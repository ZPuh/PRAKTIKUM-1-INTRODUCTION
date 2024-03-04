
public class segiTiga {

    double alas;
    double tinggi;
    int a;
    int b;
    int c;

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public int hitungKeliling() {
        return a + b + c;

    }

    public void setAlas(double alas) {
        this.alas = alas;
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
    

    void printState() {
        
        System.out.println("--------------------------");
        System.out.println("---------SEGITIGA---------");
        System.out.println("--------------------------");
        System.out.println("Alas : " + alas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Sisi A : " + a);
        System.out.println("Sisi B : " + b);
        System.out.println("Sisi C : " + c);
        System.out.println("Keliling : " + hitungKeliling());
        
    }

}
