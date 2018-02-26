package deviance.arcanegear.proxy;

import deviance.arcanegear.blocks.registerBlocks;
import deviance.arcanegear.items.registerItem;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    
	//Пре-Инициализация (Регистрация "Блоки, Предметы, События")
	public void preInit(FMLPreInitializationEvent event) {
        registerItem.register();
        registerBlocks.register();
    }
    
	//Инициализация (Регистрация "Мир, Генерация, Крафты")
	public void init(FMLInitializationEvent event) {
    }
	
	//Пост-Инициализация (Регистрация "Ore-Dict, Интеграции, Прочее")
	public void postInit(FMLPostInitializationEvent event) {}
}
