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

        
        double soma = 0.0;
        for (Integer numero : list) {
            soma += numero;
        }
        double media = soma / list.size();
        System.out.println("--- Resultados da Análise da Lista ---");
        System.out.println("Média da lista: " + media);

      
        
        int menorNum = list.get(0);
        for (Integer numero : list) {
            if (numero < menorNum) {
                menorNum = numero;
            }
        }
        System.out.println("Menor número na lista: " + menorNum);

      
        int maiorNum = list.get(0);
        for (Integer numero : list) {
            if (numero > maiorNum) {
                maiorNum = numero; }
        }
        System.out.println("Maior número na lista: " + maiorNum);

        int pares = 0;
        for (Integer numero : list) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);

    
        int impares = 0;
        for (Integer numero : list) {
          
            if (numero % 2 != 0) {
                impares++;
            }
        }
        System.out.println("Quantidade de números ímpares: " + impares);

        
        List<Integer> primosEncontrados = new ArrayList<>();
        for (Integer numero : list) {
            if (isPrimo(numero)) { 
                primosEncontrados.add(numero);
            }
        }
        {System.out.println("Números primos na lista: " + primosEncontrados);
        }
    }

    
    public static boolean isPrimo(int numero) {
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
}
