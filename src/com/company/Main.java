package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // %s sozdor uchun
        //%d butun sandar uchun
        //%f bolchok sandar uchun
        //System.out.printf("Muhammed %d %s %.2f",19, "jashta", 20.22 );

        Scanner bakyt = new Scanner(System.in);

        int age = bakyt.nextInt();// 27

        System.out.printf("Dastan is %d years old.", age);
        
    }
}
