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

public class SaveActionPerformed extends AbstractListener {

    public SaveActionPerformed(DatabaseModel dm, MainWindow m) {
        super(dm, m);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            int number = mwindow.getNumber();
            String name = mwindow.getName();
            String address = mwindow.getAddress();
            long home = mwindow.getHome();
            long mobile = mwindow.getMobile();
            int points = mwindow.getPoints();
            int bonus = mwindow.getBonus();
            double debt = mwindow.getDebt();

            int pos = dbmodel.getResultSet().getRow();
            dbmodel.getResultSet().updateInt(1, number);
            dbmodel.getResultSet().updateString(2, name);
            dbmodel.getResultSet().updateString(3, address);
            dbmodel.getResultSet().updateLong(4, home);
            dbmodel.getResultSet().updateLong(5, mobile);
            dbmodel.getResultSet().updateInt(6, points);
            dbmodel.getResultSet().updateInt(7, bonus);
            dbmodel.getResultSet().updateDouble(8, debt);
            dbmodel.getResultSet().updateRow();
            dbmodel.getstmt().close();
            dbmodel.getResultSet().close();
            dbmodel.Reload();
            dbmodel.getResultSet().absolute(pos);
            mwindow.set(dbmodel.getResultSet());
        } catch (SQLException ex) {
            mwindow.notifyException(ex);
        }
    }
}