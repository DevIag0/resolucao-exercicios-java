import java.util.Scanner;


public class fibonacciRecursivo {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int gerarFibonacci(int num){
3
        
        if (num <= 1){
            return 1;
        }
        else{
            
            return gerarFibonacci(num-1) + gerarFibonacci(num-2);
        }
    }


public static void main (String[] args) {
    
    System.out.println("Digite um número para calcular fibonacci");
    int num = scanner.nextInt();
    
    System.out.println(gerarFibonacci(num));
}
}
