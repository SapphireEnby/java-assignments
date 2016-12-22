/*

A class to represent a poem, including the poet, title, year published,
the number of lines, and the first line.


YOU MUST CODE THE toString METHOD

 ******************************************************************/

public class Poem extends WorkOfLiterature{

    // Hello there, Poetry Lovers!
    // https://www.youtube.com/watch?v=cXFDK79WOSY
    // or
    // https://www.youtube.com/watch?v=cv1L-8f2erg

    private int numberOfLines;
    private String firstLine;

    // default constructor
    public Poem(){}


    /*

      Uses constructor from super class for the inherited data members.

      THE CALL TO THE SUPER CLASS CONSTRUCTOR MUST BE THE FIRST LINE
      IN THE CONSTRUCTOR.

     */
    public Poem(Author auth, String title, int yrPub, int numLines,
            String firstLn){
        super(auth, title, yrPub);
        numberOfLines = numLines;
        firstLine = firstLn;
    }


    /*
      Code this method  to construct a string

      The poem <title>, written by <author's name> and published in <year published>,
      has <number of lines> and begins "<first line>"

      as in

      The poem #214, written by Emily Dickinson and published in 1890, has 16 lines
      and begins "I taste a liquor never brewed--"

      Note the quotes around the quoted line.  You can use the escape \" to produce them.

      You will need to use accessors from Author to get the author's name.

      YOU MUST CODE THIS
     */
    public String toString(){
        String out="";
        out+="The poem "
                +getTitle()
                +", written by "
                +getWriter()
                +" and published in "
                +Integer.toString(getYearPublished())
                +", has "
                +Integer.toString(numberOfLines)
                +" lines and begins \""
                +firstLine
                +"\"";
        return out;
    }

    public static void main(String[] args){

        Author 
        theBelleOfAmherst = new Author("Emily Dickinson", true, 1830, 1886, "the United States");

        Poem  dickinson214 = new Poem(theBelleOfAmherst, "#214", 1890, 16, "I taste a liquor never brewed--");

        System.out.println(dickinson214.toString());

    }
}

