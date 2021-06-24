package Gestioncompte;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;


public abstract class Compte {

	private int code;
	private double solde;
	private List<Operation> ensembleOperation = new ArrayList();

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(int compte, double solde) {
		super();
		this.code = compte;
		this.solde = solde;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int compte) {
		this.code = compte;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Operation> getEnsembleOperation() {
		return ensembleOperation;
	}

	public void setEnsembleOperation(List<Operation> ensembleOperation) {
		this.ensembleOperation = ensembleOperation;
	}

	public void Verser(double montant) {

		// creation de versement et serialisation de versement pour garder un historique

		Versement v = new Versement(ensembleOperation.size() + 1, LocalDateTime.now(), montant);
		ensembleOperation.add(v);
		this.solde += montant;
	}

	public abstract void retirer(double montant);

	public void virement(double montant, Compte cp2) {
		this.retirer(montant);
		cp2.Verser(montant);
	}

	public double consulterSolde() {
		return this.getSolde();

	}

	public abstract void updateSolde();

	public double totalVersement() {
		double somme = 0;
		for (Operation o : ensembleOperation) {
			if (o instanceof Versement) {
				somme += o.getMontantOperation();
			}
		}
		return somme;
	}

	public double totalretrait() {
		double somme = 0;
		for (Operation o : ensembleOperation) {
			if (o instanceof Retrait) {
				somme += o.getMontantOperation();
			}
		}
		return somme;
	}

	public void toStringOperation() {
		for (Operation o : ensembleOperation) {
			System.out.println(
					o.getNumeroOperation()+ " <--> " + o.getClass().getSimpleName() + " <--> " + o.getDateOperation() + " <--> " + o.getMontantOperation());

		}
	}
}
