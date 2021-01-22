package package7ec8;

import java.util.Random;

public class Fighter {
    private final String name;
    private final String type;
    private final Integer skill;
    private Integer stamina;

    private final Integer SKILL_MAX = 18;
    private final Integer STAMINA_MAX = 24;

    private final Random generator = new Random();

    public Fighter(String name, String type) {
        this.name = name;
        this.type = type;
        this.skill = generator.nextInt(SKILL_MAX) + 1;
        this.stamina = generator.nextInt(STAMINA_MAX) + 1;
    }

    public void takeDamage(int damage) {
        stamina -= damage;
    }



    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", skill=" + skill +
                ", stamina=" + stamina +
                '}';
    }
}
