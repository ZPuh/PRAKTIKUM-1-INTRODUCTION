package Praktikum01;

import java.util.Scanner;

/*
Buatlah program untuk menghitung luas dan keliling bangun datar: persegi, 
persegi panjang, segitiga, jajar genjang, trapesium, layang-layang, belah 
ketupat dan lingkaran. Sesuaikan variabel input yang dibutuhkan. input variabel 
dilakukan melalui console window
 */
public class no03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("program untuk menghitung luas dan keliling bangun datar : ");
            System.out.println("1. persegi");
            System.out.println("2. persegi panjang");
            System.out.println("3. segitiga");
            System.out.println("4. jajar genjang");
            System.out.println("5. trapesium");
            System.out.println("6. Layang-layang");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Lingkaran");
            System.out.println("0. keluar");

            System.out.println("Pilihan : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Sisi : ");
                    int sisiPersegi = sc.nextInt();
                    int luasPersegi = sisiPersegi * sisiPersegi;
                    int kelilingPersegi = 4 * sisiPersegi;
                    System.out.println("Luas : " + luasPersegi);
                    System.out.println("Keliling : " + kelilingPersegi);
                    break;
                case 2:
                    System.out.print("Panjang : ");
                    int panjangPersegiPanjang = sc.nextInt();
                    System.out.print("Lebar : ");
                    int lebarPersegiPanjang = sc.nextInt();
                    int luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
                    int kelilingPersegiPanjang = 2 * (panjangPersegiPanjang + lebarPersegiPanjang);
                    System.out.println("Luas : " + luasPersegiPanjang);
                    System.out.println("Keliling : " + kelilingPersegiPanjang);
                    break;
                case 3:
                    System.out.print("Sisi A : ");
                    double sisiAsg3 = sc.nextDouble();
                    System.out.print("Sisi B : ");
                    double sisiBsg3 = sc.nextDouble();
                    System.out.print("Sisi C : ");
                    double sisiCsg3 = sc.nextDouble();
                    double luasSegitiga = (sisiAsg3 + sisiBsg3 + sisiCsg3) / 2;
                    double kelilingSegitiga = sisiAsg3 + sisiBsg3 + sisiCsg3;
                    break;
                case 4:
                    System.out.print("Alas : ");
                    int alasjg = sc.nextInt();
                    System.out.print("Tinggi : ");
                    int tinggijg = sc.nextInt();
                    System.out.print("Sisi Miring : ");
                    int sisimiringjg = sc.nextInt();
                    int luasJajarGenjang = alasjg * tinggijg;
                    int kelilingJajarGenjang = 2 * (alasjg + sisimiringjg);
                    System.out.println("Luas : " + luasJajarGenjang);
                    System.out.println("Keliling : " + kelilingJajarGenjang);
                    break;
                case 5:
                    System.out.print("Sisi Atas : ");
                    double sisiAtas = sc.nextDouble();
                    System.out.print("Sisi Bawah : ");
                    double sisiBawah = sc.nextDouble();
                    System.out.print("Tinggi : ");
                    double tinggiTrapesium = sc.nextDouble();
                    System.out.print("Sisi Miring 1 : ");
                    double sisiMiring1Trapesium = sc.nextDouble();
                    System.out.print("Sisi Miring 2 : ");
                    double sisiMiring2Trapesium = sc.nextDouble();
                    double luasTrapesium = (sisiAtas + sisiBawah) * tinggiTrapesium / 2;
                    double kelilingTrapesium = sisiAtas + sisiBawah + sisiMiring1Trapesium + sisiMiring2Trapesium;
                    break;
                case 6:
                    System.out.print("Diagonal 1 : ");
                    double diagonal1LayangLayang = sc.nextDouble();
                    System.out.print("Diagonal 2 : ");
                    double diagonal2LayangLayang = sc.nextDouble();                    
                    System.out.print("Sisi 1: ");
                    double sisi1LayangLayang = sc.nextDouble();
                    System.out.print("Sisi 2: ");      
                    double sisi2LayangLayang = sc.nextDouble();
                    double luasLayangLayang = diagonal1LayangLayang * diagonal2LayangLayang / 2;
                    double kelilingLayangLayang = 2 * (sisi1LayangLayang + sisi2LayangLayang);
                    System.out.println("Luas : "+luasLayangLayang);
                    System.out.println("Keliling : "+kelilingLayangLayang);
                    break;
                case 7:
                    System.out.print("Diagonal 1 : ");
                    double diagonal1BelahKetupat = sc.nextDouble();
                    System.out.print("Diagonal 2 : ");
                    double diagonal2BelahKetupat = sc.nextDouble();                    
                    System.out.print("Sisi : ");
                    double sisiBelahKetupat = sc.nextDouble();                    
                    double luasBelahKetupat = diagonal1BelahKetupat * diagonal2BelahKetupat / 2;
                    double kelilingBelahKetupat = 4 * sisiBelahKetupat;
                    System.out.println("Luas : "+luasBelahKetupat);
                    System.out.println("Keliling : "+kelilingBelahKetupat);                    
                    break;
                case 8:
                    System.out.print("Jari-jari : ");
                    double radius = sc.nextDouble();
                    
                    double luasLingkaran = Math.PI * radius * radius;
                    double kelilingLingkaran = Math.PI * (2 * radius);
                    System.out.println("Luas : "+luasLingkaran);
                    break;
                case 0:
                    System.out.println("Terima Kasih ;)");
                    break;
                default:
                    System.out.println("Pilihan salah");
            }
        } while (pilihan != 0);

    }

}
