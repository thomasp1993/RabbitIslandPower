package VetPet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    DatabaseMetaData dbm;
    Connection con;
    Statement stmt, STMT;
    ResultSet rs;
    int curRow;
    
    private void initComponents() {
        btnSearchName.setText("Αναζήτηση με Όνομα");
        btnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNameActionPerformed(evt);
            }
        });

        btnSearchNumber.setText("Αναζήτηση με Κάρτα");
        btnSearchNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNumberActionPerformed(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNameActionPerformed
        
        try{
            int pos = rs.getRow();
            String n=JOptionPane.showInputDialog(null,"Δώσε Όνομα");
            rs.beforeFirst();
            boolean s=false;
            
            while(rs.next()){
               
                if(n.equals(rs.getString(2))){
                    set();
                    TextCurrent.setText(Integer.toString(rs.getRow()));
                    s=true;
                    break;
                    
               }
            }
            if(s==false){
                JOptionPane.showMessageDialog(null, "ΔΕ ΒΡΕΘΗΚΕ");
                rs.absolute(pos);
                
            }
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }//GEN-LAST:event_btnSearchNameActionPerformed

    private void btnSearchNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNumberActionPerformed
        try{
            int pos = rs.getRow();
            rs.beforeFirst();
            int count=0;
            while (rs.next()){
                count++;
            }
            rs.first();
            String str=JOptionPane.showInputDialog(null,"Εισαγωγή Αριθμού Κάρτας" );
            int n= Integer.parseInt(str);
            
            if(n<=count){
                rs.absolute(n);
                set();
                TextCurrent.setText(Integer.toString(rs.getRow()));
            }
            else{
                JOptionPane.showMessageDialog(null, "Δεν υπάρχει ο αριθμός");
                rs.absolute(pos);
            }
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }//GEN-LAST:event_btnSearchNumberActionPerformed

    /**
     * @param args the command line arguments
     */
}