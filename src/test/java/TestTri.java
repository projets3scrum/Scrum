import org.junit.Test;


public class TestTri {

	@Test
	public void test1Valeur(){
		int[] tab1={500};
		Tri.triInsertionTableau(tab1);
	}
	
	@Test
	public void testTableauVide(){
		int[] tab2={};
		Tri.triInsertionTableau(tab2);
	}
	
	@Test
	public void testValeurNegative(){
		int[] tab3={-45642,-415638,-12348};
		Tri.triInsertionTableau(tab3);
	}
	
	@Test
	public void testPlusieursValeursIdentiques(){
		int[] tab4={1,2,2,3,3,3,4,4,4,4};
		Tri.triInsertionTableau(tab4);
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
