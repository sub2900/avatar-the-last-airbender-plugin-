import org.Bukkit.Location;
import org.Bukkit.Material;
import org.Bukkit.entity.Player;
import org.Bukkit.event.EventHandler;
import org.Bukkit.event.Listener;
import org.Bukkit.event.Player.PlayerInteractEvent;
import org.Bukkit.plugin.java.JavaPlugin;

public class AvatarElements extends
JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

    }
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Material itemInHand = event.getItem() != null?;
        event.getItem().getType() : Material.AIR;
        
        if (itemInHand == Material.BLAZE_ROD ) {
            // fire elementb
            shootFireball(player);
        }else if (itemInHand == Material.FLINT_AND_STEEL) {
            // fire element
            createFireWall(player.getLocation());
        }else if (itemInHand == Material.WATER_BUCKET){
            //water element
            manipulateWater(player.getTargetBlock(null, 5).getLocation());
        }else if (itemInHand == Material.POTION){
            // water element
            waterHealing(player);
        }else if (itemInHand == Material.STONE) {
            // earth element
            lauchRockProjectile(player);
        }else if (itemInHand == Material.DIRT){
            // earth element
            createEarthBarrier(player.getLocation());
        }else if (itemInHand == Material.FEATHER){
            // air element
            createAirGust(player);
        }else if (itemInHand == Material.ELYTRA){
            enableFlight(player);
        }
    }
    // fire element logic
    public void shootFireball(Player player){
        //logic 
    }
    public void createFireWall(Location location){
        // logic
    }
    ///water element logic
    public void manipulateWater(Player player, Location targetLocation){
        // logic
    }
    public void waterHealing(Player player){
        //logic
    }
    // eath element logic
    public void lauchRockProjectile(Player player){
        //logic
    }
    public void createEarthBarrier(Location location){
        //logic
    }
    // air element logic
    public void createAirGust(Player player){
        //logic
    } 
    public void enableFlight(Player player){
        //logic
    }
}
