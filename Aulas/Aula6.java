package Aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aula6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números (pressione Enter sem digitar nada para finalizar):");

        while (true) {
            System.out.print("Número: ");
            String entrada = scanner.nextLine();

            if (entrada.isEmpty()) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }

        Collections.sort(numeros);

        System.out.println("\nNúmeros em ordem crescente:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}