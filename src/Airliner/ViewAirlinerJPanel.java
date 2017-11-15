/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airliner;

import Business.Airplane;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jhsnehashree
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {
   private JPanel jPanelBody ;
   private Airplane airplanes;
   private TravelAgency travelAgencyObj;
    /**
     * Creates new form ViewAirlinerJPanel
     */
    

    ViewAirlinerJPanel(JPanel jPanelBody, Airplane airplanes) {
        initComponents();
        setBounds(10, 10, 400, 300);
        setSize(3500, 3360);
        this.jPanelBody=jPanelBody;
        this.airplanes=airplanes;
        populateAirlinerDetails();
        
        
        
             jTextFieldRatingView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
             
                 jTextFieldAirlinerTotalSeatsView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
                 
                     jTextFieldAirlinerWindowSeatsView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
                     
                         jTextFieldAirlinerMiddleSeatsView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
                         
                             jTextFieldAirlinerAisleSeatsView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
                             
                                jTextFieldAirlinerWindowPriceView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (e.getKeyChar() == '.') ||(c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
                                   jTextFieldAirlinerMiddlePriceView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (e.getKeyChar() == '.') ||(c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
                                      jTextFieldAirlinerAislePriceView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (e.getKeyChar() == '.') ||(c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
                                      
                    jTextFieldAirlinerCompanyNameView.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
                if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE )){
                    e.consume();
                }
            }
        });  
    }
