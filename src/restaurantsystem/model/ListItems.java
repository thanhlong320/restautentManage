package restaurantsystem.model;

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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import restaurantsystem.model.Employee;
import restaurantsystem.model.Item;


public class ListItems extends Observable{

	public ListItems() {	
	}
	
	public void updateData() {
		setChanged();
		notifyObservers();
	}
	
	public List<Item> getListItems() {
        List<Item> items = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/item.txt"))) {
            while (scanner.hasNextLine()) {
                String itemLine = scanner.nextLine();
                String itemInfo[] = itemLine.split(",");               
                Item item = new Item(itemInfo[0], Double.parseDouble(itemInfo[1]),
                        Integer.parseInt(itemInfo[2]));
                items.add(item);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListItems.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
	
	public Item getItemByIndex(int index) {
	    List<Item> listOfItem = getListItems();
	    if (listOfItem.size() >= index) {
	        return listOfItem.get(index - 1);
	    }
	    return null;
	}
	
	
	
	public void addItem(Item item) {
		  try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/item.txt", true))) {
		      pw.println(item.getName() + "," + item.getPrice() + "," + item.getQuantity());
		  } catch (FileNotFoundException ex) {
		      Logger.getLogger(ListItems.class.getName()).log(Level.SEVERE, null, ex);
		  }
	}
	
	
	public void deleteItem(Item item) {

		List<Item> itemList = getListItems();

		int indexToBeDeleted = -1;
      // Tim vi tri mon an bi xoa
		for (int i = 0; i < itemList.size(); i++) {
			Item itemFromList = itemList.get(i);

			if (itemFromList.getName().equalsIgnoreCase(item.getName())) {
				indexToBeDeleted = i;
			}
		}

		itemList.remove(indexToBeDeleted);

		try {
          // Xoa file item.txt
			Files.delete(Paths.get("storage/item.txt"));
		} catch (IOException ex) {
			Logger.getLogger(ListItems.class.getName()).log(Level.SEVERE, null, ex);
		}

		// Tao file item.txt moi, ghi lai du lieu 
		try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/item.txt"))) {	
			for (Item i : itemList) {
				pw.println(i.getName() + "," + i.getPrice() + "," + i.getQuantity());
			}	
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ListItems.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public boolean hasItemInList(String name, int exceptIndex) {
		 List<Item> listOfItem = getListItems();
		 for (int i = 0; i < listOfItem.size(); i++) {
			 if (name.equalsIgnoreCase(listOfItem.get(i).getName())) {
				 if (i != exceptIndex) {
					 return true;
				}	
			}
		}
		 return false;
	}
}
