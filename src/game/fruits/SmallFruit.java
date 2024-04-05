package game.fruits;

import game.ConsumableItem;

public class SmallFruit extends Fruit {
    public static final double DROPPING_PROBABILITY = 0.2;
    public static final int HEAL_POINTS = 1;

    public SmallFruit() {
        super("small fruit", 'o', DROPPING_PROBABILITY, HEAL_POINTS);
    }

}
