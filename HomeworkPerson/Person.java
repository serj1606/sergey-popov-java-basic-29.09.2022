package HomeworkPerson;

public class Person {
    public static void main(String[] args) {

       System.out.println(personInfo("Will", "Smith ", "New York", 2936729462846L));
        System.out.println(personInfo("Jackie", "Chan ", "Shanghai", 12312412412L));
        System.out.println(personInfo("Sherlock", "Holmes ", "London", 37742123513L));

    }

    public static String personInfo(String name, String surname, String city, long phone) {
        return
                "Позвонить гражданину " + name + " " + surname + "из города " + city + " можно по номеру " + phone;

    }
}


