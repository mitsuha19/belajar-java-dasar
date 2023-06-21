public class RekursifMethod {
    public static void main(String[] args) {
        System.out.println(faktorial(5));
        System.out.println(faktorialRekursif(5));
    }
    static int faktorial(int value){
    var result = 1;
    for (var i = 1 ; i <= value ; i ++) {
        result *= i;
        }
    return result;
    }

    static int faktorialRekursif(int value){
        if (value == 1){
            return 1;
        }else {
            return value * faktorialRekursif(value - 1 );
        }

    }
}
