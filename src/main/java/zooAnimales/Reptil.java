package zooAnimales;

import java.util.ArrayList;

class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        listado.add(this);
    }

    public Reptil () {
        listado.add(this);
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static int cantidadReptiles () {
        return Ave.listado.size();
    }

    public static crearIguana(String nombre, int edad, String genero) {
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas++;
        Animal.setTotalAnimales();
		listado.add(iguana);
		return iguana;
    }

    public static crearSerpiente(String nombre, int edad, String genero) {
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes++;
        Animal.setTotalAnimales();
		listado.add(serpiente);
		return serpiente;
    }

    public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

    public static int getIguanas() {
		return iguanas;
	}

    public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}

	public static int getSerpientes() {
		return serpientes;
	}

    public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public ArrayList<Reptil> getListado() {
		return Reptil.listado;
	}
    
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

    public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public int getLargoCola() {
		return largoCola;
	}

}