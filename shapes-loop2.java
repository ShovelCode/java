import java.awt.Graphics;
 
public class FirstApplet extends java.applet.Applet
{
 
    public void paint(Graphics g)
    {
        int x, y;
        y = 10;
        while (y <= 210)
        {
            g.drawLine(10, y, 210, y);
            y = y + 25;
        }
        x = 10;
        while (x <= 210)
        {
            g.drawLine(x, 10, x, 210);
            x = x + 25;
        }
    }
}
