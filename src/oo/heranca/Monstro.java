package oo.heranca;

//Heroi herda da classe jogador, ou seja JOGADOR NO TOPO, MOSTRO EM BAIXO( DO LADO DO HEROI)
public class Monstro extends Jogador{

        boolean atacar(Jogador oponente){
        
        int eixoX = x - oponente.x;
        int eixoY = y - oponente.y;
        
        if(eixoX == 0 && eixoY == 1){//oponente ta na posição X(mesma coluna) e Y(um do lado do outro)
            oponente.vida = vida -5;
            return true;
        }
        else if (eixoX== 1 && eixoY == 0){//oponente ta na posição X(coluna vizinha) e Y(mesma linha)
            oponente.vida = vida -5;
            return true;
        } else{
                return false;//caso nao esteja próximo nem em liha nem coluna nada acontece
        }
    }
}
