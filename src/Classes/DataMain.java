package Classes;

public class DataMain {
    public static void main(String[] args) {
        
        //Criei um novo objeto do tipo Data
        Data aniversario = new Data();
        
        //Joguei as propriedades do objeto que criei para variáveis
        int dia = aniversario.dias = 31;
        int mes = aniversario.mess = 12;
        Integer ano = aniversario.anos = 2011;

        //Converti o ano para texto, para poder fazer a validação .lenght(Método String.ValueOf(variavel))
        String ano_String = String.valueOf(ano);
        
        if (dia < 1 ||dia > 31) {
            System.out.println("Dia inválido");
        }
        else if (mes < 1 ||mes > 12) {
            System.out.println("Mês inválido");
        }
        else if (ano_String.length() < 4 || ano_String.length() > 4 ) {
            System.out.println("Ano inválido");
        }
        else{      
             System.out.printf("Usando diretamente as variáveis : %d/%d/%s",dia,mes,ano);
             
        }
        System.out.println("");
        
        //-------------------------------------------------------------------------------------------------------
        
        //Data usando método com parametro
        Data niver = new Data();
        
        //Com 3 parâmetros passados separadamente
        String D = niver.DataFormatada2("21","05","1991");
        System.out.println("Usando método com 3 parâmetros "+D);
        
        //Com 1 parametro passando a data completa
        Data niver3 = new Data();
        System.out.print("Usando método com 1 parâmetros: "+niver3.DataFormatada3("21/05/1991"));
        System.out.println("");
               
        //RESPOSTA DO PROFESSOR//
        Data niver4 = new Data();
        niver4.dias = 21;
        niver4.mess = 05;
        niver4.anos = 1991;
        System.out.printf("Usando método sem parâmetros e convertendo int para String : "+niver4.Dataformatada4());
        
        //----------------------------------------------------------------------
        //Chamada de construtor com 3 parâmetros
        System.out.println("");
        Data niver5 = new Data(21, 05,1991);
        System.out.println("Usando construtor com 3 parâmetros: "+niver5.dias+"/"+niver5.mess+"/"+niver5.anos);
        
        //Chamada de construtor com 3 parâmetros
        Data niver6 = new Data();
        System.out.println("Usando construtor sem parâmetro e com valor default: "+niver6.dias+"/"+niver6.mess+"/"+niver6.anos);

    }
}
