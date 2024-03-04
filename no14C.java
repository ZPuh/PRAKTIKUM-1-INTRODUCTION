package Praktikum01;

import java.util.Scanner;

public class no14C {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Kata : ");
        String kata = sc.nextLine();
        
        String[] arrkata = kata.split(" ");
        
        int panjangkata = 0;
        String katabaru = "";
        
        for (String katabaru2 : arrkata) {
            int panjang = katabaru2.length();
            if (panjang > panjangkata) {
                panjangkata = panjang;
                katabaru = katabaru2;
            }
        }
        System.out.println(panjangkata +" " +katabaru);
    }
    
}
