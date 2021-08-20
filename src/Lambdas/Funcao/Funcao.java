package Lambdas.Funcao;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		//EXEMPLO 1
		Function<Integer, String> parOuImpar = 
			numero -> numero % 2 == 0 ? "Par" : "Impar";
			
		System.out.println(parOuImpar.apply(2));
		
		
		//EXEMPLO 2
		Function<String, String> oResultadoE =
				valor -> "O resultado é " + valor;
		
		Function<String, String> feliz =
				valor -> valor + "!!!";
				
		String resultadoFinal = 
				parOuImpar.andThen(oResultadoE).andThen(feliz).apply(2);
		
		System.out.println(resultadoFinal);
		
		
	}
}
