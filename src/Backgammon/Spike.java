package Backgammon;


/** An instance of the Spike class represents a single
 * Spike on the board. This Spike can hold as many pieces
 * the same Side as the game allows for. The Spike object
 * itself only keeps track of a couple things. It will
 * keep track of the SIDE it is currently holding. This
 * is because a Spike cannot hold two of the same color.
 * Another thing the Spike will keep track of is how many
 * pieces it is currently holding. A key rule is that if
 * any Spike on the board hold a single piece, the opposite
 * color can attack and take it over.
 *
 * @author Aram Kazorian
 */
public class Spike {

    /** Constructor for a Spike object. Will be used for
     * default initialization.
     * @param side -> The current Side occupying this Spike
     * @param pieces -> The number of pieces on this Spike
     */
    public Spike(Side side, int pieces) {
        _side = side;
        _pieces = pieces;
    }

    /** Retrieves the Side that currently occupies this Spike. */
    public Side getSide() {
        return _side;
    }

    /** Sets the current Side of this Spike to NEWSIDE. */
    public void setSide(Side newSide) {
        this._side = newSide;
    }

    /** Sets the current number of pieces of this Spike to
     * PIECES.
     */
    public void setPieces(int pieces) {
        this._pieces = pieces;
    }

    /** Retrieves the number of pieces on this Spike. */
    public int numPieces() {
        return _pieces;
    }

    /** The Side occupying this Spike. */
    private Side _side;

    /** Number of pieces currently contained on this Spike. */
    private int _pieces;


}
