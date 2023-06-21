public class Array {

    public static void main(String[] args) {

        String[] stringarray;
        stringarray = new String[3];

        stringarray[0] = "Rohit ";
        stringarray[1] = "Pradoa ";
        stringarray[2] = "Panjaitan";

        System.out.println(stringarray[0]);
        System.out.println(stringarray[1]);
        System.out.println(stringarray[2]);

        String[] namanama = {
                "Rohit", "Pradoa", "Panjaitan"
        };

        long[] angka = {
          10,20,30,40,50
        };

        angka[0] = 100;

        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka.length);
    }

}
