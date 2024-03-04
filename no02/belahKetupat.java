
public class belahKetupat {

    double diagonal1;
    double diagonal2;
    int sisi;

    public double hitungLuas() {
        return diagonal1 * diagonal2 / 2;
    }

    public int hitungKeliling() {
        return 4 * sisi;

    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    

    void printState() {

        System.out.println("--------------------------");
        System.out.println("-------BELAHKETUPAT-------");
        System.out.println("--------------------------");
        System.out.println("Diagonal 1 : " + diagonal1);
        System.out.println("Diagonal 2 : " + diagonal2);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Sisi : " + sisi);
        System.out.println("Keliling : " + hitungKeliling());

    }
}
