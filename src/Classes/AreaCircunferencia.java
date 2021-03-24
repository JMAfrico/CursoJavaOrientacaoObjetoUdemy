
package Classes;

//AULA 99 - MEMBROS DE CLASSE VS INSTÂNCIA
public class AreaCircunferencia {

        static double pi= 3.14; // static é um valor padrão que funciona como atributo da classe, para não precisar chamar no objeto e seu valor pode ser alterado
        //static final double pi= 3.14; // final transforma a variável numa constante, onde esse valor mesmo sendo chamado pelo objeto não pode ser alterado

        double raio;
    
        public AreaCircunferencia(double raioInicial){
            raio = raioInicial;
        }
        
        double calcArea(){
            //return raio * raio * pi;
            return pi * Math.pow(raio,2);
        }
        
        //Método static
        static double calcArea(double raio){
            //return raio * raio * pi;
            return pi * Math.pow(raio,2);
        }
}
