package h4_Battleship;
import java.util.Arrays;

public class Submarine extends Ship {
    /* 
     * each of the sub classes has a constructor, to set length to correct value and to initialize the hit array.
     * and override the "getShipType"
     */
    public Submarine() {
	this.setLength(3);
	this.setHit(new boolean[3]);
	Arrays.fill(this.getHit(), false);
    }
    
    @Override
    public String getShipType() {
	return "submarine";
    }
}
