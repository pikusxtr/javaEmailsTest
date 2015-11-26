package com.kpi.hello;

/**
 * Created by SG0213064 on 2/26/2015.
 */



import java.util.*;

public class IteratorTest {
    public static String  getListContent(ArrayList list) {
        String resultList="";
        for (int i = 0; i < list.size(); i++) {
            resultList = resultList + list.get(i);
        }
        return "list content =" + resultList;
    }


    public static void main(String args[]) {
        // Create an array list

        ArrayList al = new ArrayList();
        // add elements to the array list
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");

        // Use iterator to display contents of al
        System.out.print("Original contents of al: ");
        //execute method on al Arraylist
        Iterator itr = al.iterator();
        Iterator itr2 = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println("\n\n");
        System.out.println(getListContent(al));
        System.out.println("\n Iter Next ITR2 to string");

        while(itr2.hasNext()) {
            String elem2 = itr2.next().toString();
            System.out.print(elem2 + " ");
        }
        System.out.println();

        System.out.println(getListContent(al));

        System.out.println();

        // Modify objects being iterated
        ListIterator litr = al.listIterator();
        while(litr.hasNext()) {
            Object element = litr.next();
            System.out.println("Element = "  +element);
            litr.set(element + "+");
            Object element2 = litr.next();
            System.out.println("Element After Set = "  +element2);
        }

        System.out.println(getListContent(al));

        System.out.println();
        if(litr.hasPrevious()){
            System.out.println("firt check has previous -OK IF");
        }
        while(litr.hasPrevious()) {
            System.out.println("Previous index=" + litr.previousIndex());
            Object element = litr.previous();
            System.out.println("Element Previous = "  +element);
            litr.set(element + "+");
        }
        // Now, display the list backwards
        System.out.print("Modified list backwards: ");
        if(litr.hasPrevious()){
            System.out.println("After back iter - has previus");
        } else {
            System.out.println("After back iter - NO Previous");
        }


        while(litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }


}