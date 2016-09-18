package com.company;

import com.sun.org.apache.xerces.internal.util.SymbolTable;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        System.out.println("moi nhap loại nv :");
        String loai = x.nextLine();
        System.out.println("mòi nhập tiền lương :");
        int luong = x.nextInt();

         if (loai.equals("A"))
             { System.out.println("tien luong cuoi thang cua nhan vien la:" + (luong + 3000));}

         else  if (loai.equals("B"))

        { System.out.println("tien luong cuoi thang cua nhan vien la:" + (luong + 2000));}
         else
         { System.out.println("tien luong cuoi thang cua nhan vien la:" + (luong + 1000));
         }



    }
}


