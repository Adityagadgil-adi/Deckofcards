/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deckofcards;

/**
 *
 * @author: Aditya Gadgil
 */
public class Cards {
    private int number;
    private String card; 
    public static final String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final int [] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    

void setValue(int number){
    this.number = number;
}
void getCard(String card){
   this.card = card;
}

}
