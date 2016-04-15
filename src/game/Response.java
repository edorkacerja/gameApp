/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Edor Kacerja
 */
public abstract class Response {
    int playerNumber;
    int numberOfPlayers;
    Player[] playersArray;
    
    public Response(Player[] playersArray, int playerNumber, int numberOfPlayers){
        this.playerNumber = playerNumber;
        this.numberOfPlayers = numberOfPlayers;
        this.playersArray = playersArray;
    }
    
    
    public abstract int changeInPosition();
    
}
