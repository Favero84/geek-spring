package com.projeto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RevistaHq implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private int codigo;
	
	private String titulo;
	
	private String subTitulo;
	
	private String personagemPrinc;
	
	private int status;
	
	private String situacao;
	
	private int numeracao;
	
	private String colecaoComp;
	
	private String foto;
	
	private String dataAquis;
	
	private String dataLancam;
	
	private String tipoCapa;
	
	private String editora;
	
	private String marca;
	
	private int numPagina;
	
	private String lido;
	
	private int nivelHist;
	
	private String paraTroca;
	
	private String nacInt;
	
	private String rara;
	
	private String autor;
	
	private int quant;
	
	private String padrao;
	
	private String observ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public String getPersonagemPrinc() {
		return personagemPrinc;
	}

	public void setPersonagemPrinc(String personagemPrinc) {
		this.personagemPrinc = personagemPrinc;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}

	public String getColecaoComp() {
		return colecaoComp;
	}

	public void setColecaoComp(String colecaoComp) {
		this.colecaoComp = colecaoComp;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDataAquis() {
		return dataAquis;
	}

	public void setDataAquis(String dataAquis) {
		this.dataAquis = dataAquis;
	}

	public String getDataLancam() {
		return dataLancam;
	}

	public void setDataLancam(String dataLancam) {
		this.dataLancam = dataLancam;
	}

	public String getTipoCapa() {
		return tipoCapa;
	}

	public void setTipoCapa(String tipoCapa) {
		this.tipoCapa = tipoCapa;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}

	public String getLido() {
		return lido;
	}

	public void setLido(String lido) {
		this.lido = lido;
	}

	public int getNivelHist() {
		return nivelHist;
	}

	public void setNivelHist(int nivelHist) {
		this.nivelHist = nivelHist;
	}

	public String getParaTroca() {
		return paraTroca;
	}

	public void setParaTroca(String paraTroca) {
		this.paraTroca = paraTroca;
	}

	public String getNacInt() {
		return nacInt;
	}

	public void setNacInt(String nacInt) {
		this.nacInt = nacInt;
	}

	public String getRara() {
		return rara;
	}

	public void setRara(String rara) {
		this.rara = rara;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public String getPadrao() {
		return padrao;
	}

	public void setPadrao(String padrao) {
		this.padrao = padrao;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}
}
