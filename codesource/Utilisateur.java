package Exo3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilisateur {
	
	 static ArrayList<Connectable> addConnect =new ArrayList<Connectable>();
	
	public static void main(String []args)  {
		 

			String classe="exit";
			boolean arret=false;
			 Radio radio = new Radio();
			   
			   Cafetiere cafetiere =new Cafetiere();
			   Connectable connectable = null;
			
		while(arret==false) {
				
				System.out.println("saisie le nom de la classe ");
				Scanner sc = new Scanner(System.in);
				classe = sc.nextLine();
				if(classe.equals("exit")) {
					arret=true;
				}
				else {
			FbriqueConnectable con=new FbriqueConnectable();
			Connectable connect;
				
			try {
			
				connect = con.creer(classe);
				
				addConnect.add(connect);
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
		}
			
			   
			  	
		System.out.println("si vous voullez activer cliquez oui sinon cliquez non");
		Scanner sc = new Scanner(System.in);
		String reponse = sc.nextLine();	   
			  
		if(reponse.equals("oui")) {	   
			
			   
			
			for(int i=0;i<addConnect.size();i++) {
				String name=addConnect.get(i).getClass().getName();
		
				    if(name.equals("Exo3.Radio")) {
				    	 radio.setDescription("Radio demaré");
				    	
				    	ConcretObserver concret = new ConcretObserver(radio);
					   concret.demarer();
				    	
				    }else if(name.equals("Exo3.Cafetiere")) {
				    	 cafetiere.setDescription("Cafetiere demmaré");
				    
				   
				    ConcretObserver concret = new ConcretObserver(cafetiere);
				    concret.demarer();
				    
				
				    
			}
				 
					}
		}else if(reponse.equals("non")){
			   for(int i=0;i<addConnect.size();i++) {
					String name=addConnect.get(i).getClass().getName();
			
					    if(name.equals("Exo3.Radio")) {
					    	 radio.setDescription("Radio desactiver");
					         ConcretObserver concret = new ConcretObserver(radio);
						 concret.desactiver();
						  System.out.println("Radio supprimé des objets deconnctés");
					    	
					    }else if(name.equals("Exo3.Cafetiere")) {
					    	 cafetiere.setDescription("Cafetiere desactiver");
					         ConcretObserver concret = new ConcretObserver(cafetiere);
					         concret.desactiver();
						 System.out.println("Cafetiere supprimé des objets deconnctés");
					    
					
				}
		  
	
	}

	}
	}
}


