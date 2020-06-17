package h4_Battleship;
import java.util.Arrays;

/**
 * Describes a battlecruiser - a ship that occupies 7 squares.
 * @author anderspedersen
 *
 */
public class BattleCruiser extends Ship {
    /* 
     * each of the sub classes has a constructor, to set length to correct value and to initialize the hit array.
     * and override the "getShipType"
     */
    public BattleCruiser() {
	this.setLength(7);
	this.setHit(new boolean[7]);
	Arrays.fill(this.getHit(), false);
    }
    
    @Override
    public String getShipType() {
	return "battlecruiser"; 
    }
}
