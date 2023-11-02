package GUI;

import Domain.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * @author Samim
 */

public class UpdateUI extends javax.swing.JFrame {

    private MobilePlan mobilePlan;   
    private UserUI userUI;
    private AdminUI adminUI;
    private int userID;
    private int status;
    
    public UpdateUI(MobilePlan mobilePlan, UserUI userUI, int status) {
        this.mobilePlan = mobilePlan;
        this.userUI = userUI;        
        this.status = status;
        initComponents();
        personalPlanChoice.setEnabled(false);
        businessPlanChoice.setEnabled(false);        
        if(mobilePlan instanceof PersonalPlan){
            personalPlanChoice.setSelected(true);
            planCityText.setText(((PersonalPlan)mobilePlan).getCity());
        } else{
            businessPlanChoice.setSelected(true);
            ABNText.setText(((BusinessPlan)mobilePlan).getABN() + "");
            numberOfEmployeesText.setText(((BusinessPlan)mobilePlan).getNumberOfEmployees() + "");
        }
        planIDText.setText(mobilePlan.getId() + ""); 
        planIDText.setEnabled(false);        
        usernameText.setText(mobilePlan.getUserName());
        modelText.setText(mobilePlan.getModel());
        typeChoice.setModel(new DefaultComboBoxModel<>(MobileType.values()));
        typeChoice.setSelectedItem(mobilePlan.getHandset().getType());
        memorySizeText.setText(mobilePlan.getHandset().getMemorySize() + "");
        priceText.setText(mobilePlan.getHandset().getPrice() + "");
        internetQuotaText.setText(mobilePlan.getInternetQuota() + "");
        capLimitText.setText(mobilePlan.getCapLimit() + "");
        dayText.setText(mobilePlan.getExpiryDate().getDay() + "");
        monthText.setText(mobilePlan.getExpiryDate().getMonth() + "");
        yearText.setText(mobilePlan.getExpiryDate().getYear() + "");
    }    
    
