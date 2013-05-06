/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetpet.controller;

import java.awt.event.ActionEvent;
import vetpet.model.DatabaseModel;
import vetpet.view.MainWindow;

/**
 *
 * @author dio
 */
public class TextAddressActionPerformed extends AbstractListener {
    
    public TextAddressActionPerformed(DatabaseModel dbm , MainWindow mw){
        super(dbm,mw);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Called Text Address action performed listener");
    }
    
}
