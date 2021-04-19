
package oo.heranca;


public class Jogo {

    public static void main(String[] args) {
        Jogador monstro = new Monstro();
        
        monstro.x = 5;
        monstro.y = 5;
        
        System.out.println("Posição x Inicial:"+monstro.x);
        System.out.println("Posição y Inicial:"+monstro.y);
        
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.NORTE);
        
        System.out.println("Coodenada x Atual:"+monstro.x);
        System.out.println("Coodenada y Atual:"+monstro.y);
        
        Jogador heroi = new Heroi();
        heroi.x = 6;
        heroi.y = 5;
        
        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        System.out.println(heroi.atacar(monstro));
        System.out.println(monstro.vida);
        System.out.println(heroi.vida);
        
        System.out.println(monstro.atacar(heroi));
        System.out.println(monstro.vida);
        System.out.println(heroi.vida);
        
    }
}
