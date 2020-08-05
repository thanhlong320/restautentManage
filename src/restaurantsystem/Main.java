
package restaurantsystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import restaurantsystem.console.accuracy.Login;

public class Main extends JFrame {
	
	
    public static void main(String[] args) {
        
    	//Tao cac file can thiet neu cac file chua ton tai
    	createFile();
        
        Login im = new Login();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setVisible(true);
        im.setLocationRelativeTo(null);
    }
    
    private static void createFile() {
        String fileNames [];
        
        File storage = new File("storage");
        if (!storage.exists()) {
        	storage.mkdirs();
		}
        
  
        fileNames = new String [] {"storage/item.txt",
            "storage/employee.txt",
            "storage/order.txt",
            "storage/orderLine.txt"};
        
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if(!file.exists())
            {  
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
       
    }

}
