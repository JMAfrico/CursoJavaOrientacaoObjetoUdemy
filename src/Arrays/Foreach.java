
package Arrays;


public class Foreach {
    
    public static void main(String[] args) {
        
        double[] notas = {8.4,6.6,9.8,4.5};
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+ " ");
        }
        System.out.println("");
        //foreach em java é assim: começa com for, coloca o tipo e o nome, depois dos dois pontos : coloca a lista que voce quer percorrer
        for(double item : notas){
            item += item *2;
        }
        
                for(double item : notas){
                    System.out.println(item);
        }
    }
}
