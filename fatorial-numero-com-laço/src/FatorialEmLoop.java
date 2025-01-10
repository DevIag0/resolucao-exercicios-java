import java.util.Scanner;


public class FatorialEmLoop {

    public static long fatorial(long numero){
        
        long resultado = 1;

        if (numero == 0 || numero == 1){
                return resultado ;
        }
        
        else{
            for (long i = numero; i > 0; i--){
                
                resultado *= i;

                System.out.print(i+" x ");

            }
            return resultado;
        }
   
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um numero: ");
        long numero = scanner.nextLong();

        System.out.println("O fatorial de " + numero + " é: "+ fatorial(numero));
        
        scanner.close();
    }
}
