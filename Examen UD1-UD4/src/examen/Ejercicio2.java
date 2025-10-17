package examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int pares = 0;
        int impares = 0;
        int sumaTotal = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        
        // Leer 10 números enteros
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            
            // Acumular suma total
            sumaTotal += numero;
            
            // Comprobar si es par o impar
            if (numero % 2 == 0) {
                pares++;
                sumaPares += numero;   // Acumulador de pares
            } else {
                impares++;
                sumaImpares += numero; // Acumulador de impares
            }
        }
        
        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        
        sc.close();
    }
}
