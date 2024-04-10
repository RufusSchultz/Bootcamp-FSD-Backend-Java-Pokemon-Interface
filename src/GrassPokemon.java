import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.type = "grass";
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leaf Storm!");
        switch (enemy.type) {
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                System.out.println("It's super effective!");
                break;
            case "fire":
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

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Solar Beam!");
        switch (enemy.type) {
            case "water":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
                System.out.println("It's super effective!");
                break;
            case "fire":
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

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leech Seed!");
        switch (enemy.type) {
            case "water":
                System.out.println(name.getName() + " leeches 12 hp from " + enemy.getName());
                enemy.setHp(enemy.getHp() - 12);
                name.setHp(name.getHp() + 12);
                break;
            case "electric":
                System.out.println(name.getName() + " leeches 20 hp from " + enemy.getName());
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
                System.out.println("It's super effective!");
                break;
            case "fire":
                System.out.println(name.getName() + " leeches 15 hp from " + enemy.getName());
                enemy.setHp(enemy.getHp() - 15);
                name.setHp(name.getHp() + 15);
                break;
            default:
                System.out.println(name.getName() + " leeches 10hp from " + enemy.getName());
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
                System.out.println("It's not very effective");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hitpoints remaining");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leave Blade!");
        switch (enemy.type) {
            case "water":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                System.out.println("It's super effective!");
                break;
            case "fire":
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

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    List<String> getAttacks() {
        return attacks;
    }
}
