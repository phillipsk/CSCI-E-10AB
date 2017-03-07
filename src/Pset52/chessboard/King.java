package Pset52.chessboard;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/5/17
 */

public class King extends Piece {

	@Override
	boolean attackingThisLocation(int indexRow, int indexColumn) {

		if ((indexRow == pieceRow - 1 || indexRow == pieceRow + 1)
				&& (indexColumn == pieceColumn - 1 || indexColumn == pieceColumn + 1 || indexColumn == pieceColumn)) {
			return true;
		}

        return indexRow == pieceRow && (indexColumn == pieceColumn + 1 || indexColumn == pieceColumn - 1);
    }

}
