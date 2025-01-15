import java.util.Scanner;
import java.util.Arrays;

public class MaiorNumeroArray {

    private static final Scanner scanner = new Scanner(System.in);


    public static int maiorValor(int [] array){
        int maiorNumero = array[0];

        for (int i = 0; i < array.length; i++){
                
            if(array[i] > maiorNumero){
                maiorNumero = array[i];
                }            
        }
        return maiorNumero;

    }
    public static void main(String[] args) {

        System.out.print("Digite quantos numeros deseja no array: ");
        int tamanhoArray = scanner.nextInt();
        
        int [] array = new int[tamanhoArray];


        for (int i = 0; i < array.length; i++){
            System.out.print("Digite o " + (i+1) + "º número" + " que deseja inserir no array: ");
            int valoresArray = scanner.nextInt();
            array[i] = valoresArray;
        }
        
        System.out.println("----------------------------------------------");
        
        String dadosArray = Arrays.toString(array);
        System.out.println("Os arrays inseridos foram: " + dadosArray);
        
        System.out.println("----------------------------------------------");
        System.out.println("O maior número do array é: " + maiorValor(array));

        scanner.close();
    }
    
}
