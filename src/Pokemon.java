import java.util.List;

public class Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;

    protected String type;

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public Pokemon(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public String getFood() {
        return food;
    }
}
