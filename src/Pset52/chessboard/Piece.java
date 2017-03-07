package Pset52.chessboard;
//  Piece.java

//  Created by Henry Leitner on January 5, 2016
//

import java.util.Scanner;

abstract class Piece {
	int pieceRow;
	int pieceColumn;

	public void placeOnChessBoard() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type the ROW where your chess piece is located: ");
		pieceRow = keyboard.nextInt();
		System.out.println("Type the COLUMN where your chess piece is located: ");
		pieceColumn = keyboard.nextInt();
		if ((pieceRow < 1) || (pieceRow > 8) || (pieceColumn < 1) || (pieceColumn > 8))
			System.out.println("Invalid input, but I'll try anyway");
		keyboard.nextLine();
		keyboard.close();
	}

	abstract boolean attackingThisLocation(int row, int column);
}
