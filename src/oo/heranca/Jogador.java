
package oo.heranca;

public class Jogador {
    
    int x; //posição 0 do boneco
    int y;
    
    //método andar para a direita acrescenta no y
    //método andar para a esquerda acrescenta no x
    //método comum sem utilização de enum
    /*
    boolean andar(String direcao){
        if ("direita".equalsIgnoreCase(direcao)) {
            y++;           
            System.out.println("andou "+y+" posições para direita");
        }
        
        if("esquerda".equalsIgnoreCase(direcao)){
            x++;
            System.out.println("andou "+x+" posições para esquerda");
        }
            return false;
    }*/
    
        boolean andar(Direcao direcao){
        if (direcao == (Direcao.NORTE)) {
            y--;           
            System.out.println("andou para norte");
        }
        
        if (direcao == (Direcao.SUL)) {
            y++;           
            System.out.println("andou para SUL");
        }
        
        if (direcao == (Direcao.LESTE)) {
            x++;           
            System.out.println("andou para Leste");
        }
        
          if (direcao == (Direcao.OESTE)) {
            x--;           
            System.out.println("andou para Oeste");
        }
            return false;
    }

}
