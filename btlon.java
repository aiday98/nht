

import java.util.Scanner;

/**
 * Created by Windows 7 on 10/18/2016.
 */
public class btlon {
    public static void main(String[] args) {


    }
    static String[][] sort(String[][] mang){
        String[][] x=mang;
            for(int j=1;j<2;j++){
                for(int i=0;i<x.length;i++)
            switch (x[i][j]){
                case "mot":
                    String a1="1";
                    x[i][j]=a1;
                    int  b1 = Integer.parseInt(x[i][j])
                   ; break;
                case "hai":
                    String a2="2";
                    x[i][j]=a2;
                    int  b2 = Integer.parseInt(x[i][j])
                            ; break;

                case "ba":  String a3="3";
                    x[i][j]=a3;
                    int  b3 = Integer.parseInt(x[i][j])
                            ; break;

                case "bon":
                    String a4="4";
                    x[i][j]=a4;
                    int  b4 = Integer.parseInt(x[i][j])
                            ; break;
                case "nam":
                    String a5="5";
                    x[i][j]=a5;
                    int  b5 = Integer.parseInt(x[i][j])
                            ; break;

                case "sau":
                    String a6="6";
                    x[i][j]=a6;
                    int  b6 = Integer.parseInt(x[i][j])
                            ; break;

                case"bay":
                    String a7="7";
                    x[i][j]=a7;
                    int  b7= Integer.parseInt(x[i][j])
                            ; break;

                case"tam":String a8="8";
                    x[i][j]=a8;
                    int  b8 = Integer.parseInt(x[i][j])
                            ; break;

                case"chin":String a9="9";
                    x[i][j]=a9;
                    int  b9 = Integer.parseInt(x[i][j])
                            ; break;

                case "muoi":String a10="10";
                    x[i][j]=a10;
                    int  b10= Integer.parseInt(x[i][j])
                            ; break;

                case "muoi mot":String a11="11";
                    x[i][j]=a11;
                    int  b11 = Integer.parseInt(x[i][j])
                            ; break;

                case "muoi hai":String a12="12";
                    x[i][j]=a12;
                    int  b12 = Integer.parseInt(x[i][j])
                            ; break;

                case"muoi ba":
                    String a13="13";
                    x[i][j]=a13;
                    int  b13= Integer.parseInt(x[i][j])
                            ; break;
                case"muoi bon":String a14="14";
                    x[i][j]=a14;
                    int  b14 = Integer.parseInt(x[i][j])
                            ; break;

                case"muoi nam":String a15="15";
                    x[i][j]=a15;
                    int  b15 = Integer.parseInt(x[i][j])
                            ; break;

                case"muoi sau":String a16="16";
                    x[i][j]=a16;
                    int  b16 = Integer.parseInt(x[i][j])
                            ; break;

                case"muoi bay":String a17="17";
                    x[i][j]=a17;
                    int  b17 = Integer.parseInt(x[i][j])
                            ; break;
                case"muoi tam":String a18="4";
                    x[i][j]=a18;
                    int  b18 = Integer.parseInt(x[i][j])
                            ; break;
                case"muoi chin":String a19="4";
                    x[i][j]=a19;
                    int  b19 = Integer.parseInt(x[i][j])
                            ; break;

                default:
                    break;
            }


        }
        return mang;


    }

}
