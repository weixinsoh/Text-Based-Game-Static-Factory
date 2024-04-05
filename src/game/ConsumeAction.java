package game;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.GameMap;

public class ConsumeAction extends Action {
    ConsumableItem consumable;

    public ConsumeAction(ConsumableItem consumable) {
        this.consumable = consumable;
    }

    @Override
    public String execute(Actor actor, GameMap map) {
        actor.heal(consumable.getHealPoints());
        actor.removeItemFromInventory(consumable);
        return String.format("%s consumed %s. ", actor, this);
    }

    @Override
    public String menuDescription(Actor actor) {
        return null;
    }
}
