package game;

import edu.monash.fit2099.demo.conwayslife.Status;
import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.actors.Behaviour;
import edu.monash.fit2099.engine.displays.Display;
import edu.monash.fit2099.engine.positions.GameMap;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;

import java.util.ArrayList;
import java.util.List;

public class Inheritree extends Ground {
    private int count = 0;
    private boolean hasGrown;

    public Inheritree() {
        super('t');
        this.hasGrown = false;
    }

    @Override
    public void tick(Location location) {
        super.tick(location);
        count++;
        Fruit fruit;
        if (count > 5)
            setDisplayChar('T');
        if (hasGrown) {
            fruit = new Fruit('O');
            if (Math.random() <= 0.3) {

            }
        } else {
            fruit = new Fruit('o');
        }

    }

    @Override
    public boolean blocksThrownObjects() {
        return true;
    }

}
