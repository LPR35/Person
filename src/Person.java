public class Person {

    private String name;

    private int age;

    public Person() {
        name = null;
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){

        return name + " is " + age + " years old.";
    }

    public void incrementAge(){
        this.age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
