
package Laboratorio03;

/**
 *
 * @author jaime
 */
public class Laboratorio03 {
    
    public static void main(String[] args) {
        Entrenador dede = new Entrenador ("Damian", "Tenis");
    dede.getNombre();
    dede.getTipo();
    System.out.println("Id: " +Entrenador.contadorEntrenadores+"\tNombre: " +dede.getNombre()+"\tTipo: "+dede.getTipo());
    
    Entrenador dede1 =new Entrenador ("Joel", "Futbol");      
     dede1.getNombre();
     dede1.getTipo();
     System.out.println("Id: " +Entrenador.contadorEntrenadores+"\tNombre: " +dede1.getNombre()+"\tTipo: "+dede1.getTipo());
        
   Entrenador dede2 = new Entrenador ("Jose","Voley");
   dede2.getNombre();
   dede2.getTipo();
   System.out.println("Id: " +Entrenador.contadorEntrenadores+"\tNombre: " +dede2.getNombre()+"\tTipo: "+dede2.getTipo());
    
    Entrenador dede3 = new Entrenador ("Raul","Basquet");
    dede3.getNombre();
    dede3.getTipo();
    System.out.println("Id: " +Entrenador.contadorEntrenadores+"\tNombre: " +dede3.getNombre()+"\tTipo: "+dede3.getTipo());
    
    Entrenador dede4 = new Entrenador ("Marco","Natacion");
    dede4.getNombre();
    dede4.getTipo();
    System.out.println("Id: " +Entrenador.contadorEntrenadores+"\tNombre: " +dede4.getNombre()+"\tTipo: "+dede4.getTipo());
    
    
    System.out.println("");
    }
    
    
    
}
