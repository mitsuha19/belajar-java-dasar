public class IfElse {

    public static void main(String[] args) {

        var nilai = 70;
        var absen = 80;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Anda Lulus");
        }else {
            System.out.println("Anda Gagal");
        }

        var Nilai = "A" ;
        switch (Nilai){
            case "A":
                System.out.println("Anda Lulus");
                break;
            case "B":
                System.out.println("Anda Lulus");
                break;
            default:
                System.out.println("Anda Gagal");
                break;
        }

        Nilai = "E";
        switch (Nilai){
            case "A" -> System.out.println("Anda lulus dengan baik");
            case "B","C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda Gagal");
            default -> System.out.println("Mungkin Anda Salah Jurusan");
        }
    }
}
