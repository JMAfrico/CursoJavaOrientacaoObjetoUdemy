package oo.Gererics;

import java.util.List;


public class ListaUtil {

    //capturar o ultimo elemento de uma lista genérica
    //na chamada do método é necessário fazer uma conversão forçada(cast)
    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size()-1);
    }
    
        //capturar o ultimo elemento de uma lista genérica
        //na chamada do método não é necessário fazer conversão pq aqui na construção do método
        //o parametro que é recebido é o mesmo que o método vai puxar
        public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size()-1);
        }
}
