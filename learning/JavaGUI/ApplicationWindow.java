import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Component;

/**
 * ApplicationWindow
 */
public class ApplicationWindow implements ActionListener {
    private JFrame topCon;
    private ColorStrategy colorStrategy;
    private MainCanvas mainCanvas;

    public ApplicationWindow(int w, int h) {
        JFrame topCon = new JFrame("Composite in Action");
        topCon.setSize(w, h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        topCon.setJMenuBar(menuBar);
        JMenu colorJMenu = new JMenu("Color Option");
        menuBar.add(colorJMenu);

        JMenuItem defaultColors = new JMenuItem("Default");
        JMenuItem randomColors = new JMenuItem("Random");

        colorJMenu.add(defaultColors);
        colorJMenu.add(randomColors);

        defaultColors.addActionListener(this);
        randomColors.addActionListener(this);

        colorStrategy = new DefaultColorStrategy();
        mainCanvas = new MainCanvas();
        mainCanvas.setColorStrategy(colorStrategy);

        topCon.add(mainCanvas);
        topCon.setVisible(true);
        topCon.setResizable(false);
    }

    public ApplicationWindow() {
        this(600, 600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        topCon.setVisible(false);
        if (command.equals("Random")) {
            // System.out.println("Clicked Random");
            colorStrategy = new RandomColorStrategy();

        } else {
            // System.out.println("Clicked ");
            colorStrategy = new DefaultColorStrategy();
        }
        topCon.setVisible(true);
    }

}