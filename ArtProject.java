import java.awt.*;
import javax.swing.*;
/**
 * Expirimenting with graphics
 * 
 * @author William Bazinet, Xhorxhi Olldashi
 * @version Spring 2025
 * 
 */
class GraphicsPanel extends JPanel{
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawArc(8, 42, 73, 45, 84, 12);
    }
}
public class ArtProject implements Runnable {

    /**
     * The run method to set up the graphical user interface
     */
    @Override
    public void run() {

        // the usual JFrame setup steps
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("ArtProject");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // construct JPanel with a custom paintComponent method
        JPanel panel = new GraphicsPanel();
        frame.add(panel);

        // display the window we've created
        
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new ArtProject());
    }
}