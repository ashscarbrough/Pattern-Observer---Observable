//import java.util.ArrayList;
import java.util.*;	// added to include Observable

class Product extends Observable // extends Observable rather than Subject
{
    private String productName;
    private String productType;
    String availability;
    
	public Product(String productName, String productType,String availability)
	{
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability = availability;
	}
	
	/* ************* ArrayList Implementation methods no longer needed ****************
	 * public ArrayList<Observer> getObservers()
	 * {
	 * 	return observers;
	 * }
	 *
	 *
	 * public void setObservers(ArrayList<Observer> observers)
	 * {
	 *	this.observers = observers;
	 * }
	 **********************************************************************************/
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
		setChanged();
		notifyObservers(this.productName);
	}
	
	public String getProductType()
	{
		return productType;
	}
	
	public void setProductType(String productType)
	{
		this.productType = productType;
		setChanged();
		notifyObservers(this.productType);
	}
	
	public String getAvailability()
	{
		return availability;
	}

	public void setAvailability(String availability)
	{
		if(this.availability != availability)
		{
			this.availability = availability;
			setChanged();
			notifyObservers(this.availability);
		}
	}

	/*public void notifyObservers(String availability)
	{
		System.out.println("***Notifying subscribers when product's availability is changed***");
		notifyObservers();
	}
	*/

	public void registerObserver(Observer observer)
	{
		addObserver(observer);
	}

	public void removeObserver(Observer observer)
	{
		 deleteObserver(observer);
	}

}