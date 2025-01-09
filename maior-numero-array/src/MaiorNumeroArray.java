public class MaiorNumeroArray {

    public static int [] numerosArray = {7, 8, 20, 770, 30, 50, 77, 506 ,130};
    public static int maiorNumero = numerosArray[0];

    public static int MaiorValor(int [] numerosArray){
        for (int i = 0; i < numerosArray.length; i++){
            if(numerosArray[i] > maiorNumero){
                maiorNumero = numerosArray[i];
                }
                
        }
        return maiorNumero;


    }
    public static void main(String[] args) {
       
        

            
            System.out.println(MaiorValor(numerosArray));
    }
}
