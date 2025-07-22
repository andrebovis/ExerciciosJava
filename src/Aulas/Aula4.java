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
        list.add(11); 

        
        double soma = 0.0;
        for (Integer numero : list) {
            soma += numero;
        }
        double media = soma / list.size();
     
      
        int menorNum = list.get(0);
        for (Integer numero : list) {
            if (numero < menorNum) {
                menorNum = numero;
            }
        }
     
        int maiorNum = list.get(0);
        for (Integer numero : list) {
            if (numero > maiorNum) {
                maiorNum = numero;
            }
        }
     
        int pares = 0;
        for (Integer numero : list) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
    
        int impares = 0;
        for (Integer numero : list) {
                        if (numero % 2 != 0) {
                impares++;
            }
        }
    
        List<Integer> primosEncontrados = new ArrayList<>();
        for (Integer numero : list) {
            if (isPrimo(numero)) { // Chamamos a função isPrimo
                primosEncontrados.add(numero);
            }
        }
        // Agora a lista 'primosEncontrados' contém todos os números primos da 'list'.
        // Você pode usá-la para o que precisar, mas não a imprimiremos aqui, conforme sua solicitação.
        // Por exemplo, para verificar: System.out.println("Primos: " + primosEncontrados);
    }

    // --- Função Auxiliar para verificar se um número é primo ---
    // Esta função deve ser 'static' para ser chamada diretamente de 'main'.
    // Ela é definida FORA do método main, mas DENTRO da classe Aula4.
    public static boolean isPrimo(int numero) {
        if (numero <= 1) { // Números menores ou iguais a 1 não são primos
            return false;
        }
        // Testamos divisibilidade de 2 até a raiz quadrada do número.
        // Se encontrar um divisor, não é primo.
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true; // Se não encontrou divisores, é primo
    }
    
}
