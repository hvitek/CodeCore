package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class MainWindowViewBase{

	private JFrame frmWindowFrame;
	private Composite m_pnlBody;

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
			m_pnlBody = new Composite(this,0);
			
			
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
