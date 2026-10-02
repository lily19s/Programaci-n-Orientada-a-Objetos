
public class Warrior extends Character {

    private int strength;
    private String armor;

    //constructor
    public Warrior(String name, int health, int level, int strength, String armor) {
        
        super(name, health, level);

        this.strength = strength;
        this.armor = armor;
    }

    //getters
    public int getStrength() {
        return strength;
    }

    public String getArmor() {
        return armor;
    }

    @Override
    public int attack() {
        int damage = getStrength() + (getLevel() * 2);
        return damage;
    }

    @Override
    public void showInformation() {
        super.showInformation();

        System.out.println("Strength: " + getStrength());
        System.out.println("Armor: " + getArmor());
    }

     @Override 
     
     public String getAttack() {
        return "attacks with his sword.";
    }

}
