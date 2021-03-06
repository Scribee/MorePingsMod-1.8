package scribee.morePingsMod.gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;
import scribee.morePingsMod.config.ConfigHandler;
import scribee.morePingsMod.util.Reference;

public class KeywordSettings extends CategoryEntry{
	public KeywordSettings(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
		super(owningScreen, owningEntryList, configElement);
	}
	
	@Override
	protected GuiScreen buildChildScreen() {

		List<IConfigElement> elements = new ArrayList<IConfigElement>();

		elements.addAll((new ConfigElement(ConfigHandler.config.getCategory(ConfigHandler.CATEGORY_KEYWORDS.toLowerCase()))).getChildElements());

		return new GuiConfig(this.owningScreen, elements, Reference.MODID, ConfigHandler.CATEGORY_KEYWORDS,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()),
				ConfigHandler.CATEGORY_KEYWORDS);
	}
}
