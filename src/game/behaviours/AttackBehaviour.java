package game.behaviours;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.actors.Behaviour;
import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.GameMap;
import edu.monash.fit2099.engine.positions.Location;
import game.actions.AttackAction;
import game.Status;

import java.util.ArrayList;
import java.util.Random;

public class AttackBehaviour implements Behaviour {
    private final Random random = new Random();

    @Override
    public Action getAction(Actor actor, GameMap map) {

        ArrayList<Action> actions = new ArrayList<>();

        for (Exit exit : map.locationOf(actor).getExits()) {
            Location destination = exit.getDestination();
            if (destination.containsAnActor()) {
                Actor target = map.getActorAt(destination);
                if (!target.hasCapability(Status.HOSTILE_TO_INTERN)) {
                    actions.add(new AttackAction(target, exit.getName()));
                }
            }
        }

        if (!actions.isEmpty()) {
            return actions.get(random.nextInt(actions.size()));
        }
        else {
            return null;
        }
    }
}
