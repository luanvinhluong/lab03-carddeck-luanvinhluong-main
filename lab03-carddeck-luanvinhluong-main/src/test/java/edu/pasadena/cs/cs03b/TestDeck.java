package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestDeck {

   @Test
   public void getCardRankSuitCase1()
   {
     // create an instance of the class
      Deck myDeckofCard = new Deck();

     // action
     String strResult = myDeckofCard.getCardRankSuit(-1);
     // assertion
     assertEquals("Invalid index", strResult);
   }

   @Test
   public void getCardRankSuitCase2()
   {
     // create an instance of the class
     Deck myDeckofCard = new Deck();

     // action
     String strResult = myDeckofCard.getCardRankSuit(1);
     // assertion
     assertEquals("Ace of Clubs", strResult);
   }   

   @Test
   public void getCardRankSuitCase3()
   {
     // create an instance of the class
     Deck myDeckofCard = new Deck();

     // action
     String strResult = myDeckofCard.getCardRankSuit(11);
     // assertion
     assertEquals("Jack of Clubs", strResult);

   }

   @Test
   public void getCardRankSuitCase4()
   {
     // create an instance of the class
     Deck myDeckofCard = new Deck();

     // action
     String strResult = myDeckofCard.getCardRankSuit(14);
     // assertion
     assertEquals("Ace of Diamonds", strResult);
   }

   @Test
   public void getCardRankSuitCase5()
   {
     // create an instance of the class
     Deck myDeckofCard = new Deck();

     // action
     String strResult = myDeckofCard.getCardRankSuit(52);
     // assertion
     assertEquals("King of Spades", strResult);
   }   
}
