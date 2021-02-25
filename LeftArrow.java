package javaproject4;
 
public class LeftArrow extends ShapeBasics {
    
    private int tail;
    private int width;
    
    public LeftArrow(){
        super();
        tail  = 0;
        width = 0;
    } //end constructor LeftArrow()
 
    public LeftArrow(int theOffset, int tailSize, int theWidth){
        super(theOffset);
        tail = tailSize;
        width = theWidth;
    }// end constructor LeftArrow(int,int,int)
    
    public void set(int newHeight, int newWidth){
        tail  = newHeight;
        width = newWidth;
    }// end method set(int, int)
    
    public void drawHere(){
        topArrowHead();
        ArrowTail();
        bottomArrowHead();
    }// end method drawHere
    
    public void topArrowHead(){
  
        for(int i=1;i<=width/2;i++)
         {
            skipSpaces(1);
          for(int j=1;j<=width/2-i;j++)
             System.out.print(" ");
          for(int j=1;j<=i;j++){
              //this condition is needed to make hollow triangles
              if (j == 1 || j == i)
                  System.out.print("*");
              else 
                  System.out.print(" ");
          } //end for loop of j
          System.out.println();
         }
        
    }// end method topArrowHead()
    
    public void ArrowTail(){
        System.out.print("*");//tip of arrow
        skipSpaces(offset);
        for(int i = 1; i < tail; i++)
            System.out.print("*");
        System.out.println();
    }// end method ArrowTail
    
    public void bottomArrowHead(){
        
        for (int i = 0; i < width/2; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int j = i; j < width/2; j++)
            {
                //this condition is need to make hollow triangles
                if( j == i || j == width/2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }// end for loop of j
            System.out.println();
        }
    }// end method bottomArrowHead()
    
    private static void skipSpaces(int number){
        for(int count = 0; count < number; count++){
            System.out.print(" ");
        }// end for loop of count
    }// end method skipSpaces
    
} //end class LeftArrow
