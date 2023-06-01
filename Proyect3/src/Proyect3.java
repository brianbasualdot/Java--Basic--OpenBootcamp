public class Proyect3 {
    public static void main(String[] args) {

        String[] nombres = {"Diego,", " Lionel,", " Julian"," ,Emiliano."};
        String texto = " ";
        for (String nombre : nombres) {
            texto += nombre ;
        }
        System.out.println("Mis alumnos son: " + texto);
    }


}