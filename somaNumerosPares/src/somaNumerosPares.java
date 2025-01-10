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
        
        int num1 = scanner.nextInt();
        
        int num2 = scanner.nextInt();
        
        System.out.println(somarNumerosPares(num1, num2));
        
       
        
        
    }
    

}