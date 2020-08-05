package restaurantsystem.manipulation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import restaurantsystem.model.Item;
import restaurantsystem.model.ListItems;

public class UpdateItem extends ManipulationItem{
	ListItems listItems;
	int indexToUpdate;
	Item item;
	public UpdateItem(Item item) {
		super(item);
		this.item = item;
		listItems = new ListItems();
	}

	public void updateItem() {
        List<Item> itemList = listItems.getListItems();


        itemList.set(indexToUpdate, item);

        try {
            Files.delete(Paths.get("storage/item.txt"));
        } catch (IOException ex) {
            Logger.getLogger(UpdateItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/item.txt"))) {
            itemList.forEach(item -> {
                pw.println(item.getName() + "," + item.getPrice() + "," + item.getQuantity());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UpdateItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


	public void setIndexToUpdate(int indexToUpdate) {
		this.indexToUpdate = indexToUpdate;
	}
}
