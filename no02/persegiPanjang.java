
public class persegiPanjang {

    int panjang;
    int lebar;
    
    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);

    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    

    void printState() {

        System.out.println("--------------------------");
        System.out.println("------PERSEGIPANJANG------");
        System.out.println("--------------------------");
        System.out.println("Panjang : " + panjang);
        System.out.println("Tinggi : " + lebar);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Panjang : " + panjang);
        System.out.println("Tinggi : " + lebar);
        System.out.println("Keliling : " + hitungKeliling());
        
    }
}
