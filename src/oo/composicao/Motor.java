
package oo.composicao;

public class Motor {
    boolean ligado = false;
    double fator_rotacao = 1;//quando o motor liga, o fator_rotacao fica no 1, a cada aceleração chama o método
                                                    //giros
    
    int giros(){
        if (!ligado) {//se ligado for diferente do original
            return 0;
        }else
            return (int) (fator_rotacao * 3000);
    }
}
