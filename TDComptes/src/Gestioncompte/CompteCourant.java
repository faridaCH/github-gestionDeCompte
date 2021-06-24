package Gestioncompte;

import java.time.LocalDateTime;

public class CompteCourant extends Compte {
	private double  decouvert;
	

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(int code, double solde, double decouvert) {
		super(code, solde);
		this.decouvert=decouvert;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirer(double montant) {
//		gestion de l'exception non controlée  de decouvert autorisé
		
		if( montant > this.getSolde() + this.decouvert) throw new RuntimeException("Solde insuffisant, le somme autorisé est :" +this.getSolde() + this.decouvert);
		
		Retrait r = new Retrait(getEnsembleOperation().size(), LocalDateTime.now(), montant);
	getEnsembleOperation().add(r);
	
	setSolde(getSolde() - montant);
	
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public void updateSolde() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + ", getSolde()=" + getSolde() + 
				 ", consulterSolde()=" + consulterSolde() + ", totalVersement()="
				+ totalVersement() + ", totalretrait()=" + totalretrait() + "]";
	}
	

}
