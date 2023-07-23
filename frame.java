import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class frame extends JFrame 
{
    
    frame()
    {
        this.add(new panel());
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
    }
}
