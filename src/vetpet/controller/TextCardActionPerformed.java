package vetpet.controller;

import java.awt.event.ActionEvent;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class TextCardActionPerformed extends AbstractListener{
    
    public TextCardActionPerformed(DatabaseModel db , MainWindow mw){
        super(db,mw);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("TextCardActionPerformed notified");
    }
    
}
