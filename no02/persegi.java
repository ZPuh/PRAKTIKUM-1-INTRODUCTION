
public class persegi {

    int sisi;

    public int hitungLuas() {
        return sisi * sisi;
    }

    public int hitungKeliling() {
        return 4 * sisi;

    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    

    void printState() {
        System.out.println("--------------------------");
        System.out.println("---------PERSEGI---------");
        System.out.println("--------------------------");
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Sisi : " + sisi);
        System.out.println("Keliling : " + hitungKeliling());

    }
}
