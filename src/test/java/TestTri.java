import static org.junit.Assert.*;

import org.junit.Test;


public class TestTri {

	@Test
	public void test1Valeur(){
		int[] tab1={500};
		int[] resultatAttendu={500};
		Tri.triInsertionTableau(tab1);
		assertTrue(tab1[0]==resultatAttendu[0]);
	}
	
	@Test
	public void testTableauVide(){
		int[] tab2={};
		Tri.triInsertionTableau(tab2);
		assertTrue(tab2.length==0);
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
		assertTrue(flag);
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
		assertTrue(flag);
	}
	
	@Test
	public void testPositifNegatif(){
		int[] tab5={-3,5,-9,4,-6,-9,-7,2,-1,0};
		int[] resultatAttendu={-9,-9,-7,-6,-3,-1,0,2,4,5};
		Tri.triInsertionTableau(tab5);
		boolean flag=true;
		for(int i=0; i<tab5.length; i++){
			if(tab5[i]!=resultatAttendu[i])
				flag=false;
		}
		if(flag)
			System.out.println("Test 5 Valeurs positives/négatives réussi");
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
