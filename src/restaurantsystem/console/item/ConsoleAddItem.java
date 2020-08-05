
package restaurantsystem.console.item;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import restaurantsystem.model.Item;
import restaurantsystem.model.ListItems;


public class ConsoleAddItem extends javax.swing.JFrame implements Observer{
    
	private List<Item> items = new ArrayList<>();
    private Observable observable;
    
    public ConsoleAddItem(Observable observable) {
        initComponents();
        this.observable = observable;
        observable.addObserver(this);
    }
    
    
    @Override
	public void update(Observable observable, Object object) {
		if (observable instanceof ListItems) {
			ListItems listItems = (ListItems) observable;
			items = listItems.getListItems();
		}
	}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemPriceField = new javax.swing.JTextField();
        itemNameField = new javax.swing.JTextField();
        itemQuantityField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ten mon");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Gia");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("So luong");

        itemPriceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        itemNameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        itemQuantityField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addButton.setBackground(new java.awt.Color(0, 255, 153));
        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("Them");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("Tro ve");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(21, 21, 21)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemQuantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(itemNameField)
                            .addComponent(itemPriceField))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(itemNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPriceField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(itemQuantityField))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = itemNameField.getText();
        String price = itemPriceField.getText();
        String quantity = itemQuantityField.getText();
        
        if(name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui long nhap ten mon an!");
            itemNameField.setText("");
            itemPriceField.setText("");
            itemQuantityField.setText("");
            return;
        }
         
        //Xem price nhap vao co hop le hay khong?
        try {
    		Double.parseDouble(price);
    		if(price.isEmpty() || Double.parseDouble(price) <= 0) {
            	JOptionPane.showMessageDialog(this, "Vui long nhap gia phu hop!");
                return;
            }
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Vui long nhap gia phu hop!");
			itemNameField.setText("");
	        itemPriceField.setText("");
	        itemQuantityField.setText("");
	        return;
		}
        
        
      //Xem quantity nhap vao co hop le hay khong?
        try {
        	Integer.parseInt(quantity);
    		if(quantity.isEmpty() || Integer.parseInt(quantity) <= 0) {
            	JOptionPane.showMessageDialog(this, "Vui long nhap so luong phu hop!");
                return;
            }
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Vui long nhap so luong phu hop!");
			itemNameField.setText("");
	        itemPriceField.setText("");
	        itemQuantityField.setText("");
	        return;
		}
        
        
        // Xem item moi tao da ton tai hay chua       

        
        
    	if (observable instanceof ListItems) {
			ListItems listItems = (ListItems) observable;
			if (listItems.hasItemInList(name,-1)) {
				JOptionPane.showMessageDialog(this, "Mon an da ton tai");
			}
			else {
				Item newItem = new Item(name,
	                    Double.parseDouble(itemPriceField.getText()),
	                    Integer.parseInt(itemQuantityField.getText()));
				listItems.addItem(newItem);
	        	JOptionPane.showMessageDialog(this, "Mon an da duoc them thanh cong");
				listItems.updateData();
			}
			
		}

		itemNameField.setText("");
        itemPriceField.setText("");
        itemQuantityField.setText("");
        
    }//GEN-LAST:event_addButtonActionPerformed
    


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ItemManagement im = new ItemManagement();
        im.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JTextField itemPriceField;
    private javax.swing.JTextField itemQuantityField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables


	
}
