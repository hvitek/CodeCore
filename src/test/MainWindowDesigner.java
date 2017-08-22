package test;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public abstract class MainWindowDesigner extends MainWindow{

	protected Shell shell;
	protected Composite pnlBody;
	
	public MainWindowDesigner(){
		super();
		shell = new Shell();
		pnlBody = new Composite(shell,SWT.None);
		initialize();
	}
	
	protected void initialize(){
		shell.setSize(450, 300);
		shell.setText("Content Simplier");		
		//TODO Composite
		{
			pnlBody.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,1,1));
		
		}	
	}
	
	public abstract void updateData(boolean save) throws Exception;

	public abstract void enableControls() throws Exception;
	
}
