package restaurantsystem.manipulation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import restaurantsystem.model.Item;
import restaurantsystem.model.ListItems;

public class ReduceItemQuantity extends ManipulationItem{
	ListItems listItems;
	Item item;
	int reduceNumber;
	
	public ReduceItemQuantity(Item item) {
		super(item);
		this.item = item;
		listItems = new ListItems();
	}
	
	public int getReduceNumber() {
		return reduceNumber;
	}
	public void setReduceNumber(int reduceNumber) {
		this.reduceNumber = reduceNumber;
	}
	
	public void reduceItemQuantity() {
		List<Item> itemList = listItems.getListItems();

        for (int i = 0; i < itemList.size(); i++) {
            Item itemFromList = itemList.get(i);

            if (itemFromList.getName().equalsIgnoreCase(item.getName())) {
                item.setQuantity(Math.max(0, item.getQuantity() - reduceNumber));
                itemList.set(i, item);
            }
        }

        try {
            Files.delete(Paths.get("storage/item.txt"));
        } catch (IOException ex) {
            Logger.getLogger(ReduceItemQuantity.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/item.txt"))) {
        	for (Item item : itemList) {
        		pw.println(item.getName() + "," + item.getPrice() + "," + item.getQuantity());
			}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReduceItemQuantity.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
}
