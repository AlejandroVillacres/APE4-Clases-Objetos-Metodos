public class Estudiante {
    // Atributos privados
    private String cedula;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private String estado;

    // Constructor
    public Estudiante(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = "Reprobado";
    }

    // Metodos set
    public void setCedula(String cedula) { this.cedula = cedula; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    // Asignar notas
    public void setNotas(double n1, double n2, double n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        calcularPromedio();
        determinarEstado();
    }

    // Metodos get
    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public double getPromedio() { return promedio; }
    public String getEstado() { return estado; }

    // Calcular promedio
    public void calcularPromedio() {
        this.promedio = (nota1 + nota2 + nota3) / 3.0;
    }

    // Determinar aprobacion
    public void determinarEstado() {
        if (this.promedio >= 7.00) {
            this.estado = "Aprobado";
        } else {
            this.estado = "Reprobado";
        }
    }

    // Imprimir datos
    public void mostrarInformacion() {
        System.out.printf("Cedula: %s | Nombre: %s %s | Promedio: %.2f | Estado: %s\n", 
                          cedula, nombre, apellido, promedio, estado);
    }
}
