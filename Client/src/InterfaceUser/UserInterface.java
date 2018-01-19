package InterfaceUser;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import user.Group;
import user.User;
/**
 *
 * @author RainAlex
 */
public class UserInterface extends javax.swing.JFrame {

    private User user;
    
    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
	user = new User(this);
	initComponents();
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
        loginPage = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        userNameField = new javax.swing.JTextField();
        validerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pwdField = new javax.swing.JPasswordField();
        userContent = new javax.swing.JPanel();
        treeView = new javax.swing.JPanel();
        composeBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        grpAndTickets = new javax.swing.JTree();
        logoutBtn = new javax.swing.JLabel();
        lastFirstLabel = new javax.swing.JLabel();
        mainContent = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        composerPage = new javax.swing.JPanel();
        titleField = new javax.swing.JTextField();
        destGrpChoices = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        writeMsgContentPanel = new javax.swing.JEditorPane();
        cancelBtn = new javax.swing.JButton();
        envoyerBtn = new javax.swing.JButton();
        ticketMsgView = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        msgStatuses = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        namesAndStatusesPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJET S5 - NeoCampus");

        jPanel1.setLayout(new java.awt.CardLayout());

        loginPage.setBackground(new java.awt.Color(244, 255, 255));

        jPanel2.setBackground(new java.awt.Color(43, 60, 112));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        userNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameField.setText("identifiant");
        userNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameFieldMouseClicked(evt);
            }
        });

        validerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validerBtn.setText("VALIDER");
        validerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("SIGN IN");

        pwdField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdField.setText("PASSWORD");
        pwdField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwdFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginPageLayout = new javax.swing.GroupLayout(loginPage);
        loginPage.setLayout(loginPageLayout);
        loginPageLayout.setHorizontalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPageLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addComponent(userNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(83, 83, 83))
                    .addGroup(loginPageLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(validerBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        loginPageLayout.setVerticalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPageLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(validerBtn)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel1.add(loginPage, "card2");

        composeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        composeBtn.setText("COMPOSER");
        composeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                composeBtnActionPerformed(evt);
            }
        });

        grpAndTickets.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grpAndTickets.setRootVisible(false);
        jScrollPane2.setViewportView(grpAndTickets);

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoutLogo.png"))); // NOI18N
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        lastFirstLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastFirstLabel.setText("jLabel5");

        javax.swing.GroupLayout treeViewLayout = new javax.swing.GroupLayout(treeView);
        treeView.setLayout(treeViewLayout);
        treeViewLayout.setHorizontalGroup(
            treeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, treeViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastFirstLabel)
                .addGap(146, 146, 146))
            .addComponent(composeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        treeViewLayout.setVerticalGroup(
            treeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treeViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn)
                    .addComponent(lastFirstLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(composeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );

        composeBtn.setBackground(Color.ORANGE);
        composeBtn.setOpaque(true);

        mainContent.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ou cliquer sur COMPOSER");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Veuillez choisir un ticket");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        mainContent.add(jPanel3, "card2");

        composerPage.setBackground(new java.awt.Color(255, 255, 255));

        titleField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleField.setText("TITRE...");
        titleField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleFieldMouseClicked(evt);
            }
        });
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        destGrpChoices.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        destGrpChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destGrpChoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destGrpChoicesActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(writeMsgContentPanel);

        cancelBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelBtn.setText("Annuler");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        envoyerBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        envoyerBtn.setText("Envoyer");

        javax.swing.GroupLayout composerPageLayout = new javax.swing.GroupLayout(composerPage);
        composerPage.setLayout(composerPageLayout);
        composerPageLayout.setHorizontalGroup(
            composerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(composerPageLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(composerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(destGrpChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(composerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(composerPageLayout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(cancelBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(envoyerBtn))
                        .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        composerPageLayout.setVerticalGroup(
            composerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(composerPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(composerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(envoyerBtn))
                .addGap(32, 32, 32)
                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(destGrpChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );

        mainContent.add(composerPage, "card3");

        ticketMsgView.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportView(jEditorPane2);

        jButton1.setText("ENVOYER");

        jButton2.setText("EFFACER");

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout ticketMsgViewLayout = new javax.swing.GroupLayout(ticketMsgView);
        ticketMsgView.setLayout(ticketMsgViewLayout);
        ticketMsgViewLayout.setHorizontalGroup(
            ticketMsgViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(ticketMsgViewLayout.createSequentialGroup()
                .addGap(0, 239, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
            .addComponent(jScrollPane4)
        );
        ticketMsgViewLayout.setVerticalGroup(
            ticketMsgViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketMsgViewLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ticketMsgViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        mainContent.add(ticketMsgView, "card4");

        msgStatuses.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setText("STATUTS DU MESSAGE");

        namesAndStatusesPanel.setLayout(new java.awt.GridLayout(0, 1));

        javax.swing.GroupLayout msgStatusesLayout = new javax.swing.GroupLayout(msgStatuses);
        msgStatuses.setLayout(msgStatusesLayout);
        msgStatusesLayout.setHorizontalGroup(
            msgStatusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgStatusesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(msgStatusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namesAndStatusesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(msgStatusesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addContainerGap())
        );
        msgStatusesLayout.setVerticalGroup(
            msgStatusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgStatusesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namesAndStatusesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainContent.add(msgStatuses, "card5");

        javax.swing.GroupLayout userContentLayout = new javax.swing.GroupLayout(userContent);
        userContent.setLayout(userContentLayout);
        userContentLayout.setHorizontalGroup(
            userContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userContentLayout.createSequentialGroup()
                .addComponent(treeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userContentLayout.setVerticalGroup(
            userContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(treeView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(userContent, "card3");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerBtnActionPerformed
	boolean accessGranted = tryToConnect();
	if (accessGranted){
	    switchToPage(mainContent, jPanel3);
	    String lastName = user.getNom();
	    String firstName = user.getPrenom();
	    lastFirstLabel.setText(lastName + " " + firstName);
	    switchToPage(jPanel1, userContent);
	} else {
	    JOptionPane.showMessageDialog(null,
	    "Erreur des identifiants",
	    "ERROR !",
	    JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_validerBtnActionPerformed

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void destGrpChoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destGrpChoicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destGrpChoicesActionPerformed

    private void composeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_composeBtnActionPerformed
        titleField.setText("TITRE...");
	loadGroupBox();
	writeMsgContentPanel.setText("");
	switchToPage(mainContent, composerPage);
    }//GEN-LAST:event_composeBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        switchToPage(mainContent, jPanel3);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void userNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameFieldMouseClicked
        userNameField.setText("");
    }//GEN-LAST:event_userNameFieldMouseClicked

    private void pwdFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwdFieldMouseClicked
        pwdField.setText("");
    }//GEN-LAST:event_pwdFieldMouseClicked

    private void titleFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleFieldMouseClicked
        titleField.setText("");
    }//GEN-LAST:event_titleFieldMouseClicked

    public void updateTreePane(){
	
    }
    
    private boolean tryToConnect() {
        String username = userNameField.getText();
        String password = new String(pwdField.getPassword());
        boolean login;
        if ((username.compareTo("") == 0) || (password.compareTo("") == 0)) {
            login = false;
        } else {
            login = user.login(password, username);
        }
        return login;
    }
    
    public void switchToPage(Container src, Component dest) {
	src.removeAll();
	src.add(dest);
	src.repaint();
	src.revalidate();
    }
    
    private void loadGroupBox() {
	Set<Group> possDestGroup = user.getListOfGroupsBox();
	Set<String> possDestGroupNames = new TreeSet<>();
	for (Group g : possDestGroup){
	    possDestGroupNames.add(g.getGroupName());
	}
	Object[] groups = new Object[possDestGroupNames.size()];
	int i = 0;
	for (String g : possDestGroupNames){
	    groups[i] = (Object)g;
	    i++;
	}
	destGrpChoices.setModel(new DefaultComboBoxModel(groups));
    }
    
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
	    java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new UserInterface().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton composeBtn;
    private javax.swing.JPanel composerPage;
    private javax.swing.JComboBox<String> destGrpChoices;
    private javax.swing.JButton envoyerBtn;
    private javax.swing.JTree grpAndTickets;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lastFirstLabel;
    private javax.swing.JPanel loginPage;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainContent;
    private javax.swing.JPanel msgStatuses;
    private javax.swing.JPanel namesAndStatusesPanel;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JPanel ticketMsgView;
    private javax.swing.JTextField titleField;
    private javax.swing.JPanel treeView;
    private javax.swing.JPanel userContent;
    private javax.swing.JTextField userNameField;
    private javax.swing.JButton validerBtn;
    private javax.swing.JEditorPane writeMsgContentPanel;
    // End of variables declaration//GEN-END:variables
}
