package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public Ave() {
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return Ave.listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.listado.add(halcon);
		Ave.halcones++;
		Animal.setTotalAnimales();
		return halcon;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.listado.add(aguila);
		Ave.aguilas++;
		Animal.setTotalAnimales();
		return aguila;
	}
	public static int getHalcones() {
		return halcones;
	}
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	public static int getAguilas() {
		return aguilas;
	}
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public ArrayList<Ave> getListado() {
		return Ave.listado;
	}
	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
}