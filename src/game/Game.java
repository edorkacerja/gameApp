/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


public class Game {
    
    
    private Player [] players = new Player[5];
    private java.util.Random rnd = new java.util.Random();
    private int numberPlayers;
    
    public Game(int numberPlayers){
        this.numberPlayers = numberPlayers;
        //Warm up random number generator
        for (int i=0; i<50000; i++){
            rnd.nextDouble();
        }



        //Create four Player objects
        players[1] = new Player(1, rnd);
        players[2] = new Player(2, rnd);
        players[3] = new Player(3, rnd);
        players[4] = new Player(4, rnd);
        
//        Assign random Response type to each player
        for(int playerNumber = 1; playerNumber <= numberPlayers; playerNumber++){
            assignRandomResponse(players[playerNumber]);
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
