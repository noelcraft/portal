package portal.type;

import arc.*;
import arc.audio.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.type.*;
import portal.content.*;
import portal.type.*;

import static mindustry.Vars.*;

public class CubeUnit extends UnitEntity{
	public CubeUnitType ctype;
	
	public void collision(Hitboxc other, float x, float y){
		Log.info(ctype.deathEffect);
	}
	
	public void type(UnitType type){
		if(type instanceof CubeUnitType){
			ctype = (CubeUnitType) type;
			setStats(ctype);
		}else{
			return;
		}
	}
	
	public void setStats(UnitType type){
		if(type instanceof CubeUnitType) ctype = (CubeUnitType) type;
		super.setStats(type);
	}
	
	public void destroy(){
		float shake = hitSize / 3f;
		
		ctype.deathEffect.at(this);
		Effect.shake(shake, shake, this);
		ctype.deathSound.at(this);
		Events.fire(new UnitDestroyEvent(this));

		if(!headless){
			for(int i = 0; i < ctype.wreckRegions.length; i++){
				if(ctype.wreckRegions[i].found()){
					float range = ctype.hitSize / 4f;
					Tmp.v1.rnd(range);
					Effect.decal(ctype.wreckRegions[i], x + Tmp.v1.x, y + Tmp.v1.y, rotation - 90);
				}
			}
		}

		remove();
	}
	
	@Override
	public int classId(){
		return PortalUnitTypes.getClassId(0);
	}
}