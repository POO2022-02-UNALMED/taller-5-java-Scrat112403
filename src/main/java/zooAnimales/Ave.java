package zooAnimales;

import java.util.ArrayList;

class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, int colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas= colorPlumas;
        listado.add(this);
    }

    pulic Ave () {
        listado.add(this);
    }

    @Override
    public String movimiento() {
		return "volar";
	}

    public static int cantidadAves() {
        return Ave.listado.size();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		Animal.setTotalAnimales();
		listado.add(halcon);
		return halcon;
	}

    public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		Animal.setTotalAnimales();
		listado.add(aguila);
		return aguila;
	}

    public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

    public static int getHalcones() {
		return halcones;
	}

    public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public static int getAguilas() {
		return aguilas;
	}

    public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public ArrayList<Ave> getListado() {
		return Ave.listado;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
    
	public String getColorPlumas() {
		return colorPlumas;
	}

}