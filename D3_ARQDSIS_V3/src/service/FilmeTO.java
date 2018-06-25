package service;

import java.util.ArrayList;

import models.Idioma;

public class FilmeTO {
	private int id;
	private String nome;
	private String genero;
	private ArrayList<Idioma> idioma;
	private String idioma2 = "Bossini FDP";
	private String idioma3[];
	private ArrayList<String> idioma4;
	
	public FilmeTO(int id, String nome, String genero, ArrayList<Idioma> idioma) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.idioma = idioma;
	}
	
	public FilmeTO() {
		this.idioma = new ArrayList<Idioma>();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Idioma> getIdioma() {
		return idioma;
	}
	
	public void setIdioma(ArrayList<Idioma> idioma) {
		this.idioma = idioma;
	}
	
	public void setIdioma2(String idioma){
		idioma2=idioma;
	}
	
	public String getIdioma2(){
		return idioma2;
	}
	
	public void setIdioma3(String idioma3){

	}
	
	public void setIdioma4(String idioma){
		idioma4.add(idioma);
	}
	
	public void setIdioma5(){
		idioma4.add("Rola");
	}
	
}