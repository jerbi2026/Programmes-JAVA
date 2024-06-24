package classes;

public class RDV {
	private String date;
	private Patient patient;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public RDV(String date, Patient patient) {
		super();
		this.date = date;
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "RDV [date=" + date + ", patient=" + patient.toString() + "]";
	}
	
	
	

}
