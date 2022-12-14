package com.example.azulfx;

public class Player {
private int playerNumber; 
private boolean isStarter;
private PlayerWall pW;
private PlayerLine pL; 
private Scoring score;
    public Player(int pNumber, boolean isStarter){
        playerNumber = pNumber;
        this.isStarter = isStarter;
        pW = new PlayerWall();
        pL = new PlayerLine(); 
        if(isStarter){
            pL.addStarterTile();
        }
        score = new Scoring(this);
    }
    //get player wall
    public PlayerWall getPlayerWall(){
        return pW;
    }
    //get player line
    public PlayerLine getPlayerLine(){
        return pL;
    }
    //get score
    public Scoring getScore(){
        return score;
    }
}
