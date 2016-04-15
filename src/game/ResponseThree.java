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
public class ResponseThree extends Response{

    public ResponseThree(Player[] playersArray, int playerNumber, int numberOfPlayers) {
        super(playersArray, playerNumber, numberOfPlayers);
    }

    @Override
    public int changeInPosition(int diceNumber) {

        int lowest = playersArray[1].getPosition();
        for(int i=2; i<numberOfPlayers; i++){
            if(lowest>playersArray[i].getPosition()){
                lowest = playersArray[i].getPosition();
            }
        }
        int change = diceNumber + (playersArray[playerNumber].getPosition() - lowest)/2;
        return (diceNumber<=2) ? change : -change;
    }
    
}
