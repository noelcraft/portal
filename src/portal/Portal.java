package portal;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Portal extends Mod{

	public Portal(){
		Log.info("Loaded Portal constructor.");

		Events.on(ClientLoadEvent.class, e -> {
			Time.runTask(10f, () -> {
				Vars.ui.showInfo(Core.bundle.get("dialog.portal.info"));
			});
		});
	}

	@Override
	public void loadContent(){
		Log.info("Loading Portal contents..");
	}

}
