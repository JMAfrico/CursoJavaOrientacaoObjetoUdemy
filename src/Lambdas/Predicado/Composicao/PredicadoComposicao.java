package Lambdas.Predicado.Composicao;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		//RECEBE INTEIRO E RETORNA TRUE OU FALSE
		Predicate<Integer> isPar =
				num -> num % 2 == 0;
		
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 && num <= 999;
				
		//RESPOSTA SE � PAR
		System.out.println(isPar.test(3));
		
		//RESPOSTA SE � TRES DIGITOS
		System.out.println(isTresDigitos.test(100));
		
		//RESPOSTA SE � PAR 'E' SE � 3 DIGITOS(O MESMO N�MERO)
		//COMPOSI��O DE FUN�OES, JUNTA AS DUAS 
		System.out.println(isPar.and(isTresDigitos).test(140));
		
		//RESPOSTA SE � PAR 'OU' SE � 3 DIGITOS(O MESMO N�MERO)
		//COMPOSI��O DE FUN�OES, JUNTA AS DUAS 
		System.out.println(isPar.or(isTresDigitos).test(140));
		
	}
}
