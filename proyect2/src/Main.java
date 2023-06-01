import java.util.Scanner;

public class Main {
    public static double calcularIva(double p){
        double IVA;
        IVA = p * 0.21;
        return IVA;
    }
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        double precioDeLaCompra, IVA;
        System.out.println("Ingrese el precio de la compra");
        precioDeLaCompra = lector.nextDouble();

        IVA = calcularIva(precioDeLaCompra);
        System.out.println("El IVA es: " + IVA);
    }
}