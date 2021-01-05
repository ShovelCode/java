import java.awt.Graphics;
import java.awt.Color;
 
public class FirstApplet extends java.applet.Applet
{
 
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(0, 0, 200, 200);
        g.setColor(Color.black);
        g.drawLine(0, 0, 200, 200);
        g.drawLine(200, 0, 0, 200);
    }
}
