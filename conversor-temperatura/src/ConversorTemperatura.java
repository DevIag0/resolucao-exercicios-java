import java.util.Scanner;

public class ConversorTemperatura {
    
    public static Scanner scanner = new Scanner(System.in);


    public static double converterCelsius(double celsius){
            
        return celsius * 9 / 5 + 32;
    }

    public static double converterFahrenheit(double fahrenheit){

        return (fahrenheit - 32) * 5 / 9 ;
    }

    public static double insiratemperatura(){
        System.out.println("Agora digite a temperatura: ");
                
        return  scanner.nextDouble();

    }

    public static void main(String[] args) {
        
    
        int sair = 0;
        
        while(sair == 0){
            
            System.out.println("Escolha (C) Celsius para Fahrenheit: ");
            System.out.println("Escolha (F) Fahrenheit para Celsius: ");
            System.out.println("Escolha (S) para Sair: ");
            char opcao = scanner.next().toUpperCase().charAt(0);

            
            if (opcao == 'C'){
                
                double temperatura = insiratemperatura();

                System.out.println("A temperatura " + temperatura + "C em Fahrenheit : " + converterCelsius(temperatura)+"F");

            }
            else if (opcao == 'F'){
                          
                double temperatura = insiratemperatura();
                System.out.println("A temperatura " + temperatura + "F em Celsius : " + converterFahrenheit(temperatura) + "C");

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
