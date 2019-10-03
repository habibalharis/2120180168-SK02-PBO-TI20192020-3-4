package tugas.pbo.pkg02;
public class motorremot {
    String nama = "motorremot_99";
    int energi ;
    int kecepatan ;
    void kecepatan (){
        energi--;
        if (energi > 10){
            energi++;
            System.out.println("motorremot bisa digunakan...");
        }else{
            System.out.println("energi lemah, motorremot tidak bisa digunakan");
        }
    }
    void belok (){
        energi++;
        System.out.println("motorremot akan belok");
    }
    void maju (){
        energi++;
        System.out.println("motorremot akan maju");
        kecepatan++;
    }
    void mundur (){
        energi++;
        System.out.println("motorremot akan mundur");
        kecepatan++;
    }
}

