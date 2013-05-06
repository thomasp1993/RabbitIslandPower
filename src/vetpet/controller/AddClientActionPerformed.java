/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

/**
 *
 * @author dio
 */
public class AddClientActionPerformed extends AbstractListener{

    public AddClientActionPerformed(DatabaseModel dbm , MainWindow mw){
        super(dbm,mw);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Called AddClientActionPerformed listener..");
        try{
            int curRow = dbmodel.getResultSet().getRow() ;
            mwindow.clearClientForm();
        }
        catch(SQLException err){
            mwindow.notifyException(err);
        }
    }
    
}
