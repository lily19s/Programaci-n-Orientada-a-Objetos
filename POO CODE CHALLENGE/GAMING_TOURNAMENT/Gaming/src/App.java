
public class App {

    public static void main(String[] args) throws Exception {

        Players objPlayer1 = new Players("Alex", 150);
        Players objPlayer2 = new Players("Maria", 200);
        Players objPlayer3 = new Players("John", 175);

        Team objDragons = new Team("Dragons");
        objDragons.registerPlayer(objPlayer1);
        objDragons.registerPlayer(objPlayer2);
        objDragons.registerPlayer(objPlayer3);

        objDragons.showInformation();
    }
}
