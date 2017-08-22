package test;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public abstract class PravaWindowDesigner{

	protected Shell shell;
	protected Composite pnlBody;
	protected Text textZko;
	
	public PravaWindowDesigner(){
		super();
		shell = new Shell();
		pnlBody = new Composite(shell,SWT.None);
		
		textZko = new Text(shell, SWT.BORDER);
		textZko.setBounds(92, 61, 76, 21);
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
