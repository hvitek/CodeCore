package widgets;



import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;


public class ButtonEntities extends Button {
	private Class<?> className = null;
	private int id = 0;
	
	protected void checkSubclass() { 
		// Disable the check that prevents subclassing of SWT components 
		} 

	public ButtonEntities(Composite parent, Integer style)
	{
	super(parent,style);
	}
	
	public Class<?> getButtonClass()
	{
		return className;
		
	}
	
	
	public void setButtonClass(Class<?> className)
	{
		this.className = className;
	}
	
	public Integer getButtonId()
	{
		return id;
		
	}
	
	
	public void setButtonId(Integer id)
	{
		this.id = id;
	}
}
