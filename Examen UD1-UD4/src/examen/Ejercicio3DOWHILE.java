package examen;

import java.util.Scanner;

public class Ejercicio3DOWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;
        int sumaTotal = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contador = 1;

        do {
            System.out.print("Introduce el número " + contador + ": ");
            numero = sc.nextInt();

            sumaTotal += numero;

            if (numero % 2 == 0) {
                pares++;
                sumaPares += numero;
            } else {
                impares++;
                sumaImpares += numero;
            }

            contador++;
        } while (contador <= 10);

        System.out.println("\n--- Resultados ---");
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);

        sc.close();
    }
}