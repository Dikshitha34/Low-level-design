package DesignTIC_TAC_TOE;

public class Main {
	public static void main(String[] args) {
		TicTacToeGame gm= new TicTacToeGame();
		gm.initializeGame();
		System.out.println("Winnwe is "+ gm.startGame());
	}
}
