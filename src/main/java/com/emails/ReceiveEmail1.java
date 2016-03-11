package com.emails;

import javax.mail.*;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Krzysztof Piekos on 2016-03-10.
 */
public class ReceiveEmail1 {

    public static void main(String[] args)     {
        String email = "kpitestqa997@gmail.com";
        String pwd = "kpiqa12#$";
        int msgCount = 1;
        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props,new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(email, pwd);
                }
            });

            javax.mail.Store store = session.getStore("imaps");
            store.connect("imap.gmail.com", email, pwd);
            Folder[] folders = store.getDefaultFolder().list("*");

            String opHtml = "<ul>";
            for (Folder folder : folders) {
                if ((folder.getType() & Folder.HOLDS_MESSAGES) != 0) {
                    opHtml += "<li>" + folder.getFullName()+ ":" + folder.getMessageCount() + "</li>";
                }
            }
            opHtml += "</ul>";
            System.out.println("MY HTML=" + opHtml);
            Folder myInbox  = store.getFolder("INBOX");
            myInbox.open(Folder.READ_ONLY);
            String myresult ;

            for (Message message: myInbox.getMessages()) {
                System.out.println("************  MSG  " + msgCount + " *******************");
                System.out.println("MsgFrom = " + message.getFrom()[0].toString().replaceFirst(".*<", "").replace(">", ""));
                System.out.println("Msg To = " + message.getRecipients(Message.RecipientType.TO)[0].toString().replaceFirst(".*<", "").replace(">", ""));
                System.out.println("Subject=" + message.getSubject());
                System.out.println("Msg ContentType=" + message.getContentType());
                //if(message.getContentType().contains("multipart"))
                System.out.println("Msg Content=" + message.getContent().toString());
                System.out.println("****************************************************");
                try {
                    Object content = message.getContent();
                    StringBuilder result = new StringBuilder();
                    if (content instanceof String) {
                        result.append(content);
                    } else if (content instanceof Multipart) {
                        Multipart parts = (Multipart) content;
                        for (int i = 0; i < parts.getCount(); i++) {
                            BodyPart part = parts.getBodyPart(i);
                            if (part.getContent() instanceof String) {
                                result.append(part.getContent());
                            }
                        }
                    }
                    myresult= result.toString();
                    System.out.println("This is resultsAAAAAAAAAAAAAAAAAAAA=" + myresult);
                } catch (Exception e) {
                    System.out.println("Failed getting text content from " +
                            "JavaMailGmailMessage. You could try handling " +
                            "((JavaMailGmailMessage).getMessage()) manually");
                    e.printStackTrace();
                }
                msgCount++;
            }
        } catch (MessagingException e) {
            System.out.println("Error in getting list.<br />");
        } catch (IOException e) {
            System.out.println("Error in getting CONTENT.");
            e.printStackTrace();
        }
    }
}
