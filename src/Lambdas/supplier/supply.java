package Lambdas.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class supply {

	public static void main(String[] args) {
		
		//N�O ENTRA PAR�METRO E RECEBE ALGUMA COISA
		
		Supplier<List<String>> lista = 
				() -> Arrays.asList("Ana","Bia","Lia");
				
		System.out.println(lista.get());
	}
}
