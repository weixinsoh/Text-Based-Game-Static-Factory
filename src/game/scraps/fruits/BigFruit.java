package game.scraps.fruits;

import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;

/**
 * Class representing big fruit that can be produced by the mature stage of the inheritree.
 *
 */
public class BigFruit extends Fruit {
    /**
     * The probability to drop the fruit.
     *
     */
    public static final double DROPPING_PROBABILITY = 0.3;

    /**
     * The amount of points it can heal after consuming by the actor.
     *
     */
    public static final int HEAL_POINTS = 2;

    /**
     * Constructor of the BigFruit class.
     *
     */
    public BigFruit() {
        super("big fruit", 'O', DROPPING_PROBABILITY, HEAL_POINTS);
    }
}
