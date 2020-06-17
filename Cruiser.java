package h4_Battleship;
import java.util.Arrays;

public class Cruiser extends Ship {
    /* 
     * each of the sub classes has a constructor, to set length to correct value and to initialize the hit array.
     * and override the "getShipType"
     */
    public Cruiser() {
	this.setLength(6);
	this.setHit(new boolean[6]);
	Arrays.fill(this.getHit(), false);
    }
    
    @Override
    public String getShipType() {
	return "cruiser";
    }
}
