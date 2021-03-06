/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import RegistryManagement.*;
import BookingManagement.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sian Paul Lasaga
 */
public class ScheduleDetailsFrame extends javax.swing.JFrame {

    private Registry reg = Registry.getInstance();
    private SearchEngine search = new SearchEngine();
    private List<Trip> tripList;
    private Trip trip;
    private DefaultTableModel tripsTableModel = new DefaultTableModel(new String[]{"Schedule", "Route", "Bus type", "Price", "Ref no."}, 0);
    private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yy  -  hh:mm");
    /**
     * Creates new form ScheduleDetailsFrame
     */
    public ScheduleDetailsFrame() {
        initComponents();
        for (int i = 2015; i <= 2020; i++) {
            yearCBox.addItem(i);
        }
        for (int i = 1; i < 32; i++) {
            dayCBox.addItem(i);
        }
        tripListTable.setModel(tripsTableModel);
        tripList = (List<Trip>) search.searchAvailableTrips();
        for (Trip trip1 : tripList) {
            String route = trip1.getTripFrom()+" to "+trip1.getTripTo();
            tripsTableModel.addRow(new Object[]{ df.format(trip1.getSchedule()), route, 
                trip1.getBus().getBusType(), "Php "+trip1.getPrice()+"0", trip1.getReferenceNo()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monthCBox = new javax.swing.JComboBox();
        dayCBox = new javax.swing.JComboBox();
        yearCBox = new javax.swing.JComboBox();
        searchTripButton = new javax.swing.JButton();
        proceedButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tripListTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Date of trip"));

        jLabel1.setText("Month:");

        jLabel2.setText("Day:");

        jLabel3.setText("Year:");

        monthCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthCBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthCBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monthCBoxMouseEntered(evt);
            }
        });
        monthCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthCBoxActionPerformed(evt);
            }
        });

        dayCBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dayCBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dayCBoxMouseEntered(evt);
            }
        });

        yearCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearCBoxActionPerformed(evt);
            }
        });

        searchTripButton.setText("Search Trip");
        searchTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTripButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(dayCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchTripButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(dayCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTripButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //dayCBox.setModel(new DefaultComboBoxModel());
        //try{
            //if(monthCBox.getSelectedItem().toString().equals("Feb")){
                //    for(int i = 1; i<=29; i++){
                    //        monthCBox.addItem(i);
                    //    }
                //}
            //}
        //catch(Exception e){
            ////}
        //}

    proceedButton.setText("Proceed");
    proceedButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            proceedButtonActionPerformed(evt);
        }
    });

    exitButton.setText("Exit");
    exitButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            exitButtonActionPerformed(evt);
        }
    });

    tripListTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPane1.setViewportView(tripListTable);
    DefaultTableCellRenderer centerRenderer= new DefaultTableCellRenderer();
    DefaultTableCellRenderer leftRenderer= new DefaultTableCellRenderer();
    DefaultTableCellRenderer rightRenderer= new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    leftRenderer.setHorizontalAlignment (SwingConstants.LEFT);
    rightRenderer.setHorizontalAlignment (SwingConstants.RIGHT);
    tripListTable.setRowSelectionAllowed (true);
    tripListTable.setSelectionMode (ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    tripListTable.setEnabled (true);
    tripListTable.setSelectionBackground (java.awt.Color.GRAY);
    for (int c = 0; c < tripListTable.getColumnCount(); c++)
    {
        Class<?> col_class = tripListTable.getColumnClass(c);
        tripListTable.setDefaultEditor(col_class, null);        // remove editor
    }

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(exitButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(proceedButton))
                .addComponent(jScrollPane1))
            .addGap(20, 20, 20))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(proceedButton)
                .addComponent(exitButton))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthCBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthCBoxMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_monthCBoxMouseClicked

    private void monthCBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthCBoxMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_monthCBoxMouseEntered

    private void dayCBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayCBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dayCBoxMouseClicked

    private void dayCBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayCBoxMouseEntered
        // TODO add your handling code here:
        dayCBox.setModel(new DefaultComboBoxModel());
        String month = null;
        month = monthCBox.getSelectedItem().toString();
        if(month.equals("Feb")){
            for (int i = 1; i < 30; i++) {
                dayCBox.addItem(i);
            }
        }
        if(month.equals("Jan")||month.equals("Mar")||month.equals("May")||month.equals("Jul")
            ||month.equals("Aug")||month.equals("Oct")||month.equals("Dec")){
            for (int i = 1; i < 32; i++) {
                dayCBox.addItem(i);
            }
        }
        if(month.equals("Apr")||month.equals("Jun")||month.equals("Sep")||month.equals("Oct")
            ||month.equals("Nov")){
            for (int i = 1; i < 31; i++) {
                dayCBox.addItem(i);
            }
        }
    }//GEN-LAST:event_dayCBoxMouseEntered

    private void yearCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearCBoxActionPerformed

    private void monthCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthCBoxActionPerformed

    private void searchTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTripButtonActionPerformed
        // TODO add your handling code here:
        tripsTableModel = new DefaultTableModel(new String[]{"Date", "Time", "Route", "Bus type", "Price", "Ref no."}, 0);
//        tripListTable.setModel(tripsTableModel);
        if(monthCBox.getSelectedIndex()==1 && dayCBox.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select the date!", "Not complete!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String date = (int)(monthCBox.getSelectedIndex())+"/"+dayCBox.getSelectedItem().toString()+"/"+(int)(yearCBox.getSelectedIndex()+15);
            tripList = (List<Trip>) search.searchAvailableTrips(new Date(date));
            for (Trip trip1 : tripList) {
            String route = trip1.getTripFrom()+" to "+trip1.getTripTo();
            tripsTableModel.addRow(new Object[]{ df.format(trip1.getSchedule()), route, 
                trip1.getBus().getBusType(), "Php "+trip1.getPrice()+"0", trip1.getReferenceNo()});
        }
        }
    }//GEN-LAST:event_searchTripButtonActionPerformed

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        // TODO add your handling code here:
        BookingFrame booking = new BookingFrame();
        int row = tripListTable.getSelectedRow();
        String refNo = (String) tripsTableModel.getValueAt(row, 5);
        trip = (Trip) search.searchByRefNo(refNo);
        booking.loadTrip(trip);
        booking.show();
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScheduleDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleDetailsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox dayCBox;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox monthCBox;
    private javax.swing.JButton proceedButton;
    private javax.swing.JButton searchTripButton;
    private javax.swing.JTable tripListTable;
    private javax.swing.JComboBox yearCBox;
    // End of variables declaration//GEN-END:variables
}
