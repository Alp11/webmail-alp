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
@Table(name="melRecu")
public class MelRecu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="IdRec")
	private int IdRec;
	@Column(name="Expediteur")
	private String[] Expediteur;
	@Column(name="SujetRec")
	private String[] SujetRec;
	@Column(name="TextRec")
	private String[] TextRec;
	@Column(name="PieceJointeRec")
	private byte[] PieceJointeRec;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdRec() {
		return IdRec;
	}
	public void setIdRec(int idRec) {
		IdRec = idRec;
	}
	public String[] getExpediteur() {
		return Expediteur;
	}
	public void setExpediteur(String[] expediteur) {
		Expediteur = expediteur;
	}
	public String[] getSujetRec() {
		return SujetRec;
	}
	public void setSujetRec(String[] sujetRec) {
		SujetRec = sujetRec;
	}
	public String[] getTextRec() {
		return TextRec;
	}
	public void setTextRec(String[] textRec) {
		TextRec = textRec;
	}
	public byte[] getPieceJointeRec() {
		return PieceJointeRec;
	}
	public void setPieceJointeRec(byte[] pieceJointeRec) {
		PieceJointeRec = pieceJointeRec;
	}

	
	
	
}
