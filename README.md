# Employee Database
A database program for storing employee information.

## Prerequisites
A version of JRE 8. Can be downloaded from https://www.java.com.

Any IDE (Eclipse, Netbeans, IntelliJ, etc.) to compile the source code.

### OR

Download the JAR file: [link for jar](https://github.com/AbilarshViji/EmployeeDatabase/raw/master/dist/EmployeeDatabase.jar)

## Main Interface
The program is divided into 4 tabs: view, add, edit, and remove. Navigate throughout the various tabs to accomplish the desired task.

## Viewing Employees
To view the list of current employees press the ‘View Employee’ pane at the top of the program.

A list of all of the employees currently stored in the database are displayed in table format.

## Adding an Employee
To add an employee press the ‘Add’ tab.
  
  a.  Based on the type of employee (full time or part time), press the associated radio button. The fields for the respective employee will   change. If the correct fields are not displayed, however your mouse cursor over the ‘Add’ tab and the fields will be forced to be visible.
  
  b.  Enter in the information for the employee into the text fields
  
    * First name - Text
    
    * Last name - Text
    
    * Employee number - Whole positive number
    
    * Annual Salary(FT) - Positive Number
    
    * Deduction rate - Positive number (Maximum value is 100)
    
    * Hourly wage (PT) - Positive Number
    
    * Hours per week (PT) - Positive Number (Maximum value is 168)
    
    * Weeks per year (PT) - Positive Number (Maximum value is 52)
    
![myimage-alt-tag](http://i.imgur.com/Rq1Dt4a.png)
## Editing an Employee
To edit an employee press the ‘Edit’ tab

Enter the employee number of the employee which should be edited

Change the information which needs to be changed for the employee

If changing from from full time to part time, click the associated radio button.

When finished confirm the changes.

## Deleting an Employee
To delete an employee select the employee to be deleted from the table.
After selecting the employee you wish to delete, press the delete button.

![myimage-alt-tag](http://i.imgur.com/TmojlHj.png)

## Archiving
File archiving is done automatically done by the program. When the database is opened, the "data.csv" file that is within the root directory of the project will be opened. The database will be saved when the program is closed.

## Using the data file
The data file is stored in the folder that the EmployeeDatabase project is store as well. This is a comma spliced file that can be opened in Microsoft Excel. As there are no headers in the file, please use your judgement when editing the file. The program will update with the new database when it is reopened.



