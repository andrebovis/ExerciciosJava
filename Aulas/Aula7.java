package Aulas;

import java.util.ArrayList;
import java.util.List;

public class Aula7 {

	public static void main(String[] args) {
List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		List<Integer> resultados = new ArrayList<>();
		int somaAtual = 0;
		for (Integer numero : numeros) {
			somaAtual += numero;
			resultados.add(somaAtual);
			
			
			
		}
		System.out.println( resultados);	
		
		
	}
}


