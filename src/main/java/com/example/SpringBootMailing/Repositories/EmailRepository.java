package com.example.SpringBootMailing.Repositories;

import com.example.SpringBootMailing.Models.EmailDetails;

public interface EmailRepository {

    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details);
}

