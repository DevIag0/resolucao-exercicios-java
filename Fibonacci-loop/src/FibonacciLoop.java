import java.util.Scanner;

public class FibonacciLoop {
        
        private static final Scanner scanner = new Scanner(System.in);

        public static int gerarFibonacci(int numero) {
            if (numero <= 0) {
                throw new IllegalArgumentException("A entrada deve ser um número positivo.");
            } else if (numero == 1) {
                return 0;
            } else if (numero == 2) {
                return 1;
            } else {
                int fib1 = 0, fib2 = 1, fibonacci = 0;
                for (int i = 3; i <= numero; i++) {
                    fibonacci = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = fibonacci;
                }
                return fibonacci;
            }
        }
    

        public static void main(String[] args) {
            int soma = 0;
            System.out.print("Digite o número para gerar as sequências de Fibonacci: ");
            int numero = scanner.nextInt();


           System.out.print("Os primeiros " + numero +" numeros da sequência de Fibonacci são ");

           for (int i = 1; i <= numero; i++) {
                System.out.print(gerarFibonacci(i) + " + ");
                soma += gerarFibonacci(i);

           }
           System.out.println(" = " + soma);

           scanner.close();
       }
   

   }
   
   
    

