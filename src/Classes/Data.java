package Classes;

public class Data {
    
    int dias,mess,anos;
    String dia,mes,ano;
    
    //Método com parâmetro INT e com associação de variavel com this
    public int DataFormatada(int dia,int mes,int ano){     
        this.dias = dia;
        this.mess = mes;
        this.anos = ano;
        
    return dia+mes+ano;
}
    //Método com parâmetro STRING e com associação de variavel com this
    public String DataFormatada2(String dia,String mes,String ano){         
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        String data = dia +"/"+ mes +"/"+ ano;
        return data;
}
    
     //Método com um parâmetro STRING e com associação de variavel com this
    public String DataFormatada3(String dataAni){         
        return dataAni;
}
    //RESPOSTA DO PROFESSOR
    public String Dataformatada4(){
        //converte a variável int para String
        return String.format("%d/%d/%d",dias,mess,anos);
    }
    
 
    //MÉTODO CONSTRUTOR
    
    //criei valor default (padrão) caso o usuário não dê nenhum valor
    public Data(){
        dias = 1; 
        mess = 1;
        anos = 1970;
    }
    public Data(int diaN,int mesN,int anoN){
        dias = diaN;
        mess = mesN;
        anos = anoN;
    }
}
