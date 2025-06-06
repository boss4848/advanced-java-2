import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridCanvas extends JPanel {
    private int id;
    private ColorStrategy colorStrategy;

    public GridCanvas(int id, int w, int h) {
        setPreferredSize(new Dimension(w, h));
        this.id = id;
    }

    public GridCanvas(int id) {
        this(id, 300, 300);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(colorStrategy.getColor(id - 1));

        g.setColor(Color.PINK);
        g.setFont(new Font("Courier", Font.BOLD, 20));
        switch (id) {
            case 1:
                g.drawString("Q1", 25, 25);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 90, 90);
                g.setColor(Color.PINK);
                g.fillArc(100, 100, 400, 400, 90, 90);
                g.setColor(Color.BLUE);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 2:
                g.drawString("Q2", 255, 25);
                g.setColor(Color.BLACK);
                g.drawArc(-200, 100, 400, 400, 0, 90);
                g.setColor(Color.GRAY);
                g.fillArc(-200, 100, 400, 400, 0, 90);
                g.setColor(Color.BLACK);
                // g.drawLine(300, 0, 300, 300);
                // g.drawLine(0, 300, 300, 300);
                break;
            case 3:
                g.drawString("Q2", 25, 275);
                g.setColor(Color.BLACK);
                g.drawArc(100, -200, 400, 400, 180, 90);
                g.setColor(Color.BLUE);
                g.fillArc(100, -200, 400, 400, 180, 90);
                g.setColor(Color.GREEN);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 4:
                g.drawString("Q2", 255, 275);
                g.setColor(Color.BLACK);
                g.drawArc(-200, -200, 400, 400, 270, 90);
                g.setColor(Color.ORANGE);
                g.fillArc(-200, -200, 400, 400, 270, 90);
                // g.setColor(Color.GREEN);
                // g.drawLine(300, 0, 300, 300);
                // g.drawLine(0, 300, 300, 300);
                break;
            default:
                System.exit(0);
        }
    }

    public void setColorStrategy(ColorStrategy colorStrategy) {
        this.colorStrategy = colorStrategy;
    }

}
