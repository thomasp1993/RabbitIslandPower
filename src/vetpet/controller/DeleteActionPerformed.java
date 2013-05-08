package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class DeleteActionPerformed extends AbstractListener {

    public DeleteActionPerformed(DatabaseModel db, MainWindow mw) {
        super(db, mw);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            int pos = dbmodel.getResultSet().getRow();
            dbmodel.getResultSet().deleteRow();
            dbmodel.getstmt().close();
            dbmodel.getResultSet().close();
            dbmodel.Reload();
            dbmodel.getResultSet().absolute(pos-1);
            mwindow.set(dbmodel.getResultSet());
            mwindow.updateTextField("TextCurrent", Integer.toString(pos-1));
        } catch (SQLException err) {
            mwindow.notifyException(err);
        }
    }
}