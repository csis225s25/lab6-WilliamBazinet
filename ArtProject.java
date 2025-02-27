import java.awt.*;
import javax.swing.*;
/**
 * Expirimenting with graphics
 * 
 * @author William Bazinet, Xhorxhi Olldashi
 * @version Spring 2025
 * 
 */
class GPan extends JPanel{
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        /* setting background to blue */

        /* fill blue */
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight()/2);

        /* grab gray crayon */
        g.setColor(Color.GRAY);

        /* the burj khalifa tower */
        g.drawArc(600, 300, 100, 100000, 84, 12);

        /* grab gray crayon */
        g.setColor(Color.GRAY);

        /* some buildings to place around the tower */
        g.drawRect(570, 555, 10, 30);
        g.drawRect(550, 554, 10, 33);
        g.drawRect(515, 545, 10, 30);
        g.drawRect(500, 550, 10, 35);
        

        /* it's like picking up a different crayon, yellow */
        g.setColor(Color.YELLOW);

        /* the sun */
        g.fillOval(900, 42, 100, 100);

        /* grab white crayon */
        g.setColor(Color.WHITE);


        /* cloud */
        g.drawRoundRect(500, 400, 60, 30, 50000, 5);
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
        JPanel panel = new GPan();
        frame.add(panel);

        // display the window we've created
        
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new ArtProject());
    }
}