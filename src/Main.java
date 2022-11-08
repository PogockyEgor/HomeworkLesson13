public class Main {
    public static void main(String[] args) {
        List.addInEnd("Cow");
        List.addInEnd("Horse");
        List.addInEnd("Chicken");
        System.out.println(List.getAnimals());
        List.deleteFromStart();
        List.deleteFromStart();
        System.out.println(List.getAnimals());
    }
}