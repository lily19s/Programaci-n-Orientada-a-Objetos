public class App {
    public static void main(String[] args) throws Exception {
       
        Developer objDev = new Developer("Mario", 25000, "Java");
        

        Designer objDesigner = new Designer("Laura", 22000, "Figma");
        
        objDev.showInformation();
        objDesigner.showInformation();
    }
}
