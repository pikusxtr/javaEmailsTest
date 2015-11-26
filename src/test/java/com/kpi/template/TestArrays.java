package com.kpi.template;

/**
 * Created by SG0213064 on 3/19/2015.
 */
public class TestArrays {
    public static void main(String[] args) {
        int y=0;
        int ref;
        int [] index = new int[4];
        String [] islands = new String[4];
     index[0] = 1;
     index[1] = 3;
     index[2] = 0;
     index[3] = 2;

        islands[0] = "bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        while(y<4) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y=y+1;
        }
/*

Output:
number of islands index
1
3
0
2

 */




    }
}
