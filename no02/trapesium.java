
public class trapesium {

    double sisiBawah;
    double sisiAtas;
    double tinggi;
    int a;
    int b;
    int c;
    int d;

    public double hitungLuas() {
        return (sisiBawah + sisiAtas) / 2 * tinggi;
    }

    public int hitungKeliling() {
        return a + b + c + d;

    }

    public void setSisiBawah(double sisiBawah) {
        this.sisiBawah = sisiBawah;
    }

    public void setSisiAtas(double sisiAtas) {
        this.sisiAtas = sisiAtas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }
    

    void printState() {

        System.out.println("--------------------------");
        System.out.println("---------TRAPESIUM--------");
        System.out.println("--------------------------");
        System.out.println("Sisi Bawah : " + sisiBawah);
        System.out.println("Sisi Atas : " + sisiAtas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Sisi A : " + a);
        System.out.println("Sisi B : " + b);
        System.out.println("Sisi C : " + c);
        System.out.println("Sisi D : " + d);
        System.out.println("Keliling : " + hitungKeliling());

    }
}
