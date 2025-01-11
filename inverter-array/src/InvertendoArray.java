public class InvertendoArray {

    public static int [] inverteArray( int [] array){
        int[] invertidoArray = new int[array.length];

        for (int i = 0 ; i < array.length; i++){

            invertidoArray[i] = array[array.length - 1 - i];
            
        }
        return invertidoArray;
    }
    
    public static void main (String[] args) {

        int [] array = {0,1,2,3,4,5,6,7,8,9,10};
        
     
        System.out.print("Array Normal: ");
        for( int i: array){
            System.out.print(i + " , ");
        }

        System.out.println(" ");

        System.out.print("Array Invertido: ");
        for(int i: inverteArray(array)){
            System.out.print(i+ " , ");
        }
    
    

}
}