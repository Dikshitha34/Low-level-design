package DesignTIC_TAC_TOE.Model;

public class Player {
	
	public String name;
	public PlayingPiece pp;
	public Player(String name, PlayingPiece pp) {
		
		this.name = name;
		this.pp = pp;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public PlayingPiece getPlayingPiece() {
		return pp;
	}
	
	public void setPLayingPiece(PlayingPiece p) {
		this.pp=p;
	}
	
}
