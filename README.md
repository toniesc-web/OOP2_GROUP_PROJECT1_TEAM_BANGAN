public class Player extends Character implements Attackable {

    private Inventory inventory;

    public Player(String name, int health) {
        super(name, health);
        inventory = new Inventory();
    }

    public void attack(Character target) {
        target.takeDamage(20);
        System.out.println(name + " attacks " + target.name);
    }

    public void display() {
        System.out.println("Player: " + name + " HP: " + health);
    }
    public void defend(){
        System.out.println(name + " defends ally! " + health + " hp left.");
    }
}
