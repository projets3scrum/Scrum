import org.junit.Test;


public class TestTri {
	
	@Test
	public static void testTri1(){
		int[] tab5={2,5,6,4,8};
		Tri.triInsertionTableau(tab5);
	}
	
	public static void main(String[] args){
		int[] tab1={500};
		int[] tab2={-500};
		int[] tab3={-45642,-415638,-12348};
		int[] tab4={1,2,2,3,3,3,4,4,4,4};
		
		System.out.print("Premier tri");
		Tri.triInsertionTableau(tab1);
		
		System.out.print("Deuxieme tri");
		Tri.triInsertionTableau(tab2);
		
		System.out.print("Troisieme tri");
		Tri.triInsertionTableau(tab3);
		
		System.out.print("Quatrieme tri");
		Tri.triInsertionTableau(tab4);
		
		testTri1();
		
	}
	
	public void afficherTab(int[] tab){
		System.out.print("|");
		for(int i=0; i<tab.length; i++){
			System.out.print(tab[i]+"|");
		}
		System.out.println();
	}
}
