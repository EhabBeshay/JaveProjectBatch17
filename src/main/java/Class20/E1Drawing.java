package Class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyCanvas c= new MyCanvas();
        frame.setSize(2000,2000);
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class MyCanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(200,200,500,500, 500,500);
    }
}