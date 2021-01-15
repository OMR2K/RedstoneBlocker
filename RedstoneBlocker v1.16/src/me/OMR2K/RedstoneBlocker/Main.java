package me.OMR2K.RedstoneBlocker;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.codedred.playtimes.api.TimelessPlayer;

public class Main extends JavaPlugin implements Listener 
{

	public void onEnable()
	{
		
		System.out.println("(!) RedstoneBlocker has been enabled!");
		
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		
		loadConfig();
		
	}
	
	public void onDisable()
	{
		
		System.out.println("(!) RedstoneBlocker has been disabled!");
		
	}
	
	public void loadConfig()
	{
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e)
	{
		
		TimelessPlayer player = new TimelessPlayer(e.getPlayer());
		
		if ( (e.getBlock().getType() == Material.REDSTONE_WIRE 
				|| e.getBlock().getType() == Material.REDSTONE_BLOCK 
				|| e.getBlock().getType() == Material.REDSTONE_WALL_TORCH 
				|| e.getBlock().getType() == Material.PISTON 
				|| e.getBlock().getType() == Material.STICKY_PISTON 
				|| e.getBlock().getType() == Material.COMPARATOR 
				|| e.getBlock().getType() == Material.DISPENSER 
				|| e.getBlock().getType() == Material.LEVER )
				&& ( (player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")))
		{
			e.setCancelled(true);
			
			e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place redstone.");
		}
		
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (!(sender instanceof Player)) {
			sender.sendMessage("Cannot use this command");
			return false;
		}
		
		if (label.equalsIgnoreCase("rb"))
		{
			
			Player player = (Player) sender;
			
			if (args.length == 0) {
				
				player.sendMessage(ChatColor.RED + "Usage: /rb reload" );
			
			} else if (args[0].equalsIgnoreCase("reload"))
			{
				
				player.sendMessage(ChatColor.GREEN + "(!) Reloading plugin.");
				reloadConfig();
				player.sendMessage(ChatColor.GREEN + "(!) Plugin reloaded.");
				
			}
			
		}
		
		return false;
	}
	
}
