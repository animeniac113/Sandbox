/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author LoTB
 */
public abstract class Card implements Comparable {
    private Suit suit;
    private Face face;
    
    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }    
    
    public Suit getSuit() {
        return suit;
    }
    
    public Face getFace() {
        return face;
    }
    
    public abstract int getValue();

    public enum Suit {
        CLUB,
        SPADE,
        HEART,
        DIAMOND;
    }

    public enum Face {
        
        DEUCE(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(1);
        
        int value;
        
        Face(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }


}
