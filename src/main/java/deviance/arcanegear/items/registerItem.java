package deviance.arcanegear.items;

import deviance.arcanegear.main.ItemMain;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class registerItem {
    //metal
	//ingot
    public static Item arcanite_ingot = new ItemMain("arcanite_ingot",64);
    public static Item syfinite_ingot = new ItemMain("syfinite_ingot",64);
    public static Item evenite_ingot = new ItemMain("evenite_ingot",64);
    public static Item devinite_ingot = new ItemMain("devinite_ingot",64);
    public static Item redolite_ingot = new ItemMain("redolite_ingot",64);
    //dust
    public static Item arcanite_dust = new ItemMain("arcanite_dust",64);
    public static Item syfinite_dust = new ItemMain("syfinite_dust",64);
    public static Item evenite_dust = new ItemMain("evenite_dust",64);
    public static Item devinite_dust = new ItemMain("devinite_dust",64);
    public static Item redolite_dust = new ItemMain("redolite_dust",64);
    //molten
    public static Item arcanite_molten = new ItemMain("arcanite_molten",1);
    public static Item syfinite_molten = new ItemMain("syfinite_molten",1);
    public static Item evenite_molten = new ItemMain("evenite_molten",1);
    public static Item devinite_molten = new ItemMain("devinite_molten",1);
    public static Item redolite_molten = new ItemMain("redolite_molten",1);

    public static void register() {
        
    	//metal
    	//ingot
        setRegister(arcanite_ingot);
        setRegister(syfinite_ingot);
        setRegister(evenite_ingot);
        setRegister(devinite_ingot);
        setRegister(redolite_ingot);
        //dust
        setRegister(arcanite_dust);
        setRegister(syfinite_dust);
        setRegister(evenite_dust);
        setRegister(devinite_dust);
        setRegister(redolite_dust);
        //molten
        setRegister(arcanite_molten);
        setRegister(syfinite_molten);
        setRegister(evenite_molten);
        setRegister(devinite_molten);
        setRegister(redolite_molten);
    }
		
    @SideOnly(Side.CLIENT)
	public static void registerRender() {
    	
    	//metal
    	//ingot
        setRender(arcanite_ingot);
        setRender(syfinite_ingot);
        setRender(evenite_ingot);
        setRender(devinite_ingot);
        setRender(redolite_ingot);
        //dust
        setRender(arcanite_dust);
        setRender(syfinite_dust);
        setRender(evenite_dust);
        setRender(devinite_dust);
        setRender(redolite_dust);
        //molten
        setRender(arcanite_molten);
        setRender(syfinite_molten);
        setRender(evenite_molten);
        setRender(devinite_molten);
        setRender(redolite_molten);
    }
	
    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }

	@SideOnly(Side.CLIENT)
    private static void setRender(Item item)
    {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}