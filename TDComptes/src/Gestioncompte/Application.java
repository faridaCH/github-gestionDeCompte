package Gestioncompte;

public class Application {

	public static void main(String[] args) {
		
//	test des methodes et des classes 
		
try {
	Compte cp1= new CompteCourant(1,8000,5000);
	Compte cp2= new CompteEpaegne(2, 30000,5.5);
	cp1.Verser(50000);
	cp1.retirer(3000);
	cp1.virement(400, cp2);
	System.out.println("Solde de compte cp1= "+cp1.consulterSolde());
	System.out.println("Solde de compte cp2= "+cp2.consulterSolde());
	System.out.println("total versement de cp1 : "+ cp1.totalVersement());
	System.out.println("total retrait de cp1  : "+ cp1.totalretrait());
	cp1.Verser(50000);
	cp1.retirer(3000);
	cp1.virement(400, cp2);
	
	System.out.println("Solde de compte cp1= "+cp1.consulterSolde());
	System.out.println("Solde de compte cp2= "+cp2.consulterSolde());
	System.out.println("total versement de cp1 : "+ cp1.totalVersement());
	System.out.println("total retrait de cp1  : "+ cp1.totalretrait());
	cp1.toStringOperation();
	System.out.println("total versement de cp1 : "+ cp1.totalVersement());
	System.out.println("total retrait de cp1  : "+ cp1.totalretrait());
	System.out.println("Solde de compte cp1= "+cp1.consulterSolde());
	
//	cp1.retirer(8000000);
	System.out.println(" metre à jours le solde de compte");
	System.out.println("Solde de compte cp1= "+cp1.consulterSolde());
	System.out.println("Solde de compte cp2= "+cp2.consulterSolde());
	cp1.updateSolde();
	cp2.updateSolde();
	System.out.println("Solde de compte cp1= "+cp1.consulterSolde());
	System.out.println("Solde de compte cp2= "+cp2.consulterSolde());
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
}

	}

}
