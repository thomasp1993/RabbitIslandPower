package vetpet.controller;

import java.awt.event.ActionEvent;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public class AddClientActionPerformed extends AbstractListener {

    public AddClientActionPerformed(DatabaseModel dbm, MainWindow mw) {
        super(dbm, mw);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Called AddClientActionPerformed listener..");
        mwindow.disableClientForm();
    }
}
