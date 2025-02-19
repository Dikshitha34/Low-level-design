package DesignTIC_TAC_TOE;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import DesignTIC_TAC_TOE.Model.Board;
import DesignTIC_TAC_TOE.Model.PieceO;
import DesignTIC_TAC_TOE.Model.PieceType;
import DesignTIC_TAC_TOE.Model.PieceX;
import DesignTIC_TAC_TOE.Model.Player;
import DesignTIC_TAC_TOE.Model.PlayingPiece;

public class TicTacToeGame {
	Deque<Player> players;
	Board gB;
	
	public TicTacToeGame() {
		// TODO Auto-generated constructor stub
		initializeGame();
	}
	
	public void initializeGame() {
		players = new LinkedList<>();
		PieceX px=new PieceX();
		Player ply1=new Player("Player1", px);
		
		PieceO po=new PieceO();
		Player ply2=new Player("Player2", po);
		
		players.add(ply1);
		players.add(ply2);
		
		gB=new Board(3);
	}
	
	public String startGame() {
		boolean noWinner =true;
		while(noWinner) {
			Player pTurn = players.removeFirst();
			gB.printBoard();
			List<Pair<Integer, Integer>> freeSpaces=gB.getFreeCells();
			if(freeSpaces.isEmpty()) {
				noWinner=false;
				continue;
			}
			
			System.out.println("Player: "+ pTurn+ " Enter row, col: ");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			String[] val=s.split(",");
			int rowip=Integer.valueOf(val[0]);
			int colip=Integer.valueOf(val[1]);
			
			boolean pieceAdd=gB.addPiece(rowip, colip, pTurn.pp);
			if(!pieceAdd) {
				System.out.println("Incorrect position chosen!! Try Again.");
				players.addFirst(pTurn);
				continue;
			}
			
			players.addLast(pTurn);
			
			boolean winner=isThereWinner(rowip, colip, pTurn.pp.p);
			if(winner) {
				return pTurn.name;
			}
			
		}
		return "Tie";
	}

	private boolean isThereWinner(int row, int col, PieceType p) {
		// TODO Auto-generated method stub
		boolean rMatch=true, colMatch=true;
		boolean diagMatch=true, antidiagMatch=true;
		
//		check rows
		for(int i=0;i<gB.size;i++) {
			if(gB.board[row][i]==null || gB.board[row][i].p!=p) {
				rMatch=false;
			}
		}
//		check columns
		for(int i=0;i<gB.size;i++) {
			if(gB.board[i][col]==null || gB.board[i][col].p!=p) {
				colMatch=false;
			}
		}
//		check diagonals
		for(int i=0,j=0;i<gB.size;i++,j++) {
			if(gB.board[i][j]==null || gB.board[i][j].p!=p) {
				diagMatch=false;
			}
		}
		
//		check anti-diagonals
		for(int i=0,j=gB.size-1;i<gB.size;i++,j--) {
			if(gB.board[i][j]==null || gB.board[i][j].p!=p) {
				antidiagMatch=false;
			}
		}
		
		
		return rMatch || colMatch || diagMatch || antidiagMatch;
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
