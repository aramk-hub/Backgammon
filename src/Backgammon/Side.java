package Backgammon;

/**
 * Player and piece colors for Backgammon.
 * @author Aram Kazorian
 */

public enum Side {

    /** Possible square or player colors. */
    BROWN, SPRUCE;

    /** Return the reverse of this Side:: BROWN <->SPRUCE */
    Side opposite() {
        if (this == Side.BROWN) {
            return SPRUCE;
        }
        return BROWN;
    }

    /** Return my lower case name. */
    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
