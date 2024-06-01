package view;

import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JTable;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
	/**
	 * 
	 */
	//private JTable curentTable;
	public void setCurentTable(JTable table) {
		//this.curentTable = table;
	}
	private static final long serialVersionUID = 1L;

	public MyFrame() {
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
            	//getComponentAt(getMousePosition())
            }

            @Override
            public void windowClosed(WindowEvent e) {
            	//JOptionPane.showMessageDialog(null,getTitle());
            	
            }
        });
    }
}
