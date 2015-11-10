<<<<<<< HEAD


=======
>>>>>>> eba7427065b4b0a7fe633dac808b697c334a8ed3

public class Tri {
	
	public static void triInsertionTableau(int[] tab){ //tri par insertion
		int n=tab.length;
		int j;
		for(int i=1; i<n; i++){
			int flag=tab[i];
			for(j=i; j>0 && tab[j-1]>flag; j--){
				tab[j]=tab[j-1];
			}
			tab[j]=flag;
		}
	}
}
