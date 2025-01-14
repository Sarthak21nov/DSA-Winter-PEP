
// Encapsulation

class Person{
    private String Name;
    private int Age;
    private char Gender;

    public void SetDetails(String Name, int Age, char Gender){
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }

    public void PrintDetails(){
        System.out.println("Name: " + Name + "\n" + "Age: " + Age + "\n" + "Gender: " + Gender);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.SetDetails("Anonymous", 27, 'm');
        p1.PrintDetails();
    }
}
