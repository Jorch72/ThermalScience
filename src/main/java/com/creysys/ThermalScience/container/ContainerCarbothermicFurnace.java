package com.creysys.ThermalScience.container;

import com.creysys.ThermalScience.container.slot.SlotOutput;
import com.creysys.ThermalScience.tileEntity.TileEntityMachine;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

/**
 * Created by Creysys on 1/31/2015.
 */
public class ContainerCarbothermicFurnace extends ContainerBasic {
    public ContainerCarbothermicFurnace(InventoryPlayer inventory, TileEntityMachine tileEntity) {
        super(inventory, tileEntity, 8, 69);

        inputSlots.add(new Slot(tileEntity, 0, 39, 29));
        inputSlots.add(new Slot(tileEntity, 1, 57, 29));
        outputSlots.add(new SlotOutput(tileEntity, 2, 130, 29));

        addSlots();
    }
}
