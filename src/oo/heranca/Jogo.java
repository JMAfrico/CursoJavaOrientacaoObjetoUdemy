
package oo.heranca;


public class Jogo {

    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        
        j1.x = 5;
        j1.y = 5;
        
        System.out.println("Posição x Inicial:"+j1.x);
        System.out.println("Posição y Inicial:"+j1.y);
        
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        
        System.out.println("Coodenada x Atual:"+j1.x);
        System.out.println("Coodenada y Atual:"+j1.y);
        
        Jogador j2 = new Jogador();
        j2.x = 6;
        j2.y = 5;
        
        System.out.println(j1.vida);
        System.out.println(j2.vida);

        System.out.println(j2.atacar(j1));
        System.out.println(j1.vida);
        System.out.println(j2.vida);
        
    }
}
