package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class LastActionListener extends AbstractListener{
    public LastActionListener(DatabaseModel dm, MainWindow m ){
        super (dm, m);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        
        try{
            ResultSet rs = dbmodel.getResultSet();
            rs.last();
            mwindow.set(rs);
        }
        catch(SQLException err){
            mwindow.notifyException(err);
        }
    }
}
