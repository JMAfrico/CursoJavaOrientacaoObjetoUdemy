
package oo.heranca;

public class Jogador {
    
    int vida = 100;
    int x; //posição 0 do boneco
    int y;
    
    //
    boolean atacar(Jogador oponente){
        
        int eixoX = x - oponente.x;
        int eixoY = y - oponente.y;
        
        if(eixoX == 0 && eixoY == 1){//oponente ta na posição X(mesma coluna) e Y(um do lado do outro)
            oponente.vida = vida -10;
            return true;
        }
        else if (eixoX== 1 && eixoY == 0){//oponente ta na posição X(coluna vizinha) e Y(mesma linha)
            oponente.vida = vida -10;
            return true;
        } else{
                return false;//caso nao esteja próximo nem em liha nem coluna nada acontece
        }
    }
    
        //boolean para saber se o jogar andou
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
            return true;
    }

}
