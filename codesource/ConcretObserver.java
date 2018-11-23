package Exo3;

public class ConcretObserver implements Observer {
	 Radio radio;
	 Radiateur radiateur;
	 Cafetiere cafetiere;
	 Connectable connectable;
	  protected String texte = "";

	  public ConcretObserver(Connectable connectable)
	  {
	  this.connectable=connectable;
	  connectable.add(this);
	    metAJourTexte();
	  }

	  protected void metAJourTexte()
	  {
	    texte =  connectable.description ;
	   
	  }

	

	  public void afficher()
	  {
	    System.out.println(texte);
	  }

	@Override
	public void demarer() {
	
		 metAJourTexte();
		    this.afficher();
		
	}

	@Override
	public void desactiver() {
		// TODO Auto-generated method stub
		 metAJourTexte();
		    this.afficher();
		
	}
	


	


}
