package Services;

public class Avis {

	
	private String nom;
	private String email;
	private int noteService;
	private int notePlat;
	Avis(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
		this.noteService = 0;
		this.notePlat = 0;
	}
	public Avis() {
	// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
public void setNom(String nom) {
	this.nom = nom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getNoteService() {
	return noteService;
}
public void setNoteService(int noteService) {
	this.noteService = noteService;
}
public int getNotePlat() {
	return notePlat;
}
public void setNotePlat(int notePlat) {
	this.notePlat = notePlat;
}
@Override
public String toString() {
	return "Avis [nom=" + nom + ", email=" + email + ", noteService=" + noteService + ", notePlat=" + notePlat + "]";
}




}
