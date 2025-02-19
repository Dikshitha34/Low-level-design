package DesignTIC_TAC_TOE.Model;

// import java.util.Pair;
import java.util.ArrayList;
import java.util.List;

import DesignTIC_TAC_TOE.Pair;

public class Board {
	
	public int size;
	public PlayingPiece[][] board;
	public Board(int size) {
		
		this.size = size;
		board = new PlayingPiece[size][size];
		
	}
	
	

	public boolean addPiece(int row, int col, PlayingPiece pp) {
		
		if(board[row][col]!=null) {
			return false;
		}
		board[row][col]=pp;
		return true;
	}
	
	
	public List<Pair<Integer, Integer>> getFreeCells(){
		
		List<Pair<Integer, Integer>> freeCell = new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j]==null) {
					Pair<Integer, Integer> rowCol = new Pair<>(i, j);
					freeCell.add(rowCol);
				}
			}
		}
		return freeCell;
	}

	public void printBoard() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j]!=null) {
					System.out.print(board[i][j].p.name() + "   ");
				}
				else {
					System.out.print("    ");
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
}

//public class Pair<U, V> {
//	public final U first;
//	public final V second;
//
//	public Pair(U first, V second) {
//		this.first = first;
//		this.second = second;
//	}
//}
	


