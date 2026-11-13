public class Musica {

    // Crear una lista con notas musicales
    public static String[] notas = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si"};                                     

    //Imprimir una melodía aleatoria
    public static void imprimirMelodia(int longitud) {
        for (int i = 0; i < longitud; i++) {
            int indice = (int) (Math.random() * notas.length);
            System.out.print(notas[indice] + " ");
        }
        System.out.println();
    }
    
}

