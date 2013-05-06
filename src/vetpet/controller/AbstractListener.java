package vetpet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractListener implements ActionListener{
    
    @Override
    public abstract void actionPerformed(ActionEvent evt);
    
}
