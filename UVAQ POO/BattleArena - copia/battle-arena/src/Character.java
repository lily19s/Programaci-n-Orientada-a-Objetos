
public class Character {

    private String name;
    private int health;
    private int level;

    //constructor
    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;

    }

    //getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int attack() {
        return 10;
    }

    public String getAttack() {
        return "attacks";
    }

    public void receiveDamage(int damage) {

        this.health = this.getHealth() - damage;

        if (health < 0) {
            this.health = 0;
        }

    }

    public boolean isAlive() {

        if (this.health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void showInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Level: " + getLevel());
        System.out.println("-----------------------");
    }

}
