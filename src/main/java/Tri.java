public class Tri {
	
	public static void triInsertionTableau(int[] tab){ //tri par insertion
		int j;
		for(int i=1; i<tab.length; i++){
			int flag=tab[i];
			for(j=i; j>0 && tab[j-1]>flag; j--){
				tab[j]=tab[j-1];
			}
			tab[j]=flag;
		}
	}
}
