package vetpet.view;

import java.awt.Component;
import java.util.logging.Level; //loggers are optional 
import java.util.logging.Logger;
import javax.swing.*;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import vetpet.controller.*;
import vetpet.model.DatabaseModel;

public class MainWindow extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables

    private DatabaseModel dbm;
private javax.swing.JTextField TextAll;
    private javax.swing.JTextField TextCurrent;
    private javax.swing.JButton btnAddClient;
    private javax.swing.JButton btnAddPoints;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchName;
    private javax.swing.JButton btnSearchNumber;
    private javax.swing.JButton btnStart;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textBonus;
    private javax.swing.JTextField textCard;
    private javax.swing.JTextField textDebt;
    private javax.swing.JTextField textHome;
    private javax.swing.JTextField textMobile;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPoints;
    
    public MainWindow(DatabaseModel db) {
        this.dbm = db;
        initComponents();
    }

    public void addDatabase(DatabaseModel db) {
        this.dbm = db;
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textCard = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textHome = new javax.swing.JTextField();
        textMobile = new javax.swing.JTextField();
        textPoints = new javax.swing.JTextField();
        textBonus = new javax.swing.JTextField();
        textDebt = new javax.swing.JTextField();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        TextCurrent = new javax.swing.JTextField();
        TextAll = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        btnAddClient = new javax.swing.JButton();
        btnSearchName = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 6), new java.awt.Dimension(0, 6), new java.awt.Dimension(32767, 6));
        btnSearchNumber = new javax.swing.JButton();
        btnAddPoints = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jLabel1.setText("Αριθμός Κάρτας");
        jLabel2.setText("Ονοματεπώνυμο");
        jLabel4.setText("Διεύθυνση");
        jLabel5.setText("Σταθερό");
        jLabel6.setText("Κινητό");
        jLabel7.setText("Πόντοι");
        jLabel8.setText("xBONUS");
        jLabel9.setText("Χρέος");

        btnPrevious.setText("Προηγούμενο");
        btnPrevious.addActionListener(new PreviousActionPerformed(dbm, this));

        btnNext.setText("Επόμενο");
        btnNext.addActionListener(new NextActionPerformed(dbm, this));

        btnStart.setText("Αρχή");
        btnStart.addActionListener(new StartActionPerformed(dbm, this));

        btnLast.setText("Τέλος");
        btnLast.addActionListener(new LastActionListener(dbm, this));

        btnAddClient.setText("Προσθήκη πελάτη");
        btnAddClient.addActionListener(new AddClientActionPerformed(dbm, this));

        btnSearchName.setText("Αναζήτηση με Όνομα");
        btnSearchName.addActionListener(new SearchNameActionPerformed(dbm, this));

        btnDelete.setText("Διαγραφή");
        btnDelete.addActionListener(new DeleteActionPerformed(dbm, this));

        btnSearchNumber.setText("Αναζήτηση με Κάρτα");
        btnSearchNumber.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnSearchNumberActionPerformed(evt);
            }
        });

        btnAddPoints.setText("Πρόσθεση Πόντων");
        btnAddPoints.addActionListener(new AddPointActionPerformed(dbm, this));

        btnConfirm.setText("Επιβεβαίωση");
        btnConfirm.setEnabled(false);
        btnConfirm.addActionListener(new ConfirmActionPerformed(dbm, this));

        btnCancel.setText("Ακύρωση");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new CancelActionPerformed(dbm, this));
        
        btnSave.setText("Αποθήκευση");
        btnSave.addActionListener(new SaveActionPerformed(dbm, this));
        
        TextCurrent.setText("1");

        TextAll.setText("total");

        jLabel3.setText("από");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7)).addGap(49, 49, 49).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(textPoints).addComponent(textMobile).addComponent(textHome).addComponent(textAddress))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel8).addGap(59, 59, 59).addComponent(textBonus)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel9).addGap(71, 71, 71).addComponent(textDebt)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(btnPrevious).addGap(18, 18, 18).addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(TextCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1).addComponent(jLabel2))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(TextAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(textCard).addComponent(textName))))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(btnStart).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnLast))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(textCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(textHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(textMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(textPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(textBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(textDebt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(TextCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(TextAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3)).addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnPrevious).addComponent(btnNext)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnStart).addComponent(btnLast)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 59, Short.MAX_VALUE));

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(55, 55, 55).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(btnAddClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE).addComponent(btnSearchNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnAddPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(18, 18, 18).addComponent(btnConfirm).addGap(18, 18, 18).addComponent(btnCancel).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnAddClient).addComponent(btnConfirm).addComponent(btnCancel)).addGap(18, 18, 18).addComponent(btnDelete).addGap(18, 18, 18).addComponent(btnSearchName).addGap(18, 18, 18).addComponent(btnSearchNumber).addGap(18, 18, 18).addComponent(btnAddPoints).addGap(34, 34, 34).addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(136, Short.MAX_VALUE)));

        jToolBar1.add(jPanel2);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(101, 101, 101).addComponent(btnSave)).addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)).addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createSequentialGroup().addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(btnSave).addContainerGap()))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void disableClientForm() {
        textCard.setText("");
        textName.setText("");
        textAddress.setText("");
        textHome.setText("");
        textMobile.setText("");
        textPoints.setText("");
        textBonus.setText("");
        textDebt.setText("");

        //DISABLE BUTTONS
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnStart.setEnabled(false);
        btnLast.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSearchName.setEnabled(false);
        btnSearchNumber.setEnabled(false);
        btnSave.setEnabled(false);
        btnAddPoints.setEnabled(false);
        btnAddClient.setEnabled(false);

        //ENABLE BUTTONS
        btnConfirm.setEnabled(true);
        btnCancel.setEnabled(true);
    }

    public void enableClientForm() {
        //DISABLE BUTTONS
        btnPrevious.setEnabled(true);
        btnNext.setEnabled(true);
        btnStart.setEnabled(true);
        btnLast.setEnabled(true);
        btnDelete.setEnabled(true);
        btnSearchName.setEnabled(true);
        btnSearchNumber.setEnabled(true);
        btnSave.setEnabled(true);
        btnAddPoints.setEnabled(true);
        btnAddClient.setEnabled(true);

        //ENABLE BUTTONS
        btnConfirm.setEnabled(false);
        btnCancel.setEnabled(false);
    }

    public void set(ResultSet rs) throws SQLException {
        textCard.setText(Integer.toString(rs.getInt(1)));
        textName.setText(rs.getString(2));
        textAddress.setText(rs.getString(3));
        textHome.setText(Long.toString(rs.getLong(4)));
        textMobile.setText(Long.toString(rs.getLong(5)));
        textPoints.setText(Integer.toString(rs.getInt(6)));
        textBonus.setText(Integer.toString(rs.getInt(7)));
        textDebt.setText(Double.toString(rs.getDouble(8)));

        int pos = rs.getRow();
        rs.beforeFirst();
        int total = 0;
        while (rs.next()) {
            total++;
        }
        rs.absolute(pos);
        TextAll.setText(Integer.toString(total));
    }

    public void notifyException(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        System.out.println("Exception of type " + e.getClass() + " , with message " + e.getMessage());
    }

    public int getNumber() {
        return Integer.parseInt(textCard.getText());
    }

    @Override
    public String getName() {
        return textName.getText();
    }

    public String getAddress() {
        return textAddress.getText();
    }

    public long getHome() {
        return Long.parseLong(textHome.getText());
    }

    public long getMobile() {

        return Long.parseLong(textMobile.getText());
    }

    public int getPoints() {
        return Integer.parseInt(textPoints.getText());
    }

    public int getBonus() {
        return Integer.parseInt(textBonus.getText());
    }

    public double getDebt() {
        return Double.parseDouble(textDebt.getText());
    }
    
    public void updateTextField(String fieldName, String fieldVal){
        try {
            //look for element 
            //info at http://tutorials.jenkov.com/java-reflection/private-fields-and-methods.html
            // and http://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html
            Field c = MainWindow.class.getDeclaredField(fieldName);
            c.setAccessible(true);
            JTextField f = (JTextField) c.get(this);
            f.setText(fieldVal);
            c.setAccessible(false);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            notifyException(ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            notifyException(ex);
        } catch (SecurityException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            notifyException(ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            notifyException(ex);
        }
    }

    public int showAddPointDialog(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
    }
    
    public void showDialog(Component d, String b , String c , int a){
        JOptionPane.showMessageDialog(d,b,c,a);
    }
    
    public String askForString(String msg){
        return JOptionPane.showInputDialog(null,msg);
    }
}