import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Square extends JPanel implements MouseListener {

    /*int size = 100;
    int dotpos = 10;
    int dotsize = size-2*dotpos;
    */
    private boolean showdot = true; //Om sant rita dot annars cirkel

    public Square(){
        this.setBounds(50,50,100,100);
        //mypanel.setBackground(Color.blue.blue);
        this.setBackground(new Color(250,17,188));
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.addMouseListener(this);
    }

    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        if(showdot) {
            g.setColor(Color.blue);
            //  g.fillOval(dotpos,dotpos,dotsize,dotsize);
            g.fillOval(10, 10, 80, 80);
        }else {
            g.drawLine(0, 0, 100, 100);
            g.setColor(Color.CYAN);
            g.fillRect(20, 20, 50, 50);
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
        showdot = !showdot;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
