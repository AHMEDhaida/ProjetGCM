package mr.projet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Bateaux {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message="pa_N name is required")
	private String pa_N;
	@NotNull(message="pa_N name is required")
	private String appartennant;
	@NotNull(message="nom_cp name is required")
	private String nom_cp;
	@NotNull(message="n_cin name is required")
	private int n_cin;
	@NotNull(message="v_licence name is required")
	private String v_licence;
	
	private String equipage;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPa_N() {
		return pa_N;
	}
	public void setPa_N(String pa_N) {
		this.pa_N = pa_N;
	}
	public String getAppartennant() {
		return appartennant;
	}
	public void setAppartennant(String appartennant) {
		this.appartennant = appartennant;
	}
	public String getNom_cp() {
		return nom_cp;
	}
	public void setNom_cp(String nom_cp) {
		this.nom_cp = nom_cp;
	}
	public int getN_cin() {
		return n_cin;
	}
	public void setN_cin(int n_cin) {
		this.n_cin = n_cin;
	}
	public String getV_licence() {
		return v_licence;
	}
	public void setV_licence(String v_licence) {
		this.v_licence = v_licence;
	}
	public String getEquipage() {
		return equipage;
	}
	public void setEquipage(String equipage) {
		this.equipage = equipage;
	}
	
	
	
	

}
