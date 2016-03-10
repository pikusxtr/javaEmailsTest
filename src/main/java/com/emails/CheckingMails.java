package com.emails;

/**
 * Created by SG0213064 on 3/10/2016.
 */

import javax.mail.*;
import java.util.Properties;

public class CheckingMails {

    public static void check(String host, String storeType, String user,
                             String password) {
        try {

            //create properties field
            Properties properties = new Properties();

            properties.put("mail.pop3.host", host);
            properties.put("mail.pop3.port", "25");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3");

            store.connect(host, user, password);

            //create the folder object and open it
            Folder emailFolder = store.getDefaultFolder();
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());

            }

            //close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

       // String host = "pop.gmail.com";// change accordingly
        String host = "127.0.0.1";// change accordingly
        String mailStoreType = "pop3";
        String username = "aaaaaaa@gmail.com";// change accordingly
        String password = "kpitest";// change accordingly

        check(host, mailStoreType, username, password);

    }

}