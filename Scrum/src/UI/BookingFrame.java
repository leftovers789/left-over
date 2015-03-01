/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import EmployeeManagement.*;
import BookingManagement.*;
import RegistryManagement.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sian Paul Lasaga
 */
public class BookingFrame extends javax.swing.JFrame {

    private Trip trip;
    private Passenger passenger;
    private TicketType ticketType;
    private Ticket ticket;
    private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy  -  hh:mm");
    private Gender gender;
//    private static CodeGenerator gen = CodeGenerator.getInstance();
    /**
     * Creates new form BookingFrame
     */
    public BookingFrame() {
        initComponents();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        tickerTypeButtonGroup.add(regularRadioButton);
        tickerTypeButtonGroup.add(halfFareRadioButton);
        tickerTypeButtonGroup.add(discountedRadioButton);
        tickerNoLabel.setText(CodeGenerator.generateTicketNumber());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        tickerTypeButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        contactNoTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        tripSchedLabel = new javax.swing.JLabel();
        tickerNoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        regularRadioButton = new javax.swing.JRadioButton();
        halfFareRadioButton = new javax.swing.JRadioButton();
        discountedRadioButton = new javax.swing.JRadioButton();
        busTypeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Passenger Information"));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("First name:");

        fNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Last name:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Contact No.:");

        lNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextFieldActionPerformed(evt);
            }
        });

        contactNoTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ageTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        maleRadioButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        femaleRadioButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        femaleRadioButton.setText("Female");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Address:");

        addressTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)
                                .addComponent(maleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(femaleRadioButton))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(contactNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tripSchedLabel.setText("Trip schedule here");

        tickerNoLabel.setText("#######");

        jLabel2.setText("Ticket No.:");

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Ticket type:");

        regularRadioButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        regularRadioButton.setText("Regular");
        regularRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularRadioButtonActionPerformed(evt);
            }
        });

        halfFareRadioButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        halfFareRadioButton.setText("Half-fare");
        halfFareRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfFareRadioButtonActionPerformed(evt);
            }
        });

        discountedRadioButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        discountedRadioButton.setText("Discounted");
        discountedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountedRadioButtonActionPerformed(evt);
            }
        });

        busTypeLabel.setText("Bus type here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(busTypeLabel)
                        .addGap(63, 63, 63)
                        .addComponent(tripSchedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tickerNoLabel)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(regularRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(halfFareRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(discountedRadioButton)))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tickerNoLabel)
                    .addComponent(tripSchedLabel)
                    .addComponent(busTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(regularRadioButton)
                    .addComponent(halfFareRadioButton)
                    .addComponent(discountedRadioButton))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(backButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadTrip(Trip trip){
        this.trip = trip;
        tripSchedLabel.setText(df.format(trip.getSchedule()));
        busTypeLabel.setText(String.valueOf(trip.getBus().getBusType()));
    }
    
    private void lNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTextFieldActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
        gender = Gender.MALE;
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
        gender = Gender.FEMALE;
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void regularRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularRadioButtonActionPerformed
        // TODO add your handling code here:
        ticketType = TicketType.Regular;
    }//GEN-LAST:event_regularRadioButtonActionPerformed

    private void halfFareRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfFareRadioButtonActionPerformed
        // TODO add your handling code here:
        ticketType = TicketType.Half_Fare;
    }//GEN-LAST:event_halfFareRadioButtonActionPerformed

    private void discountedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountedRadioButtonActionPerformed
        // TODO add your handling code here:
        ticketType = TicketType.Discounted;
    }//GEN-LAST:event_discountedRadioButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        ConfirmBooking confirm = new ConfirmBooking();
        if(fNameTextField.getText().isEmpty() || lNameTextField.getText().isEmpty() || gender==null || 
                ageTextField.getText().isEmpty() || contactNoTextField.getText().isEmpty() || ticketType==null){
            JOptionPane.showMessageDialog(null, "Please fill all the data.", "Not complete!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String fName = fNameTextField.getText();
            String lName = lNameTextField.getText();
            int age = Integer.parseInt(ageTextField.getText());
            String contactNo = contactNoTextField.getText();
            String ticketNo = tickerNoLabel.getText();
            String address = addressTextField.getText();
            double price = trip.getPrice();
            ticket = new Ticket(ticketNo, ticketType, price);
            passenger = new Passenger(fName, lName, age, gender, contactNo, address, ticket);
            confirm.loadData(passenger, trip, this);
            confirm.show();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel busTypeLabel;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JRadioButton discountedRadioButton;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JRadioButton halfFareRadioButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JButton okButton;
    private javax.swing.JRadioButton regularRadioButton;
    private javax.swing.JLabel tickerNoLabel;
    private javax.swing.ButtonGroup tickerTypeButtonGroup;
    private javax.swing.JLabel tripSchedLabel;
    // End of variables declaration//GEN-END:variables
}
