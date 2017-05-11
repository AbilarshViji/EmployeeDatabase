
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

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
        viewTable = new javax.swing.JTable();
        editPanel = new javax.swing.JPanel();
        addPanel1 = new javax.swing.JPanel();
        firstNameField1 = new javax.swing.JTextField();
        lastNameField1 = new javax.swing.JTextField();
        employeeNumField1 = new javax.swing.JTextField();
        editEmployeeConfirm = new javax.swing.JButton();
        fullTimeRadio1 = new javax.swing.JRadioButton();
        partTimeRadio1 = new javax.swing.JRadioButton();
        locationBox1 = new javax.swing.JComboBox<>();
        annualSalaryText1 = new javax.swing.JTextField();
        dRText1 = new javax.swing.JTextField();
        hPWField1 = new javax.swing.JTextField();
        hourlyWageField1 = new javax.swing.JTextField();
        wPYField1 = new javax.swing.JTextField();
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

        viewPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPaneMouseClicked(evt);
            }
        });

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee Number", "First Name", "Last Name", "Work Location", "Annual Salary", "Deductions Rate", "Net Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewTable);

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        viewPane.addTab("View Employees", viewPanel);

        firstNameField1.setText("First name");
        firstNameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameField1ActionPerformed(evt);
            }
        });

        lastNameField1.setText("Last name");
        lastNameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameField1ActionPerformed(evt);
            }
        });

        employeeNumField1.setText("Employee number");
        employeeNumField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNumField1ActionPerformed(evt);
            }
        });

        editEmployeeConfirm.setText("Confirm changes");
        editEmployeeConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeConfirmActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(fullTimeRadio1);
        fullTimeRadio1.setText("Full Time");
        fullTimeRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeRadio1ActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(partTimeRadio1);
        partTimeRadio1.setText("Part Time");
        partTimeRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadio1ActionPerformed(evt);
            }
        });

        locationBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Toronto", "Ottawa", "Vancouver" }));
        locationBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationBox1ActionPerformed(evt);
            }
        });

        annualSalaryText1.setText("Annual Salary");
        annualSalaryText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualSalaryText1ActionPerformed(evt);
            }
        });

        dRText1.setText("Deduction Rate");
        dRText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRText1ActionPerformed(evt);
            }
        });

        hPWField1.setText("Hours per week");

        hourlyWageField1.setText("Hourly Wage");

        wPYField1.setText("Weeks per year");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanel1Layout = new javax.swing.GroupLayout(addPanel1);
        addPanel1.setLayout(addPanel1Layout);
        addPanel1Layout.setHorizontalGroup(
            addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanel1Layout.createSequentialGroup()
                .addGap(0, 340, Short.MAX_VALUE)
                .addGroup(addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(hourlyWageField1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dRText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(editEmployeeConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(annualSalaryText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(employeeNumField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(lastNameField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(firstNameField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(wPYField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hPWField1)
                    .addComponent(locationBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 338, Short.MAX_VALUE))
                .addGap(339, 339, 339))
            .addGroup(addPanel1Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addGroup(addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partTimeRadio1)
                    .addComponent(fullTimeRadio1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(437, 437, 437))
        );
        addPanel1Layout.setVerticalGroup(
            addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanel1Layout.createSequentialGroup()
                .addComponent(fullTimeRadio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partTimeRadio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeNumField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(editButton)
                .addGap(1, 1, 1)
                .addGroup(addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annualSalaryText1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWageField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hPWField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wPYField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dRText1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(editEmployeeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(796, Short.MAX_VALUE))
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
                .addGap(483, 483, 483)
                .addComponent(partTimeRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGap(0, 392, Short.MAX_VALUE)
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
                .addGap(392, 392, 392))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fullTimeRadio)
                .addGap(184, 184, 184)
                .addComponent(saveButton)
                .addGap(186, 186, 186))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullTimeRadio)
                    .addComponent(saveButton))
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
        // take numberToDelete into fileio program
    }//GEN-LAST:event_delEmployeeNumFieldActionPerformed


    private void numberToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberToEditActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_numberToEditActionPerformed


    private void locationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBoxActionPerformed
        String location = (String) locationBox.getSelectedItem();
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
        String location = (String) locationBox.getSelectedItem();
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
        } else if (partTimeRadio.isSelected()) {
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

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        FileIO file = new FileIO();
        try {
            file.writeFile("data.csv", hashTable);
            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    private void viewPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPaneMouseClicked
        DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < hashTable.buckets.length; i++) {
            for (int x = 0; x < hashTable.buckets[i].size(); x++) {
                if (hashTable.buckets[i].get(x) instanceof FullTimeEmployee) {
                    model.addRow(new Object[]{hashTable.buckets[i].get(x).getEmployeeNum(), hashTable.buckets[i].get(x).getFirstName(), hashTable.buckets[i].get(x).getLastName(), hashTable.buckets[i].get(x).getWorkLocation(), ((FullTimeEmployee) hashTable.buckets[i].get(x)).getAnnualSalary(), hashTable.buckets[i].get(x).getDeductionRate(), ((FullTimeEmployee) hashTable.buckets[i].get(x)).getNetSalary(hashTable.buckets[i].get(x).getDeductionRate())});
                } else {
                    model.addRow(new Object[]{hashTable.buckets[i].get(x).getEmployeeNum(), hashTable.buckets[i].get(x).getFirstName(), hashTable.buckets[i].get(x).getLastName(), hashTable.buckets[i].get(x).getWorkLocation(), ((PartTimeEmployee) hashTable.buckets[i].get(x)).getAnnualSalary(((PartTimeEmployee) hashTable.buckets[i].get(x)).getHourlyWage(), ((PartTimeEmployee) hashTable.buckets[i].get(x)).getHoursPerWeek(), ((PartTimeEmployee) hashTable.buckets[i].get(x)).getWeeksPerYear()), hashTable.buckets[i].get(x).getDeductionRate(), ((PartTimeEmployee) hashTable.buckets[i].get(x)).getNetSalary(hashTable.buckets[i].get(x).getDeductionRate())});
                }
            }
}    }//GEN-LAST:event_viewPaneMouseClicked

    private void firstNameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameField1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameField1ActionPerformed

    private void lastNameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameField1ActionPerformed

    private void employeeNumField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNumField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNumField1ActionPerformed

    private void editEmployeeConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeConfirmActionPerformed
        int numToEdit = Integer.parseInt(employeeNumField1.getText());
        hashTable.removeEmployee(numToEdit);
        String location = (String) locationBox1.getSelectedItem();
        int employeeNumber = Integer.parseInt(employeeNumField1.getText());
        String firstName = firstNameField1.getText();
        String lastName = lastNameField1.getText();
        double deductionRate = Double.parseDouble(dRText1.getText());
        if (fullTimeRadio1.isSelected()) {
            double annualSalary = Double.parseDouble(annualSalaryText1.getText());
            FullTimeEmployee toBeAdded = new FullTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, annualSalary);
            hashTable.addEmployee(toBeAdded);
            System.out.println("Full time employee added");
            //this goes into the fileIO class and gets added in to the .csv
        } else if (partTimeRadio1.isSelected()) {
            int hoursPerWeek = Integer.parseInt(hPWField1.getText());
            double hourlyWage = Double.parseDouble(hourlyWageField1.getText());
            int weeksPerYear = Integer.parseInt(wPYField1.getText());
            PartTimeEmployee toBeAdded = new PartTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, hourlyWage, hoursPerWeek, weeksPerYear);
            System.out.println("Part time employee added");
            hashTable.addEmployee(toBeAdded);
        }
    }//GEN-LAST:event_editEmployeeConfirmActionPerformed

    private void fullTimeRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRadio1ActionPerformed
        annualSalaryText1.setVisible(true);
        hPWField1.setVisible(false);
        wPYField1.setVisible(false);
        hourlyWageField1.setVisible(false);
    }//GEN-LAST:event_fullTimeRadio1ActionPerformed

    private void partTimeRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRadio1ActionPerformed
        annualSalaryText1.setVisible(false);
        hPWField1.setVisible(true);
        wPYField1.setVisible(true);
        hourlyWageField1.setVisible(true);
    }//GEN-LAST:event_partTimeRadio1ActionPerformed

    private void locationBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationBox1ActionPerformed

    private void annualSalaryText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualSalaryText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annualSalaryText1ActionPerformed

    private void dRText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dRText1ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int numberToEdit = Integer.parseInt(employeeNumField1.getText());
        //if statement based on parttime/fulltime employee
        int loc = hashTable.searchEmployee(numberToEdit);
        int num = hashTable.calcBucket(numberToEdit);
        if (hashTable.buckets[num].get(loc) instanceof FullTimeEmployee) {
            FullTimeEmployee toBeAdded = (FullTimeEmployee) hashTable.buckets[num].get(loc);
            fullTimeRadio1.setVisible(true);
            partTimeRadio1.setVisible(true);
            fullTimeRadio1.setSelected(true);
            partTimeRadio1.setSelected(false);
            employeeNumField1.setVisible(true);
            String numberToDisplay = Integer.toString(numberToEdit);
            employeeNumField1.setText(numberToDisplay);
            firstNameField1.setVisible(true);
            firstNameField1.setText(toBeAdded.getFirstName());
            lastNameField1.setVisible(true);
            lastNameField1.setText(toBeAdded.getLastName());
            locationBox1.setVisible(true);
            annualSalaryText1.setVisible(true);
            annualSalaryText1.setText(Double.toString(toBeAdded.getAnnualSalary()));
            editButton.setVisible(false);
            hPWField1.setVisible(false);
            wPYField1.setVisible(false);
            hourlyWageField1.setVisible(false);
            dRText1.setVisible(true);
            dRText1.setText(Double.toString(toBeAdded.getDeductionRate()));

        } else if (hashTable.buckets[num].get(loc) instanceof PartTimeEmployee) {
            PartTimeEmployee toBeAdded = (PartTimeEmployee) hashTable.buckets[num].get(loc);
            fullTimeRadio1.setVisible(true);
            partTimeRadio1.setVisible(true);
            partTimeRadio1.setSelected(true);
            fullTimeRadio1.setSelected(false);
            employeeNumField1.setVisible(true);
            String numberToDisplay = Integer.toString(numberToEdit);
            employeeNumField1.setText(numberToDisplay);
            firstNameField1.setVisible(true);
            firstNameField1.setText(toBeAdded.getFirstName());
            lastNameField1.setVisible(true);
            lastNameField1.setText(toBeAdded.getLastName());
            hourlyWageField1.setVisible(true);
            hourlyWageField1.setText(Double.toString(toBeAdded.getHourlyWage()));
            hPWField1.setVisible(true);
            hPWField1.setText(Double.toString(toBeAdded.getHoursPerWeek()));
            wPYField1.setVisible(true);
            wPYField1.setText(Double.toString(toBeAdded.getWeeksPerYear()));
            dRText1.setVisible(true);
            dRText1.setText(Double.toString(toBeAdded.getDeductionRate()));
        }
    }//GEN-LAST:event_editButtonActionPerformed

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JPanel addPanel1;
    private javax.swing.JTextField annualSalaryText;
    private javax.swing.JTextField annualSalaryText1;
    private javax.swing.JTextField dRText;
    private javax.swing.JTextField dRText1;
    private javax.swing.JButton delButton;
    private javax.swing.JTextField delEmployeeNumField;
    private javax.swing.JPanel delPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editEmployeeConfirm;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField employeeNumField;
    private javax.swing.JTextField employeeNumField1;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField firstNameField1;
    private javax.swing.JRadioButton fullTimeRadio;
    private javax.swing.JRadioButton fullTimeRadio1;
    private javax.swing.JTextField hPWField;
    private javax.swing.JTextField hPWField1;
    private javax.swing.JTextField hourlyWageField;
    private javax.swing.JTextField hourlyWageField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField lastNameField1;
    private javax.swing.JComboBox<String> locationBox;
    private javax.swing.JComboBox<String> locationBox1;
    private javax.swing.JRadioButton partTimeRadio;
    private javax.swing.JRadioButton partTimeRadio1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTabbedPane viewPane;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JTable viewTable;
    private javax.swing.JTextField wPYField;
    private javax.swing.JTextField wPYField1;
    // End of variables declaration//GEN-END:variables
}
