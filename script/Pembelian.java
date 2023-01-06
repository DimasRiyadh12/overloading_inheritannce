import java.util.Scanner;

// OVERLOADING
class Pembelian {
    public String nama;
    public int no_ktp;

    private String mobil;
    private String jenis;
    private String merek;
    private Scanner input;

    // ------- CONSTRUCTOR -------

    public Pembelian() {
        input = new Scanner(System.in);
        System.out.println("Memilih constructor kosong");
    }

    public Pembelian(String nama, int no_ktp) {
        input = new Scanner(System.in);
        this.nama = nama;
        this.no_ktp = no_ktp;
    }
    // -------- METHOD -----------

    public void setMobil() {
        System.out.println("Nama motor yang ingin dibeli : ");
        this.mobil = input.next();
    }

    public void setJenis() {
        System.out.println("Jenis motor : ");
        this.jenis = input.next();

    }

    public void setMerek() {
        System.out.println("Merek Motor :\n[1] Honda\n[2] Yamaha\n[3] Suzuki\n[4] Kawasaki\n[5] Gesits ");
        System.out.println("=> pilih nomor");
        int choose = input.nextInt();

        if (choose == 1) {
            this.merek= "Honda";

        } else if (choose == 2) {
            this.merek = "Yamaha";

        } else if (choose == 3) {
            this.merek = "Suzuki";

        } else if (choose == 4) {
            this.merek = "Kawasaki";

        } else if (choose == 5) {
            this.merek = "Gesits"; 
        
        } else {
            this.merek = " => Belum ada data";
        }

    }

    public String getMobil() {
        return this.mobil;
    }

    public String  getJenis() {
        return this.jenis;
    }

    public String getMerek() {
        return this.merek;
    }

    public void collectingTrash() {
        System.out.println("Mulai memilih merek motor:  " + this.merek);
        System.out.println("-------------------------------");
    }

    public void bio() {
        System.out.println("Hallo " + this.nama + " dengan no_ktp " + this.no_ktp);
    }

}

// INHERITANCE
class PembelianBin extends Pembelian {

    private String warna;

    public void ThrowOut() {

        switch (getMerek()) {
            case "Honda":
                this.warna = "merah";
                break;
            case "Yamaha":
                this.warna = "hitam";
                break;
            case "Suzuki":
                this.warna = "silver";
                break;
            
            case "Kawasaki":
                this.warna = "biru";
                break;    

            case "Gesits":
                this.warna = "lainnnya";
                break;
        }

        System.out.println(
                "Warna motor yang dibeli " + warna + " > Memilih " + getMobil() + "Jenis: " + getJenis()
                        + " > pembelian berhasil.");
        System.out.println("\t");
    }
}