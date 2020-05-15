package clase2.ejemplos;

public class CollectionsEstudiante {
    private String nombre;
    private int id;

    public CollectionsEstudiante(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getName(){
        return nombre;
    }

    public void setName(String nombre){
        this.nombre = nombre;
    }
}
