package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class SearchNameActionPerformed extends AbstractListener {

    public SearchNameActionPerformed(DatabaseModel dm, MainWindow m) {
        super(dm, m);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            int pos = dbmodel.getResultSet().getRow();
            String name = mwindow.askForString("Δώσε Όνομα");
            dbmodel.getResultSet().beforeFirst();
            boolean found = false ;
            
            //i think that this needs improvement, breaks on first occasion
            while(dbmodel.getResultSet().next()){
                if(name.equals(dbmodel.getResultSet().getString(2))){
                    mwindow.set(dbmodel.getResultSet());
                    mwindow.updateTextField("TextCurrent", Integer.toString(dbmodel.getResultSet().getRow()));
                    found = true ;
                    break ;
                }
            }
            
            if(!found){
                mwindow.showDialog(null, "ΔΕ ΒΡΕΘΗΚΕ", "ΔΕ ΒΡΕΘΗΚΕ", 1);
                dbmodel.getResultSet().absolute(pos);
            }
        } catch (SQLException ex) {
            mwindow.notifyException(ex);
        }
    }
}