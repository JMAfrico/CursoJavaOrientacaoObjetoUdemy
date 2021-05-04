package oo.abstrato;

public abstract class Animal {

    //metodo que sera comum a todas as classes filhas, entao aqui ja pode ser feito o corpo do metodo
    public String respirar(){
        return "CO2";
    }
    
    //para criar metodo abstrato a classe deve ser abstrata
    //cada classe filha tera sua diferenca no andar, entao aqui deve ser abstrata
    //e na hora de chamar o metodo na classe filha , pode ser necessario declarar o corpo
    public abstract String andar();
    
}
