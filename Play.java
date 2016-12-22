/*

A class to represent a play, including playwright, title, year published,
number of acts and number of characters.

YOU MUST CODE THE CONSTRUCTOR BELOW

*********************************************************************/

public class Play extends WorkOfLiterature{

   private int numberOfActs;
   private int numberOfNamedCharacters;


   // default constructor
   public Play(){}

   /*

      Uses constructor from super class for the inherited data members.

      YOU MUST CODE THIS.

   */
   public Play(Author auth, String title, int yrPub, int numActs,
      int numCharctrs){
       super(auth,title,yrPub);
       numberOfActs = numActs;
       numberOfNamedCharacters = numCharctrs;

   }


   /*
      Code to construct the string

      The <num acts> act play <title>, written by <author's name> and published
      in <year published>,has <number of characters> named parts
   
   */
   public String toString(){
      return "The " + numberOfActs + " act play " + getTitle() + ", written by "
      + getWriter() + " and published in " +
       Integer.toString(getYearPublished()) + ", has " + Integer.toString(numberOfNamedCharacters) + " named parts";
   }

   public static void main(String[] args){

      Author 
          theBard  = new Author("William Shakespeare", false, 1564, 1616, "England");


      Play Lear = new Play(theBard, "King Lear", 1608, 5, 15);

      System.out.println(Lear.toString());

   }
}
      
  
