/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magic.Design;

/**
 *
 * @author umair
 */
public class MyJLabel extends javax.swing.JLabel{
    
    public MyJLabel() {
        
        setMagicDesign();
    }

    private void setMagicDesign() {
        
//        this.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        this.setForeground(new java.awt.Color(0, 0, 0));
        
        this.setBackground(new java.awt.Color(255, 255, 255));

        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


    }

}
