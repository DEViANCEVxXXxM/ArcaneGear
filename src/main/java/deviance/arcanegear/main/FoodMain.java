package deviance.arcanegear.main;

import deviance.arcanegear.MainClass;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class FoodMain extends ItemFood {
	public Item item;
	public FoodMain(int amount, float saturation, boolean isWolfFood,String name,Item item) 
	// Регистрация пищи (Количество восполняемой еды (max20), Насыщенность, Съедобность для волка, Имя предмета, id предмета) 
	{
		super(amount, saturation, isWolfFood);	
	       this.setRegistryName(name);
	       this.setCreativeTab(MainClass.agMain);
	       this.setUnlocalizedName(name);
	       this.item = item;
	 }
	 
	
	@Override
	 public void onFoodEaten(ItemStack is, World worldIn, EntityPlayer player) {
	  	ItemStack itemSA = new ItemStack(item);
	  	if (!player.capabilities.isCreativeMode) player.getHeldItem(EnumHand.MAIN_HAND).shrink(1);
	  	if (!player.inventory.addItemStackToInventory(itemSA))
		  player.dropItem(itemSA, false);
	 return;
	}
}