/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

/**
 *
 * @author dio
 */
public class PreviousActionPerformed extends AbstractListener{

    public PreviousActionPerformed(DatabaseModel dm, MainWindow m ){
        super (dm, m);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        ResultSet rs = dbmodel.getResultSet();
        try{
            if(rs.previous()){
                mwindow.set(rs);
                String pos =Integer.toString(rs.getRow());
                mwindow.updateTextField("TextCurrent", pos);
            }
            else{
                rs.next();
            }               
        }
        catch(SQLException err){
            mwindow.notifyException(err);
        }
    }
}