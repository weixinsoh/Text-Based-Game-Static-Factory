package game.specialscraps.fruits;

import edu.monash.fit2099.engine.actors.Actor;

public abstract class HealingFruit extends Fruit {

    public final int HEAL_POINTS;

    /***
     * Constructor.
     * @param name
     * @param displayChar the character to use to represent this item if it is on the ground
     * @param droppingProbability
     */
    public HealingFruit(String name, char displayChar, double droppingProbability, int healPoints) {
        super(name, displayChar, droppingProbability);
        this.HEAL_POINTS = healPoints;
    }

    @Override
    public String consumedBy(Actor actor) {
        actor.heal(HEAL_POINTS);
        return String.format("%s consumed %s and %s heals %s by %d points. ", actor, this, this, actor, HEAL_POINTS);
    }
}
