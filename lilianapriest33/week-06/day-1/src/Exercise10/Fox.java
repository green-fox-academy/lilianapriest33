package Exercise10;

public class Fox {
    protected String name;
    protected String color;
    protected Integer age;

    public Fox(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }
}
