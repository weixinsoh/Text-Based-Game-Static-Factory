package game.specialscraps.fruits;

import edu.monash.fit2099.engine.actors.Actor;

public class BigFruit extends HealingFruit {
    public static final double DROPPING_PROBABILITY = 0.3;
    public static final int HEAL_POINTS = 2;

    public BigFruit() {
        super("big fruit", 'O', DROPPING_PROBABILITY, HEAL_POINTS);
    }

}
