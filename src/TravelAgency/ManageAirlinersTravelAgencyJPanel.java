/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import Business.Airplane;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhsnehashree
 */
public class ManageAirlinersTravelAgencyJPanel extends javax.swing.JPanel {
    private JPanel jPanelBody ;
    private TravelAgency travelAgencyObj;
    
    /**
     * Creates new form ManageAirlinersJPanel
     */

    /**
     * Creates new form ManageAirlinersJPanel
     * @param jPanelBody
     * @param travelAgencyObj
     */
    public ManageAirlinersTravelAgencyJPanel(JPanel jPanelBody, TravelAgency travelAgencyObj) {
        initComponents();
        setBounds(10, 10, 400, 300);
        setSize(3500, 3360);
        this.jPanelBody=jPanelBody;
        this.travelAgencyObj=travelAgencyObj;
        populateTable();
       
    }
 public void populateTable()
{
    DefaultTableModel dtm =(DefaultTableModel) jTableSearchManage.getModel();
    dtm.setRowCount(0);
    
    for(Airplane airplaneslst:travelAgencyObj.getAirplaneCompany())
    {
        Object[] row=new Object[14];
        row[0]=airplaneslst;
        row[1]=airplaneslst.getAirlinerName();
        row[2]=airplaneslst.getSourcePlace();
        row[3]=airplaneslst.getDestinationPlace();
        row[4]=airplaneslst.getStartDate();
        row[5]=airplaneslst.getEndDate();
        row[6]=airplaneslst.getTotalSeatsAvailable();
        row[7]=airplaneslst.getTotalSeatsBooked();
        row[8]=airplaneslst.getWindowTotal();
        row[9]=airplaneslst.getAisleTotal();
        row[10]=airplaneslst.getMiddleTotal();
        row[11]=airplaneslst.getWindowPrice();
        row[12]=airplaneslst.getAislePrice();
        row[13]=airplaneslst.getMiddlePrice();

        dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSearchCompany = new javax.swing.JTextField();
        jButtonSearchAirliner = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearchManage = new javax.swing.JTable();
        jButtonBackManageTravelAgency = new javax.swing.JButton();
        jTextFieldFromSearch = new javax.swing.JTextField();
        jTextFieldToSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Search Airliner");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel2.setText("Manage Airliners");

        jButtonSearchAirliner.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSearchAirliner.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonSearchAirliner.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearchAirliner.setText("Go/View >>>");
        jButtonSearchAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchAirlinerActionPerformed(evt);
            }
        });

        jTableSearchManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Company", "Airline Name", "Source", "Destination", "From Time", "To Time", "Total Available Seats", "Total Seats Booked", "Window Seats", "Aisle Seats", "Middle Seats", "Price Window", "Price Aisle", "Price Middle"
            }
        ));
        jScrollPane1.setViewportView(jTableSearchManage);

        jButtonBackManageTravelAgency.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBackManageTravelAgency.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonBackManageTravelAgency.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackManageTravelAgency.setText("<< Back");
        jButtonBackManageTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackManageTravelAgencyActionPerformed(evt);
            }
        });

        jTextFieldFromSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFromSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("to");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setText("Travel Agency");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBackManageTravelAgency)
                            .addComponent(jButtonSearchAirliner)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFromSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldSearchCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(611, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldSearchCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFromSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearchAirliner)
                .addGap(18, 18, 18)
                .addComponent(jButtonBackManageTravelAgency)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchAirlinerActionPerformed
        // TODO add your handling code here:
         if(jTextFieldSearchCompany.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Airline Company to be Searched.");
        }
         else{
            Airplane airplaneCompanySearch=travelAgencyObj.searchAirplaneCompany(jTextFieldSearchCompany.getText());
            Airplane toFromSearch=travelAgencyObj.searchFromTo(jTextFieldToSearch.getText(),jTextFieldFromSearch.getText());
         
            if(airplaneCompanySearch==null)
            {
                JOptionPane.showMessageDialog(null, "Airline Company not found.");
            }
            else if (toFromSearch==null){
           ViewTravelAgencyJPanel panel=new ViewTravelAgencyJPanel(jPanelBody,airplaneCompanySearch);
           jPanelBody.add("ViewTravelAgencyJPanel",panel);
           CardLayout layout=(CardLayout) jPanelBody.getLayout();
           layout.next(jPanelBody); 
            } 
            else{
                if(jTextFieldToSearch.getText().equals("") && jTextFieldFromSearch.getText().equals(""))
                {
                  JOptionPane.showMessageDialog(null, "Please enter From and To Locations both.");   
                }
                else{
            ViewTravelAgencyJPanel panel=new ViewTravelAgencyJPanel(jPanelBody,toFromSearch);
           jPanelBody.add("ViewTravelAgencyJPanel",panel);
           CardLayout layout=(CardLayout) jPanelBody.getLayout();
           layout.next(jPanelBody);   
                }
            }
           }
    }//GEN-LAST:event_jButtonSearchAirlinerActionPerformed

    private void jButtonBackManageTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackManageTravelAgencyActionPerformed
        // TODO add your handling code here:
        jPanelBody.remove(this);
        CardLayout layout=(CardLayout) jPanelBody.getLayout();
        layout.previous(jPanelBody);
    }//GEN-LAST:event_jButtonBackManageTravelAgencyActionPerformed

    private void jTextFieldFromSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFromSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFromSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackManageTravelAgency;
    private javax.swing.JButton jButtonSearchAirliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSearchManage;
    private javax.swing.JTextField jTextFieldFromSearch;
    private javax.swing.JTextField jTextFieldSearchCompany;
    private javax.swing.JTextField jTextFieldToSearch;
    // End of variables declaration//GEN-END:variables
}
