package genericminecraftmod.block;

import genericminecraftmod.GenericMinecraftMod;
import net.minecraft.block.material.Material;

public class GenericOreBlock extends GenericModBlock {

    public GenericOreBlock() {
        super(Material.rock);
        this.setBlockName("oreGenericMod");
        this.setBlockTextureName(GenericMinecraftMod.MODID + ":" + "oreGenericMod");
        this.setHardness(2f);
    }

}
