/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarHist;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author apurva
 */
public class ViewJPanel extends javax.swing.JPanel {
CarHist hist;
    /**
     * Creates new form ViewJPanel
     */
DefaultTableModel model ;
    public ViewJPanel(CarHist hist) {
        initComponents();
        this.hist = hist;
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblView_Table = new javax.swing.JTable();
        BtnView = new javax.swing.JButton();
        lblModel_No = new javax.swing.JLabel();
        lblExpiry_Maintenance = new javax.swing.JLabel();
        lbl_Serial_NO = new javax.swing.JLabel();
        txtCar_Make = new javax.swing.JTextField();
        txt_serial_No = new javax.swing.JTextField();
        txt_Model_No = new javax.swing.JTextField();
        lblCarMake = new javax.swing.JLabel();
        lblNoOf_Seats = new javax.swing.JLabel();
        lblModel_year = new javax.swing.JLabel();
        jbtnUpdate = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtExpiry_Date = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAvailability = new javax.swing.JTextField();
        lblCarsAvailable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnCarsAvailable = new javax.swing.JButton();
        lblCarsBooked = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        spinMin = new com.toedter.components.JSpinField();
        spinMax = new com.toedter.components.JSpinField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnFirstAv = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtExpiry = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblMaximum = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Catalogue");

        lblView_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Make ", "Model year ", "Seats", "Serial No ", "Model No ", "Availability", "Expiry maintainence", "City", "Expiry"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lblView_Table);

        BtnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        lblModel_No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModel_No.setText("Model No.");

        lblExpiry_Maintenance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExpiry_Maintenance.setText("Expiry Maintenance");

        lbl_Serial_NO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Serial_NO.setText("Serial No.");

        txtCar_Make.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCar_MakeActionPerformed(evt);
            }
        });

        lblCarMake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCarMake.setText("Car Make");

        lblNoOf_Seats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNoOf_Seats.setText("No. of Seats ");

        lblModel_year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModel_year.setText("Model Year ");

        jbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        txtExpiry_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpiry_DateActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Availability");
        jLabel1.setRequestFocusEnabled(false);

        txtAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailabilityActionPerformed(evt);
            }
        });

        lblCarsAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCarsAvailable.setForeground(new java.awt.Color(0, 0, 255));
        lblCarsAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblCarsAvailableKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Search");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnCarsAvailable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCarsAvailable.setText("Total Cars :");
        btnCarsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarsAvailableActionPerformed(evt);
            }
        });

        lblCarsBooked.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCarsBooked.setForeground(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Available:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Booked:");

        btnFilter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCity.setText("City :");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnFirstAv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirstAv.setText("First Available Car");
        btnFirstAv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Expiry");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Minimum");

        lblMaximum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMaximum.setText("Maximum");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblExpiry_Maintenance)
                                            .addComponent(lblModel_No, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_Serial_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNoOf_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblModel_year, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCarMake, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txt_Model_No, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                                            .addComponent(txt_serial_No, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                                            .addComponent(txtSeats)
                                                            .addComponent(txtExpiry_Date)
                                                            .addComponent(txtAvailability))
                                                        .addComponent(txtExpiry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCar_Make, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(372, 372, 372)
                                                .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCarsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spinMin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCarsBooked, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spinMax, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCarsAvailable)
                                        .addGap(112, 112, 112)
                                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnFirstAv, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch)
                            .addComponent(btnFirstAv, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCarMake, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblModel_year, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNoOf_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_serial_No, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Serial_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblModel_No, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Model_No, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtCar_Make, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCarsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCarsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(spinMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCarsBooked, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lblMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(lblExpiry_Maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtExpiry_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        btnsave.setEnabled(false);
        int SelectedRowIndex = lblView_Table.getSelectedRow();
       if (SelectedRowIndex<0){
           JOptionPane.showMessageDialog(this,"Please select a row to View!");
      }else{
       //DefaultTableModel tablemodel =(DefaultTableModel) lblView_Table.getModel();
       Car SelectedCar =hist.getHist().get(SelectedRowIndex);
       txtCar_Make.setText(SelectedCar.getCar_Make());
       txtSeats.setText(String.valueOf(SelectedCar.getNo_of_Seats()));
       txt_serial_No.setText(String.valueOf(SelectedCar.getSerial_No()));
       txt_Model_No.setText(String.valueOf(SelectedCar.getModel_No()));
       txtYear.setText(String.valueOf(SelectedCar.getModel_Year()));
       txtExpiry_Date.setText(SelectedCar.getExpiery_Maintnance());
       txtAvailability.setText(SelectedCar.getAvailability());
       txtCity.setText(SelectedCar.getCity());
       txtExpiry.setText(SelectedCar.getExpiry());
       }
    }//GEN-LAST:event_BtnViewActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // TODO add your handling code here:
        btnsave.setEnabled(true);
       int SelectedRowIndex = lblView_Table.getSelectedRow();
       if (SelectedRowIndex<0){
           JOptionPane.showMessageDialog(this,"Please select a row to View!");
      }else{
       //DefaultTableModel tablemodel =(DefaultTableModel) lblView_Table.getModel();
       Car SelectedCar =hist.getHist().get(SelectedRowIndex);
       txtCar_Make.setText(SelectedCar.getCar_Make());
       txtSeats.setText(String.valueOf(SelectedCar.getNo_of_Seats()));
       txt_serial_No.setText(String.valueOf(SelectedCar.getSerial_No()));
       txt_Model_No.setText(String.valueOf(SelectedCar.getModel_No()));
       txtYear.setText(String.valueOf(SelectedCar.getModel_Year()));
       txtExpiry_Date.setText(SelectedCar.getExpiery_Maintnance());
       txtAvailability.setText(SelectedCar.getAvailability());
       txtCity.setText(SelectedCar.getCity());
       txtExpiry.setText(SelectedCar.getExpiry());
       }
       
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void txtExpiry_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpiry_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpiry_DateActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = lblView_Table.getSelectedRow();
        Car selectedCar = hist.getHist().get(SelectedRowIndex);
        selectedCar.setCar_Make(txtCar_Make.getText());
        selectedCar.setSerial_No(Integer.parseInt(txt_serial_No.getText()));
        selectedCar.setModel_No(Integer.parseInt(txt_Model_No.getText()));
        selectedCar.setModel_Year(Integer.parseInt(txtYear.getText()));
        selectedCar.setExpiery_Maintnance(txtExpiry_Date.getText());
        selectedCar.setAvailability(txtAvailability.getText());
        selectedCar.setCity(txtCity.getText());
        selectedCar.setExpiry(txtExpiry.getText());
        populateTable();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailabilityActionPerformed

    private void lblCarsAvailableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCarsAvailableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCarsAvailableKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String searchString = txtSearch.getText();
        search(searchString);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnCarsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarsAvailableActionPerformed
        // TODO add your handling code here:
        int a = 0;
        int b = 0;
        for (Car c: hist.getHist()){
         if (c.getAvailability().equals("Available")){
             a+=1;
         }else if(c.getAvailability().equals("Booked")){
             b+=1;
         }
        }
        lblCarsAvailable.setText(Integer.toString(a));
        lblCarsBooked.setText(Integer.toString(b));
        
    }//GEN-LAST:event_btnCarsAvailableActionPerformed

    private void txtCar_MakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCar_MakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCar_MakeActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
        int min = (int) spinMin.getValue();
        int max = (int) spinMax.getValue();
        DefaultTableModel table_model =(DefaultTableModel) lblView_Table.getModel();
        table_model.setRowCount(0);
        for (Car c: hist.getHist()){
            if(c.getNo_of_Seats() >= min && c.getNo_of_Seats() <= max){
                Object[] row = createRow(c);
                table_model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnFirstAvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvActionPerformed
        // TODO add your handling code here:
        DefaultTableModel first_model =(DefaultTableModel) lblView_Table.getModel();
        first_model.setRowCount(0);
        for (Car c: hist.getHist()){
            if(c.getAvailability().equals("Available")){
                Object[] row = createRow(c);
                first_model.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_btnFirstAvActionPerformed
    
    private Object[] createRow(Car c) {
        Object[] row = new Object[9];
         row[0] = c.getCar_Make();
         row[1] = c.getModel_Year();
         row[2] = c.getNo_of_Seats();
         row[3] = c.getSerial_No();
         row[4] = c.getModel_No();
         row[5] = c.getAvailability();
         row[6]= c.getExpiery_Maintnance();
         row[7] = c.getCity();
         row[8] = c.getExpiry();
         return row;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnView;
    private javax.swing.JButton btnCarsAvailable;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnFirstAv;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JLabel lblCarMake;
    private javax.swing.JLabel lblCarsAvailable;
    private javax.swing.JLabel lblCarsBooked;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblExpiry_Maintenance;
    private javax.swing.JLabel lblMaximum;
    private javax.swing.JLabel lblModel_No;
    private javax.swing.JLabel lblModel_year;
    private javax.swing.JLabel lblNoOf_Seats;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable lblView_Table;
    private javax.swing.JLabel lbl_Serial_NO;
    private com.toedter.components.JSpinField spinMax;
    private com.toedter.components.JSpinField spinMin;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtCar_Make;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpiry;
    private javax.swing.JTextField txtExpiry_Date;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txt_Model_No;
    private javax.swing.JTextField txt_serial_No;
    // End of variables declaration//GEN-END:variables

    
    

    private void populateTable() {
        
     DefaultTableModel tablemodel =(DefaultTableModel) lblView_Table.getModel();
     tablemodel.setRowCount(0);
     
     for (Car c: hist.getHist()){
      
         Object[] row = createRow(c);
         
         tablemodel.addRow(row);
         //model = (DefaultTableModel) lblView_Table.getModel();
       //model.addRow(row);
     }
     
     
    }
   public  void search(String str){
   model =(DefaultTableModel) lblView_Table.getModel();
       TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
       lblView_Table.setRowSorter(trs);
       trs.setRowFilter(RowFilter.regexFilter(str));
   }
}
