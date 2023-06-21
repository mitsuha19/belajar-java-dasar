public class Perulangan {

    public static void main(String[] args) {

        for (var counter = 1 ; counter <= 3 ; counter++){
            System.out.println("perulangan ke " + counter);
        }

        var counter = 1;
        while (counter <= 2){
            System.out.println("while ke" + counter);
            counter ++;
        }
         counter = 1;
        do {
            System.out.println("do while ke " + counter);
            counter ++;
        }while (counter <=3);
    }
}
