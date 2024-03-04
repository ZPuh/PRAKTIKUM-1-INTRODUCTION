
public class main {

    public static void main(String[] args) {
        // SegiTiga
        segiTiga sg3 = new segiTiga();
        sg3.setAlas(12);
        sg3.setTinggi(5);
        sg3.setA(2);
        sg3.setB(8);
        sg3.setC(7);
        
        sg3.hitungLuas();
        sg3.hitungKeliling();
        sg3.printState();

        // persegi panjang
        persegiPanjang pp = new persegiPanjang();
        pp.setLebar(4);
        pp.setPanjang(7);

        pp.hitungLuas();
        pp.hitungKeliling();
        pp.printState();

        // persegi
        persegi p = new persegi();
        p.setSisi(6);

        p.hitungLuas();
        p.hitungKeliling();
        p.printState();

        // lingkaran
        lingkaran lk = new lingkaran();
        lk.setJariJari(7);
        
        lk.hitungLuas();
        lk.hitungKeliling();
        lk.printState();

        // jajargenjang
        jajarGenjang jg = new jajarGenjang();
        jg.setA(4);
        jg.setB(2);
        jg.setAlas(6);
        jg.setTinggi(7);

        jg.hitungLuas();
        jg.hitungKeliling();
        jg.printState();

        // trapesium
        trapesium tr = new trapesium();
        tr.setA(3);
        tr.setB(7);
        tr.setC(9);
        tr.setD(12);
        tr.setSisiAtas(5);
        tr.setSisiBawah(9);
        tr.setTinggi(3);

        tr.hitungLuas();
        tr.hitungKeliling();
        tr.printState();

        // belah ketupat
        belahKetupat bk = new belahKetupat();
        bk.setDiagonal1(5);
        bk.setDiagonal2(7);
        bk.setSisi(9);

        bk.hitungLuas();
        bk.hitungKeliling();
        bk.printState();
        
        // layang-layang
        layangLayang ll = new layangLayang();
        ll.setA(5);
        ll.setB(6);
        ll.setC(7);
        ll.setD(7);
        ll.setDiagonal1(5);
        ll.setDiagonal2(8);

        ll.hitungLuas();
        ll.hitungKeliling();
        ll.printState();
        
    }

}
