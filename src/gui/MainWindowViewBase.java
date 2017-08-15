package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;


public class MainWindowViewBase{

	private JFrame frmWindowFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			public void run() {
				try {
					MainWindowViewBase window = new MainWindowViewBase();
					window.frmWindowFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindowViewBase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		{
			
			frmWindowFrame = new JFrame();
			frmWindowFrame.setBounds(100, 100, 450, 300);
			frmWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			{
				JPanel pnlBody = new JPanel();
				frmWindowFrame.getContentPane().add(pnlBody, BorderLayout.CENTER);
				pnlBody.setLayout(new GridLayout(2, 0, 0, 0));
			}
			
		}
		
	}

}
