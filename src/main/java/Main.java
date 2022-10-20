import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<AnimalElement> animals = new TreeSet<>(new AnimalElementComparator());

        animals.add(new AnimalElement("Lion"));
        animals.add(new AnimalElement("Tiger"));
        animals.add(new AnimalElement("Giraffe"));
        animals.add(new AnimalElement("Elephant"));
        animals.add(new AnimalElement("Lion"));
        animals.add(new AnimalElement("Lion"));

        for ( AnimalElement a : animals) {

            System.out.println(a);

        }
    }
}
