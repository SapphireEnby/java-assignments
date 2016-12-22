import java.util.*;
/*

   To represent authors of works of literature.
   Has data members for

   name
   gender(isFemale is true if the author is/was a woman)
   yearOfBirth
   yearOfDeath (uses 0 if still alive)
   native country


   Team members who worked on this exercise should be given here.

   Team members:



   YOU MUST CODE THE toString METHOD


 */
public class Author{

    private String name;
    private boolean isFemale;
    private int
    yearOfBirth,

    // uses 0 if still alive
    yearOfDeath;

    private String
    // country of author's birth
    nativeCountry;

    // default constructor;
    public Author(){} 

    public Author(String nm, boolean isFem, int yrBrth, 
            int yrDth, String cntry){
        name = nm;
        isFemale = isFem;
        yearOfBirth = yrBrth;
        yearOfDeath = yrDth;
        nativeCountry = cntry;
    }

    // accessors for the data members
    public String getName(){
        return name;
    }

    public boolean getIsFemale(){
        return isFemale;
    }


    public int getYearOfBirth(){
        return yearOfBirth;
    }


    public int getYearOfDeath(){
        return yearOfDeath;
    }


    public String getNativeCountry(){
        return nativeCountry;
    }


    /*

       Code this method to contruct strings such as the following.

       "William Shakespeare, male author of England, born 1564 and died 1616"

       "Emily Dickinson, female author of the United States, born 1830 and died 1886"

       "Mario Vargas Llosa, male author of Peru, born 1936 and still living"

       YOU MUST CODE THIS.

     */
    public String toString(){
        String out="";

        out += getName() +", ";

        if(isFemale)
            out += "female ";

        else
            out += "male ";

        out += "author of " 
                + getNativeCountry()
                + ", born " 
                + Integer.toString( getYearOfBirth() ) 
                +" and ";
        if(getYearOfDeath()==0)
            out += "still living";
        else
            out += "died " + Integer.toString( getYearOfDeath() );

        return out;
    }


    public static void main(String[] args){

        Author 
        theBard = new Author("William Shakespeare", false, 1564, 1616, "England"),
        theBelleOfAmherst = new Author("Emily Dickinson", true, 1830, 1886, "the United States"),
        Llosa = new Author("Mario Vargas Llosa", false, 1936, 0, "Peru");

        System.out.println("" + theBard + '\n' + theBelleOfAmherst + '\n' + Llosa);
    }
}