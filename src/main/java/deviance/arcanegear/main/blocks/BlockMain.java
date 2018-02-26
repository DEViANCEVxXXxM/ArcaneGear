package deviance.arcanegear.main.blocks;

import deviance.arcanegear.MainClass;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMain extends Block{

	public BlockMain(final Material materialIn, final String name, float hardness,float resistanse, String hravLevel, int level, SoundType soundtype) {
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setSoundType(soundtype);
		this.setHardness(hardness);
		this.setResistance(resistanse);
		this.setHarvestLevel(hravLevel, level);
		this.setCreativeTab(MainClass.agMain);
	}
}