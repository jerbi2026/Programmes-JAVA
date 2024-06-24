package Restaurant;

import java.time.LocalDate;

public class disoponibility {
	private boolean dispo=false;
	private LocalDate date;
	
	
	public disoponibility(boolean dispo, LocalDate dateEmp) {
		super();
		this.dispo = false;
		this.date = dateEmp;
		
	}

	public disoponibility() {
		super();
		this.dispo=false;
		this.date=LocalDate.now();
		
		
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public LocalDate getDateEmp() {
		return date;
	}

	public void setDateEmp(LocalDate dateEmp) {
		this.date = dateEmp;
	}

	@Override
	public String toString() {
		return "disoponibility [dispo=" + dispo + ", date=" + date + "]";
	}

	
	
}
