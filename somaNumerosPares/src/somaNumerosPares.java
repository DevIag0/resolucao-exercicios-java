import java.util.Scanner;

public class somaNumerosPares {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static int somarNumerosPares(int num1, int num2){
        
        int soma = 0;
        
        for (int i = num1; i <= num2; i++){
            if (i % 2 == 0){
                soma += i;
                
            }
        }
        return  soma;
   
    }
    
    public static void main (String[] args) {
        
        System.out.println("Digite o número inicial da contagem: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite o número final da contagem: ");
        int num2 = scanner.nextInt();
        
        System.out.println(" A soma dos numeros pares entre "+ num1 + " e " + num2 + " = " + somarNumerosPares(num1, num2));
        
       
        
        
    }
    

}