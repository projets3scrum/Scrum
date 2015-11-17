public class Recherche{
		
	public static boolean rechercheDansTableau(int tab[], int val)
	{
		  boolean trouve;  
		  int debut;
		  int fin;
		  int milieu;
		  
		  trouve = false; 
		  debut = 0;
		  fin = tab.length; 
		  
		
		  while(!trouve && ((fin - debut) > 1)){
	
			  milieu = (debut + fin)/2; 
		    
		    trouve = (tab[milieu] == val); 
		    if(tab[milieu] > val) fin = milieu;
		    else debut = milieu; 
		    }
		  
		  if(tab[debut] == val) {
			  System.out.println("La valeur " + val + " a été trouvée.");
			  return true;
		  }
		  else {
			  System.out.println("La valeur " + val + " n'a pas été trouvée.");
			  return false;
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
}