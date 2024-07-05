package gestionChoferes;

import java.util.ArrayList;
import java.util.List;

public class GestorDeChoferes {

    private List<Chofer> choferes;

    public GestorDeChoferes() {
        this.choferes = new ArrayList<>();
        // array de lista de choferes con sus placas
        choferes.add(new Chofer("Oscar Alberto Vargas Peña", "BRU-236"));
        choferes.add(new Chofer("Luis Enrique Castillo Moreno", "XZT-482"));
        choferes.add(new Chofer("Mario Enrique Pérez López", "GHY-756"));
        choferes.add(new Chofer("Andrés Felipe Torres Castillo", "QWE-134"));
        choferes.add(new Chofer("Roberto Carlos Menéndez Rojas", "RTF-850"));
        choferes.add(new Chofer("Juan Pablo Valdez Morales", "LOP-679"));
        choferes.add(new Chofer("Santiago Alberto Luna Guerrero", "NMB-560"));
        choferes.add(new Chofer("Ricardo José Alvarado Fernández", "KLP-489"));
        choferes.add(new Chofer("Enrique Alfredo Díaz Paredes", "WSD-378"));
        choferes.add(new Chofer("Fernando Gabriel Herrera Pérez", "OIL-952"));

    }

    public List<Chofer> getChoferes() {
        return choferes;
    }

    public String buscarPlacaPorNombre(String nombre) {
        for (Chofer c : choferes) {
            if (c.getNombre().equals(nombre)) {
                return c.getPlaca();
            }
        }
        return null;
    }
}
