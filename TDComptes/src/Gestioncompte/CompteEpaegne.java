package Gestioncompte;

import java.time.LocalDateTime;

public class CompteEpaegne  extends Compte{
	private double tauxInteret;
	



	public CompteEpaegne() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public CompteEpaegne(int code, double solde) {
//		super(code, solde);
//		// TODO Auto-generated constructor stub
//	}

	public CompteEpaegne(int code, double solde, double tauxInteret) {
		super(code, solde);
		this.tauxInteret = tauxInteret;
	}

	@Override
	public void retirer(double montant) {
//gestion de l'exception non controlée  de decouvert autorisé
		
		if( montant > this.getSolde()) throw new RuntimeException("Solde insuffisant, le somme autorisé est :" +this.getSolde() );
		
		Retrait r = new Retrait(getEnsembleOperation().size(), LocalDateTime.now(), montant);
	getEnsembleOperation().add(r);
	
	setSolde(getSolde() - montant);
		
	}

	@Override
	public void updateSolde() {
	setSolde(getSolde()*(1+tauxInteret/100));
		
	}

}
