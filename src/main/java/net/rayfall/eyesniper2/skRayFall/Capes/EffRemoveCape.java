package net.rayfall.eyesniper2.skRayFall.Capes;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;
import org.eclipse.jdt.annotation.Nullable;

import tfw.Capes.General.Capes;
import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;

public class EffRemoveCape extends Effect{
	
	private Expression<Player> player;

	@SuppressWarnings("unchecked")
	@Override
	public boolean init(Expression<?>[] e, int arg1, Kleenean arg2,
			ParseResult arg3) {
		player = (Expression<Player>) e[0];
		return true;
	}

	@Override
	public String toString(@Nullable Event arg0, boolean arg1) {
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void execute(Event evt) {
		if(player != null){
			Player p = player.getSingle(evt);
			ItemStack i = p.getItemInHand();
			p.setItemInHand(null);
			Capes.capeInHand(p);
			p.setItemInHand(i);
		}
		
	}

}
