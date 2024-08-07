import java.util.Scanner;

public class ejemplo1 {

    public static void main(String[] args) {
//se declaran las variables que se utilizaran
        int primerNumero ;
        int segundoNumero;
        int tercerNumero ;
        int cuartoNumero;
        long resultado;
//inicializamos la clase Scanner
Scanner scan = new Scanner(System.in);
System.out.println("xxx");
System.out.println("Ingrese el primer numero");
primerNumero =  scan.nextInt();
System.out.println("Ingrese el segundo numero");
segundoNumero =  scan.nextInt();
System.out.println("Ingrese el primer numero");
tercerNumero =  scan.nextInt();
System.out.println("Ingrese el segundo numero");
cuartoNumero =  scan.nextInt();
resultado=(primerNumero+segundoNumero+tercerNumero+cuartoNumero)/4;
System.out.println("El promedio de las 4 notas es:  "+resultado);

    }
}
