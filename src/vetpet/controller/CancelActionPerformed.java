package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class CancelActionPerformed extends AbstractListener {

    public CancelActionPerformed(DatabaseModel dm, MainWindow m) {
        super(dm, m);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            int pos = dbmodel.getResultSet().getRow();
            dbmodel.getResultSet().absolute(pos);            
            mwindow.set(dbmodel.getResultSet()); 
            mwindow.enableClientForm();
        } catch (SQLException ex) {
            mwindow.notifyException(ex);
        }
    }
}
