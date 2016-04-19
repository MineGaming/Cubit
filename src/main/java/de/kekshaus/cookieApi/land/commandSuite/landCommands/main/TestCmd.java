package de.kekshaus.cookieApi.land.commandSuite.landCommands.main;

import org.bukkit.command.CommandSender;

import de.kekshaus.cookieApi.land.Landplugin;
import de.kekshaus.cookieApi.land.commandSuite.ILandCmd;

public class TestCmd implements ILandCmd {

	private Landplugin plugin;

	public TestCmd(Landplugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean runCmd(final CommandSender sender, String[] args) {

		sender.sendMessage("Test hallo");
		return true;
	}

}