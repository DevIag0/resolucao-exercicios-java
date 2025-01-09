import java.util.Scanner;

public class ParidadeHackerrankDesafio {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        scanner.close();
        
        if(N % 2 != 0 ){
            System.out.println("Weird");
        }
        else if ((N % 2 == 0) && (N >= 2) && (N <= 5)){
            System.out.println("Not Weird");
        }
        else if ((N % 2 == 0) && (N >= 6) && (N <= 20)){
            System.out.println("Weird");
        }
        else if (N>20 && N<100){
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}