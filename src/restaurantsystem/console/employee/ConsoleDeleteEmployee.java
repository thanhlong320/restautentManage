
package restaurantsystem.console.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import restaurantsystem.model.Employee;
import restaurantsystem.model.ListEmployees;
import restaurantsystem.model.LoadAndDisplayEmployees;

public class ConsoleDeleteEmployee extends javax.swing.JFrame implements Observer,LoadAndDisplayEmployees{
    
	private Observable observable;
	List<Employee> employees = new ArrayList<>();

    
    public ConsoleDeleteEmployee(Observable observable) {
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

        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        employeeIDField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteButton.setText("Xoa");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backButton.setText("Tro ve");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID nhan vien muon xoa");

        employeeIDField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(employeeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(backButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        String deleteemployeeID = employeeIDField.getText();
        
        if (deleteemployeeID.isEmpty()) {
            employeeIDField.setText("");
            JOptionPane.showMessageDialog(this, "Vui long nhap ID");
            return;
        }
        
        
        boolean canDelete = false;
        for (Employee employee : employees) {
			if (employee.getId().equalsIgnoreCase(deleteemployeeID)) {
				canDelete = true;
				if (observable instanceof ListEmployees) {
	    			ListEmployees listEmployees = (ListEmployees) observable;
	    			listEmployees.deleteEmployee(employee);
	    			JOptionPane.showMessageDialog(this, "Da xoa nhan vien");
	    			listEmployees.updateData();	
	    		}
				break;
			}
		}  
        if (!canDelete) {
        	JOptionPane.showMessageDialog(this, "ID khong ton tai");
		}
        
        employeeIDField.setText("");
        
        loadAndDisplayEmployees();

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        EmployeeManagement lm = new EmployeeManagement();
        lm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField employeeIDField;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables


}
