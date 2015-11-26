package com.kpi.template;

/**
 * Created by SG0213064 on 3/19/2015.
 */
public class CorpoManApiTest {
    public static void main(String[] args) {
        CorpoManApi corpoManApi1;
        CorpoManApi corpoManApi3;
         CorpoManApi corpoManApi2;
        System.out.println("classCount=" + CorpoManApi.class.hashCode());
         corpoManApi1 = new CorpoManApi("Kris", "Api1").withAddress(new Address("powst", "413","tychy", "43-100" ));
        corpoManApi3 = new CorpoManApi("Kris", "Api1").withAddress(new Address("powst", "413","tychy", "43-100" ));
        System.out.println("classCount=" + corpoManApi1.getClassCount());
        System.out.println("hashCode=" + corpoManApi1.hashCode());
    corpoManApi2 = corpoManApi1;
        System.out.println("hashCode=" + corpoManApi1.hashCode());
        System.out.println("hashCode=" + corpoManApi2.hashCode());
        corpoManApi2 = corpoManApi1;
        CorpoManApi[] corpoManApis;
        corpoManApis = new CorpoManApi[8];
        corpoManApis[0]=corpoManApi1;


class Books {
            String title;
            String author;

        }


        Books [] myBooks = new Books[3];
        int x = 0;
        myBooks[0]  = new Books();
        myBooks[0].title = "The Grapes of Java";



    }
}
