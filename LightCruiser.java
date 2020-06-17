package h4_Battleship;
import java.util.Arrays;

public class LightCruiser extends Ship {
    /* 
     * each of the sub classes has a constructor, to set length to correct value and to initialize the hit array.
     * and override the "getShipType"
     */
    public LightCruiser() {
	this.setLength(5);
	this.setHit(new boolean[5]);
	Arrays.fill(this.getHit(), false);
    }
    
    @Override
    public String getShipType() {
	return "light cruiser";
    }
}
