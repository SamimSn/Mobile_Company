package GUI;

import Domain.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Samim
 */
public class Login extends javax.swing.JFrame {

    private MobileCompany mobileCompany;

    public Login() {
        test();
        initComponents();
    }

    public void test() {
        // initializing objects
        mobileCompany = new MobileCompany("SamimSanaei", "admin", "admin", 15);

        MobilePhone mob1 = new MobilePhone("apple", MobileType.IOS, 64, 650);
        MobilePhone mob2 = new MobilePhone("samsung", MobileType.Android, 128, 750);
        MobilePhone mob3 = new MobilePhone("LG", MobileType.Android, 1024, 600);

        MobilePlan Plan1 = new PersonalPlan("USR000000U", 300000, mob1, 4, 13, new MyDate(1990, 10, 13), "new york");
        MobilePlan Plan2 = new PersonalPlan("USR000001U", 300002, mob2, 5, 5, new MyDate(2003, 1, 29), "new york");
        MobilePlan Plan3 = new BusinessPlan(20, 3, "USR000003U", 300002, mob3, 7, 28, new MyDate(1998, 4, 30));
        MobilePlan Plan4 = new BusinessPlan(8, 6, "USR000004U", 300003, mob1, 19, 10, new MyDate(2000, 1, 9));
        MobilePlan Plan5 = new BusinessPlan(200, 34, "USR000005U", 300004, mob2, 27, 9, new MyDate(1998, 2, 18));
        MobilePlan Plan6 = new BusinessPlan(8, 6, "USR000006U", 300005, mob3, 5, 132, new MyDate(1970, 10, 21));

        User user1 = new User("Ali", new Address(11, "AliStreet", "AliSuburb", "Tehran"), "password1");
        User user2 = new User("Taqi", new Address(22, "TaqiStreet", "TaqiSuburb", "Gorgan"), "password2");
        User user3 = new User("Naqi", new Address(33, "NaqiStreet", "NaqiSuburb", "Sari"), "password3");
        User user4 = new User("Hasan", new Address(44, "HasanStreet", "HasanSuburb", "Shiraz"), "password4");
        User user5 = new User("Hosein", new Address(55, "HoseinStreet", "HoseinSuburb", "Bojnord"), "password5");
        User user6 = new User("Jafar", new Address(66, "JafarStreet", "JafarSuburb", "Esfahan"), "password6");

        user1.addPlan(user1.getUserID(), user1.getPassword(), Plan1);
        user2.addPlan(user2.getUserID(), user2.getPassword(), Plan2);
        user3.addPlan(user3.getUserID(), user3.getPassword(), Plan3);
        user4.addPlan(user4.getUserID(), user4.getPassword(), Plan4);
        user5.addPlan(user5.getUserID(), user5.getPassword(), Plan5);
        user6.addPlan(user6.getUserID(), user6.getPassword(), Plan6);

        mobileCompany.addUser(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword(), user1);
        mobileCompany.addUser(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword(), user2);
        mobileCompany.addUser(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword(), user3);
        mobileCompany.addUser(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword(), user4);
        mobileCompany.addUser(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword(), user5);
        mobileCompany.addUser(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword(), user6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        userID = new javax.swing.JLabel();
        usernameOrUserID = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        load = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        listOfUsers = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mobile Company System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        userID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userID.setText("Username/UserID");

        usernameOrUserID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameOrUserIDKeyPressed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setText("Password");

        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 51, 0));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });

        jLabel1.setText("If you don't have an account   -->");

        signUpButton.setBackground(new java.awt.Color(204, 204, 204));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 51, 0));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        file.setText("File");
        file.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        file.add(load);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file.add(save);

        menu.add(file);

        listOfUsers.setText("List Of Users");
        listOfUsers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listOfUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOfUsersMouseClicked(evt);
            }
        });
        menu.add(listOfUsers);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userID)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameOrUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(login))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUpButton)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userID)
                    .addComponent(usernameOrUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(15, 15, 15)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(signUpButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        load();
    }//GEN-LAST:event_loadActionPerformed

    private void load() {
        if (mobileCompany.loadTextFile("mobileCompany-GUI.txt")) {
            JOptionPane.showMessageDialog(this, "Loaded succesfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Loading failed.");
        }
    }

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        save();
    }//GEN-LAST:event_saveActionPerformed

    private void save() {
        if (mobileCompany.saveTextFile("mobileCompany-GUI.txt")) {
            JOptionPane.showMessageDialog(this, "Saved succesfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Saving failed.");
        }
    }

    private void listOfUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOfUsersMouseClicked
        JOptionPane.showMessageDialog(this, listOfUsers());
    }//GEN-LAST:event_listOfUsersMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        login();
    }//GEN-LAST:event_loginActionPerformed

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_passwordTextKeyPressed

    private void usernameOrUserIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameOrUserIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_usernameOrUserIDKeyPressed

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_loginKeyPressed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        SignUp signUp = new SignUp(mobileCompany, this);
        signUp.setVisible(true);
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void login() {
        if (!usernameOrUserID.getText().isEmpty() && !passwordText.getText().isEmpty()) {
            try {
                if (mobileCompany.validateMobileCompany(usernameOrUserID.getText(), passwordText.getText())) {
                    AdminUI adminUI = new AdminUI(this, mobileCompany, usernameOrUserID.getText(), passwordText.getText());
                    passwordText.setText("");
                    this.setVisible(false);
                    adminUI.setVisible(true);
                } else if (mobileCompany.validateUser(Integer.parseInt(usernameOrUserID.getText()), passwordText.getText())) {
                    User user = mobileCompany.findUser(Integer.parseInt(usernameOrUserID.getText()));
                    ArrayList<String> cities = mobileCompany.populateDistinctCityNames(mobileCompany.getMobileCompanyUsername(), mobileCompany.getMobileCompanyPassword());
                    UserUI userUI = new UserUI(mobileCompany, user, Integer.parseInt(usernameOrUserID.getText()), passwordText.getText(), this, cities);
                    passwordText.setText("");
                    userUI.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Username/UserID or Password is incorrect.");
                    passwordText.setText("");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "UserID should be an Integer.");
                passwordText.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Username/UserID and Password required.");
            passwordText.setText("");
        }

    }

    private String listOfUsers() {
        String out = "";
        for (User user : mobileCompany.getUsers().values()) {
            out += ("userID: " + user.getUserID() + "  -  pass: " + user.getPassword() + "\n");
        }
        return out;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu file;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu listOfUsers;
    private javax.swing.JMenuItem load;
    private javax.swing.JButton login;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JMenuItem save;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel userID;
    private javax.swing.JTextField usernameOrUserID;
    // End of variables declaration//GEN-END:variables
}
