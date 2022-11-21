package fitnessTracker;

public class FitnessTracker {
    private final String name, email;
    private final int dayOfBirth, monthOfBirth, yearOfBirth;
    private final long phone;
    private int ageClient;
    String surname;
    int weight, arterialPressure, numberOfStepsDay;

    public FitnessTracker(String name, String email, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                          long phone, String surname, int weight, int arterialPressure, int numberOfStepsDay) {
        this.name = name;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.arterialPressure = arterialPressure;
        this.numberOfStepsDay = numberOfStepsDay;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return dayOfBirth;
    }

    public int getMonth() {
        return monthOfBirth;
    }

    public int getYear(int i) {
        return yearOfBirth;
    }

    public long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setArterialPressure(int arterialPressure) {
        this.arterialPressure = arterialPressure;
    }

    public void setNumberOfStepsDay(int numberOfStepsDay) {
        this.numberOfStepsDay = numberOfStepsDay;
    }

    public int getAgeClient() {
        return ageClient;
    }

    public void printAccountInfo(String string) {

        ageClient = 2022 - yearOfBirth;
        System.out.println(string + " age " + getAgeClient() + " years");
    }

    @Override
    public String toString() {
        return "FitnessTracker{" +
                "client: " +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", phone=" + phone +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", " + '\n' +
                " arterialPressure=" + arterialPressure +
                ", numberOfStepsDay=" + numberOfStepsDay +
                '}';
    }
}
