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
public class ResponseTwo extends Response{

    public ResponseTwo(Player[] playersArray, int playerNumber, int numberOfPlayers) {
        super(playersArray, playerNumber, numberOfPlayers);
    }

    @Override
    public int changeInPosition(int diceNumber) {
        
        int changeNumber = diceNumber;
        
        return (diceNumber % 2 == 0) ? changeNumber *3 : changeNumber;
        
    }
    
}
