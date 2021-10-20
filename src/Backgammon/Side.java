package Backgammon;

/**
 * Player and piece colors for Backgammon.
 * @author Aram Kazorian
 */

public enum Side {

    /** Possible square or player colors. */
    MAHOGANY, SPRUCE;

    /** Return the reverse of this Side:: BROWN <->SPRUCE */
    Side opposite() {
        if (this == Side.MAHOGANY) {
            return SPRUCE;
        }
        return MAHOGANY;
    }

    /** Return my lower case name. */
    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
