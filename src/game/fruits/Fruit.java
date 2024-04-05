package game.fruits;

import edu.monash.fit2099.engine.items.Item;
import game.ConsumableItem;

public abstract class Fruit extends ConsumableItem {
    private double droppingProbability;

    /***
     * Constructor.
     * @param displayChar the character to use to represent this item if it is on the ground
     */
    public Fruit(String name, char displayChar, double droppingProbability, int healPoints) {
        super(name, displayChar, true, healPoints);
        this.droppingProbability = droppingProbability;
    }

    public boolean drop() {
        return Math.random() <= droppingProbability;
    }

}
