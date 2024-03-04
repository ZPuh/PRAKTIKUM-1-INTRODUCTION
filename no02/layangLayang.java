
public class layangLayang {
    double diagonal1;
    double diagonal2;
    int a;
    int b;
    int c;
    int d;

    public double hitungLuas() {
        return diagonal1 * diagonal2 / 2;
    }

    public int hitungKeliling() {
        return a + b + c + d;

    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
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
        System.out.println("-------LAYANGLAYANG-------");
        System.out.println("--------------------------");
        System.out.println("Diagonal 1 : " + diagonal1);
        System.out.println("Diagonal 2 : " + diagonal2);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Sisi A: " + a);
        System.out.println("Sisi B: " + b);
        System.out.println("Sisi C: " + c);
        System.out.println("Sisi D: " + d);
        System.out.println("Keliling : " + hitungKeliling());
        System.out.println("--------------------------");

    }
}
