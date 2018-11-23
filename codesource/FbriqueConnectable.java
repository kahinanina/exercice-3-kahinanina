package Exo3;

public class FbriqueConnectable {
	
	Class classeEffective;
	
	public Connectable creer(String nomClasse) throws InstantiationException, IllegalAccessException {
		
		Connectable c=null;
		try {
			
			 classeEffective =Class.forName("Exo3."+nomClasse);
           c=(Connectable) classeEffective.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}

}
