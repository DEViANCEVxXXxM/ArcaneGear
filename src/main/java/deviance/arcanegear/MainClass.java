package deviance.arcanegear;

import deviance.arcanegear.creativetabs.*;
import deviance.arcanegear.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MainClass.MODID, useMetadata = true)
public class MainClass
{
    public static final String MODID = "arcanegear";
    public static CreativeTabs agMain = new agMain("agMain"); //������� � ��������

    @SidedProxy(clientSide = "deviance.arcanegear.proxy.ClientProxy", serverSide = "deviance.arcanegear.proxy.CommonProxy") //��������� ������
   	public static CommonProxy proxy;
    

    //���-������������� (����������� "�����, ��������, �������")
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event); //���������� ������������ � ������-�����
    }
    
    //������������� (����������� "���, ���������, ������")
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event); //���������� ������������ � ������-�����
    }
    
    //����-������������� (����������� "Ore-Dict, ����������, ������")
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event); //���������� ������������ � ������-�����
    }
}