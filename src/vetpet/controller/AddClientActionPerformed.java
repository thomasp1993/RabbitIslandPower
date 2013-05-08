package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class AddClientActionPerformed extends AbstractListener {

    public AddClientActionPerformed(DatabaseModel dbm, MainWindow mw) {
        super(dbm, mw);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            System.out.println("Called AddClientActionPerformed listener..");
            dbmodel.setCurrRow();
            mwindow.disableClientForm();
        } catch (SQLException ex) {
            mwindow.notifyException(ex);
        }
    }
}
