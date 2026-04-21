public class Boss extends Enemy {

    public Boss(String name, int health) {
        super(name, health);
    }

    public void attack(Character target) {
        target.takeDamage(30);
        System.out.println(name + " uses heavy attack!");
    }
}
