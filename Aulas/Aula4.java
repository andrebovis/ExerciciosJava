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

        realizarAnalisesDaLista(list);
    }

    public static void realizarAnalisesDaLista(List<Integer> numeros) {
        System.out.println("--- Resultados da Análise da Lista ---");

        double mediaCalculada = calcularMedia(numeros);
        System.out.println("Média da lista: " + mediaCalculada);

        int menorNumEncontrado = calcularMenorNum(numeros);
        System.out.println("Menor número na lista: " + menorNumEncontrado);

        int maiorNumEncontrado = calcularMaiorNum(numeros);
        System.out.println("Maior número na lista: " + maiorNumEncontrado);

        int totalPares = calcularPares(numeros);
        System.out.println("Total Pares : " + totalPares);

        int totalImpares = calcularImpares(numeros);
        System.out.println("Total Impares : " + totalImpares);

        List<Integer> primosEncontrados = encontrarPrimosNaLista(numeros);
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
            throw new IllegalArgumentException("A lista está vazia. Não é possível encontrar o menor número.");
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
            throw new IllegalArgumentException("A lista está vazia. Não é possível encontrar o maior número.");
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
        for ( Integer num : numeros) {
            if (num % 2 ==0) {
                totalPares++;
            }
        }
        return totalPares;
    }

    private static int calcularImpares(List<Integer> numeros) {
        int totalImpares = 0;
        for ( Integer num : numeros) {
            if (num % 2 !=0) {
                totalImpares++;
            }
        }
        return totalImpares;
    }

    private static List<Integer> encontrarPrimosNaLista(List<Integer> numeros) {
        List<Integer> primosEncontrados = new ArrayList<>();
        for (Integer numero : numeros) {
            if (isPrimo(numero)) {
                primosEncontrados.add(numero);
            }
        }
        return primosEncontrados;
    }
}

