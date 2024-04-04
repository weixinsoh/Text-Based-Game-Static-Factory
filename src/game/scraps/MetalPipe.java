package game.scraps;

import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.positions.Location;
import edu.monash.fit2099.engine.weapons.WeaponItem;
import game.AttackAction;

public class MetalPipe extends WeaponItem {

    public MetalPipe() {
        super("metal pipe", '!', 1, "pokes", 20);
    }
}
