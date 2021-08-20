package Lambdas.operadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		//RECEBE UM VALOR COMO PARÂMETRO
		UnaryOperator<Integer> maisDois = 
				n -> n + 2;
				
		UnaryOperator<Integer> vezesDois = 
				n -> n * 2;
						
		UnaryOperator<Integer> aoQuadrado = 
				n -> n * n;
				
		//N+2
		System.out.println(maisDois.apply(2));
		
		//N*2
		System.out.println(vezesDois.apply(3));
		
		//N*N
		System.out.println(aoQuadrado.apply(4));
		
		//SOMA, MULTIPLICA E ELEVA AO QUADRADO DO PRIMEIRO P/ ULTIMO
		System.out.println(maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(2));
		
		//SOMA, MULTIPLICA E ELEVA AO QUADRADO DO ULTIMO P/ PRIMEIRO
		System.out.println(aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(2));
	}
}
