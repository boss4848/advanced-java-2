import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JPanel;

public class MainCanvas extends JPanel {
    private ColorStrategy colorStrategy;

    public MainCanvas(int w, int h) {
        setPreferredSize(new Dimension(w, h));
        setLayout(new GridLayout(2, 2));

        for (int i = 1; i <= 4; i++) {
            add(new GridCanvas(i));
        }
    }

    public MainCanvas() {
        this(600, 600);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // g.drawLine(300, 0, 300, 600);
        // g.drawLine(0, 300, 600, 300);
        // g.drawOval(100, 100, 400, 400);
    }

    public void setColorStrategy(ColorStrategy colorStrategy) {
        this.colorStrategy = colorStrategy;
        for (Component component : getComponents()) {
            if (component instanceof GridCanvas) {
                ((GridCanvas) component).setColorStrategy(colorStrategy);
            }
        }
    }
}
