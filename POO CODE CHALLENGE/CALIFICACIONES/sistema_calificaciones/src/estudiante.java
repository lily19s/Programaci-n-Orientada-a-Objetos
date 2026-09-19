
public class estudiante {

    private String name;
    private String matricula;
    private double parcial1;
    private double parcial2;
    private double parcial3;
    private static double total;
    private static double promedio;

    // constructor
    public estudiante(String name, String matricula, double parcial1, double parcial2, double parcial3) {
        
        this.matricula = matricula;
        this.name = name;

        if (parcial1 > 0 && parcial1 <= 100) {

            this.parcial1 = parcial1;
        }

        if (parcial2 > 0 && parcial2 <= 100) {

            this.parcial2 = parcial2;
        }

        if (parcial3 > 0 && parcial3 <= 100) {

            this.parcial3 = parcial3;

        }

    }

    // getters

    public String getName() {
        return name;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getParcial1() {
        return parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public double getParcial3() {
        return parcial3;
    }

    public double getTotal() {
        return total;
    }

    //methods and functions

    public double getCalcularPromedio(double parcial1, double parcial2, double parcial3) {

        total = ((parcial1 + parcial2 + parcial3) / 3);

        promedio = Math.round(total * 100.0) / 100.0;

        return promedio;
    }

    public void getShowInformation() {
        
        System.out.println("--- INFORMACION ---");
        System.out.println("Nombre: " + getName());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("------------------------");
        System.out.println("Parcial 1: " + getParcial1());
        System.out.println("Parcial 2: " + getParcial2());
        System.out.println("Parcial 3: " + getParcial3());
        System.out.println("-------------------------");
        System.out.println("Total: " + promedio);
        System.out.println("Dictamen: ");
        if (total >= 7) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Reprobado");
        }

    }

}
