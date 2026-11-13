public class App {
    
    public static void main(String[] args) {
        System.out.println("Suma: " + suma(5, 3));
        System.out.println("Area del circulo: " + areaCirculo(2));
        System.out.print("Melodia: ");
        Musica.imprimirMelodia(8);
    }

    //funcion que suma dos numeros enteros
    public static int suma(int a, int b) {
        return a + b;
    }

    //funcion que calcula el area de un circulo
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

}
