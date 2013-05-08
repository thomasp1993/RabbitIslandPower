package vetpet.controller;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class NextActionPerformed extends AbstractListener{

    public NextActionPerformed(DatabaseModel dm, MainWindow m ){
        super (dm, m);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
     try{
            ResultSet rs = dbmodel.getResultSet();
            if(rs.next()){
                mwindow.set(rs);
                String pos =Integer.toString(rs.getRow());
                mwindow.updateTextField("TextCurrent", pos);
            }
            else{
                rs.previous();
            }
        }
        catch(SQLException err){
            mwindow.notifyException(err);
        }
    }   
}