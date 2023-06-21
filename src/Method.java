public class Method {

    public static void main(String[] args) {
        sayHelloWorld();
        printName("Rohit", "Panjaitan" );
        System.out.println(total(3, 4));
    }

    static void sayHelloWorld(){
        System.out.println("Hello world");
    }

    static void printName(String Firstname , String Lasname){
        System.out.println(Firstname +" "+Lasname);
    }

    static int total(int a,int b){
        var sum = a + b ;
        return sum;
    }
}
