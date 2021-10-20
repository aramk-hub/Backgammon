package Backgammon;


/** Class representing the Board of a Backgammon game. Spikes are
 * stored on the board in a 2D array, flattened to a 1D array.
 * This 1D array will have a range from 0 -> 23. The first 0 -> 11
 * are the bottom row of the board, and 12 -> 23 are the top row.
 * With this in mind, the board of each player is essentially a
 * mirror of the other. For example, Mahogany Player's collecting
 * region will be held in board[0] -> board[5]. Spruce Player's
 * collecting region will be held in board[18] -> board[23].
 * The mirror image in the top row.
 *
 * For example, what would be board[1][6] on the 2D respresentation
 * is now board[17]. Further, board[1][4] => board[19].
 *
 * Another takeaway from this representation is that since spruce
 * collects in board[23]->board[18], if they roll a 2, they would
 * take a piece say, on board[5] and move to board[7], thus, we
 * are adding to spruces index. For Mahogany, we subtract, since
 * their collecting region is board[0] -> board[5]. Rolling a 2,
 * means moving a piece from board[10] -> board[8].
 *
 * The board in our program will now be represented as this
 * stated 2D array of Spikes. There is only one way to construct
 * this board, so, naturally the constructor will be the easy part,
 * whereas the moves on the board are more difficult since we must
 * keep track of many things.
 *
 * In this Board's initial construction, we have the following
 * layout of pieces:
 *
 * board[0] = 5 mahogany spikes
 * board[4] = 3 spruce spikes
 * board[6] = 5 spruce spikes
 * board[11] = 2 mahogany spikes
 * board[12] = 2 spruce spikes
 * board[17] = 5 mahogany spikes
 * board[19] = 3 mahogany spikes
 * board[23] = 5 spruce spikes
 *
 * @author Aram Kazorian
 *
 */
public class Board {

    /** The default constructor for this game's board. The only
     * one needed, since there is only one way to construct the game.
     */
    public Board() {
        
    }





    /** Represents this board. */
    private Spike[] _board;



}
