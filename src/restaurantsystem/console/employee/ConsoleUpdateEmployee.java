
package restaurantsystem.console.employee;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import restaurantsystem.manipulation.UpdateEmployee;
import restaurantsystem.model.Employee;
import restaurantsystem.model.ListEmployees;
import restaurantsystem.model.LoadAndDisplayEmployees;

public class ConsoleUpdateEmployee extends javax.swing.JFrame implements Observer,LoadAndDisplayEmployees{

	private Observable observable;
	List<Employee> employees = new ArrayList<>();

    public ConsoleUpdateEmployee(Observable observable) {
        initComponents();
        this.observable = observable;
        observable.addObserver(this);
        loadAndDisplayEmployees();
    }
    

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof ListEmployees) {
			ListEmployees listEmployees = (ListEmployees) observable;
			this.employees = listEmployees.getListEmployees();
			loadAndDisplayEmployees();
		}
		
	}
    
    
    @Override
    public void loadAndDisplayEmployees() {
    	StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
        	stringBuilder.append(employee.getId())
            .append("\t")
            .append(employee.getName())
            .append("\t")
            .append(employee.getSalary())
            .append("\n");
		}
       
        text.setText(stringBuilder.toString());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newemployeeNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        newemployeeSalaryField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        oldemployeeIdField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newemployeeIDField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        newemployeeNameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nhap ten moi");

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nhap luong moi");

        newemployeeSalaryField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID nhan vien muon cap nhat");

        oldemployeeIdField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        

        updateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updateButton.setText("Cap nhat");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backButton.setText("Tro ve");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nhap ID moi");

        newemployeeIDField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oldemployeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(backButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(newemployeeNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(newemployeeSalaryField)
                                .addComponent(newemployeeIDField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(updateButton)
                                .addGap(39, 39, 39)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oldemployeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newemployeeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newemployeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(newemployeeSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(updateButton))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String sourceId = oldemployeeIdField.getText();
        String id = newemployeeIDField.getText();
        String name = newemployeeNameField.getText();
        String salary = newemployeeSalaryField.getText();

        if (sourceId.isEmpty() || id.isEmpty() || name.isEmpty() || newemployeeSalaryField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui long dien day du thong tin");
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
			oldemployeeIdField.setText("");
	        newemployeeIDField.setText("");
	        newemployeeNameField.setText("");
	        newemployeeSalaryField.setText("");
	        return;
		} 
        
        boolean canUpdate = false;
        for (int i = 0; i < employees.size(); i++) {
        	if (employees.get(i).getId().equalsIgnoreCase(sourceId)) {	
				if (observable instanceof ListEmployees) {
	    			ListEmployees listEmployees = (ListEmployees) observable; 
	    			if (listEmployees.hasEmployeeInList(id,i)) {
	    				canUpdate = true;
	    				JOptionPane.showMessageDialog(this, "ID muon thay doi da ton tai");
					}
	    			else {
	    				Employee updatedemployee = new Employee(id, name, Double.parseDouble(salary));	
	    				UpdateEmployee updateEmployee = new UpdateEmployee(updatedemployee);
						updateEmployee.setIndexToUpdate(i);
						updateEmployee.updateEmployee();
						canUpdate = true;
		    			JOptionPane.showMessageDialog(this, "Thong tin da duoc cap nhat");
		    			listEmployees.updateData();
	    			}	
	    		}
				break;
			}
		}
        if (!canUpdate) {
        	JOptionPane.showMessageDialog(this, "ID khong ton tai");
		}
        
        oldemployeeIdField.setText("");
        newemployeeIDField.setText("");
        newemployeeNameField.setText("");
        newemployeeSalaryField.setText("");
        
        loadAndDisplayEmployees();
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        EmployeeManagement lm = new EmployeeManagement();
        lm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newemployeeIDField;
    private javax.swing.JTextField newemployeeNameField;
    private javax.swing.JTextField newemployeeSalaryField;
    private javax.swing.JTextField oldemployeeIdField;
    private javax.swing.JTextArea text;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}
