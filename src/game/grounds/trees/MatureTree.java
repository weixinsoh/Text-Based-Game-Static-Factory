package game.grounds.trees;

import game.scraps.fruits.BigFruit;
import game.scraps.fruits.Fruit;

/**
 * Class representing the mature stage of the inheritree.
 *
 */
public class MatureTree extends Inheritree {
    /**
     * Constructor of the MatureTree class.
     *
     */
    public MatureTree() {
        super('T', 0);
    }

    /**
     * Grow a big fruit.
     *
     * @return a new big fruit.
     */
    @Override
    public Fruit growFruit() {
        return new BigFruit();
    }
}
