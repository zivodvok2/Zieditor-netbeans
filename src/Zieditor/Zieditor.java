/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zieditor;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.event.*;
public class Zieditor extends JFrame implements ActionListener{
	
	/**
	 * @param args
	 */
	//JPanel pane=new JPanel();
	Actions act=new Actions();
	
	JToolBar tool=new JToolBar();
	
	//ImageIcon saveIcon = new ImageIcon("/images/icons8-save-24.png");
	
	JButton save=new JButton("save");
	
	
	
	JButton save_as=new JButton("save_as");
	JButton open=new JButton("open");
	JTextArea edit=new JTextArea();
	
	JScrollPane scroll=new JScrollPane(edit);
	
	 public Zieditor(){
	        super("Zieditor");
	        
	        BorderLayout bord=new BorderLayout();
	        tool.add(save);
	        tool.addSeparator();
	        save.addActionListener(this);
	        
	        tool.add(save_as);
	        tool.addSeparator();
	        
	        tool.add(open);
	        tool.addSeparator();
	        open.addActionListener(this);
	        
	        setLayout(bord);
	        add("North",tool);
	        add("Center",scroll);
	        
	        
	        //pack();
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(500,500);
	        setVisible(true);
	        try {
	            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (Exception e) {
	            // If Nimbus is not available, you can set the GUI to another look and feel.
	        }
	 }
	 
	        public void actionPerformed(ActionEvent evt)
	        {
	        	Object source=evt.getSource();
	        	if(source==save) {
	        		act.saving();
	        	}
	        	if(source==open) {
	        		act.open();
	        	}
	        }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zieditor z=new Zieditor();
	}

}






