package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class AddPointActionPerformed extends AbstractListener {
    
    public AddPointActionPerformed(DatabaseModel db, MainWindow mw) {
        super(db, mw);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            int addPoints = mwindow.showAddPointDialog("Πόσοι πόντοι να προσθεθούν;");
            int points = Integer.parseInt(dbmodel.getResultSet().getString(6));
            points += addPoints;
            int inc = 0 ;
            if (points >= 800 ){
                mwindow.showDialog(null,"O πελάτης "+ dbmodel.getResultSet().getString(2)+" κέρδισε 2 BONUS!","BONUS",JOptionPane.INFORMATION_MESSAGE);
                points -= 800 ;
                inc += 2; 
            }else if(points >= 400 ){
                points -= 400 ;
                inc++ ;
                mwindow.showDialog(null,"O πελάτης "+ dbmodel.getResultSet().getString(2)+" κέρδισε BONUS!","BONUS",JOptionPane.INFORMATION_MESSAGE);
            }
            
            int bon = dbmodel.getResultSet().getInt(7);
            dbmodel.getResultSet().updateInt(7, bon+inc);
            dbmodel.getResultSet().updateInt(6, points);            
        } catch (SQLException ex) {
            mwindow.notifyException(ex);
        }
    }
}