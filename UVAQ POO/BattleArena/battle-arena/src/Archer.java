
public class Archer extends Character {

    private int dexterity;
    private int arrows;

    //constructor
    public Archer(String name, int health, int level, int dexterity, int arrows) {

        super(name, health, level);

        this.dexterity = dexterity;
        this.arrows = arrows;
    }

    //getters
    public int getDexterity() {
        return dexterity;
    }

    public int getArrows() {
        return arrows;
    }

    //methods and functions
    @Override
    public int attack() {

        if (arrows <= 0) {
            return 0;
        }

        arrows = arrows - 1;

        int damage = getDexterity() + getLevel();

        return damage;
    }

    @Override
    public void showInformation() {
        super.showInformation();

        System.out.println("Dexterity: " + getDexterity());
        System.out.println("Arrows: " + getArrows());
    }

    @Override 
    public String getAttack() {

        return "shoots an arrow";
    }
}
