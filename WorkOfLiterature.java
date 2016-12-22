import java.util.*;
/*

To represent works of literature, to include novels, plays, and poems.
The common attributes: author, title, and year published are included 
here.

YOU SHOULD NOT MODIFY THIS CODE.

*/

public abstract class WorkOfLiterature{

   // the author of the work
   private String writer;
  
   private String title;
   private int yearPublished;

   // two constructors
   // accessible to subclasses
   protected WorkOfLiterature(){}

   protected WorkOfLiterature(Author auth, String wrkTitle, int yrPub){
      writer = auth.getName();
      title = wrkTitle;
      yearPublished = yrPub;
   }

   // accessor methods for the data members
   protected String getWriter(){
      return writer;
   }

   protected String getTitle(){
      return title;
   }

   protected int getYearPublished(){
      return yearPublished;
   }

   public String toString(){
      return  title + ", written by " + writer + ", was published in " 
      + yearPublished;
   }

}