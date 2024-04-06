package game.grounds;

import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;
import game.actors.creatures.Creature;
import game.actors.creatures.HuntsmanSpider;

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

        List<Creature> creatures = new ArrayList<>();
        creatures.add(new HuntsmanSpider());
        Creature creature = creatures.get(random.nextInt(creatures.size()));

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
