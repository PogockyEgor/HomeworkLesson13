import java.util.LinkedList;

public class List {

    static private LinkedList<String> animals = new LinkedList<>();

    public static LinkedList<String> getAnimals() {
        return animals;
    }

    public static void addInEnd(String animal) {
        animals.addLast(animal);
    }

    public static void deleteFromStart() {
        animals.removeFirst();
    }
}
