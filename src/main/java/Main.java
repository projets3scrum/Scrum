import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		int tabEx[] = {1,63,15,9,-11,11,14,0,5} ; 
		Tri.triInsertionTableau(tabEx); 
		Recherche.rechercheDansTableau(tabEx, 9);
		Recherche.rechercheDansTableau(tabEx, 17);
		Recherche.rechercheDansTableau(tabEx, -5);	
	}

}


