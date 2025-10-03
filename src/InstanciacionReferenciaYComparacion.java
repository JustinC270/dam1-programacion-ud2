import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c2);
        System.out.println(c1 == c1);
        Cancion c3 = new Cancion("hola", "alonso");
        Cancion c4 = c3;
        System.out.println(c4 == c3);
        System.out.println(c3);
        System.out.println(c3.equals(c4));
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula();
        
    }
}
