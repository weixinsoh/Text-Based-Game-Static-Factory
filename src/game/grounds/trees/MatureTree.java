package game.grounds.trees;

import game.specialscraps.fruits.BigFruit;
import game.specialscraps.fruits.Fruit;

public class MatureTree extends Inheritree {
    /**
     * Constructor.
     *
     */
    public MatureTree() {
        super('T', 0);
    }

    @Override
    public Fruit growFruit() {
        return new BigFruit();
    }
}
