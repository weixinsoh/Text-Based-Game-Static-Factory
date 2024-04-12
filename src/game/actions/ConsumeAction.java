package game.actions;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.GameMap;
import game.ConsumableItem;

public class ConsumeAction extends Action {
    ConsumableItem consumable;

    public ConsumeAction(ConsumableItem consumable) {
        this.consumable = consumable;
    }

    @Override
    public String execute(Actor actor, GameMap map) {
        actor.removeItemFromInventory(consumable);
        return consumable.consumedBy(actor);
    }

    @Override
    public String menuDescription(Actor actor) {
        return actor + " consumes " + consumable;
    }
}
