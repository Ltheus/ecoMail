package br.com.ecoMail.repository

import br.com.ecoMail.model.EmailBody

fun getEmails(): List<EmailBody> {
    return listOf(
        EmailBody(
            id = 1,
            senderName = "Thiago",
            emailSubject = "Orçamento",
            emailText = "Boa tarde! Gostaria de realizar um orçamento."
        ),
        EmailBody(
            id = 2,
            senderName = "Joana",
            emailSubject = "Orçamento",
            emailText = "Boa tarde! Gostaria de realizar um orçamento."
        ),
        EmailBody(
            id = 3,
            senderName = "Fernando",
            emailSubject = "Orçamento",
            emailText = "Boa tarde!"
        ),
        EmailBody(
            id = 4,
            senderName = "Fabricio",
            emailSubject = "Orçamento",
            emailText = "Boa tarde! Gostaria de realizar um orçamento."
        ),
        EmailBody(
            id = 5,
            senderName = "Nataniel",
            emailSubject = "Orçamento",
            emailText = "Boa tarde! Gostaria de realizar um orçamento."
        ),
    )
}