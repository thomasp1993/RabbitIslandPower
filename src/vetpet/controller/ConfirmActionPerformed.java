package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class ConfirmActionPerformed extends AbstractListener {
    
    public ConfirmActionPerformed(DatabaseModel db, MainWindow mw) {
        super(db, mw);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        int number = mwindow.getNumber();
        String name = mwindow.getName();
        String address = mwindow.getAddress();
        long home = mwindow.getHome();
        long mobile = mwindow.getMobile();
        int points = mwindow.getPoints();
        int bonus = mwindow.getBonus();
        double debt = mwindow.getDebt();
        
        try {
            int pos = dbmodel.getResultSet().getRow();
            dbmodel.getResultSet().moveToInsertRow();
            dbmodel.getResultSet().updateInt(1, number);
            dbmodel.getResultSet().updateString(2, name);
            dbmodel.getResultSet().updateString(3, address);
            dbmodel.getResultSet().updateLong(4, home);
            dbmodel.getResultSet().updateLong(5, mobile);
            dbmodel.getResultSet().updateInt(6, points);
            dbmodel.getResultSet().updateInt(7, bonus);
            dbmodel.getResultSet().updateDouble(8, debt);
            dbmodel.getResultSet().insertRow();
            dbmodel.getstmt().close();
            dbmodel.getResultSet().close();
            dbmodel.Reload();
            dbmodel.getResultSet().absolute(pos + 1);
            mwindow.set(dbmodel.getResultSet());
            mwindow.updateTextField("TextCurrent",Integer.toString(pos+1));
            mwindow.enableClientForm();
        } catch (SQLException err) {
            mwindow.notifyException(err);
        }
    }
}