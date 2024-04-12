package game.specialscraps.fruits;

import edu.monash.fit2099.engine.actors.Actor;

public class SmallFruit extends HealingFruit {
    public static final double DROPPING_PROBABILITY = 0.2;
    public static final int HEAL_POINTS = 1;

    public SmallFruit() {
        super("small fruit", 'o', DROPPING_PROBABILITY, HEAL_POINTS);
    }

}
