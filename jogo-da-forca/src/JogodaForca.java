import java.util.Scanner;

public class JogodaForca {

    private static final Scanner scanner = new Scanner(System.in);

    private static char [] checaPalava(char [] palavraSecretaArray, char letra, char [] palavraOculta){
        for (int i = 0; i < palavraSecretaArray.length; i++){        
            
            if(palavraSecretaArray[i] == letra){       
                palavraOculta[i] = letra;
            }         
        }
        return palavraOculta;
    }
    
    public static void main(String[] args) {
        
        System.out.print("Digite a palavra secreta: ");
        String palavraSecreta = scanner.nextLine();
        char[] palavraSecretaArray = palavraSecreta.toCharArray();
        char[] palavraOculta = new char[palavraSecreta.length()];

        for (int i = 0; i < palavraSecreta.length(); i++){
            palavraOculta[i] = '_' ;
        }

        int qtdTentativa = palavraSecretaArray.length;
   
       while(qtdTentativa > 0){

            System.out.println("Tentativas restantes: " + qtdTentativa);
           
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);
            System.out.println(" ");

            for(char palavra: checaPalava(palavraSecretaArray, letra, palavraOculta) ){
                System.out.print(palavra + " ");
            }
                
            if (qtdTentativa == 0){
                System.out.println("Você perdeu! A palavra secreta era: " + palavraSecreta);
                break;
            }
            
            if (String.valueOf(palavraOculta).equals(palavraSecreta)){
                System.out.println("Parabéns, você acertou a palavra secreta!");
                break;
            }

            qtdTentativa--;
        }

    scanner.close();

    }

}


