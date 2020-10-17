package portal.type;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.units.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.ui.*;
import portal.content.*;
import portal.world.blocks.power.*;

public class CubeUnitType extends UnitType{
	public Color baseColor;
	public Color activeColor = Color.valueOf("ffd37f");
	public Effect deathEffect = Fx.none;
	
	public CubeUnitType(String name){
		super(name);
		
		defaultController = () -> new CubeAI();
	}
	
	@Override
	public Color cellColor(Unit unit){
		if(unit.blockOn() instanceof PowerBase){
			return Tmp.c1.set(Color.black).lerp(activeColor, unit.healthf() + Mathf.absin(Time.time(), Math.max(unit.healthf() * 5f, 1f), 1f - unit.healthf()));
		}else{
			return Tmp.c1.set(Color.black).lerp(baseColor, unit.healthf() + Mathf.absin(Time.time(), Math.max(unit.healthf() * 5f, 1f), 1f - unit.healthf())); 
		}
	}
	
	public class CubeAI extends AIController{
		protected void updateVisuals(){
			
		}
		
		protected void pathfind(int pathTarget){
			
		}
		
		protected boolean shouldShoot(){
			return false;
		}
	}
}