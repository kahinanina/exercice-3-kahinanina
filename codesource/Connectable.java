package Exo3;

import java.awt.List;
import java.util.ArrayList;

public abstract class Connectable {
	
	public static String description;
	
	public static String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		Connectable.description = description;
	}

	ArrayList<Observer> observers=new ArrayList<Observer>();
	
	 public void add(Observer observateur) {
		 observers.add(observateur);
	 }

	  public void retire(Observer observateur)
	  {
	    observers.remove(observateur);
	  }

	  public void notifie()
	  {
	    for (Observer observateur: observers)
	      observateur.demarer();
	  }


	
}
