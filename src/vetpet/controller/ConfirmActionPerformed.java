package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
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
            ResultSet rs = dbmodel.getResultSet();
            int pos = rs.getRow();
            rs.moveToInsertRow();
            rs.updateInt(1, number);
            rs.updateString(2, name);
            rs.updateString(3, address);
            rs.updateLong(4, home);
            rs.updateLong(5, mobile);
            rs.updateInt(6, points);
            rs.updateInt(7, bonus);
            rs.updateDouble(8, debt);
            rs.insertRow();
            dbmodel.getstmt().close();
            rs.close();
            dbmodel.Reload();
            rs.absolute(pos + 1);
            mwindow.set(rs);
            mwindow.updateTextField("TextCurrent",Integer.toString(pos+1));
            mwindow.enableClientForm();
        } catch (SQLException err) {
            mwindow.notifyException(err);
        }
    }
}