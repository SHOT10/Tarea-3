import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre,apellido;
        byte edad;
        int altura, apartamento, peso, cantidad;
        char genero;
        long celular;

        System.out.println("\nNombre: ");
        nombre = scanner.next();

        System.out.println("\nApellido: ");
        apellido = scanner.next();

        System.out.println("\nEdad: ");
        edad = scanner.nextByte();

        System.out.println("\nAltura del visitante (cm): ");
        altura = scanner.nextInt();

        System.out.println("\nNumero de apartamento: ");
        apartamento = scanner.nextInt();

        System.out.println("\nPeso del visitante (En Kg): ");
        peso = scanner.nextShort();

        System.out.println("\nCantidad de visitantes: ");
        cantidad = scanner.nextInt();

        System.out.println("\nGenero (M/F): ");
        genero = scanner.next().charAt(0);

        System.out.println("\nNumero de celular: ");
        celular = scanner.nextLong();


        System.out.println("\nNombre: " + nombre + " " + apellido);
        System.out.println("\nEdad: " + edad);
        System.out.println("\nAltura del visitante: " + altura);
        System.out.println("\nNumero de apartamento: " + apartamento);
        System.out.println("\nPeso del visitante: " + peso);
        System.out.println("\nCantidad de visitante: " + cantidad);
        System.out.println("\nGenero: " + genero);
        System.out.println("\nNumero de celular: " + celular);


    }
}
