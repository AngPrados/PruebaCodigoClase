package examen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Contadores para cada calificación
        int insuficientes = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;
        
        double nota;
        
        // Bucle para pedir 10 notas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            
            // Validar nota (debe estar entre 0 y 10)
            while (nota < 0 || nota > 10) {
                System.out.println("Error: la nota debe estar entre 0 y 10.");
                System.out.print("Introduce de nuevo la nota del alumno " + i + ": ");
                nota = sc.nextDouble();
            }
            
            // Determinar calificación usando switch
            switch ((int) nota) {
                case 0, 1, 2, 3, 4 -> insuficientes++;
                case 5 -> suficientes++;
                case 6 -> bienes++;
                case 7, 8 -> notables++;
                case 9, 10 -> sobresalientes++;
            }
        }
        
        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Insuficientes: " + insuficientes);
        System.out.println("Suficientes: " + suficientes);
        System.out.println("Bien: " + bienes);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
        
        sc.close();
        
        System.out.println();
    }
}

