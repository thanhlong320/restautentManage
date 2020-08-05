
package restaurantsystem.console.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;
import restaurantsystem.model.Employee;
import restaurantsystem.model.ListEmployees;


public class ConsoleAddEmployee extends javax.swing.JFrame implements Observer{
	private Observable observable;
	List<Employee> employees = new ArrayList<>();

    public ConsoleAddEmployee(Observable observable) {
        initComponents();
        this.observable = observable;
        observable.addObserver(this);
    }
    
	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof ListEmployees) {
			ListEmployees listEmployees = (ListEmployees) observable;
			this.employees = listEmployees.getListEmployees();
		}
	}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeNameField = new javax.swing.JTextField();
        employeeIdField = new javax.swing.JTextField();
        employeeSalaryField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Them Nhan Vien");
        setBackground(new java.awt.Color(0, 102, 255));
        setPreferredSize(new java.awt.Dimension(500, 400));

        addButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addButton.setText("Them");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backButton.setText("Tro ve");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("ID nhan vien :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Ten nhan vien :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("Luong :");

        employeeNameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employeeNameField.setPreferredSize(new java.awt.Dimension(6, 30));

        employeeIdField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        employeeSalaryField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employeeSalaryField.setPreferredSize(new java.awt.Dimension(6, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(employeeSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(employeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(employeeNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(backButton))
                .addGap(94, 94, 94))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String id = employeeIdField.getText();
        String name = employeeNameField.getText();
        String salary = employeeSalaryField.getText();
        
        //Kiem tra xem thong tin da duoc dien du chua?
        if (id.isEmpty() || name.isEmpty() || salary.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O khong duoc de trong");
            return;
        }
        
        //Kiem tra xem luong hop le khong ?
        try {
        	Double.parseDouble(salary);
    		if(salary.isEmpty() || Double.parseDouble(salary) <= 0) {
            	JOptionPane.showMessageDialog(this, "Vui long nhap so luong phu hop!");
                return;
            }
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Vui long nhap so luong phu hop!");
			employeeIdField.setText("");
	        employeeNameField.setText("");
	        employeeSalaryField.setText("");
	        return;
		}
        
        //Kiem tra xem ID nhap vao da ton tai chua ?
    	if (observable instanceof ListEmployees) {
			ListEmployees listEmployees = (ListEmployees) observable;
			if (listEmployees.hasEmployeeInList(id,-1)) {
				JOptionPane.showMessageDialog(this, "Id nhan vien da ton tai");
			}
			else {
				Employee newEmployee = new Employee(id, name, Double.parseDouble(salary));
				listEmployees.addEmployee(newEmployee);
				JOptionPane.showMessageDialog(this, "Da them nhan vien");
				listEmployees.updateData();	
			}
			
		}  
        
        employeeIdField.setText("");
        employeeNameField.setText("");
        employeeSalaryField.setText("");

    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        EmployeeManagement lb = new EmployeeManagement();
        lb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField employeeIdField;
    private javax.swing.JTextField employeeNameField;
    private javax.swing.JTextField employeeSalaryField;
    // End of variables declaration//GEN-END:variables

}
