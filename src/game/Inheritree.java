package game;

import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;
import game.fruits.BigFruit;
import game.fruits.Fruit;
import game.fruits.SmallFruit;

import java.util.List;
import java.util.Random;

public class Inheritree extends Ground {
    public final Random random = new Random();

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

        if (!hasGrown && count > 5) {
            setDisplayChar('T');
            hasGrown = true;
        }

        List<Exit> exits = location.getExits();
        Location destination = exits.get(random.nextInt(exits.size())).getDestination();

        if (hasGrown) {
            fruit = new SmallFruit();
        } else {
            fruit = new BigFruit();
        }
        if (fruit.drop()) {
            destination.addItem(fruit);
        }

    }

    @Override
    public boolean blocksThrownObjects() {
        return true;
    }
}
