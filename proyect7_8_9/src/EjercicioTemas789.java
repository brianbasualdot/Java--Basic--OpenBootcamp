import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

public class EjercicioTemas789 {

    /*
        Escribe el código que devuelva una cadena al revés.
        Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */

    public static class CadenaReves {

        public static void main(String[] args) {

            System.out.println("Cadena al Reves");
            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce un texto");
            texto = scanner.nextLine();
            StringBuilder reves = new StringBuilder(texto);
            texto = reves.reverse().toString();
            System.out.println(texto);
        }
    }

    /*
        Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    */

    public static class ArrayUnidimensional {

        public static void main(String[] args) {

            System.out.println("Array unidimensional");
            String[] valores = {"Uno ", "Dos ", "Tres "};
            for (String arrayUni : valores) {
                System.out.print(arrayUni);
            }
        }
    }

    /*
        Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento
        en ambas dimensiones.
    */

    public static class ArrayBidimensional {

        public static void main(String[] args) {

            System.out.println("Array bidimensional");

            Integer[][] numeros = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            for (int i = 0; i < numeros.length; i++) {

                for (int y = 0; y < numeros[i].length; y++) {

                    System.out.println("Fila: " + (i + 1) + ", Columna: " + (y + 1) +
                            "\nEl valor es: " + numeros[i][y] );
                }
            }
        }
    }

    /*
        Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final.
    */

    public static class EjercicioVector {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Vector\n--------------------");

            Vector vector = new Vector();

            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);

            System.out.println("Vector sin borrar: " + vector);

            vector.remove(2);
            vector.remove(1);

            System.out.println("Vector borrado: " + vector);

            /*
                Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
                1000 elementos para ser añadidos al mismo.
            */

            System.out.println("Respuesta:");

            System.out.println("Cada vez que desborda el vector se duplica y no es eficiente");
        }
    }

    /*
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
    */

    public static class ArrayString {

        public static void main(String[] args) {

            System.out.println("Array y LinkedList");

            ArrayList<String> lista = new ArrayList<String>();
            lista.add("Juan");
            lista.add("Javi");
            lista.add("Harry");
            lista.add("Fran");

            LinkedList<String> linkedlist = new LinkedList<String>();
            for (int i = 0; i < lista.size(); i++) {
                linkedlist.add(i, lista.get(i));
            }

            System.out.println("Elementos del Array:");
            for (String elementos : lista) {
                System.out.print(elementos + " ");
            }

            System.out.println("");
            System.out.println("Elementos de la LinkedList:");
            for (String elementos : linkedlist) {
                System.out.print(elementos + " ");
            }
        }
    }

    /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
        y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        el primer "for" de relleno.
    */

    public static class ArrayInt {

        public static void main(String[] args) {

            System.out.println("ArrayInt");

            ArrayList<Integer> lista = new ArrayList<Integer>();

            for (int i = 1; i <= 10; i++) {
                lista.add(i);

                for (int numero = 0; numero < lista.size(); numero++) {

                    if (lista.get(numero) % 2 == 0) {
                        lista.remove(numero);
                    }
                }
            }
            System.out.println(lista);
        }
    }

    /*
        Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
        mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    */

    public static class DividePorCero {

        private static int Dividir(int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static void main(String[] args) {

            System.out.println("DividePorCero");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Indica los numeros a dividir: ");
            System.out.println("Numero 1: ");
            int a = scanner.nextInt();
            System.out.println("Numero 2: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Resultado: " + Dividir(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Fallo al dividir");
            } finally {
                System.out.println("Finalizado");
            }
        }

    /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        dado en "fileOut".
    */

        public static class CopiaFicheros {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce el fichero de origen: ");
                String fileIn = scanner.nextLine();
                System.out.println("Introduce el fichero de destino: ");
                String fileOut = scanner.nextLine();
                copiar(fileIn, fileOut);
            }

            private static void copiar(String fileIn, String fileOut) {
                try {
                    InputStream in = new FileInputStream(fileIn);
                    int datos = in.read();
                    in.close();

                    PrintStream out = new PrintStream(fileOut);
                    out.write(datos);
                    out.close();
                } catch (Exception e) {
                    System.out.println("Excepcion: " + e.getMessage());
                }
            }

        }

    }
}