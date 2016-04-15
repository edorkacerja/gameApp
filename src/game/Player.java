/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;

/**
 *
 * @author AcerPC
 */
public class Player {
    
    private Random random = new Random();
    
    private int positionNumber = 0;
    private Response responseType;
    private int responseMovesLeft;
    private int playerNumber;
    Player[] players;
    int numberOfPlayers = 4;
    
    
    
    Response responseTypeOne;
    Response responseTypeTwo;
    Response responseTypeThree;
    
    
    public Player(int PlayerID, Player[] players){
        this.playerNumber = PlayerID;
        this.players = players;
        
        responseTypeOne = new ResponseOne(players, playerNumber, numberOfPlayers);
        responseTypeTwo = new ResponseOne(players, playerNumber, numberOfPlayers);
        responseTypeThree = new ResponseOne(players, playerNumber, numberOfPlayers);
    }
    
    public void assignResponseMoves(){
        int j = random.nextInt(4)+2;
        responseMovesLeft = j;
    }
    
    public void assignResponseType(){
        int i = random.nextInt(3)+1;
        switch (i){
            case 1:
                responseType = responseTypeOne;
                break;
            case 2:
                responseType = responseTypeTwo;
                break;
            case 3:
                responseType = responseTypeThree;
                break;            
        }       
    }
    
    public int getPosition(){
        return positionNumber;
    }
    
    public void printPlayerCurrentPosition(){
        System.out.println("Player "+playerNumber+" is at -----"+positionNumber);
    }
    
    public boolean iWon(){
        if(positionNumber >= 500){
            System.out.print("And the winner is:    ");
            printPlayerCurrentPosition();
        }
        return (positionNumber >= 500);
    }
    
    
    
    public void updatePosition(int dice){
        if(responseMovesLeft == 0){
            assignResponseMoves();
            assignResponseType();
        }
        int change = responseType.changeInPosition(dice);
        positionNumber += change;
        responseMovesLeft--;
        printPlayerCurrentPosition();
    }
    
    
    
}
