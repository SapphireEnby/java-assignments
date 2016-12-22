/*


  Class to represent novels extending WorkOfLiterature.

  YOU MUST WRITE ALL THE CODE

  1. for the class header line, including that it is a subclass of WorkOfLiterature
  2. to define the data members (see below for description of the two data members)
  3. to define the default constructor
  4. to define a constructor that takes all data members, including the ones for the
     superclass, and initializes them
  5. code the toString method to return strings like



  6. the main method should construct two Novel objects for the The Adventures of
  Huckleberry Finn and The Tale of Peter Rabbit, as above, and call each's toString
  method to display it at the console.


  Novel should have two data additional data members beyond what WorkOfLiterature
  has:

  the number of pages (of course, that will vary with the edition, but humor me)

  a boolean isForChildren to indicate whether the novel is for young readers(before
  high school)

 */
/***

/// template for main to test your constructor and toString method.
/// you will need to uncomment it and complete the calls to the constructors.

public static void main(String[] args){

   Author
      markTwain = new Author("Mark Twain", false, 1835, 1910, "the United States"),
      beatrixPotter = new Author("Beatrix Potter", true, 1866, 1943, "England");

   Novel 
      peterRabbit =  new Novel(...),
      huckFinn = new Novel(...);

   System.out.println("\n" + huckFinn.toString() + '\n' +
   peterRabbit.toString());
}

 ***/

// Class Header Line
public class Novel extends WorkOfLiterature{

    // Initalize additional data members
    private int numberOfPages;
    private boolean isForChildren;
    // default constructor
    public Novel(){}
    // Call line for inherited data members
    public Novel(Author auth, String title, int yrPub,
            int numPages, boolean forKids){
        super(auth,title,yrPub);
        numberOfPages = numPages;
        isForChildren =forKids;
    }

    public String toString(){
        String out="";
        out+=getTitle()
                +", by "
                +getWriter()
                +", was published in "
                +Integer.toString(getYearPublished())
                +" and has "
                +Integer.toString( numberOfPages )
                +" pages, and is for ";
        if(isForChildren)
            out+="young ";
        else
            out+="adult ";

        out+="readers.";
        /**
        <Title>, by <author>, was published in <yrpub> and has <numPages> pages,
        and is for <adult/young> readers. 
        The Adventures of Huckleberry Finn, by Mark Twain, was published in 1884 and
        has 248 pages, and is for adult readers.

        The Tale of Peter Rabbit, by Beatrix Potter, was published in 1902 and has 56 pages,
        and is for young readers.
         **/
        return out;

    }
    public static void main(String[] args){

        Author
        markTwain = new Author("Mark Twain", false, 1835, 1910, "the United States"),
        beatrixPotter = new Author("Beatrix Potter", true, 1866, 1943, "England");

        Novel 
        peterRabbit =  new Novel(beatrixPotter , "Peter Rabbit" , 1902 , 56 , true ),
        huckFinn = new Novel(markTwain, "Adventure of Huckleberry Finn" , 1884 , 366 , false);

        System.out.println("\n" + huckFinn.toString() + '\n' +
                peterRabbit.toString());
    }
}