package com.changzhu.community.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;


/**
 * @author leiliu
 * @date 22-6-28 上午9:15
 */
public class MailClient {

    //日志
    private static final Logger logger= LoggerFactory.getLogger(MailClient.class);


    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    public void sendMessage(String to,String subject,String content){

    }
}
