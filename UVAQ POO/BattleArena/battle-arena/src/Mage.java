
public class Mage extends Character {

    private int magicPower;
    private int mana;

    //constructor
    public Mage(String name, int health, int level, int magicPower, int mana) {
        super(name, health, level);

        this.magicPower = magicPower;
        this.mana = mana;
    }

    //getters
    public int getMagicPower() {
        return magicPower;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public int attack() {

        if (mana < 10) {
            return 0;
        }

        mana = mana - 10;

        int damage = getMagicPower() + (getLevel() * 3);

        return damage;
    }

    @Override
    public void showInformation() {
        super.showInformation();

        System.out.println("Magic Power: " + getMagicPower());
        System.out.println("Mana: " + getMana());
    }

    @Override 
    public String getAttack(){
        return "cast a fireball";
    }

}
