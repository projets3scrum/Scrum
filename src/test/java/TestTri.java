import org.junit.Test;


public class TestTri {
<<<<<<< HEAD
	
	@Test
	public static void testTri1(){
		int[] tab5={2,5,6,4,8};
		Tri.triInsertionTableau(tab5);
	}
	
	public static void main(String[] args){
=======

	@Test
	public void test1Valeur(){
>>>>>>> eba7427065b4b0a7fe633dac808b697c334a8ed3
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
<<<<<<< HEAD
		
		testTri1();
		
=======
>>>>>>> eba7427065b4b0a7fe633dac808b697c334a8ed3
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
