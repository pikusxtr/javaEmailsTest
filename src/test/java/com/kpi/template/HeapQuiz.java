package com.kpi.template;

/**
 * Created by SG0213064 on 3/19/2015.
 */
public class HeapQuiz {
    int id=0;

    public static void main(String[] args) {
        int x=0;
        HeapQuiz [] hq = new HeapQuiz[5];
        while(x<3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x= x +1;
        }

        hq[3] = hq[1];
        hq[4] = hq[1];
        showHq(hq);
        hq[3] = null;
        showHq(hq);
        hq[4] = hq[0];
        showHq(hq);
        hq[0] = hq[3];
        System.out.println("After hq0 = hq3(null before)");
        showHq(hq);
        hq[3] = hq[2];
        hq[2] = hq[0];
        showHq(hq);
    }

    static void showHq (HeapQuiz[] hqArr) {
        int y=0;
        int hqSize = hqArr.length;
        while(y < hqSize){
            if(hqArr[y]!=null) {
                System.out.println("HQ-" + y + " = " + hqArr[y].id);

            }else {
                System.out.println("HQ["+ y + "] = null");
            }
            y = y + 1;
        }
        System.out.println("END of showing some HQ\n\n");
    }
}
