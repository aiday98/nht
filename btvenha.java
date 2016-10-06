package com.company;

import java.util.Scanner;

/**
 * Created by Windows 7 on 10/4/2016.
 */
public class btvenha {
    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner y = new Scanner(System.in);
        int i;
        int tg;
        System.out.println("moi nhap so:");
        for (i = 0; i < 10; i++) {
            int a = y.nextInt();
            x[i]=a;
        }
        for(i=0; i<9 ;i++)
        for(int j=i+1;j<10;j++ )
            if(x[i]>x[j]){
                tg=x[i];
                x[i]=x[j];
                x[j]=tg;

                }
        System.out.println("day sau khi nhap la");
        for(i=0;i<10;i++){
            System.out.println(+x[i]);}







    }
}
