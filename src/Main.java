import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Pablo del Pozo Vizueta
 * Esta clase contiene el metodo main, que lee un archivo .txt e imprime el resultado
 */
public class Main {
    public static void main(String[] args) throws Exception {
        //Variables donde se alamacenaran los datos separados, obtenidos de People.txt
        String nombre = "",
                localidad = "",
                edad = "";


        //Array list de objetos de la clase Persona, aqui se almacenaran las personas leidas desde el archivo
        List<Persona> personas = new ArrayList<>();

        //Objeto de la clase File llamado doc, se le pasa la ruta donde se encuentra el archivo a leer
        File doc = new File("People.txt");

        //Objeto de la clase BufferedReader llamado obj y se le pasa el objeto doc de la clase File
        BufferedReader obj = new BufferedReader(new FileReader(doc));

        //Variable de tipo String donde se almacenaran los datos
        String strng;


        //Mientras el arcivo tenga lienas que leer...
        while ((strng = obj.readLine()) != null) {

            //Creamos un stream llamado flujo y le paso la variable strng
            Stream<String> flujo = Stream.of(strng);


            //Almaceno los valores separados por ':' en un array de tipo String llamado valores
            String[] valores = strng.split(":");

            //Creacion de persona por cada linea que lee obj.readLine()
            Persona aux = new Persona();

            //Al nombre le asignamos el valor 0 del array
            aux.setNombre(valores[0]);
            //La localiad depende,primero comporbamos cuantos valores tiene cada linea (No sabemos si la localiad esta vacia o es la edad)
            //Ademas comprobamos  longitud del segundo parametro, si es mayor de 3 significa que no es la edad la que esta vacia, a si que a la localiad le ponemos Desconocida, si no, su valor
            aux.setLocalidad((valores.length >= 2) && (valores[1].length() > 3) ? valores[1] : "Desconocida");
            //Con la edad, parecido, si hay tres parametros, su valor, si no 0
            aux.setEdad(valores.length > 2 ? valores[2] : "0");

            //Y por ultimo añadimos dicha persona al arrayList
            personas.add(aux);

        }

            /*Una vez tenemos las personas creadas y añadidas al arrayList, con un bucle se imprimen, ademas de algun dato o salto de linea
            para una clara legibilidad*/

        System.out.println();
        System.out.println();
        System.out.println("NOMBRE         LOCALIDAD      EDAD");
        System.out.println();

        for (int i = 0; i < personas.size(); i++) {

            System.out.println(personas.get(i).getNombre() + "    " + personas.get(i).getLocalidad() + "    " + personas.get(i).getEdad());

        }

        System.out.println("Numero de personas: " + personas.size());

    }
}
