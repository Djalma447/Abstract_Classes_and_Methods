package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (anualIncome < 20000.0) {
			return anualIncome * 0.15 - healthExpenditures * 0.50;
		}
		else {
			return anualIncome * 0.25 - healthExpenditures * 0.50;
		}
	}
}
