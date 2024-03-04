package Praktikum01;

import java.util.Scanner;

/*
Buatlah program untuk menghitung debit air dengan input consol terdiri dari 
nilai luas permukaan dan kecepatan aliran air
 */
public class no04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Luas Permukaan(m^2): ");
        double luasPermukaan = input.nextDouble();
        System.out.print("Masukkan Kecepatan(m/s): ");
        double kecepatan = input.nextDouble();
        double debit = luasPermukaan * kecepatan;
        System.out.println("Debit air : " + debit + " m^3/s");
    }
}
