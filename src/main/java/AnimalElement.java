public class AnimalElement {
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalElement(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "AnimalElement{" +
                "name='" + name + '\'' +
                '}';
    }
}
