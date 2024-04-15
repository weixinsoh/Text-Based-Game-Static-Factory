package game.scraps.fruits;

import edu.monash.fit2099.engine.actors.Actor;
import game.consumable.Consumable;
import game.consumable.ConsumableItem;

/**
 * Abstract base class representing fruit that can be produced by the inheritree.
 *
 */
public abstract class Fruit extends ConsumableItem {
    /**
     * The probability to drop the fruit.
     *
     */
    private final double DROPPING_PROBABILITY;

    /**
     * The amount of points it can heal after consuming by the actor.
     *
     */
    private final int HEAL_POINTS;

    /***
     * Constructor.
     *
     * @param name the name of the fruit
     * @param displayChar the character to use to represent this fruit if it is on the ground
     * @param droppingProbability the probability of dropping the fruit
     * @param healPoints the points it can heal after consuming by the actor
     */
    public Fruit(String name, char displayChar, double droppingProbability, int healPoints) {
        super(name, displayChar, true);
        this.DROPPING_PROBABILITY = droppingProbability;
        this.HEAL_POINTS = healPoints;
    }

    /**
     * Drop the fruit with a probability.
     *
     *
     * @return a boolean indicating the fruit dropped.
     */
    public boolean drop() {
        return Math.random() <= DROPPING_PROBABILITY;
    }

    /**
     * Heal the actor after consuming.
     *
     * Overrides Consumable.consumedBy(Actor actor)
     *
     * @see Consumable#consumedBy(Actor) ()
     * @return a string representing the actor consumed the fruit and healed by point(s).
     */
    @Override
    public String consumedBy(Actor actor) {
        actor.heal(HEAL_POINTS);
        return String.format("%s and %s heals %s by %d points. ", super.consumedBy(actor), this, actor, HEAL_POINTS);
    }

}
