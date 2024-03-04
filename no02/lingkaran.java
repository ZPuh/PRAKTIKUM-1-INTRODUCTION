
public class lingkaran {

    double jariJari;
    final double PHI = 3.14;

    public double hitungLuas() {
        return PHI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * PHI * jariJari;

    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    
    void printState() {

        System.out.println("--------------------------");
        System.out.println("--------LINGKARAN---------");
        System.out.println("--------------------------");
        System.out.println("JAri-JAri : " + jariJari);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("--------------------------");
        System.out.println("Diameter : " + (2 * jariJari));
        System.out.println("Keliling : " + hitungKeliling());

    }
}
