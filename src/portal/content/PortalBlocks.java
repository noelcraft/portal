package portal.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.experimental.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import portal.world.blocks.*;

import static mindustry.type.ItemStack.*;

public class PortalBlocks implements ContentList{
	public static Block
	
	//power
	powerTransferer, powerTransfererHollow, powerTransfererClear;
	
	@Override
	public void load(){
		//region power
		powerTransferer = new PowerTransferer("power-transferer"){{
			requirements(Category.power, with(Items.copper, 1, Items.lead, 3, Items.silicon, 5));
			health = 10;
		}};
		
		powerTransfererHollow = new PowerTransferer("power-transferer-hollow"){{
			requirements(Category.power, with(Items.copper, 1, Items.lead, 3, Items.silicon, 5));
			health = 10;
		}};
		
		powerTransfererClear = new PowerTransferer("power-transferer-clear"){{
			requirements(Category.power, with(Items.copper, 1, Items.lead, 3, Items.silicon, 5));
			health = 10;
			isClear = true;
		}};
	}
}