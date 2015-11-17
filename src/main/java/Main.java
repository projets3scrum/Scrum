import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		int tabEx[] = {1,63,15,9,-11,11,14,0,5} ; 
		int str ;
		String sortie ; 
		Tri.triInsertionTableau(tabEx); 
		do
		{	Scanner sc = new Scanner(System.in);
			System.out.println("Saisir le nombre que vous recherchez : \n");
			str = sc.nextInt();
			Recherche.rechercheDansTableau(tabEx, str ) ;
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Vouler vous partir ? O/N \n");
			sortie = sc2.nextLine();
			
			
		}while (!sortie.equals("o")&&!sortie.equals("O")); 
		
	}

}


