package deviance.arcanegear.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class agMain extends CreativeTabs {
	public agMain(String label) {
		super(label);
	}	
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.APPLE);
		}
}