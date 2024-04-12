package game.grounds.trees;

import game.specialscraps.fruits.Fruit;
import game.specialscraps.fruits.SmallFruit;

public class Sapling extends Inheritree {
    private static final int timeToGrow = 5;

    /**
     * Constructor.
     *
     */
    public Sapling() {
        super('t', timeToGrow);
    }

    @Override
    public Fruit growFruit() {
        return new SmallFruit();
    }

    @Override
    public Inheritree getNextState() {
        return new MatureTree();
    }
}
