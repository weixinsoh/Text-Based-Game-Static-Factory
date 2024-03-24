package game;

import edu.monash.fit2099.engine.items.Item;

public class Fruit extends Item {

    /***
     * Constructor.
     * @param displayChar the character to use to represent this item if it is on the ground
     */
    public Fruit(char displayChar) {
        super("fruit", displayChar, true);
    }
}
