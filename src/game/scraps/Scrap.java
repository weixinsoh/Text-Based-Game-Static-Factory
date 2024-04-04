package game.scraps;

import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.items.DropAction;
import edu.monash.fit2099.engine.items.Item;
import edu.monash.fit2099.engine.items.PickUpAction;
import game.Ability;

public abstract class Scrap extends Item {
    /***
     * Constructor.
     *  @param name the name of this Item
     * @param displayChar the character to use to represent this item if it is on the ground
     * @param portable true if and only if the Item can be picked up
     */
    public Scrap(String name, char displayChar, boolean portable) {
        super(name, displayChar, portable);
    }

    /**
     * Create and return an action to pick this Item up.
     * If this Item is not portable, returns null.
     *
     * @return a new PickUpItemAction if this Item is portable, null otherwise.
     */
    @Override
    public PickUpAction getPickUpAction(Actor actor) {
        if(portable && actor.hasCapability(Ability.PICKUP_SCRAPS)) {
            return new PickUpAction(this);
        }
        return null;
    }

    /**
     * Create and return an action to drop this Item.
     * If this Item is not portable, returns null.
     * @return a new DropItemAction if this Item is portable, null otherwise.
     */
    @Override
    public DropAction getDropAction(Actor actor) {
        if(portable && actor.hasCapability(Ability.PICKUP_SCRAPS))
            return new DropAction(this);
        return null;
    }
}
