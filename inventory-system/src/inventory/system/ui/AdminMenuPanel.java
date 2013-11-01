/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminOptionPanel.java
 *
 * Created on 01-Nov-2013, 14:44:56
 */
package inventory.system.ui;
import inventory.system.ui.MainMenu;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class AdminMenuPanel extends javax.swing.JPanel {


    /** Creates new form AdminOptionPanel */
    public AdminMenuPanel() {
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(inventory.system.ui.ShoesShopApp.class).getContext().getResourceMap(AdminMenuPanel.class);
        setBackground(resourceMap.getColor("AdminOptionPanel.background")); // NOI18N
        setName("AdminOptionPanel"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("AdminTitle.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("AdminTitle.text")); // NOI18N
        jLabel1.setName("AdminTitle"); // NOI18N

        jButton1.setText(resourceMap.getString("btnAddproducts.text")); // NOI18N
        jButton1.setName("btnAddproducts"); // NOI18N

        jButton2.setText(resourceMap.getString("btnDeleteProducts.text")); // NOI18N
        jButton2.setName("btnDeleteProducts"); // NOI18N

        jButton3.setText(resourceMap.getString("btnModifyProducts.text")); // NOI18N
        jButton3.setName("btnModifyProducts"); // NOI18N

        jButton4.setText(resourceMap.getString("btnSearchProducts.text")); // NOI18N
        jButton4.setName("btnSearchProducts"); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText(resourceMap.getString("btnReports.text")); // NOI18N
        jButton5.setName("btnReports"); // NOI18N

        jButton6.setText(resourceMap.getString("btnLogout.text")); // NOI18N
        jButton6.setName("btnLogout"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName(resourceMap.getString("AdminTitle.AccessibleContext.accessibleName")); // NOI18N
        jButton1.getAccessibleContext().setAccessibleName(resourceMap.getString("btnAddproducts.AccessibleContext.accessibleName")); // NOI18N
        jButton2.getAccessibleContext().setAccessibleName(resourceMap.getString("btnDeleteProducts.AccessibleContext.accessibleName")); // NOI18N
        jButton3.getAccessibleContext().setAccessibleName(resourceMap.getString("btnModifyProducts.AccessibleContext.accessibleName")); // NOI18N
        jButton4.getAccessibleContext().setAccessibleName(resourceMap.getString("btnSearchProducts.AccessibleContext.accessibleName")); // NOI18N
        jButton5.getAccessibleContext().setAccessibleName(resourceMap.getString("btnReports.AccessibleContext.accessibleName")); // NOI18N
        jButton6.getAccessibleContext().setAccessibleName(resourceMap.getString("btnLogout.AccessibleContext.accessibleName")); // NOI18N

        getAccessibleContext().setAccessibleName(resourceMap.getString("AdminOptionPanel.AccessibleContext.accessibleName")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
hide();  
SearchPanel searchPanel = new SearchPanel();

    // TODO add your handling code here:
}//GEN-LAST:event_jButton4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}