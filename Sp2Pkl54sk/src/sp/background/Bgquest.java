/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.background;

/**
 *
 * @author HP
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author M Arif Rosyanto
 */
public class Bgquest extends JPanel{
    private Image image;
    
    public Bgquest(){
        image = new ImageIcon(getClass().getResource("/sp/image/bgquest.png")).getImage();
        setPreferredSize(new Dimension(1366,768));
    }
    

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(image, 0, 0,null);
        gd.dispose();
    }
    
}
