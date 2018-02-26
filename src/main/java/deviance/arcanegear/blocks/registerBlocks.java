package deviance.arcanegear.blocks;

import deviance.arcanegear.main.blocks.BlockMain;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class registerBlocks {
	
	//metal
	//block
	public static Block arcanite_block = new BlockMain(Material.IRON, "arcanite_block", 15F, 10F, "pickaxe", 1, SoundType.METAL);
	public static Block syfinite_block = new BlockMain(Material.IRON, "syfinite_block", 15F, 10F, "pickaxe", 1, SoundType.METAL);
	public static Block evenite_block = new BlockMain(Material.IRON, "evenite_block", 15F, 10F, "pickaxe", 1, SoundType.METAL);
	public static Block devinite_block = new BlockMain(Material.IRON, "devinite_block", 16F, 15F, "pickaxe", 1, SoundType.METAL);
	public static Block redolite_block = new BlockMain(Material.IRON, "redolite_block", 16F, 15F, "pickaxe", 1, SoundType.METAL);
	//ore
	public static Block arcanite_ore = new BlockMain(Material.ROCK, "arcanite_ore", 15F, 10F, "pickaxe", 1, SoundType.STONE);
	public static Block syfinite_ore = new BlockMain(Material.ROCK, "syfinite_ore", 15F, 10F, "pickaxe", 1, SoundType.STONE);
	public static Block redolite_ore = new BlockMain(Material.ROCK, "redolite_ore", 15F, 10F, "pickaxe", 1, SoundType.STONE);
	

	public static void register() {
		//metal
		//block
		setRegister(arcanite_block);
		setRegister(syfinite_block);
		setRegister(evenite_block);
		setRegister(devinite_block);
		setRegister(redolite_block);
		//ore
		setRegister(arcanite_ore);
		setRegister(arcanite_ore);
		setRegister(arcanite_ore);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender() {
		//metal
		//block
		setRender(arcanite_block);
		setRender(syfinite_block);
		setRender(evenite_block);
		setRender(devinite_block);
		setRender(redolite_block);
		//ore
		setRender(arcanite_ore);
		setRender(syfinite_ore);
		setRender(redolite_ore);
	}

    private static void setRegister(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block)
    {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}