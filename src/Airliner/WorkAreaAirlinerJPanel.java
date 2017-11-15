/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airliner;

import Business.TravelAgency;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author jhsnehashree
 */
public class WorkAreaAirlinerJPanel extends javax.swing.JPanel {
    private JPanel jPanelBody ;
    private TravelAgency travelAgencyObj;
    /**
     * Creates new form WorkAreaAirlinerJPanel
     */
 

    public WorkAreaAirlinerJPanel(JPanel jPanelBody, TravelAgency travelAgencyObj) {
      initComponents();
      setBounds(10, 10, 400, 300);
      setSize(3500, 3360);
      this.jPanelBody=jPanelBody;
      this.travelAgencyObj=travelAgencyObj;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCreateAirliner = new javax.swing.JButton();
        jButtonManagerAirliner = new javax.swing.JButton();
        jLabelTitleAgency = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jButtonCreateAirliner.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCreateAirliner.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateAirliner.setText("Create");
        jButtonCreateAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateAirlinerActionPerformed(evt);
            }
        });

        jButtonManagerAirliner.setBackground(new java.awt.Color(0, 0, 0));
        jButtonManagerAirliner.setForeground(new java.awt.Color(255, 255, 255));
        jButtonManagerAirliner.setText("Manage");
        jButtonManagerAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManagerAirlinerActionPerformed(evt);
            }
        });

        jLabelTitleAgency.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabelTitleAgency.setText("Welcome to Airliner & Flight Details ");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setText("Airliner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonManagerAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreateAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabelTitleAgency)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabelTitleAgency))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCreateAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonManagerAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAirlinerActionPerformed
        // TODO add your handling code here:
        CreateAirlinerJPanel panel=new CreateAirlinerJPanel(jPanelBody,travelAgencyObj);
        jPanelBody.add("CreateAirlinerJPanel",panel);
        CardLayout layout=(CardLayout) jPanelBody.getLayout();
        layout.next(jPanelBody);
    }//GEN-LAST:event_jButtonCreateAirlinerActionPerformed

    private void jButtonManagerAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManagerAirlinerActionPerformed
        // TODO add your handling code here:
        ManageAirlinerJPanel panel=new ManageAirlinerJPanel(jPanelBody,travelAgencyObj);
        jPanelBody.add("ManageAirlinerJPanel",panel);
        CardLayout layout=(CardLayout) jPanelBody.getLayout();
        layout.next(jPanelBody);
    }//GEN-LAST:event_jButtonManagerAirlinerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateAirliner;
    private javax.swing.JButton jButtonManagerAirliner;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabelTitleAgency;
    // End of variables declaration//GEN-END:variables
}