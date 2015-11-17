import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecherche {

	@Test
	public void testNbPair(){
		int tab[]={1,2,3,5,6,8};
			assertTrue(Recherche.rechercheDansTableau(tab,1));
	}
	
	@Test
	public void testNbPair2(){
		int tab[]={1,2,3,5,6,8};
			assertTrue(Recherche.rechercheDansTableau(tab,10));
	}
	
	
	public void testNbPairDébut(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,1));
	}
	
	@Test
	public void testNbPairDébut2(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,0));
	}
	
	
	@Test
	public void testRechercheDernierePosNbPaire(){
		int tab[]={1,2,3,5,6,8};
			assertTrue(Recherche.rechercheDansTableau(tab,8));
	}
	
	@Test
	public void testRechercheDernierePosNbPaire2(){
		int tab[]={1,2,3,5,6,8};
			assertTrue(Recherche.rechercheDansTableau(tab,9));
	}
	
	
	
	
	@Test
	public void testNbImpair(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,6));
	}
	
	@Test
	public void testNbImpair2(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,4));
	}
	
	@Test
	public void testNbImpairDébut(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,1));
	}
	
	@Test
	public void testNbImpairDébut2(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,0));
	}
	
	
	@Test
	public void testRechercheDernierePosBNbImpair(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,9));
	}
	
	@Test
	public void testRechercheDernierePosNbImpair2(){
		int tab[]={1,2,3,5,6,8,9};
			assertTrue(Recherche.rechercheDansTableau(tab,10));
	}
	
	public static void main(String[] args) {
	}

}