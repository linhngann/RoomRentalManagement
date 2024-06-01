package controller;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GradientPanel extends JPanel {
    private Color colorStart;
    private Color colorEnd;

    public GradientPanel() {
        this.colorStart = Color.RED;
        this.colorEnd = Color.BLUE;
    }

    public void setGradientColors(Color start, Color end) {
        this.colorStart = start;
        this.colorEnd = end;
        repaint(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        LinearGradientPaint lgp = new LinearGradientPaint(
                new Point2D.Float(0, 0),
                new Point2D.Float(getWidth(), 0),
                new float[]{0.0f, 0.5f, 1f},
                new Color[]{colorEnd, colorStart, colorEnd},
                MultipleGradientPaint.CycleMethod.REFLECT);

        g2d.setPaint(lgp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gradient Background Example");
            GradientPanel panel = new GradientPanel();
            panel.setGradientColors(Color.GREEN, Color.YELLOW);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            //panel.setGradientColors(Color.GREEN, Color.YELLOW);
        });
    }
}
