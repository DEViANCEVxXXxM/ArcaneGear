package deviance.arcanegear.main;

import deviance.arcanegear.MainClass;
import net.minecraft.item.Item;

public class ItemMain extends Item {
	public ItemMain(String name,int maxStackSize) {
		this.setRegistryName(name);
		this.setCreativeTab(MainClass.agMain);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(maxStackSize);
	}
}