package oo.composicao;

public class Carro {
    
    //COMO DIZER QUE O CARRO TEM MOTOR?
    //CHAME A CLASSE MOTOR
    
    //Classe em maíusculo, nome em minusculo
    Motor motor = new Motor();
    
    void acelerar(){
        motor.fator_rotacao = motor.fator_rotacao + 0.4;
    }   
        void frear(){
        motor.fator_rotacao = motor.fator_rotacao - 0.4;
    }
       void  ligar(){
           motor.ligado = true;
       }     
       void  desligar(){
           motor.ligado = false;
       }
       boolean estaLigado(){
           return  motor.ligado;
       }
}
