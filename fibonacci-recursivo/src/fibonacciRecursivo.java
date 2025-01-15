import java.util.Scanner;

public class fibonacciRecursivo {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int gerarFibonacci(int num){

        if (num <= 0){
            return 0;
            }
        else if (num <= 1){
            return 1;
        }
        else{

            return gerarFibonacci(num-1) + gerarFibonacci(num-2);
        }
    }

public static void main (String[] args) {

    int soma = 0;
    
    System.out.print("Digite um número para calcular fibonacci: ");
    int num = scanner.nextInt();

    System.out.print("Os primeiros " + num + " números da sequência de Fibonacci são:  ");

    for (int i = 0; i < num ; i++) { 
        System.out.print(gerarFibonacci(i) + " + ");
        soma += gerarFibonacci(i);
}

    System.out.println(" A soma destes numeros são = " + (soma) );

    scanner.close();
}
}
