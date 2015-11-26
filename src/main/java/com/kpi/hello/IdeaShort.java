package com.kpi.hello;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SG0213064 on 2/26/2015.
 */
public class IdeaShort {
    public static void main(String[] args) {
        ArrayList<String>  nameList = new ArrayList<String>();

        nameList.add("Maciek");
        nameList.add("Maciek2");
        nameList.add("Maciek3");

        int x = 0;

        for (int i=0;i < nameList.size();i++) {
            System.out.println("name=" + nameList.get(i));
        }

        //Iterator<>
    }
}
