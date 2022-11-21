public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 36;
        cliente.nombre = "Sol Martorell";
        cliente.telefono = 4449999;
        cliente.credito = 5000;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 45;
        trabajador.nombre = "Pepe Pepin";
        trabajador.telefono = 4441111;
        trabajador.salario = 2500;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}