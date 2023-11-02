package GUI;

import Domain.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * @author Samim
 */
public class SignUp extends javax.swing.JFrame {

    private MobileCompany mobileCompany;
    private Login login;
    
    public SignUp(MobileCompany mobileCompany, Login login) {
        this.mobileCompany = mobileCompany;
        this.login = login;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        streetNumberText = new javax.swing.JTextField();
        nameL = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        passwordL = new javax.swing.JLabel();
        suburbText = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        newCityText = new javax.swing.JTextField();
        streetNumberL = new javax.swing.JLabel();
        streetL = new javax.swing.JLabel();
        suburbL = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cityL = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Creation");
        setResizable(false);

        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
        });

        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        streetNumberText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                streetNumberTextKeyPressed(evt);
            }
        });

        nameL.setText("Name");

        streetText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                streetTextKeyPressed(evt);
            }
        });

        passwordL.setText("Password");

        suburbText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                suburbTextKeyPressed(evt);
            }
        });

        address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address.setText("Address Information ->");

        newCityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newCityTextKeyPressed(evt);
            }
        });

        streetNumberL.setText("Street Number");

        streetL.setText("Street");

        suburbL.setText("Suburb");

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 51, 0));
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButtonKeyPressed(evt);
            }
        });

        cityL.setText("City");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(nameL)
                        .addGap(36, 36, 36)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(passwordL)
                        .addGap(18, 18, 18)
                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(address))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(streetNumberL)
                        .addGap(18, 18, 18)
                        .addComponent(streetNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(streetL)
                        .addGap(65, 65, 65)
                        .addComponent(streetText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suburbL)
                                .addGap(57, 57, 57)
                                .addComponent(suburbText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cityL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(addButton)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(nameL))
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(passwordL))
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(address)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(streetNumberL))
                    .addComponent(streetNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(streetL))
                    .addComponent(streetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(suburbL))
                    .addComponent(suburbText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cityL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(newCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(addButton)
                .addGap(11, 11, 11)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_nameTextKeyPressed

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_passwordTextKeyPressed

    private void streetNumberTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_streetNumberTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_streetNumberTextKeyPressed

    private void streetTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_streetTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_streetTextKeyPressed

    private void suburbTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suburbTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_suburbTextKeyPressed

    private void newCityTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newCityTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_newCityTextKeyPressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addButton();
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_addButtonKeyPressed

    private void addButton() {
        if (isEditPersonalDataNotEmpty()) {  
            try{
                String username = nameText.getText();
                String password = passwordText.getText();                        
                int streetNum = Integer.parseInt(streetNumberText.getText());             
                String street = streetText.getText();
                String suburb = suburbL.getText();
                String city = newCityText.getText();

                mobileCompany.addUser(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword(), username, new Address(streetNum, street, suburb, city), password);

                JOptionPane.showMessageDialog(this, "You've been just added to the system.");
                this.dispose();
                login.setVisible(true);
                
            } catch (NumberFormatException e) {
                streetNumberText.setText("");
                JOptionPane.showMessageDialog(this, "Enter a number please!");
            }            
        } else {
            JOptionPane.showMessageDialog(this, "All fields required.");
        }
    }

    private boolean isEditPersonalDataNotEmpty() {
        if(!nameText.getText().isEmpty() && !passwordText.getText().isEmpty() && !streetNumberText.getText().isEmpty() && !streetText.getText().isEmpty() && !suburbText.getText().isEmpty() && !newCityText.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel address;
    private javax.swing.JLabel cityL;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField newCityText;
    private javax.swing.JLabel passwordL;
    private javax.swing.JTextField passwordText;
    private javax.swing.JLabel streetL;
    private javax.swing.JLabel streetNumberL;
    private javax.swing.JTextField streetNumberText;
    private javax.swing.JTextField streetText;
    private javax.swing.JLabel suburbL;
    private javax.swing.JTextField suburbText;
    // End of variables declaration//GEN-END:variables
}
