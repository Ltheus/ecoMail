package br.com.ecoMail.model

data class EmailBody(
    val id : Long = 0,
    val senderName : String = "",
    val emailSubject : String = "",
    val emailText : String = "",
)
