package com.company.v2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String x=args[2];
        Scanner s = new Scanner(new File("D:\\Documents\\GitHub\\Calculator\\src\\java\\com\\kelaniya\\uni\\numbers.txt"));
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        if(args.length==0){
            System.out.println("please enter valid option to calculate");
        }
        if(x.equals("+") || x.equals("-") || x.equals("*")){
            switch (x) {
                    case "+":
                        int y=n1+n2;
                        System.out.println(y);
                        break;
                    case "-":

                        System.out.println(n1-n2);
                        break;
                    default:
                        System.out.println(n1*n2);
                }
            }
        else{
             System.out.println("out of ");
            }
    }
}
