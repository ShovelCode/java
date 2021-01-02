import java.awt.Graphics;
 
public class FirstApplet extends java.applet.Applet
{
 
    public void paint(Graphics g)
    {
        int y;
        y = 10;
        while (y <= 210)
        {
            g.drawLine(10, y, 210, y);
            y = y + 25;
        }
    }
}