private void populateAirlinerDetails()
    {
        jTextFieldAirlinerCompanyNameView.setText(airplanes.getAirlinerName());
        jTextFieldAirlinerFlightNameView.setText(airplanes.getAirlineCompany());
        jTextFieldAirlinerSourceView.setText(airplanes.getSourcePlace());
        jTextFieldAirlinerDestinationView.setText(airplanes.getDestinationPlace());
                
        String startDate = String.valueOf(airplanes.getStartDate());
        String endDate=String.valueOf(airplanes.getEndDate());
      SimpleDateFormat formatnow = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH); 
      SimpleDateFormat formatneeded=new SimpleDateFormat("dd-MM-yyyy:HH:mm:SS");
      String startDate_=null;
      String endDate_=null;
   try{   
Date date1 = formatnow.parse(startDate);
 startDate_ = formatneeded.format(date1);
Date date2 = formatnow.parse(endDate);
 endDate_ = formatneeded.format(date2);
  } catch (ParseException ex) {
                Logger.getLogger(CreateAirlinerJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        jTextFieldAirlinerStartTimeView.setText(String.valueOf(startDate_));
        
        jTextFieldAirlinerEndTimeView.setText(String.valueOf(endDate_));
        
        
        jTextFieldAirlinerTotalSeatsView.setText(String.valueOf(airplanes.getTotalSeatsAvailable()));
        jTextFieldAirlinerWindowSeatsView.setText(String.valueOf(airplanes.getWindowTotal()));
        jTextFieldAirlinerWindowPriceView.setText(String.valueOf(airplanes.getWindowPrice()));
        jTextFieldAirlinerMiddleSeatsView.setText(String.valueOf(airplanes.getMiddleTotal()));
        jTextFieldAirlinerMiddlePriceView.setText(String.valueOf(airplanes.getMiddlePrice()));
        jTextFieldAirlinerAisleSeatsView.setText(String.valueOf(airplanes.getAisleTotal()));
        jTextFieldAirlinerAislePriceView.setText(String.valueOf(airplanes.getAislePrice()));
      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldAirlinerDestinationView = new javax.swing.JTextField();
        jTextFieldAirlinerStartTimeView = new javax.swing.JTextField();
        jTextFieldAirlinerEndTimeView = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAirlinerAislePriceView = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAirlinerMiddleSeatsView = new javax.swing.JTextField();
        jTextFieldAirlinerTotalSeatsView = new javax.swing.JTextField();
        jTextFieldAirlinerAisleSeatsView = new javax.swing.JTextField();
        jTextFieldAirlinerWindowPriceView = new javax.swing.JTextField();
        jButtonBackViewAgency = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAirlinerMiddlePriceView = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldAirlinerCompanyNameView = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAirlinerFlightNameView = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAirlinerWindowSeatsView = new javax.swing.JTextField();
        jTextFieldAirlinerSourceView = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldRatingView = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setText("End Time");

        jLabel6.setText("Start Time");

        jLabel7.setText("Total Seats Available");

        jButtonBackViewAgency.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBackViewAgency.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackViewAgency.setText("<<< Back");
        jButtonBackViewAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackViewAgencyActionPerformed(evt);
            }
        });

        jLabel9.setText("Price");

        jLabel15.setText("WINDOW");

        jLabel10.setText("Total Seats");

        jLabel1.setText("Airliner Company Name");

        jLabel16.setText("MIDDLE");

        jLabel17.setText("AISLE");

        jLabel2.setText("Flight Number");

        jLabel3.setText("Source");

        jLabel4.setText("Destination");

        jButtonSave.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("Save");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 0, 0));
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setText("View Flight Details");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setText("Airliner");

        jLabel14.setText("Ratings : ");

        jLabel18.setText("(dd-MM-yyyy:HH:mm:SS)");

        jLabel19.setText("(dd-MM-yyyy:HH:mm:SS)");

        jLabel8.setText("Number Only *");

        jLabel11.setText("Number Only *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel12)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAirlinerTotalSeatsView, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jButtonBackViewAgency))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonSave)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonUpdate))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextFieldAirlinerWindowSeatsView)
                                                    .addComponent(jTextFieldAirlinerMiddleSeatsView)
                                                    .addComponent(jTextFieldAirlinerAisleSeatsView, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(11, 11, 11)
                                                        .addComponent(jLabel10)))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextFieldAirlinerWindowPriceView)
                                                    .addComponent(jTextFieldAirlinerMiddlePriceView)
                                                    .addComponent(jTextFieldAirlinerAislePriceView, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(14, 14, 14)
                                                        .addComponent(jLabel9))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldAirlinerStartTimeView, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldAirlinerSourceView, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldAirlinerDestinationView, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(jTextFieldAirlinerEndTimeView)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                        .addComponent(jLabel19))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAirlinerFlightNameView, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAirlinerCompanyNameView))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRatingView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAirlinerCompanyNameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldRatingView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAirlinerFlightNameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldAirlinerSourceView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAirlinerDestinationView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAirlinerStartTimeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAirlinerEndTimeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldAirlinerWindowSeatsView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAirlinerMiddleSeatsView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAirlinerAisleSeatsView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldAirlinerTotalSeatsView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldAirlinerWindowPriceView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAirlinerMiddlePriceView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAirlinerAislePriceView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonUpdate))
                .addGap(1, 1, 1)
                .addComponent(jButtonBackViewAgency)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackViewAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackViewAgencyActionPerformed
        // TODO add your handling code here:
        jPanelBody.remove(this);
        Component[] componentArray = jPanelBody.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinerJPanel manageAccountJPanel = (ManageAirlinerJPanel) component;
        manageAccountJPanel.populateTable();
        CardLayout layout = (CardLayout) jPanelBody.getLayout();
        layout.previous(jPanelBody);
    }//GEN-LAST:event_jButtonBackViewAgencyActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
         String format = "dd-MM-yyyy:HH:mm:SS";
            SimpleDateFormat sdf = new SimpleDateFormat(format);

            String startDate= jTextFieldAirlinerStartTimeView.getText();
            String endDate= jTextFieldAirlinerEndTimeView.getText();

            Date flight_startDate = null;
            Date flight_endDate = null;

        if(jTextFieldAirlinerCompanyNameView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Airline Company Name.");
        }
        else if(jTextFieldAirlinerFlightNameView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Airliner's Flight Name.");
        }
        else if(jTextFieldAirlinerSourceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Start Place.");
        }
        else if(jTextFieldAirlinerDestinationView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter End Place.");
        }
        else if(jTextFieldAirlinerStartTimeView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Start Time.");
        }
        else if(jTextFieldAirlinerEndTimeView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter End Time.");
        }else if(jTextFieldAirlinerTotalSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Total Seats in the Flight.");
        }
        else if(jTextFieldAirlinerWindowSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Window Seats.");
        }else if(jTextFieldAirlinerAisleSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Aisle Seats.");
        }
        else if(jTextFieldAirlinerMiddleSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Middle Seats.");
        }else if(jTextFieldAirlinerAislePriceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Aisle Seats Price.");
        }
        else if(jTextFieldAirlinerWindowPriceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Window Seats  Price.");
        }
        else if(jTextFieldAirlinerMiddlePriceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Middle Seats Price.");
        }
        else if (flight_startDate==null) {
        JOptionPane.showMessageDialog(null, "Please enter valid Start date");
         }
         else if (flight_endDate==null) {
        JOptionPane.showMessageDialog(null, "Please enter valid End date");
         }
        else{

            String airlineCompanyName=jTextFieldAirlinerCompanyNameView.getText();
            String airlineFlightName=jTextFieldAirlinerFlightNameView.getText();
            String sourcePlace=jTextFieldAirlinerSourceView.getText();
            String destinationPlace=jTextFieldAirlinerDestinationView.getText();

           
            int totalSeatsPresent=Integer.parseInt(jTextFieldAirlinerTotalSeatsView.getText());
            int windowSeats=Integer.parseInt(jTextFieldAirlinerWindowSeatsView.getText());
            int middleSeats=Integer.parseInt(jTextFieldAirlinerMiddleSeatsView.getText());
            int aisleSeats=Integer.parseInt(jTextFieldAirlinerAisleSeatsView.getText());

            double windowPrice=Double.parseDouble(jTextFieldAirlinerWindowPriceView.getText());
            double aislePrice= Double.parseDouble(jTextFieldAirlinerAislePriceView.getText());
            double middlePrice=Double.parseDouble(jTextFieldAirlinerMiddlePriceView.getText());
            
            int ratings=Integer.parseInt(jTextFieldRatingView.getText());
           
            
            try {
                flight_startDate = sdf.parse(startDate);
                flight_endDate = sdf.parse(endDate);
            } catch (ParseException ex) {
                Logger.getLogger(CreateAirlinerJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

             int totalAllSeats=windowSeats+middleSeats+aisleSeats;
            if(totalSeatsPresent<totalAllSeats)
            {
               JOptionPane.showMessageDialog(null,"Sum of Window/Middle/Aisle seats cannot be less than total Seats"); 
            }
            else
            {
            airplanes.setAirlineCompany(airlineCompanyName);
            airplanes.setAirlinerName(airlineFlightName);
            airplanes.setSourcePlace(sourcePlace);
            airplanes.setDestinationPlace(destinationPlace);
            airplanes.setStartDate(flight_startDate);
            airplanes.setEndDate(flight_endDate);
            airplanes.setTotalSeatsAvailable(totalSeatsPresent);
            airplanes.setWindowTotal(windowSeats);
            airplanes.setAisleTotal(aisleSeats);
            airplanes.setMiddleTotal(middleSeats);
            airplanes.setWindowPrice(windowPrice);
            airplanes.setAislePrice(aislePrice);
            airplanes.setMiddlePrice(middlePrice);
            airplanes.setRatings(ratings);
            jButtonSave.setEnabled(false);
            jButtonUpdate.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Airliners Record and corresponding details added Successfully.");
        
               jTextFieldAirlinerCompanyNameView.setText("");
        jTextFieldAirlinerFlightNameView.setText("");
        jTextFieldAirlinerSourceView.setText("");
        jTextFieldAirlinerDestinationView.setText("");
        jTextFieldAirlinerTotalSeatsView.setText("");
        jTextFieldAirlinerWindowSeatsView.setText("");
        jTextFieldAirlinerMiddleSeatsView.setText("");
        jTextFieldAirlinerAisleSeatsView.setText("");
        jTextFieldAirlinerWindowPriceView.setText("");
        jTextFieldAirlinerAislePriceView.setText("");
        jTextFieldAirlinerMiddlePriceView.setText("");
        jTextFieldRatingView.setText("");
          jTextFieldAirlinerStartTimeView.setText("");
        jTextFieldAirlinerEndTimeView.setText("");
      
            }
         }

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

         if(jTextFieldAirlinerCompanyNameView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Airline Company Name.");
        }
        else if(jTextFieldAirlinerFlightNameView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Airliner's Flight Name.");
        }
        else if(jTextFieldAirlinerSourceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Start Place.");
        }
        else if(jTextFieldAirlinerDestinationView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter End Place.");
        }
        else if(jTextFieldAirlinerStartTimeView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Start Time.");
        }
        else if(jTextFieldAirlinerEndTimeView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter End Time.");
        }else if(jTextFieldAirlinerTotalSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Total Seats in the Flight.");
        }
        else if(jTextFieldAirlinerWindowSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Window Seats.");
        }else if(jTextFieldAirlinerAisleSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Aisle Seats.");
        }
        else if(jTextFieldAirlinerMiddleSeatsView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Middle Seats.");
        }else if(jTextFieldAirlinerAislePriceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Aisle Seats Price.");
        }
        else if(jTextFieldAirlinerWindowPriceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Window Seats  Price.");
        }
        else if(jTextFieldAirlinerMiddlePriceView.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Middle Seats Price.");
        }
         else
        {
            jTextFieldAirlinerCompanyNameView.setEnabled(true);
            jTextFieldAirlinerFlightNameView.setEnabled(true);
            jTextFieldAirlinerSourceView.setEnabled(true);
            jTextFieldAirlinerDestinationView.setEnabled(true);
            jTextFieldAirlinerStartTimeView.setEnabled(true);
            jTextFieldAirlinerEndTimeView.setEnabled(true);
            jTextFieldAirlinerTotalSeatsView.setEnabled(true);
            jTextFieldAirlinerWindowSeatsView.setEnabled(true);
            jTextFieldAirlinerAisleSeatsView.setEnabled(true);
            jTextFieldAirlinerMiddleSeatsView.setEnabled(true);
            jTextFieldAirlinerAislePriceView.setEnabled(true);
            jTextFieldAirlinerWindowPriceView.setEnabled(true);
            jTextFieldAirlinerMiddlePriceView.setEnabled(true);
            jTextFieldRatingView.setEnabled(true);
            
            jButtonSave.setEnabled(true);
            jButtonUpdate.setEnabled(false);

        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackViewAgency;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldAirlinerAislePriceView;
    private javax.swing.JTextField jTextFieldAirlinerAisleSeatsView;
    private javax.swing.JTextField jTextFieldAirlinerCompanyNameView;
    private javax.swing.JTextField jTextFieldAirlinerDestinationView;
    private javax.swing.JTextField jTextFieldAirlinerEndTimeView;
    private javax.swing.JTextField jTextFieldAirlinerFlightNameView;
    private javax.swing.JTextField jTextFieldAirlinerMiddlePriceView;
    private javax.swing.JTextField jTextFieldAirlinerMiddleSeatsView;
    private javax.swing.JTextField jTextFieldAirlinerSourceView;
    private javax.swing.JTextField jTextFieldAirlinerStartTimeView;
    private javax.swing.JTextField jTextFieldAirlinerTotalSeatsView;
    private javax.swing.JTextField jTextFieldAirlinerWindowPriceView;
    private javax.swing.JTextField jTextFieldAirlinerWindowSeatsView;
    private javax.swing.JTextField jTextFieldRatingView;
    // End of variables declaration//GEN-END:variables
}
