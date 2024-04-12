package game.specialscraps.fruits;

import game.ConsumableItem;

public abstract class Fruit extends ConsumableItem {
    private final double droppingProbability;

    /***
     * Constructor.
     * @param displayChar the character to use to represent this item if it is on the ground
     */
    public Fruit(String name, char displayChar, double droppingProbability) {
        super(name, displayChar, true);
        this.droppingProbability = droppingProbability;
    }

    public boolean drop() {
        return Math.random() <= droppingProbability;
    }

}
