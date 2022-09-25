package zooAnimales;

import util.java.ArrayList;

class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAleyas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas= colorEscamas;
        this.cantidadAletas= cantidadAletas;
        listado.add(this);
    }

    public Pez() {
        listado.add(this);
    }

    @Override
    public String movimiento () {
        return "nadar";
    }

    public static int cantidadPeces() {
		return Pez.listado.size();
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.listado.add(salmon);
		Pez.salmones++;
		Animal.setTotalAnimales();
		return salmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.listado.add(bacalao);
		Pez.bacalaos++;
		Animal.setTotalAnimales();
		return bacalao;
	}
	@Override
	public String movimiento() {
		return "nadar";
	}

	public void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public ArrayList<Pez> getListado() {
		return Pez.listado;
	}

    public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

    public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

}