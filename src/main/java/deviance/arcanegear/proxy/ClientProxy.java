package deviance.arcanegear.proxy;

import deviance.arcanegear.blocks.registerBlocks;
import deviance.arcanegear.items.registerItem;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {
    
	//���-������������� (����������� "�����, ��������, �������")
	@Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

	 //������������� (����������� "���, ���������, ������")
    @Override
    public void init(FMLInitializationEvent event) {
       	registerItem.registerRender();
    	registerBlocks.registerRender();
    	super.init(event);
    }

    //����-������������� (����������� "Ore-Dict, ����������, ������")
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}