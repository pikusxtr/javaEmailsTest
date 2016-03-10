package com.emails;

/**
 * Created by SG0213064 on 3/10/2016.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class GmailInbox {

    public static void main(String[] args) throws IOException, InterruptedException {
        //String host1 = "127.0.0.2";
       // String host1 = "teamcity.dev.sabre.com";
        String host1 = "H9470305442574.Global.ad.sabre.com";
        System.out.println("result=" + ping(host1));
        GmailInbox gmail = new GmailInbox();
        gmail.read();
    }

    public void read() {
        Properties props = new Properties();
        try {
            ClassLoader classLoader = getClass().getClassLoader();

            File fileProp = new File(classLoader.getResource("mySmpt.properies").getFile());
            String host = "H9470305442574.Global.ad.sabre.com";

            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "25");

            //props.load(new FileInputStream(fileProp));
            Session session = Session.getDefaultInstance(props, null);

            Store store = session.getStore("pop3s");
            store.connect("H9470305442574.Global.ad.sabre.com", "kpitestqa997@gmail.com", "kpiqa12#$");

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);
            int messageCount = inbox.getMessageCount();

            System.out.println("Total Messages:- " + messageCount);

            Message[] messages = inbox.getMessages();
            System.out.println("------------------------------");
            for (int i = 0; i < 10; i++) {
                System.out.println("Mail Subject:- " + messages[i].getSubject());
            }
            inbox.close(true);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean ping(String host) throws IOException, InterruptedException {
        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");

        ProcessBuilder processBuilder = new ProcessBuilder("ping", isWindows? "-n" : "-c", "1", host);
        Process proc = processBuilder.start();

        int returnVal = proc.waitFor();
        return returnVal == 0;
    }

}
