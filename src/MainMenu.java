
import javax.swing.JFrame;
    
public class MainMenu extends javax.swing.JFrame {
    
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypeOfEmployee = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        numberToEdit = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        DelEmployeeNumField = new javax.swing.JTextField();
        delButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        EmployeeNumField = new javax.swing.JTextField();
        AddEmployee = new javax.swing.JButton();
        FullTimeRadio = new javax.swing.JRadioButton();
        PartTimeRadio = new javax.swing.JRadioButton();
        locationBox = new javax.swing.JComboBox<>();
        AnnualSalaryText = new javax.swing.JTextField();
        DRText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Employees", jPanel2);

        numberToEdit.setText("Employee Number");
        numberToEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberToEditActionPerformed(evt);
            }
        });

        editButton.setText("Edit Employee");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numberToEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(697, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(numberToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit Employee", jPanel1);

        DelEmployeeNumField.setText("Employee Number");
        DelEmployeeNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelEmployeeNumFieldActionPerformed(evt);
            }
        });

        delButton.setText("Delete");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DelEmployeeNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(649, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(DelEmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Employee", jPanel4);

        FirstNameField.setText("First name");
        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });

        LastNameField.setText("Last name");
        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });

        EmployeeNumField.setText("Employee number");
        EmployeeNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeNumFieldActionPerformed(evt);
            }
        });

        AddEmployee.setText("Add Button");
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(FullTimeRadio);
        FullTimeRadio.setText("Full Time");
        FullTimeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullTimeRadioActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(PartTimeRadio);
        PartTimeRadio.setText("Part Time");
        PartTimeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartTimeRadioActionPerformed(evt);
            }
        });

        locationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Toronto", "Ottawa", "randomplace" }));
        locationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationBoxActionPerformed(evt);
            }
        });

        AnnualSalaryText.setText("Annual Salary");
        AnnualSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnualSalaryTextActionPerformed(evt);
            }
        });

        DRText.setText("Deduction Rate");
        DRText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PartTimeRadio)
                    .addComponent(FullTimeRadio))
                .addGap(192, 385, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DRText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnnualSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(339, 339, 339))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FullTimeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PartTimeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnnualSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DRText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Add Employee", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DelEmployeeNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelEmployeeNumFieldActionPerformed
        // TODO add your handling `code here: 
        String text = numberToEdit.getText();
        int numberToDelete = Integer.parseInt(text);
    }//GEN-LAST:event_DelEmployeeNumFieldActionPerformed

    private void numberToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberToEditActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_numberToEditActionPerformed

    private void locationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBoxActionPerformed
        String location = (String)locationBox.getSelectedItem();
        // TODO add your handling code here:
    }//GEN-LAST:event_locationBoxActionPerformed

    private void PartTimeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartTimeRadioActionPerformed
        boolean partTime = true;
        AnnualSalaryText.setText("Hourly wage");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_PartTimeRadioActionPerformed

    private void FullTimeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullTimeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullTimeRadioActionPerformed

    private void EmployeeNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeNumFieldActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void AnnualSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnualSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnualSalaryTextActionPerformed

    private void DRTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DRTextActionPerformed

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        String location = (String)locationBox.getSelectedItem();
        int employeeNumber = Integer.parseInt(EmployeeNumField.getText());
        String firstName = FirstNameField.getText();
        String lastName = LastNameField.getText();
        double annualSalary = Double.parseDouble(AnnualSalaryText.getText());
        double deductionRate = Double.parseDouble(DRText.getText());
        if (FullTimeRadio.isSelected()) {
            FullTimeEmployee toBeAdded = new FullTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, annualSalary);
            System.out.println("Employee added");
            //this goes into the fileIO class and gets added in to the .csv
        }
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        int employeeNumber = Integer.parseInt(DelEmployeeNumField.getText());
        //based on the employee number the employee is deleted from the .csv
    // TODO add your handling code here:
    }//GEN-LAST:event_delButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int employeeNumber = Integer.parseInt(numberToEdit.getText());
        
    // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployee;
    private javax.swing.JTextField AnnualSalaryText;
    private javax.swing.JTextField DRText;
    private javax.swing.JTextField DelEmployeeNumField;
    private javax.swing.JTextField EmployeeNumField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JRadioButton FullTimeRadio;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JRadioButton PartTimeRadio;
    private javax.swing.ButtonGroup TypeOfEmployee;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> locationBox;
    private javax.swing.JTextField numberToEdit;
    // End of variables declaration//GEN-END:variables
}
