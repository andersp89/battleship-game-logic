package h4_Battleship;
import java.util.Arrays;

/**
 * Describes a battleship - a ship that occupies 8 squares.
 * @author anderspedersen
 */
public class BattleShip extends Ship {
    /* 
     * each of the sub classes has a constructor, to set length to correct value and to initialize the hit array.
     * and override the "getShipType".
     */
    public BattleShip() {
	this.setLength(8);
	this.setHit(new boolean[8]);
	Arrays.fill(this.getHit(), false);
    }
    
    @Override
    public String getShipType() {
	return "battleship"; 
    }
    
    /* for test only
    @Override
    public String toString() {
	return "s"; 
    }
    */
}
