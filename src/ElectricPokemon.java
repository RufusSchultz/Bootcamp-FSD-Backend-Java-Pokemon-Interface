import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.type = "electric";
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder Punch!");
        switch (enemy.type) {
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                System.out.println("It's super effective!");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
                break;
            default:
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                System.out.println("It's not very effective");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hitpoints remaining");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Electro Ball!");
        switch (enemy.type) {
            case "fire":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
                System.out.println("It's super effective!");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
                break;
            default:
                System.out.println(enemy.getName() + " loses 1 hp");
                enemy.setHp(enemy.getHp() - 1);
                System.out.println("It's not very effective");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hitpoints remaining");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder!");
        switch (enemy.type) {
            case "fire":
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                System.out.println("It's super effective!");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
                break;
            default:
                System.out.println(enemy.getName() + " gains 10 hp");
                enemy.setHp(enemy.getHp() + 10);
                System.out.println("Oops!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hitpoints remaining");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Volt Tackle!");
        switch (enemy.type) {
            case "fire":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                System.out.println("It's super effective!");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                break;
            default:
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
                System.out.println("It's not very effective");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hitpoints remaining");
    }

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    List<String> getAttacks() {
        return attacks;
    }
}
