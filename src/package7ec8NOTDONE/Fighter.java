package package7ec8NOTDONE;

import java.util.Random;

public class Fighter {
    private final String name;
    private final String type;
    private final Integer skill;
    private Integer stamina;

    private final Integer SKILL_MAX = 18;
    private final Integer STAMINA_MAX = 24;
    private final Integer DICE_SIDES = 6;

    private final Random generator = new Random();

    public Fighter(String name, String type) {
        this.name = name;
        this.type = type;
        this.skill = generator.nextInt(SKILL_MAX) + 1;
        this.stamina = generator.nextInt(STAMINA_MAX) + 1;
    }

    public void takeDamage(int damage) {
        this.stamina -= damage;

        if (this.stamina < 0) {
            this.stamina = 0;
        }
    }

    public int calculateDamage() {
        return 2;
    }

    public int calculateAttackScore() {
        Integer dice1 = generator.nextInt(DICE_SIDES - 1) + 1;
        Integer dice2 = generator.nextInt(DICE_SIDES - 1) + 1;

        return dice1 + dice2 + this.skill;
    }

    public boolean isDead() {
        return this.stamina == 0;
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
