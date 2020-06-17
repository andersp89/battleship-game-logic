package h4_Battleship;
import java.util.Arrays;

public class Destroyer extends Ship {
    /* 
     * each of the sub classes has a constructor, to set length to correct value and to initialize the hit array.
     * and override the "getShipType"
     */
    public Destroyer() {
	this.setLength(4);
	this.setHit(new boolean[4]);
	Arrays.fill(this.getHit(), false);
    }
    
    @Override
    public String getShipType() {
	return "destroyer";
    }
}