    public UpdateUI(MobilePlan mobilePlan, AdminUI adminUI, int userID, int status) {
        this.mobilePlan = mobilePlan;        
        this.adminUI = adminUI;
        this.userID = userID;
        this.status = status;
        initComponents();
        personalPlanChoice.setEnabled(false);
        businessPlanChoice.setEnabled(false);        
        if(mobilePlan instanceof PersonalPlan){
            personalPlanChoice.setSelected(true);
            planCityText.setText(((PersonalPlan)mobilePlan).getCity());
        } else{
            businessPlanChoice.setSelected(true);
            ABNText.setText(((BusinessPlan)mobilePlan).getABN() + "");
            numberOfEmployeesText.setText(((BusinessPlan)mobilePlan).getNumberOfEmployees() + "");
        }
        planIDText.setText(mobilePlan.getId() + ""); 
        planIDText.setEnabled(false);        
        usernameText.setText(mobilePlan.getUserName());
        modelText.setText(mobilePlan.getModel());
        typeChoice.setModel(new DefaultComboBoxModel<>(MobileType.values()));
        typeChoice.setSelectedItem(mobilePlan.getHandset().getType());
        memorySizeText.setText(mobilePlan.getHandset().getMemorySize() + "");
        priceText.setText(mobilePlan.getHandset().getPrice() + "");
        internetQuotaText.setText(mobilePlan.getInternetQuota() + "");
        capLimitText.setText(mobilePlan.getCapLimit() + "");
        dayText.setText(mobilePlan.getExpiryDate().getDay() + "");
        monthText.setText(mobilePlan.getExpiryDate().getMonth() + "");
        yearText.setText(mobilePlan.getExpiryDate().getYear() + "");
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        priceL = new javax.swing.JLabel();
        memorySizeText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        modelText = new javax.swing.JTextField();
        planIDL = new javax.swing.JLabel();
        mobilePhoneL = new javax.swing.JLabel();
        businessPlanChoice = new javax.swing.JRadioButton();
        planIDText = new javax.swing.JTextField();
        modelL = new javax.swing.JLabel();
        personalPlanChoice = new javax.swing.JRadioButton();
        usernameL = new javax.swing.JLabel();
        memorySizeL = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        typeL = new javax.swing.JLabel();
        typeChoice = new javax.swing.JComboBox<>();
        internetQuotaL = new javax.swing.JLabel();
        internetQuotaText = new javax.swing.JTextField();
        capLimitL = new javax.swing.JLabel();
        capLimitText = new javax.swing.JTextField();
        expiryDateL = new javax.swing.JLabel();
        dayL = new javax.swing.JLabel();
        dayText = new javax.swing.JTextField();
        monthL = new javax.swing.JLabel();
        monthText = new javax.swing.JTextField();
        yearL = new javax.swing.JLabel();
        planCityL = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        planCityText = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        ABNText = new javax.swing.JTextField();
        ABNL = new javax.swing.JLabel();
        numberOfEmployeesL = new javax.swing.JLabel();
        numberOfEmployeesText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Plam");
        setResizable(false);

        priceL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        priceL.setText("Price");

        memorySizeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                memorySizeTextKeyPressed(evt);
            }
        });

        usernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextKeyPressed(evt);
            }
        });

        modelText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modelTextKeyPressed(evt);
            }
        });

        planIDL.setText("PlanID");

        mobilePhoneL.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        mobilePhoneL.setText("Mobile Phone ->");

        buttonGroup1.add(businessPlanChoice);
        businessPlanChoice.setText("Business Plan");

        planIDText.setEditable(false);

        modelL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modelL.setText("Model");

        buttonGroup1.add(personalPlanChoice);
        personalPlanChoice.setText("Personal Plan");
        personalPlanChoice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                personalPlanChoiceStateChanged(evt);
            }
        });

        usernameL.setText("Username");

        memorySizeL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        memorySizeL.setText("Memory Size");

        priceText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceTextKeyPressed(evt);
            }
        });

        typeL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typeL.setText("OS Type");

        typeChoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeChoiceKeyPressed(evt);
            }
        });

        internetQuotaL.setText("Internet Quota");

        internetQuotaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                internetQuotaTextKeyPressed(evt);
            }
        });

        capLimitL.setText("Cap Limit");

        capLimitText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                capLimitTextKeyPressed(evt);
            }
        });

        expiryDateL.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        expiryDateL.setText("Expiry Date ->");

        dayL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dayL.setText("Day");

        dayText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dayTextKeyPressed(evt);
            }
        });

        monthL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        monthL.setText("Month");

        monthText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                monthTextKeyPressed(evt);
            }
        });

        yearL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yearL.setText("Year");

        planCityL.setText("City");

        yearText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearTextKeyPressed(evt);
            }
        });

        planCityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                planCityTextKeyPressed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 204, 204));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 51, 0));
        clearButton.setText("CLear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        clearButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearButtonKeyPressed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(204, 204, 204));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 51, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        updateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateButtonKeyPressed(evt);
            }
        });

        ABNText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ABNTextKeyPressed(evt);
            }
        });

        ABNL.setText("ABN");

        numberOfEmployeesL.setText("NO.Employee");

        numberOfEmployeesText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numberOfEmployeesTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameL)
                            .addComponent(planIDL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton)))
                    .addComponent(mobilePhoneL)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(internetQuotaL)
                            .addComponent(priceL)
                            .addComponent(capLimitL)
                            .addComponent(memorySizeL)
                            .addComponent(typeL)
                            .addComponent(modelL)
                            .addComponent(numberOfEmployeesL))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberOfEmployeesText)
                            .addComponent(ABNText)
                            .addComponent(planCityText)
                            .addComponent(yearText)
                            .addComponent(monthText)
                            .addComponent(dayText)
                            .addComponent(internetQuotaText)
                            .addComponent(priceText)
                            .addComponent(capLimitText)
                            .addComponent(memorySizeText)
                            .addComponent(typeChoice, 0, 102, Short.MAX_VALUE)
                            .addComponent(modelText)))
                    .addComponent(dayL)
                    .addComponent(monthL)
                    .addComponent(yearL)
                    .addComponent(planCityL)
                    .addComponent(ABNL)
                    .addComponent(expiryDateL)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personalPlanChoice)
                        .addGap(18, 18, 18)
                        .addComponent(businessPlanChoice)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalPlanChoice)
                    .addComponent(businessPlanChoice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planIDL)
                    .addComponent(planIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameL)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton))
                .addGap(18, 18, 18)
                .addComponent(mobilePhoneL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelL)
                    .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memorySizeL)
                    .addComponent(memorySizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceL)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(internetQuotaL)
                    .addComponent(internetQuotaText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capLimitL)
                    .addComponent(capLimitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(expiryDateL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayL)
                    .addComponent(dayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthL)
                    .addComponent(monthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearL)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planCityL)
                    .addComponent(planCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ABNL)
                    .addComponent(ABNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfEmployeesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfEmployeesL))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void memorySizeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memorySizeTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_memorySizeTextKeyPressed

    private void usernameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_usernameTextKeyPressed

    private void modelTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_modelTextKeyPressed

    private void personalPlanChoiceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_personalPlanChoiceStateChanged
        if (personalPlanChoice.isSelected()) {
            planCityL.setVisible(true);
            planCityText.setVisible(true);
            ABNL.setVisible(false);
            ABNText.setVisible(false);
            numberOfEmployeesL.setVisible(false);
            numberOfEmployeesText.setVisible(false);
        } else {
            planCityL.setVisible(false);
            planCityText.setVisible(false);
            ABNL.setVisible(true);
            ABNText.setVisible(true);
            numberOfEmployeesL.setVisible(true);
            numberOfEmployeesText.setVisible(true);
        }
    }//GEN-LAST:event_personalPlanChoiceStateChanged

    private void priceTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_priceTextKeyPressed

    private void typeChoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeChoiceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_typeChoiceKeyPressed

    private void internetQuotaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_internetQuotaTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_internetQuotaTextKeyPressed

    private void capLimitTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capLimitTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_capLimitTextKeyPressed

    private void dayTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_dayTextKeyPressed

    private void monthTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_monthTextKeyPressed

    private void yearTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_yearTextKeyPressed

    private void planCityTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_planCityTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_planCityTextKeyPressed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateButton();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void ABNTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ABNTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_ABNTextKeyPressed

    private void numberOfEmployeesTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOfEmployeesTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_numberOfEmployeesTextKeyPressed

    private void updateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateButton();
        }
    }//GEN-LAST:event_updateButtonKeyPressed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            clear();
        }
    }//GEN-LAST:event_clearButtonKeyPressed

    private boolean isAddPlanNotEmpty() {
        if (!planIDText.getText().isEmpty() && !usernameText.getText().isEmpty() && !modelText.getText().isEmpty() && !memorySizeText.getText().isEmpty() && !priceText.getText().isEmpty() && !internetQuotaText.getText().isEmpty() && !capLimitText.getText().isEmpty() && !dayText.getText().isEmpty() && !monthText.getText().isEmpty() && !yearText.getText().isEmpty() && !planIDText.getText().isEmpty()) {
            return true;
        }
        return false;
    }
    
    private void updateButton() {
        if (isAddPlanNotEmpty()) {
            try {                
                String username = usernameText.getText();
                try{
                    if(!mobilePlan.isValidUserName(username)){
                        throw new PlanUserNameException(username);
                    }
                } catch (PlanUserNameException e){
                    JOptionPane.showMessageDialog(this, e);
                    usernameText.setText(e.getUserName());
                    username = e.getUserName();
                }
                String model = modelText.getText();
                MobileType type = MobileType.valueOf(typeChoice.getSelectedItem().toString());
                int size = Integer.parseInt(memorySizeText.getText());
                double price = Double.parseDouble(priceText.getText());                
                int quota = Integer.parseInt(internetQuotaText.getText());
                int cap = Integer.parseInt(capLimitText.getText());
                int day = Integer.parseInt(dayText.getText());
                int month = Integer.parseInt(monthText.getText());
                int year = Integer.parseInt(yearText.getText());
                if (size < 0 || price < 0 || quota < 0 || cap < 0) {
                    throw new MyException();
                }
                MyDate date = new MyDate(year, month, day);
                if (!date.isValid()) {
                    throw new MyDateException(date);
                }
                MobilePhone phone = new MobilePhone(model, type, size, price);  
                mobilePlan.setUserName(username);
                mobilePlan.setHandSet(phone);
                mobilePlan.setInternetQuota(quota);
                mobilePlan.setCapLimit(cap);
                mobilePlan.setExpiryDate(date);                
                if (personalPlanChoice.isSelected()) {
                    String city = planCityText.getText();  
                    ((PersonalPlan) mobilePlan).setCity(city);
                } else {
                    int abn = Integer.parseInt(ABNText.getText());
                    int noEmp = Integer.parseInt(numberOfEmployeesText.getText());
                    if (abn < 0 || noEmp < 0) {
                        throw new MyException();
                    }
                    ((BusinessPlan) mobilePlan).setABN(abn);
                    ((BusinessPlan) mobilePlan).setNumberOfEmployees(noEmp);
                }       
                JOptionPane.showMessageDialog(this, "Plan has been updated.");
                if(status == 1){
                    adminUI.fillTable(adminUI.getPlansInformationTable(), new ArrayList<MobilePlan>(adminUI.getMobileCompany().findUser(userID).getPlans().values()));                    
                }
                if(status == 0){
                    userUI.fillTable(userUI.getPlansInformationTable() ,new ArrayList<MobilePlan>(userUI.getUser().getPlans().values()));                    
                }                
                this.dispose();
            } catch (MyDateException e) {
                clear();
                JOptionPane.showMessageDialog(this, e);
            } catch (NumberFormatException e) {
                clear();
                JOptionPane.showMessageDialog(this, "Enter a number please.");
            } catch (MyException e) {
                clear();
                JOptionPane.showMessageDialog(this, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "All fields required.");
        }
    }
    
    private void clear() {        
        usernameText.setText("");
        modelText.setText("");
        memorySizeText.setText("");
        priceText.setText("");
        internetQuotaText.setText("");
        capLimitText.setText("");
        dayText.setText("");
        monthText.setText("");
        yearText.setText("");
        planCityText.setText("");
        ABNText.setText("");
        numberOfEmployeesText.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABNL;
    private javax.swing.JTextField ABNText;
    private javax.swing.JRadioButton businessPlanChoice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel capLimitL;
    private javax.swing.JTextField capLimitText;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dayL;
    private javax.swing.JTextField dayText;
    private javax.swing.JLabel expiryDateL;
    private javax.swing.JLabel internetQuotaL;
    private javax.swing.JTextField internetQuotaText;
    private javax.swing.JLabel memorySizeL;
    private javax.swing.JTextField memorySizeText;
    private javax.swing.JLabel mobilePhoneL;
    private javax.swing.JLabel modelL;
    private javax.swing.JTextField modelText;
    private javax.swing.JLabel monthL;
    private javax.swing.JTextField monthText;
    private javax.swing.JLabel numberOfEmployeesL;
    private javax.swing.JTextField numberOfEmployeesText;
    private javax.swing.JRadioButton personalPlanChoice;
    private javax.swing.JLabel planCityL;
    private javax.swing.JTextField planCityText;
    private javax.swing.JLabel planIDL;
    private javax.swing.JTextField planIDText;
    private javax.swing.JLabel priceL;
    private javax.swing.JTextField priceText;
    private javax.swing.JComboBox<MobileType> typeChoice;
    private javax.swing.JLabel typeL;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usernameL;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel yearL;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
