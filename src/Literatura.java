import java.sql.SQLOutput;

public class Literatura {
    // crear los atributos de la clase
    int anio;
    String nombre;
    String edicion;
    String version;
    String tipo;
    String autor;
    String ultima_actualizacion;

    //creamos los constructores


    public Literatura(int anio, String nombre, String edicion, String version, String tipo, String autor, String ultima_actualizacion) {


        this.anio = anio;
        this.nombre = nombre;
        this.edicion = edicion;
        this.version = version;
        this.tipo = tipo;
        this.autor = autor;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    // getter yb setters


    public int getAnio() {
        return anio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getVersion() {
        return version;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAutor() {
        return autor;
    }

    public String getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setUltima_actualizacion(String ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
    //creamos un objeto para imprimir datos
    public void imprimirDatos(){
        System.out.println(this.anio);
        System.out.println(this.nombre);
        System.out.println(this.edicion);
        System.out.println(this.version);
        System.out.println(this.tipo);
        System.out.println(this.autor);
        System.out.println(this.ultima_actualizacion);

    }

}