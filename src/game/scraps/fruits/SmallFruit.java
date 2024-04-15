package game.scraps.fruits;

import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;

/**
 * Class representing small fruit that can be produced by the sapling of the inheritree.
 *
 */
public class SmallFruit extends Fruit {
    /**
     * The probability to drop the fruit.
     *
     */
    public static final double DROPPING_PROBABILITY = 0.2;

    /**
     * The amount of points it can heal after consuming by the actor.
     *
     */
    public static final int HEAL_POINTS = 1;

    /**
     * Constructor of the SmallFruit class.
     *
     */
    public SmallFruit() {
        super("small fruit", 'o', DROPPING_PROBABILITY, HEAL_POINTS);
    }

}
