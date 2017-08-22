package gui;




import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;

public class MainWindowViewBase {

	protected Shell shell;
	protected Composite pnlBody;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindowViewBase window = new MainWindowViewBase();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() 
	{
		{
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		//TODO
			{
			Composite pnlBody = new Composite(shell,SWT.None);
			pnlBody.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,1,1));
			
			}
		//TODO fdsgsdg
			
		}

	}
}
