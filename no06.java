package Praktikum01;

import java.util.Scanner;

public class no06 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("m : ");
        int m = input.nextInt();
        System.out.print("n : ");
        int n = input.nextInt();
        
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        
        System.out.println("Min : "+min);
        System.out.println("MAx : "+max);
        
    }

}
