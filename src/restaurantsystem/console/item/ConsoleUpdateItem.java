
package restaurantsystem.console.item;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import restaurantsystem.manipulation.UpdateItem;
import restaurantsystem.model.Item;
import restaurantsystem.model.ListItems;
import restaurantsystem.model.LoadAndDisplayItems;

public class ConsoleUpdateItem extends javax.swing.JFrame implements Observer, LoadAndDisplayItems {

	private List<Item> items = new ArrayList<>();
	private Observable observable;

	public ConsoleUpdateItem(Observable observable) {
		initComponents();
		this.observable = observable;
		observable.addObserver(this);
		loadAndDisplayItems();
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof ListItems) {
			ListItems listItems = (ListItems) observable;
			this.items = listItems.getListItems();
			loadAndDisplayItems();
		}
	}

	@Override
	public void loadAndDisplayItems() {
		StringBuilder fullnames = new StringBuilder();
		for (Item item : items) {
			fullnames.append(item.getName()).append("\t" + "\t").append(item.getPrice()).append("\t" + "\t")
					.append(item.getQuantity()).append("\n");
		}

		text.setText(fullnames.toString());
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		text = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		modText = new javax.swing.JTextField();
		updateButton = new javax.swing.JButton();
		backButton = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		mName = new javax.swing.JTextField();
		mPrice = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		mQuantity = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(0, 153, 255));

		text.setEditable(false);
		text.setBackground(new java.awt.Color(204, 255, 204));
		text.setColumns(20);
		text.setRows(5);
		jScrollPane1.setViewportView(text);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel1.setText("Nhap ten mon muon thay doi ");

		modText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		modText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				modTextActionPerformed(evt);
			}
		});

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
		jLabel2.setText("Nhap ten moi");

		mName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

		mPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel3.setText("Nhap gia moi");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel4.setText("Nhap so luong moi");

		mQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel5.setText("Ten mon");

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel6.setText("So luong");

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel7.setText("Gia");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel5)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel7).addGap(37, 37, 37).addComponent(jLabel6).addGap(71, 71, 71))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(34, 34, 34)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(mQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(mPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(27, 27, 27).addComponent(backButton))
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34,
										Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(mName, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
										.addComponent(modText).addGroup(layout.createSequentialGroup()
												.addGap(13, 13, 13).addComponent(updateButton)))))
						.addGap(20, 20, 20)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5).addComponent(jLabel7).addComponent(jLabel6))
								.addGap(3, 3, 3)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1)
										.addComponent(modText, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(mPrice, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4).addComponent(mQuantity,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(33, 33, 33)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(updateButton).addComponent(backButton))
								.addGap(21, 21, 21)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButtonActionPerformed
		String srcName = modText.getText();
		String modName = mName.getText();
		String modPrice = mPrice.getText();
		String modQuantity = mQuantity.getText();

		// Kiem tra nguoi dung nhap du thong tin chua
		if (srcName.isEmpty() || modName.isEmpty() || modPrice.isEmpty() || modQuantity.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui long dien day du cac thong tin");
			return;
		}

		// Kiem tra xem gia hop le khong
		try {
			Double.parseDouble(modPrice);
			if (modPrice.isEmpty() || Double.parseDouble(modPrice) <= 0) {
				JOptionPane.showMessageDialog(this, "Vui long nhap gia phu hop!");
				return;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Vui long nhap gia phu hop!");
			modText.setText("");
			mName.setText("");
			mPrice.setText("");
			mQuantity.setText("");
			return;
		}

		// Kiem tra xem so luong co hop le khong
		try {
			Integer.parseInt(modQuantity);
			if (modQuantity.isEmpty() || Integer.parseInt(modQuantity) <= 0) {
				JOptionPane.showMessageDialog(this, "Vui long nhap so luong phu hop!");
				return;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Vui long nhap so luong phu hop!");
			modText.setText("");
			mName.setText("");
			mPrice.setText("");
			mQuantity.setText("");
			return;
		}

		boolean canUpdate = false;
		for (int i = 0; i < items.size(); i++) {
			if (srcName.equalsIgnoreCase(items.get(i).getName())) {
				if (observable instanceof ListItems) {
					ListItems listItems = (ListItems) observable;
					if (listItems.hasItemInList(modName,i)) {
						canUpdate = true;
						JOptionPane.showMessageDialog(this, "Mon an muon cap nhat da ton tai!");
					}
					else {
						Item newItem = new Item(modName, Double.parseDouble(modPrice), Integer.parseInt(modQuantity));	
						UpdateItem updateItem = new UpdateItem(newItem);
						updateItem.setIndexToUpdate(i);
						updateItem.updateItem();
						canUpdate = true;
						JOptionPane.showMessageDialog(this, "Mon an da duoc cap nhat");
						listItems.updateData();
					}				
				}	
				break;
			}
		}
		if (!canUpdate) {
			JOptionPane.showMessageDialog(this, "Khong tim thay mon an muon cap nhat!");
		}

		modText.setText("");
		mName.setText("");
		mPrice.setText("");
		mQuantity.setText("");

		

	}// GEN-LAST:event_updateButtonActionPerformed

	private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButtonActionPerformed
		ItemManagement im = new ItemManagement();
		im.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_backButtonActionPerformed

	private void modTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_modTextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_modTextActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton backButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField mName;
	private javax.swing.JTextField mPrice;
	private javax.swing.JTextField mQuantity;
	private javax.swing.JTextField modText;
	private javax.swing.JTextArea text;
	private javax.swing.JButton updateButton;
	// End of variables declaration//GEN-END:variables

}
