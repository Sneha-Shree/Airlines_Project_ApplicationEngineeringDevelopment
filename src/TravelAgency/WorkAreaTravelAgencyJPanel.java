/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author jhsnehashree
 */
public class WorkAreaTravelAgencyJPanel extends javax.swing.JPanel {
    private JPanel jPanelBody ;
    private TravelAgency travelAgencyObj;
    /**
     * Creates new form WorkAreaTravelagencyJPanel
     */

    public WorkAreaTravelAgencyJPanel(JPanel jPanelBody, TravelAgency travelAgencyObj) {
      initComponents();
      setBounds(10, 10, 400, 300);
      setSize(3500, 3360);
      this.jPanelBody=jPanelBody;
      this.travelAgencyObj=travelAgencyObj;
      jButtonCreateTravelAgency.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCreateTravelAgency = new javax.swing.JButton();
        jButtonManageTravelAgency = new javax.swing.JButton();
        jLabelTitleAgency = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jButtonCreateTravelAgency.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCreateTravelAgency.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonCreateTravelAgency.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateTravelAgency.setText("Create");
        jButtonCreateTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateTravelAgencyActionPerformed(evt);
            }
        });

        jButtonManageTravelAgency.setBackground(new java.awt.Color(0, 0, 0));
        jButtonManageTravelAgency.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonManageTravelAgency.setForeground(new java.awt.Color(255, 255, 255));
        jButtonManageTravelAgency.setText("Manage");
        jButtonManageTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageTravelAgencyActionPerformed(evt);
            }
        });

        jLabelTitleAgency.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabelTitleAgency.setText("Welcome to ABC Travel Agency");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Travel Agency");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonManageTravelAgency)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabelTitleAgency))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButtonCreateTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelTitleAgency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCreateTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonManageTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateTravelAgencyActionPerformed
        // TODO add your handling code here:
        CreateAirlinerTravelAgencyJPanel panel=new CreateAirlinerTravelAgencyJPanel(jPanelBody,travelAgencyObj);
        jPanelBody.add("CreateAirlinerTravelAgencyJPanel",panel);
        CardLayout layout=(CardLayout) jPanelBody.getLayout();
        layout.next(jPanelBody);
    }//GEN-LAST:event_jButtonCreateTravelAgencyActionPerformed

    private void jButtonManageTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageTravelAgencyActionPerformed
        // TODO add your handling code here:
        ManageAirlinersTravelAgencyJPanel panel=new ManageAirlinersTravelAgencyJPanel(jPanelBody,travelAgencyObj);
        jPanelBody.add("ManageAirlinersTravelAgencyJPanel",panel);
        CardLayout layout=(CardLayout) jPanelBody.getLayout();
        layout.next(jPanelBody);
    }//GEN-LAST:event_jButtonManageTravelAgencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateTravelAgency;
    private javax.swing.JButton jButtonManageTravelAgency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitleAgency;
    // End of variables declaration//GEN-END:variables
}
