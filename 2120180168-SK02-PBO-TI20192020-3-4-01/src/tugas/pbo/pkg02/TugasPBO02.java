package tugas.pbo.pkg02;
public class TugasPBO02 {
    public static void main(String[] args) {
        
        motorremot motorremot_ku = new motorremot();
        System.out.println (motorremot_ku.nama);
        motorremot_ku.energi = 9;
        motorremot_ku.kecepatan = 90;
        motorremot_ku.belok();
        motorremot_ku.maju();
        motorremot_ku.mundur();

    }
    
}
