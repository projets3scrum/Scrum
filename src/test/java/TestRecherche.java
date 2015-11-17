import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecherche {

	@Test
	public void test1(){
		int tab[]={1,2,3,5,6,8};
			assertTrue(Recherche.rechercheDansTableau(tab,1)==true);
	}
	
	@Test
	public void test2(){
		int tab[]={1,2,3,5,6,8};
			assertTrue(Recherche.rechercheDansTableau(tab,10));
	}
	
	@Test
	public void test3(){
		int tab[]={1,2,3,5,6,8};
			assertTrue(Recherche.rechercheDansTableau(tab,6));
	}
	
	
	public static void main(String[] args) {
	}

}