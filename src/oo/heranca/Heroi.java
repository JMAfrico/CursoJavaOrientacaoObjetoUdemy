package oo.heranca;

//Heroi herda da classe jogador, ou seja JOGADOR NO TOPO, HEROI EM BAIXO
public class Heroi extends Jogador{

         /* MÉTODO COPIANDO O MÉTODO DA CLASSE PAI
        boolean atacar(Jogador oponente){
        
        int eixoX = x - oponente.x;
        int eixoY = y - oponente.y;
        
        if(eixoX == 0 && eixoY == 1){//oponente ta na posição X(mesma coluna) e Y(um do lado do outro)
            oponente.vida = vida -20;
            return true;
        }
        else if (eixoX== 1 && eixoY == 0){//oponente ta na posição X(coluna vizinha) e Y(mesma linha)
            oponente.vida = vida -20;
            return true;
        } else{
                return false;//caso nao esteja próximo nem em liha nem coluna nada acontece
        }

    }*/
        
         //MÉTODO CHAMANDO O MÉTODO DA CLASSE PAI ATRAVÉZ DO SUPER
        boolean atacar(Jogador oponente){
                    boolean ataque1 = super.atacar(oponente);
                    return ataque1;
            
        }

            
        
}
