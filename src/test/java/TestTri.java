import org.junit.Test;


public class TestTri {

	@Test
	public void test1Valeur(){
		int[] tab1={500};
		int[] resultatAttendu={500};
		Tri.triInsertionTableau(tab1);
		if(tab1[0]==resultatAttendu[0])
			System.out.println("Test 1 Valeur réussi");
	}
	
	@Test
	public void testTableauVide(){
		int[] tab2={};
		Tri.triInsertionTableau(tab2);
		if(tab2.length==0)
			System.out.println("Test 2 Tableau Vide réussi");
	}
	
	@Test
	public void testValeurNegative(){
		int[] tab3={-45642,-415638,-12348};
		int[] resultatAttendu={-415638, -45642, -12348};
		Tri.triInsertionTableau(tab3);
		boolean flag=true;
		for(int i=0; i<tab3.length; i++){
			if(tab3[i]!=resultatAttendu[i])
				flag=false;
		}
		if(flag)
			System.out.println("Test 3 Valeurs négatives réussi");
	}
	
	@Test
	public void testPlusieursValeursIdentiques(){
		int[] tab4={5,5,1,2,4,2,3,4,3,3,4,4};
		int[] resultatAttendu={1,2,2,3,3,3,4,4,4,4,5,5};
		Tri.triInsertionTableau(tab4);
		boolean flag=true;
		for(int i=0; i<tab4.length; i++){
			if(tab4[i]!=resultatAttendu[i])
				flag=false;
		}
		if(flag)
			System.out.println("Test 4 Valeurs identiques réussi");
	}
	
	public void afficherTab(int[] tab){
		System.out.print("|");
		for(int i=0; i<tab.length; i++){
			System.out.print(tab[i]+"|");
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
