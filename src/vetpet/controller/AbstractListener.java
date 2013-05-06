package vetpet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

public abstract class AbstractListener implements ActionListener{
    protected DatabaseModel dbmodel ;
    protected MainWindow mwindow;
    
    public AbstractListener(DatabaseModel dbm , MainWindow mw){
        dbmodel = dbm;
        mwindow = mw ;
    }
    @Override
    public abstract void actionPerformed(ActionEvent evt);
    
    public void changeDatabaseModel(DatabaseModel d){
        dbmodel = d ;
        mwindow.addDatabase(d);
    }
    
    public void changeWindow(MainWindow w){
        mwindow = w ;
    }
}