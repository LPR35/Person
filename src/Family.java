import java.util.ArrayList;
public class Family {

    private Person[] familyMember;
    private int numPeople;
    private int totalAge = 0;

    public Family() {
        familyMember = new Person[10];
        numPeople = 0;

        }


    public boolean addPerson(String name, int age) {
        if (numPeople < 10) {
            familyMember[numPeople] = new Person(name, age);
            numPeople++;
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOfPeople() {
        return numPeople;
    }


    public int getTotalAge() {
        totalAge = 0;
        for (int i = 0; i < numPeople; i++) {
            totalAge = totalAge + familyMember[i].getAge();
        }
        return totalAge;
    }

    public void display() {
        int index;
        for (index = 0; index < numPeople; index++) {
            System.out.println(familyMember[index].toString());
        }
    }

    public void birthday(String name) {
        for (int i = 0; i < numPeople; i++) {
            if (name.equals(familyMember[i].getName())) {
                familyMember[i].incrementAge();
            }
        }
    }
}
