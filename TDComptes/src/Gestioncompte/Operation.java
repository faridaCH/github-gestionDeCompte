package Gestioncompte;

import java.time.LocalDateTime;
import java.util.Date;

public class Operation {
	
	private int numeroOperation;
	private LocalDateTime  dateOperation;
private double  montantOperation;


public Operation() {
	super();
	// TODO Auto-generated constructor stub
}


public Operation(int numeroOperation, LocalDateTime dateOperation, double montantOperation) {
	super();
	this.numeroOperation = numeroOperation;
	this.dateOperation = dateOperation;
	this.montantOperation = montantOperation;
}


public int getNumeroOperation() {
	return numeroOperation;
}


public void setNumeroOperation(int numeroOperation) {
	this.numeroOperation = numeroOperation;
}


public LocalDateTime getDateOperation() {
	return dateOperation;
}


public void setDateOperation(LocalDateTime dateOperation) {
	this.dateOperation = dateOperation;
}


public double getMontantOperation() {
	return montantOperation;
}


public void setMontantOperation(double montantOperation) {
	this.montantOperation = montantOperation;
}


}
