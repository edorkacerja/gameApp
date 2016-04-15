/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;


public class Game {
    
    
    private Player[] playersArray = new Player[5];
    private Random rnd = new Random();
    private int numberPlayers;
    
    public Game(){
        //Warm up random number generator
        for (int i=0; i<50000; i++){
            rnd.nextDouble();
        }
        
        playersArray[1] = new Player(1, playersArray);
        playersArray[2] = new Player(1, playersArray);
        playersArray[3] = new Player(1, playersArray);
        playersArray[4] = new Player(1, playersArray);
        
    }
    
    public void play(){
        
        outerloop: do{
            for(int i=1; i<=4; i++){
                playersArray[i].updatePosition(rnd.nextInt(6)+1);
                if(playersArray[i].iWon()){
                    break outerloop;
                }
            }
        }while(true);
        
    }
    
    
    public static void main(String[] args) {
        
        Game edorsGame = new Game();
        edorsGame.play();

    }
    
}
