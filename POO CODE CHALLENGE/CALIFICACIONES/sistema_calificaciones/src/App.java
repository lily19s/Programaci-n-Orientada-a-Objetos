
public class App {

    public static void main(String[] args) throws Exception {

        estudiante objest = new estudiante("Uriel", "25027001", 7, 8, 10);

        objest.getCalcularPromedio(
                objest.getParcial1(),
                objest.getParcial2(),
                objest.getParcial3());

        objest.getShowInformation();
    }
}
