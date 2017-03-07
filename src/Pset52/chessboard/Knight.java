package Pset52.chessboard;

//  Knight.java
//  
//  Created by Henry Leitner on January 2, 2016
//

class Knight extends Piece
{
    boolean attackingThisLocation (int indexRow, int indexColumn)
    {
      int columnDiff = pieceColumn - indexColumn;
      int rowDiff = pieceRow - indexRow;

        return (columnDiff * columnDiff + rowDiff * rowDiff == 5) ||
                ((columnDiff == 0) && (rowDiff == 0));
               
    }
}
