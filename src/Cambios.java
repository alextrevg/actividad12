import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cambios {
    public static class cambios{
    HashMap<String, String> map = new HashMap <> ();
    String nombre;
    String telefono;
    Scanner keyboard = new Scanner(System.in);

        public void list(){

            if(map.entrySet().isEmpty()){
                System.out.println("No existen contactos\n");
            }else   {
                for(Map.Entry<String, String> entry:map.entrySet() ){
                    System.out.println("Contactos\n");
                    System.out.println("{" + entry.getKey()+ "}"+ "{"+ entry.getValue() +"}");
                }
            }

    }
        public void create(){

            System.out.println("Ingrese el nombre");
            nombre = keyboard.next();
            System.out.println("Ingrese el numero");
            telefono = keyboard.next();

            if(!map.containsKey(nombre)){
                map.put(nombre, telefono);
                System.out.println("Se ha añadido del contacto\n");
            }else {
                System.out.println("Ya existe el contacto\n");
            }
        }

        public void delete(){
            System.out.println("Ingresa el numero de telefono");
            telefono = keyboard.next();
            if (map.containsKey(telefono)){
                map.remove(telefono);
                System.out.println("El contacto ha sido eliminado\n");
            }else {
                System.out.println("El contacto no existe\n");
            }
        }

    }
}
