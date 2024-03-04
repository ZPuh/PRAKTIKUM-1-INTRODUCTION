
public class main {

    public static void main(String[] args) {
        ular ul = new ular();
        ul.bergerak();
        ul.megigit();

        Harimau harimau = new Harimau();
        harimau.bergerak();
        harimau.memakan();

        mobil mb = new mobil();
        mb.mengerem();
        mb.mengegas();

        kucing kc = new kucing();
        kc.memakan();
        kc.meminum();

        motor mt = new motor();
        mt.mengegas();
        mt.mengerem();

        kursi kr = new kursi();
        kr.diduduki();
        kr.diinjak();

        tv tp = new tv();
        tp.menyala();
        tp.mati();

        ac a = new ac();
        a.mati();
        a.mendingin();

        lampu lp = new lampu();
        lp.menyala();
        lp.redup();

        laptop lpt = new laptop();
        lpt.hidup();
        lpt.lobet();

    }

}
