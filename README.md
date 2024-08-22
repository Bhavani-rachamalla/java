import java.swing.JFrame;
import java.awt.Graphics;
import java.awt.Canvas;
public class Helloworldcanvas extends Canvas{
    public void paint(Graphics g){
        g.drawstring("Helloworld",30,50);
    }
    public static void main(string args[]){
        Helloworldcanvas obj=new Helloworldcanvas();
        JFrame f=new Jframe();
        f.add(obj);
        f.setsize(200,300);
        f.setVisible(True);
    }
}
