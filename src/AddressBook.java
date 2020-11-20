import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.Normalizer;
import java.util.*;
import java.util.Formatter;

public class AddressBook {

    public static void main(String args []) throws FileNotFoundException {

        Cambios.cambios cambios = new Cambios.cambios();
        boolean salir = false;

        Formatter archivo = null;
        try{
            archivo = new Formatter("D:\\Tareas\\Quinto Semestre\\Computacion en Java\\Archivo.txt");
            archivo.format("%s %s");
        }catch(Exception e){
           // System.out.println("Ha ocurrido un error");
        }finally {
            archivo.close();
        }

        Scanner seleccion = new Scanner(System.in);
        while(!salir) {
            System.out.println("Eliga una opcion");
            System.out.println("1. Mostrar lista de contactos");
            System.out.println("2. Crear nuevo contacto");
            System.out.println("3. Borrar contacto");
            System.out.println("4. Salir");

            try {

                int opcion;
                opcion = seleccion.nextInt();

                switch (opcion) {
                    case 1:
                        cambios.list();
                        break;
                    case 2:
                        cambios.create();
                        break;
                    case 3:
                        cambios.delete();
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Salida exitosa");
                        break;
                    default:
                        System.out.println("Ingrese un numero valido\n");


                }

        } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero valido\n");
               seleccion.next();
            }

        }}
    //public void load() throws FileNotFoundException {
       // BufferedReader br = new BufferedReader(new FileReader("Archivo.txt"));

   // }
}