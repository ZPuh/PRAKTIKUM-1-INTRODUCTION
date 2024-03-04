public class jajarGenjang {
    int alas;
    int tinggi;
    int a;
    int b;
   

    public int hitungLuas() {
        return alas * tinggi;
    }

    public int hitungKeliling() {
        return 2 * (a+b);

    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    

    void printState() {
        
        System.out.println("--------------------------");
        System.out.println("-------JAJARGENJANG-------");
        System.out.println("--------------------------");
        System.out.println("Alas : " + alas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Sisi A : " + a);
        System.out.println("Sisi B : " + b);        
        System.out.println("Keliling : " + hitungKeliling());
        
    }
}
