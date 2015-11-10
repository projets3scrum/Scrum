public class Recherche{
		

	
	
	
	
	
	public void rechercheDansTableau(int tab[], int val)
	 {
        int milieu;
        int debut=0;
        int fin=tab.length;
        boolean trouve = false;
        while(trouve==false && debut<=fin)
        {
        	  milieu=tab.length/2;
        	  if(tab[milieu]==val)
        		  System.out.println(val + " Trouver");
        	  else if(val >tab[milieu])
        	  {
        		  debut=milieu;
        		  milieu=fin-(milieu/2);
        	  }
        	  else if (val < tab[milieu])
        	  {
        		  fin=milieu;
        		  milieu/=2;
        	  }
        }
    }
	
	
	
	
	
	
	
	
	
	
	
}