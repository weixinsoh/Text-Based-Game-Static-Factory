package game.grounds.trees;

import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;
import game.specialscraps.fruits.Fruit;

import java.util.List;
import java.util.Random;

public abstract class Inheritree extends Ground {
    public final Random random = new Random();

    private int count = 0;

    private int ticksBeforeGrow;

    public Inheritree(char displayChar, int ticksBeforeGrow) {
        super(displayChar);
        this.ticksBeforeGrow = ticksBeforeGrow;
    }

    public abstract Fruit growFruit();

    public Inheritree getNextState() {
        return null;
    }

    @Override
    public void tick(Location location) {
        super.tick(location);
        count++;

        if (count == ticksBeforeGrow + 1 && getNextState() != null) {
            location.setGround(getNextState());
        }

        List<Exit> exits = location.getExits();
        Location destination = exits.get(random.nextInt(exits.size())).getDestination();

        Fruit fruit = growFruit();
        if (fruit.drop()) {
            destination.addItem(fruit);
        }
    }

    @Override
    public boolean blocksThrownObjects() {
        return true;
    }
}
