package fondos;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ModificarFondo extends JPanel{
    public ModificarFondo(int a, int b){
        this.setSize(a,b);
    }
    
    public void paintComponent(Graphics g){
        Dimension tam = getSize();
        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/imagen/modificar.jpg")).getImage());
        g.drawImage(img.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
