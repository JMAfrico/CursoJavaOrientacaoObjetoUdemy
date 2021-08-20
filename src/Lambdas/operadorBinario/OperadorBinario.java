package Lambdas.operadorBinario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		//DOIS PARAMETROS DE ENTRADA DO MESMO TIPO E RETORNO TAMBEM
		BinaryOperator<Double> media = 
				(n1,n2) -> (n1 + n2) / 2;
		
		//PEGANDO RESULTADO E JOGANDO EM OUTRA FUNÇÃO 
		Function<Double, String> conceito = 
				m -> m>=7 ? "Aprovado":"Reprovado";
				
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));

			//----------------------------------------//
		
		
		//TRES PARAMETROS DE ENTRADA DO TIPO QUE EU QUISER E RESULTADO DO TIPO QUE QUISER
		BiFunction<Double, Double, String> resultado = (p1,p2) ->{
				double notafinal = (p1+p2)/2;
				return notafinal >= 7 ? "Aprovado" : "Reprovado";
		};
				
		System.out.println(resultado.apply(9.0, 9.0));
		
		
	}

}
