/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.componentButton;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class Logoutbutton extends JButton{
    
    private ImageIcon icon;
    private boolean active;
    
    public Logoutbutton(){
        
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        
        icon = new ImageIcon(getClass().getResource("/sp/image/logout.png"));
        setIcon(icon);
        
        setPreferredSize(new Dimension(301,72));
        setVisible(true);
        setText(null);
        active = false;
        
        
                        
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/logout-hover.png"));
                setIcon(icon);
            }

            @Override
            public void mouseExited(MouseEvent me) {
               
                    resetButton();
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/logout-clicked.png"));
                setIcon(icon);
                setActive(true);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/sp/image/logout-active.png"));
                setIcon(icon);
                //setActive(true);
            }
        });
        
    }
    
    public void resetButton(){
        icon = new ImageIcon(getClass().getResource("/sp/image/logout.png"));
        setIcon(icon);
        setActive(false);
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        
        this.active = active;
    }
}
