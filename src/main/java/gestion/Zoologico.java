package gestion;

impor java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion =ubicacion;
    }

    public Zoologico() {
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
        zona.setZoo(this);
    }

    public int cantidadTotalAnimales() {
        int totalAnimales = 0
        for (Zona zona: zonas) {
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUbicacion (String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return ubicacion;
    }

    public String toString() {
        return nombre;
    }
}