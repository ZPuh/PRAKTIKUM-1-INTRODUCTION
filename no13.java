package Praktikum01;

import java.util.Arrays;
import java.util.Scanner;

public class no13 {

    /*
Buatlah sebuah program kriptografi sederhana dengan scenario berikut. 
Program akan menerima sebuah kalimat (terdiri dari beberapa kata) kemudian 
anda diminta untuk memanipulasi semua huruf vocal yang ada pada kalimat 
tersebut dengan format:
a menjadi ava
i menjadi ivi
u menjadi uvu
e menjadi eve
o menjadi ovo
berikut ini contoh Input-Output programnya:
selamat belajar java
sevelavamavat bevelavajavar javavava
informatika unsulbar
ivinfovormavativikava uvunsuvulbavar
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Kalimat : ");
        String kalimat = input.nextLine();
        String kalimatBaru = "";
        
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (huruf == 'a') {
                kalimatBaru+= "ava";
            }else if (huruf == 'i') {
                kalimatBaru+= "ivi";
            }else if (huruf == 'u') {
                kalimatBaru+= "uvu";
            }else if (huruf == 'e') {
                kalimatBaru+= "eve";
            }else if (huruf == 'o') {
                kalimatBaru+= "eve";
            }else{
                kalimatBaru+= huruf;
            }
        }
        System.out.println(kalimatBaru);

    }
}
