//Left Justify
import java.util.*;

class LeftJustify {
    public static void main(String[]args){
        Formatter fmt. = new Formatter(0;
        
        //right Justify
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();

        //left Justify
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
   }
}
