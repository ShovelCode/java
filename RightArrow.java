package javaproject4;

public class RightArrow extends ShapeBasics {
	
	private int tail;
	private int width;
	
	public RightArrow(){
		super();
		tail  = 0;
		width = 0;
	} //end constructor LeftArrow()

	public RightArrow(int theOffset, int tailSize, int theWidth){
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
		
		for( int i = 1; i <= width/2; i++ ){
			skipSpaces(tail-width/2-1 + offset);
	        for( int j = 0; j < i; j++ ){
	        	
	        	if( j == 0 || j == i-1)
	        		System.out.print("*");
	        	else
	        		System.out.print(" ");
 
	        }
	        System.out.println();
	    }
		
	}// end method topArrowHead()
	
	public void ArrowTail(){
		
		for(int i = 1; i < tail; i++)
			System.out.print("*");
		skipSpaces(width/2-1);
		System.out.print("*");//arrow tip
		System.out.println();
	}// end method ArrowTail
	
	public void bottomArrowHead(){
		for( int i = 1; i <= width/2; i++ ){
			skipSpaces(tail-width/2-1 + offset);
	        for( int j = width/2; j >= i; j-- ){
	        	
	        	if( j == width/2 || j == i)
	        		System.out.print("*");
	        	else
	        		System.out.print(" ");
 
	        }
	        System.out.println();
	    }
	}// end method bottomArrowHead()
	
	private static void skipSpaces(int number){
		for(int count = 0; count < number; count++){
			System.out.print(" ");
		}// end for loop of count
	}// end method skipSpaces
	
} //end class RightArrow
