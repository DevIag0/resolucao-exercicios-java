import java.util.Scanner;

public class CalculadoraBasica {

    public static final Scanner scanner = new Scanner(System.in);

    public static double adicao (double num1, double num2){
        return num1 + num2;
    }

    public static double subtracao (double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacao (double num1, double num2){
        return num1 * num2;
    }

    public static double divisao (double num1, double num2){
        return num1 / num2;
    }


    public static void main(String[] args) {
        
        boolean i = true;
        double num1;
        double num2;
        
        double resultado = 0;

        while (i == true) {
            
            System.out.print("Digite a operação desejada: | + | - | * | / | Sair(S):  ");

            char operacao = scanner.next().toUpperCase().charAt(0);

            if (operacao == 'S'){ 
                i = false;
                break;
            }

            System.out.print("Digite o primeiro numero: ");
            num1 = scanner.nextDouble();


            System.out.print("Digite o segundo numero: ");
            num2 = scanner.nextDouble();
        
            if ( (operacao == '/') && (num2 == 0)){
                System.out.println("E impossível dividir um número por 0");
            }

            switch(operacao){
                
                case '+': 
                    resultado = adicao(num1, num2);
                    System.out.println("O Resultado de " + num1 + " + " + num2  +  " = " + resultado);
                    break;

                case '-': 
                    resultado = subtracao(num1, num2);
                    System.out.println("O Resultado de " + num1 + " - " +  num2 + " = " + resultado);
                    break;

                case '*':
                    resultado = multiplicacao(num1, num2);
                    System.out.println("O Resultado de " + num1 + " * " + num2 + " = " + resultado);
                    break;

                case '/': 
                    resultado = divisao(num1, num2);
                    System.out.println("O Resultado de " + num1 + " / " +  num2 + " = " +resultado);
                    break;

                default: 
                    System.out.println("Opção Inválida! Tente novamente.");
            }
      
        }

        scanner.close();
   
    }
}