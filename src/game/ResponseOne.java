/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author AcerPC
 */
public class ResponseOne extends Response{

    public ResponseOne(Player[] playersArray, int playerNumber, int numberOfPlayers) {
        super(playersArray, playerNumber, numberOfPlayers);
    }

    @Override
    public int changeInPosition(int diceNumber) {
        //int leadingPlayerPosition = playersArray[1].getPosition();
        //for(int i=2; i<=numberOfPlayers; i++){
            //if(leadingPlayerPosition < playersArray[i].getPosition()){
                //leadingPlayerPosition = playersArray[i].getPosition();
            //}
        //}
        
//        int changeNumber diceNumber + (leadingPlayerPosition - playersArray[playerNumber].getPosition())/2;
//        return (dieNumber>2) ? changeNumber : -changeNumber;
    }
    
}
