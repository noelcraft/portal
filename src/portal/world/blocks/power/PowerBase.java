package portal.world.blocks.power;

import mindustry.world.*;
import mindustry.world.meta.*;

public abstract class PowerBase extends Block{
	
	public PowerBase(String name){
		super(name);
		
		update = true;
		hasPower = true;
		group = BlockGroup.power;
	}
}