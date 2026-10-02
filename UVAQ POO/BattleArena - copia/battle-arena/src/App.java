
public class App {

    public static void main(String[] args) throws Exception {

        Warrior Aquiles = new Warrior("Aquiles", 100, 8, 7, "Excalibur");
        Warrior Teseo = new Warrior("Teseo", 80, 9, 6, "Tizona");

        Mage Circe = new Mage("Circe", 90, 6, 8, 60);
        Mage Erichtho = new Mage("Erichtho", 95, 8, 10, 80);

        Archer Heracles = new Archer("Heracles", 90, 9, 6, 10);
        Archer Odiseo = new Archer("Odiseo", 80, 7, 9, 10);

        Arena BattleArena = new Arena("Palestra de Olimpia");
        BattleArena.addCharacter(Aquiles);
        BattleArena.addCharacter(Teseo);
        BattleArena.addCharacter(Circe);
        BattleArena.addCharacter(Erichtho);
        BattleArena.addCharacter(Heracles);
        BattleArena.addCharacter(Odiseo);

        BattleArena.listCharacters();
        BattleArena.Battle(Heracles, Aquiles);
        BattleArena.Battle(Circe, Teseo);
        BattleArena.Battle(Erichtho, Odiseo);

    }
}
