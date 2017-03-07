package Pset52.chessboard;

//  Bishop.java
//  
//  Created by Henry Leitner on January 5, 2016
//

class Bishop extends Piece
{
    boolean attackingThisLocation (int indexRow, int indexColumn)
    {
      int columnDiff = pieceColumn - indexColumn;
      int rowDiff = pieceRow - indexRow;

      if ((columnDiff + rowDiff == 0) ||  (columnDiff == rowDiff))
           return true;
      else return false; 
    }
}
