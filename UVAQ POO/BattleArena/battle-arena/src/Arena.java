
import java.util.*;

public class Arena {

    private ArrayList<Character> characters = new ArrayList<Character>();
    private String name;

    //constructor
    public Arena(String name) {
        this.name = name;
    }

    //getters 
    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public String getName() {
        return name;
    }

    //methods and functions
    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void Battle(Character character1, Character character2) {

        int countRounds = 1;

        System.out.println(character1.getName() + " VS " + character2.getName());
        System.out.println();

        while (character1.isAlive() && character2.isAlive()) {

            System.out.println("ROUND: " + countRounds);
            System.out.println();

            int damage1 = character1.attack();

            character2.receiveDamage(damage1);

            System.out.println(character1.getName() + " attackts with is sword " + character1.getAttack());
            System.out.println("Damage: " + damage1);
            System.out.println(character2.getName() + " received " + damage1 + " damage");
            System.out.println("Health " + character2.getHealth());
            System.out.println("-------------------------------------------------");

            if (character2.isAlive()) {

                int damage2 = character2.attack();
                character1.receiveDamage(damage2);

                System.out.println(character2.getName() + " attackts with is sword " + character2.getAttack());
                System.out.println("Damage: " + damage2);
                System.out.println(character1.getName() + " received " + damage2 + " damage");
                System.out.println("Health: " + character1.getHealth());
                System.out.println();
            }

            countRounds++;

            if (character1.isAlive()) {

                System.out.println("Winner: " + character1.getName());

            } else {
                System.out.println("Winner: " + character2.getName());

            }

            System.out.println("===================================");
        }

    }

    public void listCharacters() {

        for (Character character : characters) {
            System.out.println(character);
        }
    }

}
