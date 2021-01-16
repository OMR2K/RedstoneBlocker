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

		// Getting blocked items from the config, and assigning the boolean values
		boolean blockRedstoneDust = getConfig().getBoolean("redstone_dust");
		boolean blockRedstoneRepeater = getConfig().getBoolean("redstone_repeater");
		boolean blockRedstoneComparator = getConfig().getBoolean("redstone_comparator");
		boolean blockRedstoneTorch = getConfig().getBoolean("redstone_torch");
		boolean blockRedstoneBlock = getConfig().getBoolean("redstone_block");
		boolean blockPiston = getConfig().getBoolean("piston");
		boolean blockStickyPiston = getConfig().getBoolean("sticky_piston");
		boolean blockDispenser = getConfig().getBoolean("dispenser");
		boolean blockDropper = getConfig().getBoolean("dropper");
		boolean blockObserver = getConfig().getBoolean("observer"); 
		boolean blockLever = getConfig().getBoolean("lever");
		boolean blockPressurePlates = getConfig().getBoolean("pressure_plates");
		boolean blockTripwireHook = getConfig().getBoolean("tripwire_hook");
		boolean blockButtons = getConfig().getBoolean("buttons");
		boolean blockDaylightDetector = getConfig().getBoolean("daylight_detector");
		boolean blockHopper = getConfig().getBoolean("hopper");
		boolean blockTarget = getConfig().getBoolean("target");
		boolean blockTNT = getConfig().getBoolean("tnt");
		
		// Canceling the placing event for blocked blocks in the config file
		if (blockRedstoneDust 
				&& (e.getBlock().getType() == Material.REDSTONE_WIRE)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockRedstoneRepeater 
				&& (e.getBlock().getType() == Material.REPEATER)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockRedstoneComparator
				&& (e.getBlock().getType() == Material.COMPARATOR)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockRedstoneTorch 
				&& (e.getBlock().getType() == Material.REDSTONE_WALL_TORCH)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockRedstoneBlock 
				&& (e.getBlock().getType() == Material.REDSTONE_BLOCK)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockPiston
				&& (e.getBlock().getType() == Material.PISTON)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockStickyPiston
				&& (e.getBlock().getType() == Material.STICKY_PISTON)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockDispenser
				&& (e.getBlock().getType() == Material.DISPENSER)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockDropper
				&& (e.getBlock().getType() == Material.DROPPER)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockObserver
				&& (e.getBlock().getType() == Material.OBSERVER)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockLever
				&& (e.getBlock().getType() == Material.LEVER)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockRedstoneBlock 
				&& (e.getBlock().getType() == Material.REDSTONE_BLOCK)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockPressurePlates
				&& (e.getBlock().getType() == Material.OAK_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.STONE_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.SPRUCE_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.BIRCH_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.JUNGLE_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.ACACIA_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.DARK_OAK_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.CRIMSON_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.WARPED_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.POLISHED_BLACKSTONE_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE
					|| e.getBlock().getType() == Material.HEAVY_WEIGHTED_PRESSURE_PLATE)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockTripwireHook
				&& (e.getBlock().getType() == Material.TRIPWIRE_HOOK)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockButtons
				&& (e.getBlock().getType() == Material.OAK_BUTTON
					|| e.getBlock().getType() == Material.STONE_BUTTON
					|| e.getBlock().getType() == Material.SPRUCE_BUTTON
					|| e.getBlock().getType() == Material.BIRCH_BUTTON
					|| e.getBlock().getType() == Material.JUNGLE_BUTTON
					|| e.getBlock().getType() == Material.ACACIA_BUTTON
					|| e.getBlock().getType() == Material.DARK_OAK_BUTTON
					|| e.getBlock().getType() == Material.CRIMSON_BUTTON
					|| e.getBlock().getType() == Material.WARPED_BUTTON
					|| e.getBlock().getType() == Material.POLISHED_BLACKSTONE_BUTTON)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockDaylightDetector
				&& (e.getBlock().getType() == Material.DAYLIGHT_DETECTOR)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockHopper
				&& (e.getBlock().getType() == Material.HOPPER)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockTarget
				&& (e.getBlock().getType() == Material.TARGET)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
			}
		
		else if (blockTNT
				&& (e.getBlock().getType() == Material.TNT)
				&& ((player.getDays() * 24 + player.getHours()) < getConfig().getInt("hours")) )
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "You need at least " + getConfig().getInt("hours") + " hour(s) of playtime to place this.");
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
