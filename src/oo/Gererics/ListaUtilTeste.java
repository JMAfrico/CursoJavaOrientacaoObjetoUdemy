package oo.Gererics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> Familia = new ArrayList<>();
        
       Familia.add("Joao");
        Familia.add("Elen");
       Familia.add("Mae");
       
       List<Integer> numeros = Arrays.asList(1,2,3);
       
       String ultimo_nome = (String) ListaUtil.getUltimo1(Familia);
        System.out.println(ultimo_nome);
        
        Integer ultima_posicao = (Integer) ListaUtil.getUltimo1(numeros);
        System.out.println(ultima_posicao);
        
         String ultimo_nome2 = ListaUtil.getUltimo2(Familia);
        System.out.println(ultimo_nome);
        
        Integer ultima_posicao2 = ListaUtil.getUltimo2(numeros);
        System.out.println(ultima_posicao);
        
        

        
        
    }
}
