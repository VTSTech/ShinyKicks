package mc.v0923.ShinyKicks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.plugin.Plugin;

import mc.v0923.ShinyKicks.ShinyKicks;

public class EventsClass implements Listener {
	Plugin plugin = ShinyKicks.getPlugin(ShinyKicks.class);
	String kickPlayer = "";
	String kickReason = "";
	@EventHandler
	public void onPlayerKickEvent(PlayerKickEvent event) {
		Player player = event.getPlayer();
		String reason = event.getReason();
		kickPlayer = player.getDisplayName();
		kickReason = reason.toString();
		Bukkit.broadcastMessage(ChatColor.YELLOW + "[ShinyKicks] " + ChatColor.LIGHT_PURPLE + plugin.getConfig().getString("ShinyKicks.message") + ChatColor.DARK_RED + kickPlayer + ChatColor.YELLOW + " for " + ChatColor.AQUA + kickReason);
	}
}
