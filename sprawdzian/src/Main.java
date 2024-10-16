class Employee {

    private String firstname;
    private String lastname;
    private String position;
    private int age;
    private String email;
    private boolean isWorking;

    public Employee(String firstname, String lastname, String position, int age, String email, boolean isWorking) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.age = age;
        this.email = email;
        this.isWorking = isWorking;
    }

    public void login() {
        System.out.println("Zalogowano");
    }

    public void startWork() {
        System.out.println("Start working");
    }

    public void finishWork() {
        System.out.println("Koniec pracy");
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;

    }

    public boolean getIsWorking() {
        return isWorking;
    }
}

class Maneger extends Employee{
    private int dzial;
    private int liczbaPodwladnych;
    public Maneger(String firstname, String lastname, String position, int age, String email, boolean isWorking, int dzial, int liczbaPodwladnych) {
        super(firstname, lastname, position, age, email, isWorking);
        this.dzial= dzial;
        this.liczbaPodwladnych = liczbaPodwladnych;

    }

    public int getDzial() {
        return dzial;
    }
    public int getLiczbaPodwladnych(){
        return liczbaPodwladnych;
    }

}
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Szymon", "kaplon", "budowa", 16, "kaplons143@gmail.com", true);
        System.out.println(employee.getFirstname());
        System.out.println(employee.getLastname());
        System.out.println(employee.getPosition());
        System.out.println(employee.getAge());
        System.out.println(employee.getEmail());
        System.out.println("Status zalogowania = "+employee.getIsWorking());
        employee.login();
        employee.startWork();
        employee.finishWork();


    }
}