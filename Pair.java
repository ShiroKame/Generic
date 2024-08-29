public class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Método para obtener el primer elemento
    public T getFirst() {
        return first;
    }

    // Método para obtener el segundo elemento
    public U getSecond() {
        return second;
    }

    // Método toString para representar el par en formato "(first, second)"
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    // Método principal para probar la clase Pair
    public static void main(String[] args) {
        // Crear un par para almacenar edad y nombre
        Pair<Integer, String> edadNombre = new Pair<>(30, "Juan Pérez");
        System.out.println("Edad y nombre: " + edadNombre);

        // Crear un par para almacenar EPS y fecha de nacimiento
        Pair<String, String> epsFechaNacimiento = new Pair<>("SaludTotal", "01/01/1990");
        System.out.println("EPS y fecha de nacimiento: " + epsFechaNacimiento);
    }
}
