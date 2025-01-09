import java.util.Scanner;

public class FatorialRecursivo {

    public static long fatorial(long numero){

        System.out.println(numero);

            if(numero == 0  || numero == 1){
                return 1;
        }
            else {
                return numero * fatorial(numero - 1);
        }
    }

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite um numero: ");
        long numero = scanner.nextLong();

        System.out.println("O fatorial de " + numero + " é: "+ fatorial(numero));
        

        scanner.close();
    }
}