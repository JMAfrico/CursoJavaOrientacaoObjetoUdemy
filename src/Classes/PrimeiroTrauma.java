
package Classes;

public class PrimeiroTrauma {
    
    static int a = 3;
    int b = 3;
    
    public static void main(String[] args) {

       System.out.println(a);//para acessar a variavel fora do método principal, é necessário definir um valor statico(fixo) pra ela.
       
       PrimeiroTrauma p1 = new PrimeiroTrauma(); // para acessar a variável fora do método que está dentro de um método statico, é necessário chamar por objeto
        System.out.println(p1.b);
    }
}
