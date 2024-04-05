package game;

import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;
import game.actors.HuntsmanSpider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Crater extends Ground {
    public final Random random = new Random();

    public Crater() {
        super('u');
    }

    @Override
    public void tick(Location location) {
        super.tick(location);
        HuntsmanSpider creature = new HuntsmanSpider();
        List<Exit> exits = new ArrayList<>();
        for (Exit exit: location.getExits()) {
            if (exit.getDestination().canActorEnter(creature)) {
                exits.add(exit);
            }
        }
        Location destination = exits.get(random.nextInt(exits.size())).getDestination();

        if (Math.random() <= 0.05) {
            destination.addActor(creature);
        }
    }
}
