/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zieditor;

/**
 *
 * @author zivoo
 */
import java.awt.Desktop;
    import javax.swing.*;
import java.io.*;
import java.nio.file.*;
public class Actions {
	public void saving() {
            Path source=FileSystems.getDefault().getPath("/");
            String home = System.getProperty("user.home");
	}
	public void open(String texts) {
            /**try{
          String path = System.getProperty("user.dir");
          
            }
            catch(IOException se){
               System.out.println("Error" + se.toString()); 
            }**/
             Desktop desktop = null;
    // on Windows, retrieve the path of the "Program Files" folder
    File file = new File(System.getenv("programfiles"));

    try {
      if (Desktop.isDesktopSupported()) {
         desktop = Desktop.getDesktop();
         desktop.open(file);
      }
      else {
         System.out.println("desktop is not supported");
      }
    }
    catch (IOException e){  }
        
        }
	
        public void saveAs(String text) throws IOException
        {
            try{
            String name=JOptionPane.showInputDialog("enter name","new.text");
            
                try (FileWriter file = new FileWriter(name); BufferedWriter bw = new BufferedWriter(file)) {
                    bw.write(text);
                    bw.close();
                    
                }
            }
            catch(IOException|SecurityException se)
            {
                System.out.println("Error" + se.toString());
            }
        }

}
    

