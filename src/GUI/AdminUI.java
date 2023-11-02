package GUI;

import Domain.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Samim
 */
public class AdminUI extends javax.swing.JFrame {

    private MobileCompany mobileCompany;
    private String username;
    private String password;
    private Login login;
    private ArrayList<String> IDs;

    public AdminUI(Login login, MobileCompany mobileCompany, String username, String password) {
        this.mobileCompany = mobileCompany;
        this.username = username;
        this.password = password;
        this.login = login;
        IDs = new ArrayList<String>();
        mobileCompany.getUsers().values().forEach(x -> IDs.add(x.getName() + " : " + x.getUserID()));
        initComponents();
    }

    public MobileCompany getMobileCompany() {
        return this.mobileCompany;
    }

    public JTable getPlansInformationTable() {
        return this.plansInformationTable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        popUpMenu = new javax.swing.JPopupMenu();
        updateMenu = new javax.swing.JMenuItem();
        deleteMenu = new javax.swing.JMenuItem();
        tab = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reportForCompany = new javax.swing.JTextArea();
        mobileCompanyTitle = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminUsernameText = new javax.swing.JTextField();
        adminNameText = new javax.swing.JTextField();
        adminPasswordText = new javax.swing.JTextField();
        adminFlatRateText = new javax.swing.JTextField();
        changeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        personalPlanChoice = new javax.swing.JRadioButton();
        businessPlanChoice = new javax.swing.JRadioButton();
        planIDL = new javax.swing.JLabel();
        planIDText = new javax.swing.JTextField();
        usernameL = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        mobilePhoneL = new javax.swing.JLabel();
        modelL = new javax.swing.JLabel();
        modelText = new javax.swing.JTextField();
        priceL = new javax.swing.JLabel();
        memorySizeText = new javax.swing.JTextField();
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
        yearText = new javax.swing.JTextField();
        planCityL = new javax.swing.JLabel();
        planCityText = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        ABNL = new javax.swing.JLabel();
        ABNText = new javax.swing.JTextField();
        numberOfEmployeesL = new javax.swing.JLabel();
        numberOfEmployeesText = new javax.swing.JTextField();
        userIDs2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        planIDFindL = new javax.swing.JLabel();
        planIDFindText = new javax.swing.JTextField();
        findButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        plansTextArea = new javax.swing.JTextArea();
        userIDs3 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        plansInformationTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        userIDs4 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        plansInformationTable1 = new javax.swing.JTable();
        mobileModelL1 = new javax.swing.JLabel();
        mobileModelText1 = new javax.swing.JTextField();
        expiryDateL1 = new javax.swing.JLabel();
        expiryDateText1 = new javax.swing.JTextField();
        filterByDateButton1 = new javax.swing.JButton();
        sortByUsernameCheck1 = new javax.swing.JCheckBox();
        userIDs5 = new javax.swing.JComboBox<>();
        allUsersCheck1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        userPaymentTable = new javax.swing.JTable();
        sortByUsername = new javax.swing.JCheckBox();
        sortByTotalMonthlyPayment = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        cityPaymentTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        modelTotalAverageTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        userIDs6 = new javax.swing.JComboBox<>();
        userDeleteButton = new javax.swing.JButton();
        commentL = new javax.swing.JLabel();
        payAttentionL = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        logoutButton = new javax.swing.JMenu();

        updateMenu.setText("update");
        updateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuActionPerformed(evt);
            }
        });
        popUpMenu.add(updateMenu);

        deleteMenu.setText("delete");
        deleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuActionPerformed(evt);
            }
        });
        popUpMenu.add(deleteMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        reportForCompany.setEditable(false);
        reportForCompany.setBackground(new java.awt.Color(255, 255, 204));
        reportForCompany.setColumns(20);
        reportForCompany.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reportForCompany.setRows(5);
        reportForCompany.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(reportForCompany);

        mobileCompanyTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(mobileCompanyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1006, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(mobileCompanyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tab.addTab("Company Report", jPanel6);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Flat Rate");

        adminUsernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminUsernameTextKeyPressed(evt);
            }
        });

        adminNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminNameTextKeyPressed(evt);
            }
        });

        adminPasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminPasswordTextKeyPressed(evt);
            }
        });

        adminFlatRateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminFlatRateTextKeyPressed(evt);
            }
        });

        changeButton.setBackground(new java.awt.Color(204, 204, 204));
        changeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changeButton.setForeground(new java.awt.Color(204, 0, 0));
        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminFlatRateText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(529, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeButton)
                .addGap(606, 606, 606))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(adminPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminFlatRateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(changeButton)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        tab.addTab("Edit Personal Info", jPanel10);

        buttonGroup1.add(personalPlanChoice);
        personalPlanChoice.setSelected(true);
        personalPlanChoice.setText("Personal Plan");
        personalPlanChoice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                personalPlanChoiceStateChanged(evt);
            }
        });

        buttonGroup1.add(businessPlanChoice);
        businessPlanChoice.setText("Business Plan");

        planIDL.setText("PlanID");

        planIDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                planIDTextKeyPressed(evt);
            }
        });

        usernameL.setText("Username");

        usernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextKeyPressed(evt);
            }
        });

        mobilePhoneL.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        mobilePhoneL.setText("Mobile Phone ->");

        modelL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modelL.setText("Model");

        modelText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modelTextKeyPressed(evt);
            }
        });

        priceL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        priceL.setText("Price");

        memorySizeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                memorySizeTextKeyPressed(evt);
            }
        });

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

        yearText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearTextKeyPressed(evt);
            }
        });

        planCityL.setText("City");

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

        ABNL.setText("ABN");

        ABNText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ABNTextKeyPressed(evt);
            }
        });

        numberOfEmployeesL.setText("NO.Employee");

        numberOfEmployeesText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numberOfEmployeesTextKeyPressed(evt);
            }
        });

        userIDs2.setBackground(new java.awt.Color(0, 204, 204));
        userIDs2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobilePhoneL)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameL)
                            .addComponent(planIDL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(clearButton)
                                .addGap(129, 129, 129)
                                .addComponent(userIDs2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(internetQuotaL)
                            .addComponent(priceL)
                            .addComponent(capLimitL)
                            .addComponent(memorySizeL)
                            .addComponent(typeL)
                            .addComponent(modelL)
                            .addComponent(numberOfEmployeesL))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(personalPlanChoice)
                        .addGap(18, 18, 18)
                        .addComponent(businessPlanChoice)))
                .addGap(627, 627, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalPlanChoice)
                    .addComponent(businessPlanChoice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planIDL)
                    .addComponent(planIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(userIDs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameL)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addGap(18, 18, 18)
                .addComponent(mobilePhoneL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelL)
                    .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memorySizeL)
                    .addComponent(memorySizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceL)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(internetQuotaL)
                    .addComponent(internetQuotaText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capLimitL)
                    .addComponent(capLimitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(expiryDateL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayL)
                    .addComponent(dayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthL)
                    .addComponent(monthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearL)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planCityL)
                    .addComponent(planCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ABNL)
                    .addComponent(ABNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfEmployeesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfEmployeesL))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        tab.addTab("Add Plan", jPanel2);

        planIDFindL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planIDFindL.setText("PlanID");

        planIDFindText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                planIDFindTextKeyPressed(evt);
            }
        });

        findButton.setBackground(new java.awt.Color(204, 204, 204));
        findButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        findButton.setForeground(new java.awt.Color(255, 51, 0));
        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });
        findButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                findButtonKeyPressed(evt);
            }
        });

        plansTextArea.setEditable(false);
        plansTextArea.setBackground(new java.awt.Color(153, 255, 153));
        plansTextArea.setColumns(20);
        plansTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plansTextArea.setRows(5);
        jScrollPane1.setViewportView(plansTextArea);

        userIDs3.setBackground(new java.awt.Color(0, 204, 204));
        userIDs3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(planIDFindL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(planIDFindText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(userIDs3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(670, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planIDFindL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planIDFindText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDs3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        tab.addTab("Find Plan", jPanel3);

        jPanel4.setForeground(new java.awt.Color(255, 51, 0));

        plansInformationTable.getTableHeader().setReorderingAllowed(false);
        plansInformationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plansInformationTableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plansInformationTableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(plansInformationTable);

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 51, 0));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 0, 0));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        userIDs4.setBackground(new java.awt.Color(0, 204, 204));
        userIDs4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userIDs4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userIDs4ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(603, 603, 603)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(userIDs4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(579, 579, 579))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(userIDs4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab.addTab("Plans Information", jPanel4);

        plansInformationTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(plansInformationTable1);

        mobileModelL1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobileModelL1.setText("Mobile Model");

        mobileModelText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileModelText1KeyReleased(evt);
            }
        });

        expiryDateL1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        expiryDateL1.setText("Expiry Date");

        expiryDateText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                expiryDateText1KeyPressed(evt);
            }
        });

        filterByDateButton1.setBackground(new java.awt.Color(204, 204, 204));
        filterByDateButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        filterByDateButton1.setForeground(new java.awt.Color(255, 51, 0));
        filterByDateButton1.setText("Filter By Date");
        filterByDateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterByDateButton1ActionPerformed(evt);
            }
        });

        sortByUsernameCheck1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sortByUsernameCheck1.setText("Sort By Username");
        sortByUsernameCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByUsernameCheck1ActionPerformed(evt);
            }
        });

        userIDs5.setBackground(new java.awt.Color(0, 204, 204));
        userIDs5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userIDs5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userIDs5ItemStateChanged(evt);
            }
        });

        allUsersCheck1.setText("All Users");
        allUsersCheck1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                allUsersCheck1StateChanged(evt);
            }
        });
        allUsersCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allUsersCheck1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortByUsernameCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobileModelL1)
                                    .addComponent(expiryDateL1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mobileModelText1)
                                    .addComponent(expiryDateText1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(filterByDateButton1)
                                .addGap(185, 185, 185)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allUsersCheck1)
                                    .addComponent(userIDs5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileModelL1)
                    .addComponent(mobileModelText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryDateL1)
                    .addComponent(expiryDateText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterByDateButton1)
                    .addComponent(userIDs5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allUsersCheck1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortByUsernameCheck1)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        tab.addTab("Filter Plans", jPanel5);

        userPaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(userPaymentTable);

        sortByUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sortByUsername.setText("Sort By Username");
        sortByUsername.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sortByUsernameStateChanged(evt);
            }
        });
        sortByUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByUsernameActionPerformed(evt);
            }
        });

        sortByTotalMonthlyPayment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sortByTotalMonthlyPayment.setText("Sort By Total Monthly Payment");
        sortByTotalMonthlyPayment.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sortByTotalMonthlyPaymentStateChanged(evt);
            }
        });
        sortByTotalMonthlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByTotalMonthlyPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortByTotalMonthlyPayment)
                            .addComponent(sortByUsername))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sortByTotalMonthlyPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortByUsername)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        tab.addTab("User-Payment Report", jPanel1);

        cityPaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(cityPaymentTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("City-Payment Report", jPanel7);

        modelTotalAverageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(modelTotalAverageTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Model-Total-Average  Report", jPanel8);

        userIDs6.setBackground(new java.awt.Color(0, 204, 204));
        userIDs6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userIDs6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userIDs6ItemStateChanged(evt);
            }
        });

        userDeleteButton.setBackground(new java.awt.Color(204, 204, 204));
        userDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userDeleteButton.setForeground(new java.awt.Color(255, 51, 51));
        userDeleteButton.setText("Delete");
        userDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeleteButtonActionPerformed(evt);
            }
        });

        commentL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        commentL.setText("Deleting a user is considered a permenant action. There is no coming back after deleting a user.");

        payAttentionL.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        payAttentionL.setForeground(new java.awt.Color(204, 0, 0));
        payAttentionL.setText("PAY ATTENTION !");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(payAttentionL))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(commentL))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(userIDs6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(userDeleteButton))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(payAttentionL)
                .addGap(12, 12, 12)
                .addComponent(commentL)
                .addGap(150, 150, 150)
                .addComponent(userIDs6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userDeleteButton))
        );

        tab.addTab("Delete User", jPanel9);

        logoutButton.setText("Logout");
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        menu.add(logoutButton);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        this.dispose();
        login.show();
    }//GEN-LAST:event_logoutButtonMouseClicked

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

    private boolean isAddPlanNotEmpty() {
        if (!planIDText.getText().isEmpty() && !usernameText.getText().isEmpty() && !modelText.getText().isEmpty() && !memorySizeText.getText().isEmpty() && !priceText.getText().isEmpty() && !internetQuotaText.getText().isEmpty() && !capLimitText.getText().isEmpty() && !dayText.getText().isEmpty() && !monthText.getText().isEmpty() && !yearText.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    private void clear() {
        planIDText.setText("");
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

    private void addButton() {
        if (isAddPlanNotEmpty()) {
            try {
                int id = Integer.parseInt(planIDText.getText());
                String username = usernameText.getText();
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
                MobilePlan plan;
                if (personalPlanChoice.isSelected()) {
                    String city = planCityText.getText();
                    plan = new PersonalPlan(username, id, phone, quota, cap, date, city);
                } else {
                    int abn = Integer.parseInt(ABNText.getText());
                    int noEmp = Integer.parseInt(numberOfEmployeesText.getText());
                    if (abn < 0 || noEmp < 0) {
                        throw new MyException();
                    }
                    plan = new BusinessPlan(noEmp, abn, username, id, phone, quota, cap, date);
                }
                String[] users = userIDs2.getSelectedItem().toString().split(" : ");
                int userID = Integer.parseInt(users[1]);
                if (mobileCompany.addPlan(this.username, this.password, userID, plan)) {
                    clear();
                    JOptionPane.showMessageDialog(this, "Plan has been successfuly added.");
                } else {
                    clear();
                    JOptionPane.showMessageDialog(this, "Plan can not be added.");
                }
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

    private void findButton() {
        String[] users = userIDs3.getSelectedItem().toString().split(" : ");
        int userID = Integer.parseInt(users[1]);
        try {
            MobilePlan plan = mobileCompany.findPlan(userID, Integer.parseInt(planIDFindText.getText()));
            if (plan != null) {
                plansTextArea.append("UserID = " + userID + " --> " + plan.toString() + "\n");
                planIDFindText.setText("");
            } else {
                plansTextArea.append("UserID = " + userID + " --> Plan with ID = " + Integer.parseInt(planIDFindText.getText()) + " has not been found\n");
                planIDFindText.setText("");
            }
        } catch (NumberFormatException e) {
            planIDFindText.setText("");
            JOptionPane.showMessageDialog(this, "Enter a number please.");
        }
    }

    public void fillTable(JTable table, ArrayList<MobilePlan> plans) {
        String[] header = {"Plan ID", "Username", "Model", "OS Type", "Memory Size", "handset Price", "Internet Quota", "Cap Limit", "Expiry Date", "City", "ABN", "Number OF Employees", "Mounthly Payment"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        table.setModel(model);
        for (MobilePlan plan : plans) {
            String[] row = new String[13];
            row[0] = plan.getId() + "";
            row[1] = plan.getUserName();
            row[2] = plan.getModel();
            row[3] = plan.getHandset().getType().toString();
            row[4] = plan.getHandset().getMemorySize() + "";
            row[5] = "$ " + plan.getHandset().getPrice() + "";
            row[6] = plan.getInternetQuota() + "";
            row[7] = plan.getCapLimit() + "";
            row[8] = plan.getExpiryDate().toString();
            if (plan instanceof PersonalPlan) {
                row[9] = ((PersonalPlan) plan).getCity();
                row[10] = "NA";
                row[11] = "NA";
            } else {
                row[9] = "NA";
                row[10] = ((BusinessPlan) plan).getABN() + "";
                row[11] = ((BusinessPlan) plan).getNumberOfEmployees() + "";
            }
            row[12] = String.format("$ %.2f", plan.calcPayment(mobileCompany.getFlatRate()));
            model.addRow(row);
        }
    }

    private void deleteButton() {
        String[] users = userIDs4.getSelectedItem().toString().split(" : ");
        int userID = Integer.parseInt(users[1]);
        int ind = plansInformationTable.getSelectedRow();
        if (ind >= 0) {
            int id = Integer.parseInt(plansInformationTable.getValueAt(ind, 0).toString());
            mobileCompany.findUser(userID).getPlans().remove(id);
            fillTable(plansInformationTable, new ArrayList<MobilePlan>(mobileCompany.findUser(userID).getPlans().values()));
        }
    }

    private void updateButton() {
        String[] users = userIDs4.getSelectedItem().toString().split(" : ");
        int userID = Integer.parseInt(users[1]);
        int ind = plansInformationTable.getSelectedRow();
        if (ind >= 0) {
            int id = Integer.parseInt(plansInformationTable.getValueAt(ind, 0).toString());
            UpdateUI updateUI = new UpdateUI(mobileCompany.findUser(userID).getPlans().get(id), this, userID, 1);
            updateUI.setVisible(true);
        }
    }

    private void showPopUp(MouseEvent e) {
        popUpMenu.show(this, e.getXOnScreen(), e.getYOnScreen());
    }

    public void fillTable1() {
        String[] users = userIDs5.getSelectedItem().toString().split(" : ");
        int userID = Integer.parseInt(users[1]);
        try {
            ArrayList<MobilePlan> plansCopy = mobileCompany.findUser(userID).shallowCopyPlans();
            if (allUsersCheck1.isSelected()) {
                plansCopy = mobileCompany.allPlans(username, password);
            }
            if (!mobileModelText1.getText().isEmpty()) {
                plansCopy = MobilePlan.filterByMobileModel(plansCopy, mobileModelText1.getText());
            }
            if (!expiryDateText1.getText().isEmpty()) {
                if (!Pattern.matches("\\d{1,2}\\/\\d{1,2}\\/\\d{4}", expiryDateText1.getText())) {
                    throw new NumberFormatException(expiryDateText1.getText());
                }
                String[] fields = expiryDateText1.getText().split("/");
                int year = Integer.parseInt(fields[2]);
                int month = Integer.parseInt(fields[1]);
                int day = Integer.parseInt(fields[0]);
                MyDate date = new MyDate(year, month, day);
                if (!new MyDate(year, month, day).isValid()) {
                    throw new MyDateException(date);
                }
                plansCopy = MobilePlan.filterByExpiryDate(plansCopy, date);

            }
            if (sortByUsernameCheck1.isSelected()) {
                MobilePlan.sortByUsername(plansCopy);
            }
            fillTable(plansInformationTable1, plansCopy);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter DD/MM/YYYY format please.");
        } catch (MyDateException e) {
            JOptionPane.showMessageDialog(this, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void fillTable2() {
        ArrayList<User> users = mobileCompany.shallowCopyUsers();
        if (sortByUsername.isSelected()) {
            users = mobileCompany.sortUsersByUsername();
        }
        if (sortByTotalMonthlyPayment.isSelected()) {
            users = mobileCompany.sortUsersByMonthlyPayment();
        }
        String[] header = {"User ID", "User Name", "Total Monthly Payment"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        userPaymentTable.setModel(model);
        for (User user : users) {
            String[] row = new String[3];
            row[0] = user.getUserID() + "";
            row[1] = user.getName();
            row[2] = String.format("$ %.2f", user.calcTotalPayments(user.getUserID(), user.getPassword(), mobileCompany.getFlatRate()));
            model.addRow(row);
        }
    }

    public void fillTable3() {
        HashMap<String, Double> cityPaymentReport = mobileCompany.getTotalPaymentPerCity(username, password);

        String[] header = {"City", "Total Monthly Payment"};
        DefaultTableModel model = new DefaultTableModel(header, 0);

        cityPaymentTable.setModel(model);
        for (String city : cityPaymentReport.keySet()) {
            String[] row = new String[2];
            row[0] = city;
            row[1] = String.format("$ %.2f", cityPaymentReport.get(city));
            model.addRow(row);
        }
    }

    public void fillTable4() {
        HashMap<String, Double> modelPaymentReport = mobileCompany.getTotalPaymentPerMobileModel(username, password);
        HashMap<String, Integer> modelCountReport = mobileCompany.getTotalCountPerMobileModel(username, password);

        String[] header = {"Mobile Model", "Total Premium", "Average Premium"};
        DefaultTableModel model = new DefaultTableModel(header, 0);

        modelTotalAverageTable.setModel(model);
        for (String mobileModel : modelPaymentReport.keySet()) {
            double total = modelPaymentReport.get(mobileModel);
            double average = modelPaymentReport.get(mobileModel) / modelCountReport.get(mobileModel);
            String[] row = new String[3];
            row[0] = mobileModel;
            row[1] = String.format("$ %.2f", total);
            row[2] = String.format("$ %.2f", average);
            model.addRow(row);
        }
    }

    private void planIDTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_planIDTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_planIDTextKeyPressed

    private void usernameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_usernameTextKeyPressed

    private void modelTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_modelTextKeyPressed

    private void memorySizeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memorySizeTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_memorySizeTextKeyPressed

    private void priceTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_priceTextKeyPressed

    private void typeChoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeChoiceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_typeChoiceKeyPressed

    private void internetQuotaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_internetQuotaTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_internetQuotaTextKeyPressed

    private void capLimitTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capLimitTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_capLimitTextKeyPressed

    private void dayTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_dayTextKeyPressed

    private void monthTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_monthTextKeyPressed

    private void yearTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_yearTextKeyPressed

    private void planCityTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_planCityTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_planCityTextKeyPressed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            clear();
        }
    }//GEN-LAST:event_clearButtonKeyPressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addButton();
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_addButtonKeyPressed

    private void ABNTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ABNTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_ABNTextKeyPressed

    private void numberOfEmployeesTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOfEmployeesTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addButton();
        }
    }//GEN-LAST:event_numberOfEmployeesTextKeyPressed

    private void planIDFindTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_planIDFindTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findButton();
        }
    }//GEN-LAST:event_planIDFindTextKeyPressed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        findButton();
    }//GEN-LAST:event_findButtonActionPerformed

    private void findButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findButton();
        }
    }//GEN-LAST:event_findButtonKeyPressed

    private void plansInformationTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plansInformationTableMousePressed
        if (evt.isPopupTrigger()) {
            showPopUp(evt);
        }
    }//GEN-LAST:event_plansInformationTableMousePressed

    private void plansInformationTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plansInformationTableMouseReleased
        if (evt.isPopupTrigger()) {
            showPopUp(evt);
        }
    }//GEN-LAST:event_plansInformationTableMouseReleased

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteButton();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateButton();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void mobileModelText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileModelText1KeyReleased
        fillTable1();
    }//GEN-LAST:event_mobileModelText1KeyReleased

    private void expiryDateText1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expiryDateText1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fillTable1();
        }
    }//GEN-LAST:event_expiryDateText1KeyPressed

    private void filterByDateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterByDateButton1ActionPerformed
        fillTable1();
    }//GEN-LAST:event_filterByDateButton1ActionPerformed

    private void sortByUsernameCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByUsernameCheck1ActionPerformed
        fillTable1();
    }//GEN-LAST:event_sortByUsernameCheck1ActionPerformed

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged
        // tab1
        mobileCompanyTitle.setText("Report For  < " + mobileCompany.getName() + " Co. >");
        reportForCompany.setText("");
        for (User user : mobileCompany.getUsers().values()) {
            reportForCompany.append(user + "\n  --  --  --  --  --  --  --  --  --  --  --  \n");
        }
        // tab2
        adminNameText.setText(mobileCompany.getName());
        adminUsernameText.setText(mobileCompany.getMobileCompanyUsername());
        adminPasswordText.setText(mobileCompany.getMobileCompanyPassword());
        adminFlatRateText.setText(mobileCompany.getFlatRate() + "");
        // tab3
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
        userIDs2.setModel(new DefaultComboBoxModel<>(IDs.toArray(new String[0])));
        typeChoice.setModel(new DefaultComboBoxModel<>(MobileType.values()));
        // tab4
        userIDs3.setModel(new DefaultComboBoxModel<>(IDs.toArray(new String[0])));
        // tab5
        userIDs4.setModel(new DefaultComboBoxModel<>(IDs.toArray(new String[0])));
        String[] users = userIDs4.getSelectedItem().toString().split(" : ");
        int userID = Integer.parseInt(users[1]);
        fillTable(plansInformationTable, new ArrayList<MobilePlan>(mobileCompany.findUser(userID).getPlans().values()));
        // tab6
        userIDs5.setModel(new DefaultComboBoxModel<>(IDs.toArray(new String[0])));
        fillTable1();
        // tab7
        fillTable2();
        // tab8
        fillTable3();
        // tab9
        fillTable4();
        // tab10
        userIDs6.setModel(new DefaultComboBoxModel<>(IDs.toArray(new String[0])));
    }//GEN-LAST:event_tabStateChanged

    private void userIDs4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userIDs4ItemStateChanged
        String[] users = userIDs4.getSelectedItem().toString().split(" : ");
        int userID = Integer.parseInt(users[1]);
        fillTable(plansInformationTable, new ArrayList<MobilePlan>(mobileCompany.findUser(userID).getPlans().values()));
    }//GEN-LAST:event_userIDs4ItemStateChanged

    private void updateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuActionPerformed
        updateButton();
    }//GEN-LAST:event_updateMenuActionPerformed

    private void deleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuActionPerformed
        deleteButton();
    }//GEN-LAST:event_deleteMenuActionPerformed

    private void allUsersCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allUsersCheck1ActionPerformed
        fillTable1();
    }//GEN-LAST:event_allUsersCheck1ActionPerformed

    private void allUsersCheck1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_allUsersCheck1StateChanged
        if (allUsersCheck1.isSelected()) {
            userIDs5.setEnabled(false);
        } else {
            userIDs5.setEnabled(true);
        }
    }//GEN-LAST:event_allUsersCheck1StateChanged

    private void userIDs5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userIDs5ItemStateChanged
        fillTable1();
    }//GEN-LAST:event_userIDs5ItemStateChanged

    private void sortByTotalMonthlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByTotalMonthlyPaymentActionPerformed
        fillTable2();
    }//GEN-LAST:event_sortByTotalMonthlyPaymentActionPerformed

    private void sortByUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByUsernameActionPerformed
        fillTable2();
    }//GEN-LAST:event_sortByUsernameActionPerformed

    private void sortByTotalMonthlyPaymentStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sortByTotalMonthlyPaymentStateChanged
        if (sortByTotalMonthlyPayment.isSelected()) {
            sortByUsername.setSelected(false);
        }
    }//GEN-LAST:event_sortByTotalMonthlyPaymentStateChanged

    private void sortByUsernameStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sortByUsernameStateChanged
        if (sortByUsername.isSelected()) {
            sortByTotalMonthlyPayment.setSelected(false);
        }
    }//GEN-LAST:event_sortByUsernameStateChanged

    private void userIDs6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userIDs6ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDs6ItemStateChanged

    private void userDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeleteButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure about deleting the selected User ?", "Confimation", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == choice) {
            String[] users = userIDs6.getSelectedItem().toString().split(" : ");
            int userID = Integer.parseInt(users[1]);
            if(mobileCompany.removeUser(username, password, userID)){
                JOptionPane.showMessageDialog(this, "The user with ID (" + userID + ") was removed from the system by the admin.");
            }
            IDs.remove(userIDs6.getSelectedItem().toString());
            userIDs6.setModel(new DefaultComboBoxModel<>(IDs.toArray(new String[0])));            
        }
    }//GEN-LAST:event_userDeleteButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        changeButton();
    }//GEN-LAST:event_changeButtonActionPerformed

    private void adminNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminNameTextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            changeButton();
        }
    }//GEN-LAST:event_adminNameTextKeyPressed

    private void adminUsernameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminUsernameTextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            changeButton();
        }
    }//GEN-LAST:event_adminUsernameTextKeyPressed

    private void adminPasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminPasswordTextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            changeButton();
        }
    }//GEN-LAST:event_adminPasswordTextKeyPressed

    private void adminFlatRateTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminFlatRateTextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            changeButton();
        }
    }//GEN-LAST:event_adminFlatRateTextKeyPressed

    private void changeButton() {
        if (!adminNameText.getText().isEmpty() && !adminUsernameText.getText().isEmpty() && !adminPasswordText.getText().isEmpty() && !adminFlatRateText.getText().isEmpty()) {
            mobileCompany.setName(adminNameText.getText());
            mobileCompany.setMobileCompanyUsername(adminUsernameText.getText());
            mobileCompany.setMobileCompanyPassword(adminPasswordText.getText());
            try{
                mobileCompany.setFlatRate(Integer.parseInt(adminFlatRateText.getText()));
            } catch(NumberFormatException e){
                adminFlatRateText.setText(mobileCompany.getFlatRate() + "");
                JOptionPane.showMessageDialog(this, "Enter a number please!");
            }          
            JOptionPane.showMessageDialog(this, "Done.");
        } else {
            JOptionPane.showMessageDialog(this, "All fields required.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABNL;
    private javax.swing.JTextField ABNText;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField adminFlatRateText;
    private javax.swing.JTextField adminNameText;
    private javax.swing.JTextField adminPasswordText;
    private javax.swing.JTextField adminUsernameText;
    private javax.swing.JCheckBox allUsersCheck1;
    private javax.swing.JRadioButton businessPlanChoice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel capLimitL;
    private javax.swing.JTextField capLimitText;
    private javax.swing.JButton changeButton;
    private javax.swing.JTable cityPaymentTable;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel commentL;
    private javax.swing.JLabel dayL;
    private javax.swing.JTextField dayText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem deleteMenu;
    private javax.swing.JLabel expiryDateL;
    private javax.swing.JLabel expiryDateL1;
    private javax.swing.JTextField expiryDateText1;
    private javax.swing.JButton filterByDateButton1;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel internetQuotaL;
    private javax.swing.JTextField internetQuotaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JMenu logoutButton;
    private javax.swing.JLabel memorySizeL;
    private javax.swing.JTextField memorySizeText;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel mobileCompanyTitle;
    private javax.swing.JLabel mobileModelL1;
    private javax.swing.JTextField mobileModelText1;
    private javax.swing.JLabel mobilePhoneL;
    private javax.swing.JLabel modelL;
    private javax.swing.JTextField modelText;
    private javax.swing.JTable modelTotalAverageTable;
    private javax.swing.JLabel monthL;
    private javax.swing.JTextField monthText;
    private javax.swing.JLabel numberOfEmployeesL;
    private javax.swing.JTextField numberOfEmployeesText;
    private javax.swing.JLabel payAttentionL;
    private javax.swing.JRadioButton personalPlanChoice;
    private javax.swing.JLabel planCityL;
    private javax.swing.JTextField planCityText;
    private javax.swing.JLabel planIDFindL;
    private javax.swing.JTextField planIDFindText;
    private javax.swing.JLabel planIDL;
    private javax.swing.JTextField planIDText;
    private javax.swing.JTable plansInformationTable;
    private javax.swing.JTable plansInformationTable1;
    private javax.swing.JTextArea plansTextArea;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JLabel priceL;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextArea reportForCompany;
    private javax.swing.JCheckBox sortByTotalMonthlyPayment;
    private javax.swing.JCheckBox sortByUsername;
    private javax.swing.JCheckBox sortByUsernameCheck1;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JComboBox<MobileType> typeChoice;
    private javax.swing.JLabel typeL;
    private javax.swing.JButton updateButton;
    private javax.swing.JMenuItem updateMenu;
    private javax.swing.JButton userDeleteButton;
    private javax.swing.JComboBox<String> userIDs2;
    private javax.swing.JComboBox<String> userIDs3;
    private javax.swing.JComboBox<String> userIDs4;
    private javax.swing.JComboBox<String> userIDs5;
    private javax.swing.JComboBox<String> userIDs6;
    private javax.swing.JTable userPaymentTable;
    private javax.swing.JLabel usernameL;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel yearL;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
