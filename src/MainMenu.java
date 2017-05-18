
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends javax.swing.JFrame {

    MyHashTable hashTable = new MyHashTable(2);

    public MainMenu() {
        initComponents();
        resetEdit();
        resetAdd();
        read();
        viewUpdate();
        deleteTableUpdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypeOfEmployee = new javax.swing.ButtonGroup();
        viewPane = new javax.swing.JTabbedPane();
        viewPanel = new javax.swing.JPanel();
        viewScrollPane = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        addPanel = new javax.swing.JPanel();
        firstNameFieldAdd = new javax.swing.JTextField();
        lastNameFieldAdd = new javax.swing.JTextField();
        employeeNumFieldAdd = new javax.swing.JTextField();
        addEmployee = new javax.swing.JButton();
        fullTimeRadioAdd = new javax.swing.JRadioButton();
        partTimeRadioAdd = new javax.swing.JRadioButton();
        locationBoxAdd = new javax.swing.JComboBox<>();
        annualSalaryTextAdd = new javax.swing.JTextField();
        dRTextAdd = new javax.swing.JTextField();
        hPWFieldAdd = new javax.swing.JTextField();
        hourlyWageFieldAdd = new javax.swing.JTextField();
        wPYFieldAdd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addErrorTextBox = new javax.swing.JTextArea();
        editPanel = new javax.swing.JPanel();
        editButtonPanel = new javax.swing.JPanel();
        firstNameFieldEdit = new javax.swing.JTextField();
        lastNameFieldEdit = new javax.swing.JTextField();
        employeeNumFieldEdit = new javax.swing.JTextField();
        editEmployeeConfirm = new javax.swing.JButton();
        fullTimeRadioEdit = new javax.swing.JRadioButton();
        partTimeRadioEdit = new javax.swing.JRadioButton();
        locationBoxEdit = new javax.swing.JComboBox<>();
        annualSalaryTextEdit = new javax.swing.JTextField();
        dRTextEdit = new javax.swing.JTextField();
        hPWFieldEdit = new javax.swing.JTextField();
        hourlyWageFieldEdit = new javax.swing.JTextField();
        wPYFieldEdit = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        editErrorTextBox = new javax.swing.JTextArea();
        delPanel = new javax.swing.JPanel();
        delButton = new javax.swing.JButton();
        deleteScrollPane = new javax.swing.JScrollPane();
        deleteTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        viewPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPaneMouseClicked(evt);
            }
        });

        viewPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPanelMouseClicked(evt);
            }
        });

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        viewScrollPane.setViewportView(viewTable);

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        viewPane.addTab("View Employees", viewPanel);

        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
        });

        firstNameFieldAdd.setText("First name");
        firstNameFieldAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstNameFieldAddMouseClicked(evt);
            }
        });

        lastNameFieldAdd.setText("Last name");
        lastNameFieldAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameFieldAddMouseClicked(evt);
            }
        });

        employeeNumFieldAdd.setText("Employee number");
        employeeNumFieldAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeNumFieldAddMouseClicked(evt);
            }
        });

        addEmployee.setText("Add Button");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(fullTimeRadioAdd);
        fullTimeRadioAdd.setSelected(true);
        fullTimeRadioAdd.setText("Full Time");
        fullTimeRadioAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeRadioAddActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(partTimeRadioAdd);
        partTimeRadioAdd.setText("Part Time");
        partTimeRadioAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadioAddActionPerformed(evt);
            }
        });

        locationBoxAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Toronto", "Ottawa", "Vancouver" }));

        annualSalaryTextAdd.setText("Annual Salary");
        annualSalaryTextAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annualSalaryTextAddMouseClicked(evt);
            }
        });

        dRTextAdd.setText("Deduction Rate");
        dRTextAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dRTextAddMouseClicked(evt);
            }
        });

        hPWFieldAdd.setText("Hours per week");
        hPWFieldAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hPWFieldAddMouseClicked(evt);
            }
        });

        hourlyWageFieldAdd.setText("Hourly Wage");
        hourlyWageFieldAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hourlyWageFieldAddMouseClicked(evt);
            }
        });

        wPYFieldAdd.setText("Weeks per year");
        wPYFieldAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wPYFieldAddMouseClicked(evt);
            }
        });

        addErrorTextBox.setEditable(false);
        addErrorTextBox.setColumns(20);
        addErrorTextBox.setRows(5);
        jScrollPane1.setViewportView(addErrorTextBox);

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(0, 464, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hPWFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hourlyWageFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dRTextAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(addEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(annualSalaryTextAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(locationBoxAdd, 0, 191, Short.MAX_VALUE)
                            .addComponent(employeeNumFieldAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(lastNameFieldAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(firstNameFieldAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(wPYFieldAdd))))
                .addGap(392, 392, 392))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partTimeRadioAdd)
                    .addComponent(fullTimeRadioAdd))
                .addGap(458, 458, 458))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullTimeRadioAdd)
                .addGap(1, 1, 1)
                .addComponent(partTimeRadioAdd)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstNameFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeNumFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationBoxAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annualSalaryTextAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWageFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hPWFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wPYFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dRTextAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        viewPane.addTab("Add Employee", addPanel);

        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPanelMouseClicked(evt);
            }
        });

        editButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonPanelMouseClicked(evt);
            }
        });

        firstNameFieldEdit.setText("First name");
        firstNameFieldEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstNameFieldEditMouseClicked(evt);
            }
        });
        firstNameFieldEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldEditActionPerformed(evt);
            }
        });

        lastNameFieldEdit.setText("Last name");
        lastNameFieldEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameFieldEditMouseClicked(evt);
            }
        });

        employeeNumFieldEdit.setText("Employee number");
        employeeNumFieldEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeNumFieldEditMouseClicked(evt);
            }
        });

        editEmployeeConfirm.setText("Confirm changes");
        editEmployeeConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeConfirmActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(fullTimeRadioEdit);
        fullTimeRadioEdit.setText("Full Time");
        fullTimeRadioEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeRadioEditActionPerformed(evt);
            }
        });

        TypeOfEmployee.add(partTimeRadioEdit);
        partTimeRadioEdit.setText("Part Time");
        partTimeRadioEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadioEditActionPerformed(evt);
            }
        });

        locationBoxEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Toronto", "Ottawa", "Vancouver" }));

        annualSalaryTextEdit.setText("Annual Salary");
        annualSalaryTextEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annualSalaryTextEditMouseClicked(evt);
            }
        });

        dRTextEdit.setText("Deduction Rate");
        dRTextEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dRTextEditMouseClicked(evt);
            }
        });

        hPWFieldEdit.setText("Hours per week");
        hPWFieldEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hPWFieldEditMouseClicked(evt);
            }
        });

        hourlyWageFieldEdit.setText("Hourly Wage");
        hourlyWageFieldEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hourlyWageFieldEditMouseClicked(evt);
            }
        });

        wPYFieldEdit.setText("Weeks per year");
        wPYFieldEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wPYFieldEditMouseClicked(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        editErrorTextBox.setColumns(20);
        editErrorTextBox.setRows(5);
        jScrollPane2.setViewportView(editErrorTextBox);

        javax.swing.GroupLayout editButtonPanelLayout = new javax.swing.GroupLayout(editButtonPanel);
        editButtonPanel.setLayout(editButtonPanelLayout);
        editButtonPanelLayout.setHorizontalGroup(
            editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dRTextEdit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editEmployeeConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(annualSalaryTextEdit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeNumFieldEdit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameFieldEdit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameFieldEdit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wPYFieldEdit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hPWFieldEdit)
                    .addComponent(locationBoxEdit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourlyWageFieldEdit))
                .addGap(340, 340, 340))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editButtonPanelLayout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(437, 437, 437))
            .addGroup(editButtonPanelLayout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addGroup(editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partTimeRadioEdit)
                    .addComponent(fullTimeRadioEdit))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        editButtonPanelLayout.setVerticalGroup(
            editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editButtonPanelLayout.createSequentialGroup()
                .addComponent(fullTimeRadioEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partTimeRadioEdit)
                .addGroup(editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editButtonPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeNumFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editButtonPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationBoxEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(editButton)
                .addGap(1, 1, 1)
                .addGroup(editButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annualSalaryTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWageFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hPWFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wPYFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dRTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(editEmployeeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        viewPane.addTab("Edit Employee", editPanel);

        delPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delPanelMouseClicked(evt);
            }
        });

        delButton.setText("Delete");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        deleteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        deleteScrollPane.setViewportView(deleteTable);

        javax.swing.GroupLayout delPanelLayout = new javax.swing.GroupLayout(delPanel);
        delPanel.setLayout(delPanelLayout);
        delPanelLayout.setHorizontalGroup(
            delPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(654, Short.MAX_VALUE))
        );
        delPanelLayout.setVerticalGroup(
            delPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(delPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        viewPane.addTab("Delete Employee", delPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void numberToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberToEditActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_numberToEditActionPerformed


    private void partTimeRadioAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRadioAddActionPerformed
        annualSalaryTextAdd.setVisible(false);
        hPWFieldAdd.setVisible(true);
        wPYFieldAdd.setVisible(true);
        hourlyWageFieldAdd.setVisible(true);
    }//GEN-LAST:event_partTimeRadioAddActionPerformed

    private void fullTimeRadioAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRadioAddActionPerformed
        annualSalaryTextAdd.setVisible(true);
        hPWFieldAdd.setVisible(false);
        wPYFieldAdd.setVisible(false);
        hourlyWageFieldAdd.setVisible(false);
    }//GEN-LAST:event_fullTimeRadioAddActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        try {
            addErrorTextBox.setText("");
            String location = (String) locationBoxAdd.getSelectedItem();
            int employeeNumber = Integer.parseInt(employeeNumFieldAdd.getText());
            String firstName = firstNameFieldAdd.getText();
            String lastName = lastNameFieldAdd.getText();
            double deductionRate = Double.parseDouble(dRTextAdd.getText());
            if (fullTimeRadioAdd.isSelected()) {
                double annualSalary = Double.parseDouble(annualSalaryTextAdd.getText());
                FullTimeEmployee toBeAdded = new FullTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, annualSalary);
                hashTable.addEmployee(toBeAdded);
                System.out.println("Full time employee added");
                //this goes into the fileIO class and gets added in to the .csv
            } else if (partTimeRadioAdd.isSelected()) {
                int hoursPerWeek = Integer.parseInt(hPWFieldAdd.getText());
                double hourlyWage = Double.parseDouble(hourlyWageFieldAdd.getText());
                int weeksPerYear = Integer.parseInt(wPYFieldAdd.getText());
                PartTimeEmployee toBeAdded = new PartTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, hourlyWage, hoursPerWeek, weeksPerYear);
                System.out.println("Part time employee added");
                hashTable.addEmployee(toBeAdded);
            }
        } catch (IllegalArgumentException e) {
            addErrorTextBox.setText("There is something wrong with the entry");
        }
    }//GEN-LAST:event_addEmployeeActionPerformed

    public void saveToFile() {
        FileIO file = new FileIO();
        try {
            file.writeFile("data.csv", hashTable);
            System.out.println("saved");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void resetEdit() {
        employeeNumFieldEdit.setText("Employee number");
        firstNameFieldEdit.setText("First name");
        lastNameFieldEdit.setText("Last name");
        annualSalaryTextEdit.setText("Annual salary");
        locationBoxEdit.setSelectedIndex(0);
        hourlyWageFieldEdit.setText("Hourly wage");
        hPWFieldEdit.setText("Hours per week");
        wPYFieldEdit.setText("Weeks per year");
        dRTextEdit.setText("Deduction Rate");
        fullTimeRadioEdit.setVisible(false);
        partTimeRadioEdit.setVisible(false);
        firstNameFieldEdit.setVisible(false);
        lastNameFieldEdit.setVisible(false);
        dRTextEdit.setVisible(false);
        locationBoxEdit.setVisible(false);
        editButton.setVisible(true);
        hourlyWageFieldEdit.setVisible(false);
        hPWFieldEdit.setVisible(false);
        wPYFieldEdit.setVisible(false);
        annualSalaryTextEdit.setVisible(false);
        editErrorTextBox.setVisible(false);
    }

    private void resetAdd() {
        employeeNumFieldAdd.setText("Employee number");
        firstNameFieldAdd.setText("First name");
        lastNameFieldAdd.setText("Last name");
        annualSalaryTextAdd.setText("Annual salary");
        locationBoxAdd.setSelectedIndex(0);
        hourlyWageFieldAdd.setText("Hourly wage");
        hPWFieldAdd.setText("Hours per week");
        wPYFieldAdd.setText("Weeks per year");
        dRTextAdd.setText("Deduction Rate");
        fullTimeRadioAdd.setSelected(true);
        partTimeRadioAdd.setSelected(false);
        hourlyWageFieldAdd.setVisible(false);
        hPWFieldAdd.setVisible(false);
        wPYFieldAdd.setVisible(false);
        annualSalaryTextAdd.setVisible(true);
    }

    private void viewPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPaneMouseClicked
        viewUpdate();
        resetEdit();
        resetAdd();
        deleteTableUpdate();
    }//GEN-LAST:event_viewPaneMouseClicked

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try {
            editErrorTextBox.setVisible(true);
            int numberToEdit = -1;
            numberToEdit = Integer.parseInt(employeeNumFieldEdit.getText());
            //if statement based on parttime/fulltime employee
            int loc = hashTable.searchEmployee(numberToEdit);
            int num = hashTable.calcBucket(numberToEdit);
            if (hashTable.buckets[num].get(loc) instanceof FullTimeEmployee) {
                FullTimeEmployee toBeAdded = (FullTimeEmployee) hashTable.buckets[num].get(loc);
                fullTimeRadioEdit.setVisible(true);
                partTimeRadioEdit.setVisible(true);
                fullTimeRadioEdit.setSelected(true);
                partTimeRadioEdit.setSelected(false);
                employeeNumFieldEdit.setVisible(true);
                String numberToDisplay = Integer.toString(numberToEdit);
                employeeNumFieldEdit.setText(numberToDisplay);
                firstNameFieldEdit.setVisible(true);
                firstNameFieldEdit.setText(toBeAdded.getFirstName());
                lastNameFieldEdit.setVisible(true);
                lastNameFieldEdit.setText(toBeAdded.getLastName());
                locationBoxEdit.setVisible(true);
                annualSalaryTextEdit.setVisible(true);
                annualSalaryTextEdit.setText(Double.toString(toBeAdded.getAnnualSalary()));
                editButton.setVisible(false);
                hPWFieldEdit.setVisible(false);
                wPYFieldEdit.setVisible(false);
                hourlyWageFieldEdit.setVisible(false);
                dRTextEdit.setVisible(true);
                dRTextEdit.setText(Double.toString(toBeAdded.getDeductionRate()));

            } else if (hashTable.buckets[num].get(loc) instanceof PartTimeEmployee) {
                PartTimeEmployee toBeAdded = (PartTimeEmployee) hashTable.buckets[num].get(loc);
                fullTimeRadioEdit.setVisible(true);
                partTimeRadioEdit.setVisible(true);
                partTimeRadioEdit.setSelected(true);
                fullTimeRadioEdit.setSelected(false);
                employeeNumFieldEdit.setVisible(true);
                String numberToDisplay = Integer.toString(numberToEdit);
                employeeNumFieldEdit.setText(numberToDisplay);
                firstNameFieldEdit.setVisible(true);
                firstNameFieldEdit.setText(toBeAdded.getFirstName());
                lastNameFieldEdit.setVisible(true);
                lastNameFieldEdit.setText(toBeAdded.getLastName());
                hourlyWageFieldEdit.setVisible(true);
                hourlyWageFieldEdit.setText(Double.toString(toBeAdded.getHourlyWage()));
                hPWFieldEdit.setVisible(true);
                hPWFieldEdit.setText(Double.toString(toBeAdded.getHoursPerWeek()));
                wPYFieldEdit.setVisible(true);
                wPYFieldEdit.setText(Double.toString(toBeAdded.getWeeksPerYear()));
                dRTextEdit.setVisible(true);
                dRTextEdit.setText(Double.toString(toBeAdded.getDeductionRate()));
            }
            hashTable.removeEmployee(numberToEdit);
        } catch (IllegalArgumentException e) {
            editErrorTextBox.setText("There is something wrong with the entry");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void partTimeRadioEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRadioEditActionPerformed
        annualSalaryTextEdit.setVisible(false);
        hPWFieldEdit.setVisible(true);
        wPYFieldEdit.setVisible(true);
        hourlyWageFieldEdit.setVisible(true);
    }//GEN-LAST:event_partTimeRadioEditActionPerformed

    private void fullTimeRadioEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRadioEditActionPerformed
        annualSalaryTextEdit.setVisible(true);
        hPWFieldEdit.setVisible(false);
        wPYFieldEdit.setVisible(false);
        hourlyWageFieldEdit.setVisible(false);
    }//GEN-LAST:event_fullTimeRadioEditActionPerformed

    private void editEmployeeConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeConfirmActionPerformed
        int numToEdit = Integer.parseInt(employeeNumFieldEdit.getText());
        String location = (String) locationBoxEdit.getSelectedItem();
        int employeeNumber = Integer.parseInt(employeeNumFieldEdit.getText());
        String firstName = firstNameFieldEdit.getText();
        String lastName = lastNameFieldEdit.getText();
        double deductionRate = Double.parseDouble(dRTextEdit.getText());
        if (fullTimeRadioEdit.isSelected()) {
            double annualSalary = Double.parseDouble(annualSalaryTextEdit.getText());
            FullTimeEmployee toBeAdded = new FullTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, annualSalary);
            hashTable.addEmployee(toBeAdded);
            System.out.println("Full time employee added");
            //this goes into the fileIO class and gets added in to the .csv
        } else if (partTimeRadioEdit.isSelected()) {
            double hoursPerWeek = Double.parseDouble(hPWFieldEdit.getText());
            double hourlyWage = Double.parseDouble(hourlyWageFieldEdit.getText());
            double weeksPerYear = Double.parseDouble(wPYFieldEdit.getText());
            PartTimeEmployee toBeAdded = new PartTimeEmployee(employeeNumber, firstName, lastName, location, deductionRate, hourlyWage, hoursPerWeek, weeksPerYear);
            System.out.println("Part time employee added");
            hashTable.addEmployee(toBeAdded);
        }
        resetEdit();
    }//GEN-LAST:event_editEmployeeConfirmActionPerformed
    private void read() {
        FileIO file = new FileIO();
        try {
            file.readFile("data.csv", hashTable);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void viewUpdate() {
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
        }
    }

    private void deleteTableUpdate() {
        DefaultTableModel model = (DefaultTableModel) deleteTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < hashTable.buckets.length; i++) {
            for (int x = 0; x < hashTable.buckets[i].size(); x++) {
                model.addRow(new Object[]{hashTable.buckets[i].get(x).getEmployeeNum()});
            }
        }
    }


    private void editButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonPanelMouseClicked

    }//GEN-LAST:event_editButtonPanelMouseClicked

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseClicked

    }//GEN-LAST:event_editPanelMouseClicked

    private void viewPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPanelMouseClicked
        ;
        // TODO add your handling code here:
    }//GEN-LAST:event_viewPanelMouseClicked

    private void firstNameFieldAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameFieldAddMouseClicked
        // TODO add your handling code here:
        firstNameFieldAdd.setText("");
    }//GEN-LAST:event_firstNameFieldAddMouseClicked

    private void lastNameFieldAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameFieldAddMouseClicked
        // TODO add your handling code here:
        lastNameFieldAdd.setText("");
    }//GEN-LAST:event_lastNameFieldAddMouseClicked

    private void employeeNumFieldAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeNumFieldAddMouseClicked
        // TODO add your handling code here:
        employeeNumFieldAdd.setText("");
    }//GEN-LAST:event_employeeNumFieldAddMouseClicked

    private void annualSalaryTextAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annualSalaryTextAddMouseClicked
        // TODO add your handling code here:
        annualSalaryTextAdd.setText("");
    }//GEN-LAST:event_annualSalaryTextAddMouseClicked

    private void hPWFieldAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hPWFieldAddMouseClicked
        // TODO add your handling code here:
        hPWFieldAdd.setText("");
    }//GEN-LAST:event_hPWFieldAddMouseClicked

    private void wPYFieldAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wPYFieldAddMouseClicked
        // TODO add your handling code here:
        wPYFieldAdd.setText("");
    }//GEN-LAST:event_wPYFieldAddMouseClicked

    private void dRTextAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dRTextAddMouseClicked
        // TODO add your handling code here:
        dRTextAdd.setText("");
    }//GEN-LAST:event_dRTextAddMouseClicked

    private void hourlyWageFieldAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hourlyWageFieldAddMouseClicked
        // TODO add your handling code here:
        hourlyWageFieldAdd.setText("");
    }//GEN-LAST:event_hourlyWageFieldAddMouseClicked

    private void firstNameFieldEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameFieldEditMouseClicked
        // TODO add your handling code here:
        firstNameFieldEdit.setText("");
    }//GEN-LAST:event_firstNameFieldEditMouseClicked

    private void lastNameFieldEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameFieldEditMouseClicked
        // TODO add your handling code here:
        lastNameFieldEdit.setText("");
    }//GEN-LAST:event_lastNameFieldEditMouseClicked

    private void employeeNumFieldEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeNumFieldEditMouseClicked
        // TODO add your handling code here:
        employeeNumFieldEdit.setText("");
    }//GEN-LAST:event_employeeNumFieldEditMouseClicked

    private void annualSalaryTextEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annualSalaryTextEditMouseClicked
        // TODO add your handling code here:
        annualSalaryTextEdit.setText("");
    }//GEN-LAST:event_annualSalaryTextEditMouseClicked

    private void hourlyWageFieldEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hourlyWageFieldEditMouseClicked
        // TODO add your handling code here:
        hourlyWageFieldEdit.setText("");
    }//GEN-LAST:event_hourlyWageFieldEditMouseClicked

    private void hPWFieldEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hPWFieldEditMouseClicked
        // TODO add your handling code here:
        hPWFieldEdit.setText("");
    }//GEN-LAST:event_hPWFieldEditMouseClicked

    private void wPYFieldEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wPYFieldEditMouseClicked
        // TODO add your handling code here:
        wPYFieldEdit.setText("");
    }//GEN-LAST:event_wPYFieldEditMouseClicked

    private void dRTextEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dRTextEditMouseClicked
        // TODO add your handling code here:
        dRTextEdit.setText("");
    }//GEN-LAST:event_dRTextEditMouseClicked

    private void delPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPanelMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_delPanelMouseClicked

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        int employeeNumber = Integer.parseInt(deleteTable.getModel().getValueAt(deleteTable.getSelectedRow(), 0).toString());
        hashTable.removeEmployee(employeeNumber);
        deleteTableUpdate();
        //based on the employee number the employee is deleted from the .csv
    }//GEN-LAST:event_delButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        saveToFile();
    }//GEN-LAST:event_formWindowClosing

    private void firstNameFieldEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldEditActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
    private javax.swing.JTextArea addErrorTextBox;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField annualSalaryTextAdd;
    private javax.swing.JTextField annualSalaryTextEdit;
    private javax.swing.JTextField dRTextAdd;
    private javax.swing.JTextField dRTextEdit;
    private javax.swing.JButton delButton;
    private javax.swing.JPanel delPanel;
    private javax.swing.JScrollPane deleteScrollPane;
    private javax.swing.JTable deleteTable;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel editButtonPanel;
    private javax.swing.JButton editEmployeeConfirm;
    private javax.swing.JTextArea editErrorTextBox;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField employeeNumFieldAdd;
    private javax.swing.JTextField employeeNumFieldEdit;
    private javax.swing.JTextField firstNameFieldAdd;
    private javax.swing.JTextField firstNameFieldEdit;
    private javax.swing.JRadioButton fullTimeRadioAdd;
    private javax.swing.JRadioButton fullTimeRadioEdit;
    private javax.swing.JTextField hPWFieldAdd;
    private javax.swing.JTextField hPWFieldEdit;
    private javax.swing.JTextField hourlyWageFieldAdd;
    private javax.swing.JTextField hourlyWageFieldEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameFieldAdd;
    private javax.swing.JTextField lastNameFieldEdit;
    private javax.swing.JComboBox<String> locationBoxAdd;
    private javax.swing.JComboBox<String> locationBoxEdit;
    private javax.swing.JRadioButton partTimeRadioAdd;
    private javax.swing.JRadioButton partTimeRadioEdit;
    private javax.swing.JTabbedPane viewPane;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JScrollPane viewScrollPane;
    private javax.swing.JTable viewTable;
    private javax.swing.JTextField wPYFieldAdd;
    private javax.swing.JTextField wPYFieldEdit;
    // End of variables declaration//GEN-END:variables
}
