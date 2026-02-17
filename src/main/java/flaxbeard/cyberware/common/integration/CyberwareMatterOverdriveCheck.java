package flaxbeard.cyberware.common.integration;

import net.minecraft.entity.player.EntityPlayer;

public class CyberwareMatterOverdriveCheck {
    
    public static boolean isMatterOverdriveLoaded() {
        return false;
    }
    
    // Add this method that was being called
    public static boolean isPlayerAndroid(EntityPlayer player) {
        return false; // Always return false since Matter Overdrive is not available
    }
}
