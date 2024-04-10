import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.type = "fire";
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno!");
        switch (enemy.type) {
            case "electric":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                System.out.println("It's super effective!");
                break;
            case "water":
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

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Pump!");
        switch (enemy.type) {
            case "electric":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
                System.out.println("It's super effective!");
                break;
            case "water":
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

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Fire Lash!");
        switch (enemy.type) {
            case "electric":
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                System.out.println("It's super effective!");
                break;
            case "water":
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

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Flame Thrower!");
        switch (enemy.type) {
            case "electric":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                System.out.println("It's super effective!");
                break;
            case "water":
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

    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    List<String> getAttacks() {
        return attacks;
    }
}
