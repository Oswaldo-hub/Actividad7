import java.util.Scanner;

public class Secuencias {
    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola porfavor escribe un valor numerico ");
        n = entrada.nextInt();
        nprimos(n);
        nfibo(n);
    }

    private static void nfibo(int n) {
          int a=0,b=1,c=n;
        int   [] numerosfb = new int[n];
        System.out.println("Calculando numeros fibonacci: ");
        for(int i=0; i<numerosfb.length; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }


    private static int nprimos(int n) {
        int a = 0;
      int   [] numeros = new int[n];
        System.out.println("Calculando numeros primos: ");
        for(int i=0; i<numeros.length; i++) {
         numeros[i] = i + 1;

          a = numeros[i];
            if( i  %2==0){} else {System.out.println("numeros primos: " + i );}
        }


        return a; }


}
