package org.shield.mails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.codec.binary.Base64;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="melEnvoye")
public class MelEnvoye {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="IdEnv")
	private int IdEnv;
	@Column(name="Destinataire")
	private String[] Destinataire;
	@Column(name="SujetEnv")
	private String[] SujetEnv;
	@Column(name="TextEnv")
	private String[] TextEnv;
	@Column(name="PieceJointeEnv")
	private byte[] PieceJointeEnv;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEnv() {
		return IdEnv;
	}
	public void setIdEnv(int idEnv) {
		IdEnv = idEnv;
	}
	public String[] getDestinataire() {
		return Destinataire;
	}
	public void setDestinataire(String[] destinataire) {
		Destinataire = destinataire;
	}
	public String[] getSujetEnv() {
		return SujetEnv;
	}
	public void setSujetEnv(String[] sujetEnv) {
		SujetEnv = sujetEnv;
	}
	public String[] getTextEnv() {
		return TextEnv;
	}
	public void setTextEnv(String[] textEnv) {
		TextEnv = textEnv;
	}
	public byte[] getPieceJointeEnv() {
		return PieceJointeEnv;
	}
	public void setPieceJointeEnv(byte[] pieceJointeEnv) {
		PieceJointeEnv = pieceJointeEnv;
	}
	
	
}
