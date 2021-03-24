package Fundamentos;

import javax.swing.JOptionPane;

/*
Aula 2- Mostrar as variáveis e constantes double atravéz do calculo da área da circunferência
*/
public class AreaCircunferencia {
    
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159; // CONSTANTE EM JAVA (final na frente e nome em maiúscula)
        double area = (raio * raio) * PI;
        
        
        System.out.println("Área = "+ PI * (raio *raio));
        //ou
        JOptionPane.showConfirmDialog(null,area);
        System.out.println("Area = "+ area);
    }
    
}
