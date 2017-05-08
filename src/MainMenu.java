
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
    
public class MainMenu extends javax.swing.JFrame {
    
    public MainMenu() {
        initComponents();
    }
    MyHashTable hashTable = new MyHashTable(2);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypeOfEmployee = new javax.swing.ButtonGroup();
        viewPane = new javax.swing.JTabbedPane();
        viewPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        editPanel = new javax.swing.JPanel();
        numberToEdit = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        delPanel = new javax.swing.JPanel();
        delEmployeeNumField = new javax.swing.JTextField();
        delButton = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        employeeNumField = new javax.swing.JTextField();
        addEmployee = new javax.swing.JButton();
        fullTimeRadio = new javax.swing.JRadioButton();
        partTimeRadio = new javax.swing.JRadioButton();
        locationBox = new javax.swing.JComboBox<>();
        annualSalaryText = new javax.swing.JTextField();
        dRText = new javax.swing.JTextField();
        hPWField = new javax.swing.JTextField();
        hourlyWageField = new javax.swing.JTextField();
        wPYField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        viewPane.addTab("View Employees", viewPanel);

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

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numberToEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(697, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(numberToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        viewPane.addTab("Edit Employee", editPanel);

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

        javax.swing.GroupLayout delPanelLayout = new javax.swing.GroupLayout(delPanel);
        delPanel.setLayout(delPanelLayout);
        delPanelLayout.setHorizontalGroup(
            delPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(delPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delEmployeeNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(649, Short.MAX_VALUE))
        );
        delPanelLayout.setVerticalGroup(
            delPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(delEmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        viewPane.addTab("Delete Employee", delPanel);

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

        hPWField.setText("Hours per week");

        hourlyWageField.setText("Hourly Wage");

        wPYField.setText("Weeks per year");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(partTimeRadio)
                        .addGap(117, 117, 117)
                        .addComponent(saveButton))
                    .addComponent(fullTimeRadio))
                .addGap(192, 203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hPWField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWageField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dRText, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(addEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(annualSalaryText, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(locationBox, 0, 191, Short.MAX_VALUE)
                        .addComponent(employeeNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(wPYField)))
                .addGap(339, 339, 339))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullTimeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partTimeRadio)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annualSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWageField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hPWField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wPYField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dRText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        viewPane.addTab("Add Employee", addPanel);

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
        annualSalaryText.setVisible(false);
        hPWField.setVisible(true);
        wPYField.setVisible(true);
        hourlyWageField.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_partTimeRadioActionPerformed

    private void fullTimeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRadioActionPerformed
        annualSalaryText.setVisible(true);
        hPWField.setVisible(false);
        wPYField.setVisible(false);
        hourlyWageField.setVisible(false);
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
        double deductionRate = Double.parseDouble(dRText.getText());
        if (fullTimeRadio.isSelected()) {
            double annualSalary = Double.parseDouble(annualSalaryText.getText());
            FullTimeEmployee toBeAdded = new FullTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, annualSalary);
            hashTable.addEmployee(toBeAdded);
            System.out.println("Full time employee added");
            //this goes into the fileIO class and gets added in to the .csv
        }
        else if (partTimeRadio.isSelected()) {
            int hoursPerWeek = Integer.parseInt(hPWField.getText());
            double hourlyWage = Double.parseDouble(hourlyWageField.getText());
            int weeksPerYear = Integer.parseInt(wPYField.getText());
            PartTimeEmployee toBeAdded = new PartTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, hourlyWage, hoursPerWeek, weeksPerYear);
            System.out.println("Part time employee added");
            hashTable.addEmployee(toBeAdded);
        }
        
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        int employeeNumber = Integer.parseInt(delEmployeeNumField.getText());
        hashTable.removeEmployee(employeeNumber);
        //based on the employee number the employee is deleted from the .csv
    // TODO add your handling code here:
    }//GEN-LAST:event_delButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int employeeNumber = Integer.parseInt(numberToEdit.getText());
        viewPane.setSelectedIndex(3);
        
    // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        FileIO file = new FileIO();
        try {
            file.writeFile("data.csv", hashTable);
            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed


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
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField annualSalaryText;
    private javax.swing.JTextField dRText;
    private javax.swing.JButton delButton;
    private javax.swing.JTextField delEmployeeNumField;
    private javax.swing.JPanel delPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField employeeNumField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JRadioButton fullTimeRadio;
    private javax.swing.JTextField hPWField;
    private javax.swing.JTextField hourlyWageField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JComboBox<String> locationBox;
    private javax.swing.JTextField numberToEdit;
    private javax.swing.JRadioButton partTimeRadio;
    private javax.swing.JButton saveButton;
    private javax.swing.JTabbedPane viewPane;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JTextField wPYField;
    // End of variables declaration//GEN-END:variables
}
