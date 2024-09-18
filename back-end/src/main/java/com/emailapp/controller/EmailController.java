package com.emailapp.controller;

import com.emailapp.model.EmailMessage;
import com.emailapp.service.EmailReceiver;
import com.emailapp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {
    private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

    private final EmailService emailService;
    private final EmailReceiver emailReceiver;

    // Construtor para injeção
    @Autowired
    public EmailController(EmailService emailService, EmailReceiver emailReceiver) {
        this.emailService = emailService;
        this.emailReceiver = emailReceiver;
    }

    // Endpoint para enviar e-mails
    @PostMapping("/send")
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        emailService.sendEmail(to, subject, text);
        return "E-mail enviado com sucesso!";
    }

    // Endpoint para receber e-mails
    @GetMapping("/receive")
    public List<EmailMessage> receiveEmails() {
        try {
            return emailReceiver.checkEmails();
        } catch (Exception e) {
            logger.error("Erro ao verificar e-mails", e);
            return new ArrayList<>();
        }
    }
}
