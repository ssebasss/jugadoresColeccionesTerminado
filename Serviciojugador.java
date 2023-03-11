import java.util.*;
import java.util.stream.Collector;

public class Serviciojugador {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador() {
        Jugador p1 = new Jugador();

        System.out.println("ingrese nombre");
        p1.setNombre(sc.next());
        System.out.println("ingrese edad");
        p1.setEdad(sc.nextInt());
        System.out.println("ingrese altura");
        p1.setAltura(sc.nextDouble());
        System.out.println("ingrese peso");
        p1.setPeso(sc.nextDouble());
        System.out.println("ingrese nacionalidad");
        p1.setNacionalidad(sc.next());
        return p1;
    }

    //                  CREO LISTA DE JUGADORES


    public ArrayList<Jugador> crearListaJugadores() {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        do {
            System.out.println("Ingrese  los atributos del jugador a continuacion: ");
            System.out.println("");
            listaJugadores.add(crearJugador());
            System.out.println("Desea ingresar otro jugador?\n");
        } while (sc.next().equalsIgnoreCase("si") ? true : false);

        System.out.println("el equipo es:  ");
        mostrarLista(listaJugadores);
        return listaJugadores;
    }

    //                  MUESTRO JUGADORES DE LISTA

    private void mostrarLista(ArrayList<Jugador> listaJugadores) {
        for (Jugador x: listaJugadores
             ) {
            System.out.println(x);
        }
        }


    //                  ELIMINAR JUGADORES DE LISTA

    public ArrayList<Jugador> eliminarJugador(ArrayList<Jugador> listaJugadores) {
        System.out.println("pone nombre");
        boolean encontro;
        String queVasAEliminar=sc.next();
        Iterator<Jugador> it = listaJugadores.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(queVasAEliminar)) {
                it.remove();
                encontro=true;
            }
            if (encontro=false){
                System.out.println("no se encontro el nombre proporcionado");
            }
        }
        mostrarLista(listaJugadores);
        return listaJugadores;
    }


    //                  Ordena la lista alfabeticamente según nacionalidad.*/

        public ArrayList<Jugador> nacionalidadAlfabeto(ArrayList<Jugador> listaJugadores){
        listaJugadores.sort(Comparator.comparing(Jugador::getNacionalidad));
        mostrarLista(listaJugadores);
        return listaJugadores;
}

//                  Ordena la lista alfabeticamente según nombre de jugador.*/

    public ArrayList <Jugador> nombreAlfatbetico(ArrayList<Jugador> listaJugadores){
        listaJugadores.sort(Comparator.comparing(Jugador::getNombre));
        mostrarLista(listaJugadores);
        return listaJugadores;
    }


//                  Ordena la lista alfabeticamente según edad del jugador.*/

    public ArrayList <Jugador> nombreAlfatbeticoPeroalReves(ArrayList<Jugador> listaJugadores){
        listaJugadores.sort(Comparator.comparing(Jugador::getNombre).reversed());
                mostrarLista(listaJugadores);
        return listaJugadores;
    }

}