import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c2);
        System.out.println(c1 == c2);

        Cancion c3 = new Cancion("hola", "alonso");
        Cancion c4 = c3;
        System.out.println(c4 == c3);
        System.out.println(c3);
        System.out.println(c3.equals(c4));

        Pelicula p1 = new Pelicula("Titanic", 1997);
        Pelicula p2 = new Pelicula("Titanic", 1997);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Cancion c7 = new Cancion("Adios", "alonsito");
        Cancion c8 = c7;
        System.out.println((c7 == c8));
        c8.setTitutlo("Que tal");
        System.out.println(c7);

        Pelicula p3 = null;
        System.out.println(p3);


    }
}
