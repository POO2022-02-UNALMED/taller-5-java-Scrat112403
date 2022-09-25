package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}

	public Animal() {}
	
	public String movimiento() {
		return "desplazarse";
	}

    public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

    public static void setTotalAnimales() {
		Animal.totalAnimales++;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

    public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

    public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

    public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}


	public void setZona(Zona Zona) {
		zona.add(Zona);
	}
	
	public static String totalPorTipo() {
		int mamiferos = Mamifero.cantidadMamiferos();
		int aves = Ave.cantidadAves();
		int reptiles = Reptil.cantidadReptiles();
		int peces = Pez.cantidadPeces();
		int anfibios = Anfibio.cantidadAnfibios();
		return "Mamiferos: " + mamiferos+ "\nAves: " + aves+ "\nReptiles: " + reptiles+ "\nPeces: " + peces+ "\nAnfibios: " + anfibios;
	}

	@Override
	public String toString() {
		if(zona.size() == 1) {	
			return "Mi nombre es "+getNombre()+ ", tengo una edad de "+getEdad()+ ", habito en "+getHabitat()+ " y mi genero es "+getGenero()+ ", la zona en la que me ubico es "+zona.get(0)+ ", en el "+zona.get(0).getZoo();
		}
        else {
			return "Mi nombre es "+getNombre()+ ", tengo una edad de "+getEdad()+ ", habito en "+getHabitat()+ " y mi genero es "+getGenero();
		}
	}
	
	
}