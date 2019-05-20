package com.zubaer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,2};
        System.out.println(lastStoneWeight(arr));
        System.out.println(removeAdjacentLetter("zuuzbbaer"));
    }
    public static int lastStoneWeight(int[] stones){
        //Arrays.sort(stones);
        while (stones.length>1){
            Arrays.sort(stones);
            for (int i=0;i<stones.length;i++){
                //System.out.println(stones[i]);
            }
            if (stones[(stones.length-1)]==stones[(stones.length-2)]){
                int[] newInput = new int[stones.length-2];
                for (int i=0;i<stones.length-2;i++){
                    newInput[i]=stones[i];
                }
                stones=newInput;
            }else {
                int[] newInput = new int[stones.length-1];
                for (int i=0;i<newInput.length;i++){
                    newInput[i]=stones[i];
                }
                newInput[newInput.length-1]=(stones[stones.length-1]-stones[stones.length-2]);
                stones=newInput;
            }
        }
        if (stones.length>0){
            return stones[0];
        }else {
            return 0;
        }

    }

    public static String removeAdjacentLetter(String S){
        //String a="";
        //String B = S.substring(1,1);
        //System.out.println("B "+B);

        boolean flag=true;
        while (flag){
            flag=false;
            for (int i=0;i<S.length()-1;i++){
                char ch1=S.charAt(i);
                char ch2 =S.charAt(i+1);
                if (ch1==ch2 && i==0){
                    String S1=S.substring(2);
                    System.out.println(S1);
                    S=S1;
                    flag=true;
                }else if (ch1==ch2 && i>0){
                    String S1=S.substring(0,i);
                    String S2=S.substring(i+2);
                    S=S1+S2;
                    flag=true;
                }
            }
        }
        return S;
    }
}
