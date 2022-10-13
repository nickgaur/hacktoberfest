import java.applet.Applet;  
import java.awt.*;  
public class demo extends Applet
{  
   public void paint(Graphics g)
   {  
      g.setColor(Color.black);    
      g.drawLine(20,30,200,30);  
      g.drawRect(70,100,150,100);   
      g.drawOval(70,250,200,100); 
      g.drawString("Welcome",70,400);
     }  
}  
