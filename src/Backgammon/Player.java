package Backgammon;



/** Represents a single player in a game of Backgammon.
 * At any time, each player is tied to a single game and
 * has a Side (Brown or Spruce).
 * @author Aram Kazorian
 */
abstract class Player {

    /** A player in GAME, playing with Side labeled COLOR. */
    Player(Game game, Side color) {
        _game = game;
        _color = color;
    }

    /** Getter method to retrieve the side of this player. */
    final Side getSide() {
        return _color;
    }

    /** Getter method to retrieve the game of this player. */
    final Game getGame() {
        return _game;
    }

    /** Getter method to retrieve the Board this player plays on. */
    final Board getBoard() {
        return _game.getBoard();
    }

    /** Returns the next move that this player will make. Assumes that
     * the game has not yet been won.
     */
    abstract String getMove();

    /** Variable representing the current game this player is in. */
    private final Game _game;

    /** Variable representing the Side this player is using. */
    private Side _color;

}
