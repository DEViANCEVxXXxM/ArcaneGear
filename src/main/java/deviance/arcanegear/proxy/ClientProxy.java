package deviance.arcanegear.proxy;

import deviance.arcanegear.blocks.registerBlocks;
import deviance.arcanegear.items.registerItem;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {
    
	//Пре-Инициализация (Регистрация "Блоки, Предметы, События")
	@Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

	 //Инициализация (Регистрация "Мир, Генерация, Крафты")
    @Override
    public void init(FMLInitializationEvent event) {
       	registerItem.registerRender();
    	registerBlocks.registerRender();
    	super.init(event);
    }

    //Пост-Инициализация (Регистрация "Ore-Dict, Интеграции, Прочее")
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}