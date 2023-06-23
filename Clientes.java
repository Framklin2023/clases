import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Clientes {
    public static void main(String[] args) {
        Afiliado[] afils = new Afiliado[4];
        afils[0] = new Afiliado("Sabb", "Luis", "Lima", 1, 250);
        System.out.println(afils[0].orden());
        System.out.println("Funciona");
    }

}

abstract class Person {
    private String nombre;
    private String apellido;
    private String direccion;

    public Person(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

class Afiliado extends Person implements Pedido {
    private float monto;
    private long id;

    public Afiliado(String nombre, String apellido, String direccion, float monto, long id) {
        super(nombre, apellido, direccion);
        this.monto = monto;
        this.id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String orden() {
        String msg = "Afiliado " + this.getId() + " Debe consumir más de S/" + this.getMonto();
        return msg;
    }

}

class Cliente extends Person {
    private String telefono;

    public Cliente(String nombre, String apellido, String direccion, String telefono) {
        super(nombre, apellido, direccion);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String orden() {
        String msg = "Cliente " + this.getApellido() + "  " + this.getNombre() + " telélefono : " + this.getTelefono();
        return msg;
    }
}

/**
 * InnerClientes
 */
interface Pedido {
    public String orden();
}
