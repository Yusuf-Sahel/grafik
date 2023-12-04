import javax.swing.*;
import java.awt.*;

public class window extends JFrame {

    int size = 500;
    public window(){
        this.setVisible(true);//Gör den synlig
        this.setTitle("Te21c");//Sätter en text på rutaan
        this.setBounds(100,150,500,500);//sätter position och storlek
        this.setResizable(false);//Vilkor som tillåter ej förändring av storlek
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5,5));

        for (int i = 0; i < 5*5; i++) {
            addSquare();
        }


    }

    private void addSquare() {
        Square ruta = new Square();
        this.add(ruta);
    }
}
