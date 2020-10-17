package portal.content;

import arc.func.*;
import arc.graphics.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.gen.*;
import mindustry.type.*;
import portal.content.*;
import portal.type.*;

public class PortalUnitTypes implements ContentList{
	private static Prov<? extends Unit>[] cons = new Prov[]{CubeUnit::new};
	private static final int[] idMap = new int[cons.length];
	
	public static UnitType
	
	//cubes
	companionCube, storageCube;
	
	/** classId for custom unit entities in entity mapping */
	public static int getClassId(int i){
		return idMap[i];
	}
	
	@Override
	public void load(){
		//load constructors
		for(int i = 0; i < EntityMapping.idMap.length; i++){
			for(int c = 0; c < idMap.length; c++){
				if(EntityMapping.idMap[i] == null){
					idMap[c] = i;
					EntityMapping.idMap[i] = cons[c];
				}
				if(c >= cons.length) break;
			}
		}
		
		//region cubes
		
		EntityMapping.nameMap.put("companion-cube", CubeUnit::new);
		EntityMapping.nameMap.put("storage-cube", CubeUnit::new);
		
		companionCube = new CubeUnitType("companion-cube"){{
			health = 40;
			speed = 0.01f;
			targetAir = false;
			targetGround = false;
			baseColor = Color.valueOf("f5bfe1");
		}};
		
		storageCube = new CubeUnitType("storage-cube"){{
			health = 40;
			speed = 0.01f;
			targetAir = false;
			targetGround = false;
			baseColor = Color.valueOf("6974c4");
		}};
		
		//endregion
	}
}