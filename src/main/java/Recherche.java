public class Recherche{
	
	
	public int test;
	
	
	
	
	
	public void rechercheDansTableau(int tab[], int n){
		
			int i=0;
			if(n < tab[tab.length/2])
				for(i=0;i<tab.length/2; i++){
				if(tab[i] == n)
					System.out.println("L'occurence " + n + " existe à la position " + i);
				}
			
			if(n > tab[tab.length/2])
				for(i=tab.length/2;i<tab.length; i++){
				if(tab[i] == n)
					System.out.println("L'occurence " + n + " existe à la position " + i);
				}	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}