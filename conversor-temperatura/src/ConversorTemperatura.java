import java.util.Scanner;

public class ConversorTemperatura {
    private static double temperatura;
    
    public static Scanner scanner = new Scanner(System.in);


    public static double converterCelsius(double celsius){
            
        return celsius * 9 / 5 + 32;
    }

    public static double converterFahrenheit(double fahrenheit){

        return (fahrenheit - 32) * 5 / 9 ;
    }

    public static double insiratemperatura(){
        System.out.println("Agora digite a temperatura: ");
                temperatura = scanner.nextDouble();
                
                return temperatura;

    }

    public static void main(String[] args) {
        
    
        int sair = 0;
        
        while(sair == 0){
            
            System.out.println("Escolha (C)Celsius para Fahrenheit / (F)Fahrenheit para Celsius Sair(S): ");
            char opcao = scanner.next().toUpperCase().charAt(0);

            
            if (opcao == 'C'){
                
                insiratemperatura();

                System.out.println("A temperatura " + temperatura + " em Celsius : " + converterCelsius(temperatura));

            }
            else if (opcao == 'F'){
                          
                insiratemperatura();
                System.out.println("A temperatura " + temperatura + " em Fahrenheit : " + converterFahrenheit(temperatura));

            }

            else if (opcao == 'S'){
                
                sair = 1;

            }

            else{
                System.out.println("Opção Inválida. tente novamente.");
            }
}
        scanner.close();
}
}