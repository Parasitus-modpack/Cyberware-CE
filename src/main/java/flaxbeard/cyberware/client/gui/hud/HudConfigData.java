package flaxbeard.cyberware.client.gui.hud;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import flaxbeard.cyberware.api.hud.IHudSaveData;
import flaxbeard.cyberware.common.CyberwareConfig;

public class HudConfigData implements IHudSaveData
{
	private Configuration config;
	
	private static final String C_HUD = "HUD";
	
	public HudConfigData(String name)
	{
		config = new Configuration(new File(CyberwareConfig.configDirectory, "cyberware_hud/" + name + ".cfg"));
	}
	

	@Override
	public void setString(String key, String s)
	{
		config.getString(key, C_HUD, s, "");
	}

	@Override
	public void setInteger(String key, int i)
	{
		config.getInt(key, C_HUD, i, Integer.MIN_VALUE, Integer.MAX_VALUE, "");
	}

	@Override
	public void setBoolean(String key, boolean b)
	{
		config.getBoolean(key, C_HUD, b, "");
	}

	@Override
	public void setFloat(String key, float f)
	{
		config.getFloat(key, C_HUD, f, Float.MIN_VALUE, Float.MAX_VALUE, "");
	}

	@Override
	public String getString(String key)
	{
		return config.getString(key, C_HUD, "", "");
	}

	@Override
	public int getInteger(String key)
	{
		return config.getInt(key, C_HUD, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, "");
	}

	@Override
	public boolean getBoolean(String key)
	{
		return config.getBoolean(key, C_HUD, false, "");
	}

	@Override
	public float getFloat(String key)
	{
		return config.getFloat(key, C_HUD, 0.0f, Float.MIN_VALUE, Float.MAX_VALUE, "");
	}
}
