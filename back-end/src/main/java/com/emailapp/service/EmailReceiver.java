package com.emailapp.service;

import com.emailapp.model.EmailMessage;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.search.FlagTerm;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class EmailReceiver {

    public List<EmailMessage> checkEmails() throws Exception {
        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");

        Session session = Session.getDefaultInstance(properties, null);
        Store store = session.getStore("imaps");

        // Conectar ao servidor IMAP
        store.connect("imap.gmail.com", "seuemail@gmail.com", "sua_senha");

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        // Buscar mensagens não lidas
        Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));

        List<EmailMessage> emailMessages = new ArrayList<>();
        for (Message message : messages) {
            EmailMessage emailMessage = new EmailMessage();
            emailMessage.setFrom(message.getFrom()[0].toString());
            emailMessage.setSubject(message.getSubject());
            emailMessage.setBody(message.getContent().toString());

            emailMessages.add(emailMessage);
        }

        inbox.close(false);
        store.close();

        return emailMessages;
    }
}
