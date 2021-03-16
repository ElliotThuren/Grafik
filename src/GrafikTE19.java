import javax.swing.*;
import java.awt.*;

public class GrafikTE19 extends Canvas {
    public GrafikTE19() {
        JFrame frame = new JFrame("A simple painting");
        this.setSize(800,600);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        drawTree(g, 100,200);
        drawTree(g, 150,250);
        drawTree(g, 200,300);
        drawTree(g, 300,300);
        drawTree(g, 350,250);
        drawTree(g, 400,200);
        drawHouse(g, 200, 165);
    }

    private void drawTree(Graphics g, int x, int y) {
        g.setColor(new Color(0,128,0));
        int[] xs = {0+x, 10+x, 20+x};
        int[] ys = {30+y, 0+y, 30+y};
        g.fillPolygon(xs,ys,3);
        g.setColor(new Color(200,128,30));
        g.fillRect(7+x, 30+y, 6, 10);
    }

    private void drawHouse(Graphics g, int x, int y) {
        g.setColor(new Color(30, 181, 206));
        int[] xs = {0+x, 57+x, 114+x};
        int[] ys = {30+y, 0+y, 30+y};
        g.fillPolygon(xs,ys,3);
        g.setColor(new Color(13, 70, 154));
        g.fillRect(7+x, 30+y, 100, 70);
    }

    public static void main(String[] args) {
        GrafikTE19 painting = new GrafikTE19();
    }
}