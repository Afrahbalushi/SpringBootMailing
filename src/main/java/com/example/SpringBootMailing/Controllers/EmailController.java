package com.example.SpringBootMailing.Controllers;

import com.example.SpringBootMailing.Models.EmailDetails;
import com.example.SpringBootMailing.Repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmailController {

    @Autowired private EmailRepository emailRepository;

    // Sending a simple Email
    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody EmailDetails details)
    {
        String status = emailRepository.sendSimpleMail(details);

        return status;
    }

    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(
            @RequestBody EmailDetails details)
    {
        String status
                = emailRepository.sendMailWithAttachment(details);

        return status;
    }
}

