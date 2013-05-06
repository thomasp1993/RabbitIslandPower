package vetpet.controller;

import java.awt.event.ActionEvent;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class ConfirmActionPerformed extends AbstractListener{

    public ConfirmActionPerformed(DatabaseModel db , MainWindow mw){
        super(db,mw);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("YAY!");
    }
    
}
