import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.type = "water";
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf!");
        switch (enemy.type) {
            case "grass":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                System.out.println("It's super effective!");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
                break;
            default:
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                System.out.println("It's not very effective");
        }
        System.out.println(enemy + " has " + enemy.getHp() + " hitpoints remaining");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Pump!");
        switch (enemy.type) {
            case "grass":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
                System.out.println("It's super effective!");
                break;
            case "electric":
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

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Canon!");
        switch (enemy.type) {
            case "grass":
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                System.out.println("It's super effective!");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
                break;
            default:
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                System.out.println("It's not very effective");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hitpoints remaining");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Rain Dance!");
        switch (enemy.type) {
            case "grass":
                System.out.println(enemy.getName() + " gains 5 hp");
                enemy.setHp(enemy.getHp() + 5);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                System.out.println("It's super effective!");
                break;
            case "electric":
                System.out.println("Has no effect on " + enemy.getName());
                break;
            default:
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
                System.out.println("It's not very effective");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hitpoints remaining");
    }

    List<String> attacks = Arrays.asList("surf", "hydroPump", "HydroCanon", "rainDance");
    List<String> getAttacks() {
        return attacks;
    }
}
