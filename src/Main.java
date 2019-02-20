import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int res = product(70, 2);        //ex. 1
        System.out.println(res);
        System.out.println("   J    a   v     v  a ");         // lab 10. ex.2
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        int rezultat = average(2, 3, 4) / 3;          // lab.10 ex. 3
        System.out.println(rezultat);
        System.out.println(" +\"\"\"\"\"+ ");                 //lab.10 ex. 4
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");


        Scanner scanez = new Scanner(System.in);                     // lab.10 ex. 5 - printam op. math dintre doua nr.
        System.out.print("Input first number: ");
        int x = scanez.nextInt();
        System.out.print("Input second number: ");
        int y = scanez.nextInt();
        int adunare = x + y;
        System.out.println(x + " + " + y + " = " + adunare);
        int scadere = x - y;
        System.out.println(x + " - " + y + " = " + scadere);
        int inmultire = x * y;
        System.out.println(x + " * " + y + " = " + inmultire);
        int impartire = x / y;
        System.out.println(x + " / " + y + " = " + impartire);
        int modulo = x % y;
        System.out.println(x + " % " + y + " = " + modulo);    //

        System.out.print("Introdu grade Fahrenheit : ");       // lab.10 ex. 6 - transf. grade Fahrenheit in Celsius
        float F = scanez.nextFloat();
        float C =  ((5 * (F-32))/9);
        System.out.println( F + " grade Fahrenheit egal cu  " + C + " grade Celsius" );

        System.out.print("Introdu inch: ");                       // lab.10 ex. 7 - transf. inch in metri
        float I = scanez.nextFloat( );
        float M = 0.0254f * I ;
        System.out.println( I + " inch  " + " egal cu " + M + " metri " );

        System.out.print("Introdu distanta:  ");                       // lab.10 ex. 8 -
        float D = scanez.nextFloat( );
        System.out.print("Introdu timp:  ");
        float T = scanez.nextFloat();
        float V = D / T ;
        System.out.println( "Afisati viteza: " + V + " m/s" );




//   System.out.println("Hello World!");
//
        //     afisareHelloNume();
//        System.out.println(scadere(7, 4));
//        System.out.println(inmultire( 6,2));
//        System.out.println(impartire(20, 5)); //aici se introduc doar valori ale variabilelor
//        System.out.println( modulo( 17, 5));
//
//
       Catel mimi= new  Catel();
       System.out.println("Introdu nume catel");
        mimi.nume = scanez.next();
       mimi.culoare = "negru";
       mimi.greutate = 3.5f;


   }
////
//    public static int scadere(int primulNumar, int alDoileaNumar) {
//        int resultat = primulNumar - alDoileaNumar;
//        return resultat;
//    }
//    public static int inmultire ( int x, int y){
//        int resultat = x * y;
//        return resultat;
//
//    }
//    public static int impartire ( int a , int b ){
//        int rezultat = a / b ;
//        return rezultat;
//    }
//    public static int modulo ( int v , int d ) {
//        int rezultat = v % d;
//        return rezultat;
 //   }


    public static int product(int primulNumar, int alDoileaNumar) {       // lab 10.ex.1- produsul dintre doua nr
        int result = primulNumar * alDoileaNumar;
        return result;
    }

    public static int average(int x, int y, int z) {                     // lab. 10. ex. 3 - media nr.
        int adunare = x + y + z;
        return adunare;

    }







}






