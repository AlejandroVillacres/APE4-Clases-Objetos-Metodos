import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instancias necesarias
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> lista = new ArrayList<>();
        int aprobados = 0;
        int reprobados = 0;

        // Registrar estudiantes
        for (int i = 0; i < 5; i++) {
            System.out.println("--- Datos del estudiante " + (i + 1) + " ---");
            System.out.print("Cedula: ");
            String ced = scanner.next();
            System.out.print("Nombre: ");
            String nom = scanner.next();
            System.out.print("Apellido: ");
            String ape = scanner.next();

            double n1, n2, n3;
            // Validar calificaciones
            do {
                System.out.print("Ingrese 3 notas (0-10): ");
                n1 = scanner.nextDouble();
                n2 = scanner.nextDouble();
                n3 = scanner.nextDouble();

                if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
                    System.out.println("Notas invalidas");
                }
            } while (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10);

            // Crear objeto
            Estudiante est = new Estudiante(ced, nom, ape);
            est.setNotas(n1, n2, n3);
            lista.add(est);
        }

        System.out.println("\n--- Listado completo ---");
        
        // Recorrer lista
        for (Estudiante est : lista) {
            est.mostrarInformacion();
            
            // Contar estados
            if (est.getEstado().equals("Aprobado")) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Mostrar resumen
        System.out.println("\n--- Resultados ---");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        scanner.close();
    }
}
