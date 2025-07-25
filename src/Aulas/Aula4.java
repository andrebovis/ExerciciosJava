package Aulas;

import java.util.ArrayList;
import java.util.List;

public class Aula4 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(13);

       
        double mediaCalculada = calcularMedia(list);
        System.out.println("Média da lista: " + mediaCalculada);

     
        int menorNumEncontrado = calcularMenorNum(list);
        System.out.println("Menor número na lista: " + menorNumEncontrado);
        
        int maiorNumEncontrado = calcularMaiorNum(list);
        System.out.println("Menor número na lista: " + maiorNumEncontrado);
        
        int totalPares = calcularPares(list);
        System.out.println("Total Pares : " + totalPares);
        
        int totalImpares = calcularImpares(list);
        System.out.println("Total Impares : " + totalImpares);

        

       

        List<Integer> primosEncontrados = new ArrayList<>();
        for (Integer numero : list) {
            if (isPrimo(numero)) {
                primosEncontrados.add(numero);
            }
        }
        if (primosEncontrados.isEmpty()) {
            System.out.println("Nenhum número primo encontrado na lista.");
        } else {
            System.out.println("Números primos na lista: " + primosEncontrados);
        }
    }

 
    private static boolean isPrimo(int numero) { 
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calcularMedia(List<Integer> numeros) {
        double soma = 0.0;
        for (Integer num : numeros) {
            soma += num;
        }
        if (numeros.isEmpty()) { 
            return 0.0; 
        }
        return soma / numeros.size();
    }

    
    private static int calcularMenorNum(List<Integer> numeros) {
        if (numeros.isEmpty()) { 
            throw new IllegalArgumentException("A lista esta vazia ");
          
        }
        int menorNum = numeros.get(0); 
        for (Integer num : numeros) {  
            if (num < menorNum) {      
                menorNum = num;        
            }
        }
        return menorNum;
    }
    private static int calcularMaiorNum(List<Integer> numeros) {
    	if(numeros.isEmpty()) {
    		throw new IllegalArgumentException("A lista esta vazia ");
    	}
    	int maiorNum = numeros.get(0);
    	for ( Integer num : numeros) {
    		if (num > maiorNum) {
    			maiorNum = num;
    		}
    	}
    	return maiorNum;
    }
    private static int calcularPares(List<Integer> numeros) {
    	int totalPares = 0;
    	for ( Integer num :  numeros) {
    		if (num % 2 ==0) {
    			totalPares++;
    		}
    	}
    	return totalPares;
    }
    private static int calcularImpares(List<Integer> numeros) {
    	int totalImpares = 0;
    	for ( Integer num :  numeros) {
    		if (num % 2 !=0) {
    			totalImpares++;
    		}
    	}
    	return totalImpares;
    }
}
