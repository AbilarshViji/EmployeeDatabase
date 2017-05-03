
import javax.swing.JFrame;
    
public class MainMenu extends javax.swing.JFrame {
    
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypeOfEmployee = new javax.swing.ButtonGroup();
        viewPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        numberToEdit = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        delEmployeeNumField = new javax.swing.JTextField();
        delButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        employeeNumField = new javax.swing.JTextField();
        addEmployee = new javax.swing.JButton();
        fullTimeRadio = new javax.swing.JRadioButton();
        partTimeRadio = new javax.swing.JRadioButton();
        locationBox = new javax.swing.JComboBox<>();
        annualSalaryText = new javax.swing.JTextField();
        dRText = new javax.swing.JTextField();

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

        viewPane.addTab("View Employees", jPanel2);

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

        viewPane.addTab("Edit Employee", jPanel1);

        delEmployeeNumField.setText("Employee Number");
        delEmployeeNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEmployeeNumFieldActionPerformed(evt);
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
                    .addComponent(delEmployeeNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(649, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(delEmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        viewPane.addTab("Delete Employee", jPanel4);

        firstNameField.setText("First name");
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        lastNameField.setText("Last name");
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        employeeNumField.setText("Employee number");
        employeeNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNumFieldActionPerformed(evt);
            }
        });

        addEmployee.setText("Add Button");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(fullTimeRadio);
        fullTimeRadio.setText("Full Time");
        fullTimeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeRadioActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(partTimeRadio);
        partTimeRadio.setText("Part Time");
        partTimeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadioActionPerformed(evt);
            }
        });

        locationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Toronto", "Ottawa", "randomplace" }));
        locationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationBoxActionPerformed(evt);
            }
        });

        annualSalaryText.setText("Annual Salary");
        annualSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualSalaryTextActionPerformed(evt);
            }
        });

        dRText.setText("Deduction Rate");
        dRText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partTimeRadio)
                    .addComponent(fullTimeRadio))
                .addGap(192, 385, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dRText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annualSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(339, 339, 339))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullTimeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partTimeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annualSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dRText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        viewPane.addTab("Add Employee", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delEmployeeNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delEmployeeNumFieldActionPerformed
        // TODO add your handling `code here: 
        String text = numberToEdit.getText();
        int numberToDelete = Integer.parseInt(text);
        // take numberToDelete into fileio program
    }//GEN-LAST:event_delEmployeeNumFieldActionPerformed

    private void numberToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberToEditActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_numberToEditActionPerformed

    private void locationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBoxActionPerformed
        String location = (String)locationBox.getSelectedItem();
        // TODO add your handling code here:
    }//GEN-LAST:event_locationBoxActionPerformed

    private void partTimeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRadioActionPerformed
        boolean partTime = true;
        annualSalaryText.setText("Hourly wage");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_partTimeRadioActionPerformed

    private void fullTimeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullTimeRadioActionPerformed

    private void employeeNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNumFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void annualSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annualSalaryTextActionPerformed

    private void dRTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dRTextActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        String location = (String)locationBox.getSelectedItem();
        int employeeNumber = Integer.parseInt(employeeNumField.getText());
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        double annualSalary = Double.parseDouble(annualSalaryText.getText());
        double deductionRate = Double.parseDouble(dRText.getText());
        if (fullTimeRadio.isSelected()) {
            FullTimeEmployee toBeAdded = new FullTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, annualSalary);
            System.out.println("Employee added");
            //this goes into the fileIO class and gets added in to the .csv
        }
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        int employeeNumber = Integer.parseInt(delEmployeeNumField.getText());
        //based on the employee number the employee is deleted from the .csv
    // TODO add your handling code here:
    }//GEN-LAST:event_delButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int employeeNumber = Integer.parseInt(numberToEdit.getText());
        viewPane.setSelectedIndex(3);
        
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
    private javax.swing.ButtonGroup TypeOfEmployee;
    private javax.swing.JButton addEmployee;
    private javax.swing.JTextField annualSalaryText;
    private javax.swing.JTextField dRText;
    private javax.swing.JButton delButton;
    private javax.swing.JTextField delEmployeeNumField;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField employeeNumField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JRadioButton fullTimeRadio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JComboBox<String> locationBox;
    private javax.swing.JTextField numberToEdit;
    private javax.swing.JRadioButton partTimeRadio;
    private javax.swing.JTabbedPane viewPane;
    // End of variables declaration//GEN-END:variables
}
