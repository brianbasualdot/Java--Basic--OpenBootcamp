public class SmartDevice {

    public static class SmartPhone  {

        String marca;
        String color;
        String modelo;

        public SmartPhone(String marca, String color, String modelo) {
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "Marca='" + marca + '\'' +
                    ", Color='" + color + '\'' +
                    ", Modelo='" + modelo + '\'';
        }
    }

    public static class SmartWatch {


        String marca;
        String color;
        String modelo;

        public SmartWatch(String marca, String color, String modelo) {
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "Marca='" + marca + '\'' +
                    ", Color='" + color + '\'' +
                    ", Modelo='" + modelo + '\'';

        }
    }

}