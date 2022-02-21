import java.util.Scanner;
     
    public class ArrowDemo{
            //display either left arrow or right arrow
            //offset = 0
     
            public static void main(String[]args){
     
            Scanner NumScan = new Scanner(System.in);
            String leftOrRight;
            int width;
            int tail;
     
            while(true){
                    //select left or right arrow
                    System.out.println("Would you like to print a left or right pointing arrow? ");
                    leftOrRight = NumScan.nextLine(); //check for correct input here with a try-catch
                    System.out.println("Width of arrow head(must be odd): ");
                    width = NumScan.nextInt();
                    System.out.println("Tail of arrow: ");
                    tail = NumScan.nextInt();
                    //get tail and arrowhead
                    //draw left or right arrow
                    LeftArrow LArrow = new LeftArrow();
                    RightArrow RArrow = new RightArrow();
     
                    //Both arrows will be made, butonly one of them shown.
                    //I am still unsure about what offset meant
                    //I need to get to the development computer to test this further.
            }//end while loop
     
            }//end main method
     
     
    }//end class ArrowDemo

    public class LeftArrow extends ShapeBasics{
    }//end class LeftArrow

    public class RightArrow extends ShapeBasics{
    }//end class RightArrow
