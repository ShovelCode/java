import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
 
public class FirstApplet extends java.applet.Applet
{
 
    public void paint(Graphics g)
    {
        int width;
        int height;
        Rectangle r;
 
        r = g.getClipBounds();
        width = r.width - 1;
        height = r.height - 1;
 
        g.drawRect(0, 0, width, height);
        g.drawLine(0, 0, width, height);
        g.drawLine(width, 0, 0, height);
    }
}
