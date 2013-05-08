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

public class StartActionPerformed extends AbstractListener{

    public StartActionPerformed(DatabaseModel dm, MainWindow m ){
        super (dm, m);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        try{
            ResultSet rs = dbmodel.getResultSet();
            rs.first();
            mwindow.set(rs);
        }
        catch(SQLException err){
            mwindow.notifyException(err);
        }
    }
    
}
