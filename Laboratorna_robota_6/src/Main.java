import java.util.Scanner;
public class Main {
    public static class Zav_1 {
        public static void main(String[] args) {
            // Виклик методу main з кожного класу в зазначеному порядку
            Person.main(args);
        }
    }
    public static class Zav_2 {
        public static void main(String[] args) {
            // Виклик методу main з кожного класу в зазначеному порядку
            Result2.main(args);
            Phone.main(args);
            Phone_1.main(args);
            Phone_2.main(args);
            Phone_3.main(args);
        }
    }
    public static class Zav_3 {
        public static void main(String[] args) {
            // Виклик методу main з кожного класу в зазначеному порядку
            Ball.main(args);
            Cylinder.main(args);
            SolidOfRevolution.main(args);
            Pyramid.main(args);
            Shape.main(args);
            Result3.main(args);
        }
    }
    public static class Zav_4 {
        public static void main(String[] args) {
            // Виклик методу main з кожного класу в зазначеному порядку
            Car.main(args);
            Sedan.main(args);
            Truck.main(args);
            Result4.main(args);
        }
    }
    public static class Zav_5_6 {
        public static void main(String[] args) {
            // Виклик методу main з кожного класу в зазначеному порядку
            LibraryCard.main(args);
            ExtendedLibraryCard.main(args);
            Truck.main(args);
            Result5_6.main(args);
        }
    }
}
//Zav_1
class Person {
    private String fullName;
    private int age;
    public Person() {
        fullName = "Невідомо";
        age = 0;
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void move() {
        System.out.println(fullName + " рухається.");
    }
    public void talk() {
        System.out.println(fullName + " говорить.");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Ім'я: " + person1.fullName);
        System.out.println("Вік: " + person1.age); //
        person1.move();
        person1.talk();
        Person person2 = new Person("Олександр", 20);
        System.out.println("Ім'я: " + person2.fullName);
        System.out.println("Вік: " + person2.age);
        person2.move();
        person2.talk();
    }
}


//Zav_2
class Result2 {
    public static void main(String[] args) {
        Phone_1 Smartphone = new Phone_1("123456789", "Samsung Galaxy", 0.2, "Android");
        Phone_2 landlinePhone = new Phone_2("987654321", "Panasonic", 1.5, true);
        Phone_3 mobilePhone = new  Phone_3("987654321", "iPhone 12", 0.15, 10);
        // Виклик методів для кожного об'єкта
        System.out.println("Smartphone:");
        Smartphone.receiveCall("John");
        System.out.println("Phone Number: " + Smartphone.getNumber());
        System.out.println("\nLandline Phone:");
        landlinePhone.receiveCall("Jane");
        System.out.println("Phone Number: " + landlinePhone.getNumber());
        System.out.println("\nMobile Phone:");
        mobilePhone.receiveCall("Alice");
        System.out.println("Phone Number: " + mobilePhone.getNumber());
    }
}
class Phone {
    private String number;
    private String model;
    private double weight;
    public Phone(String number, String model, double weight) { this.number = number; this.model = model; this.weight = weight;}
    public Phone(String number, String model) { this.number = number; this.model = model; this.weight = 0.0;}
    public Phone() { this.number = ""; this.model = ""; this.weight = 0.0; }

    public static void main(String[] args) {
    }

    public void receiveCall(String callerName, String callerNumber) { System.out.println("Дзвонить " + callerName + " (" + callerNumber + ")"); }
    public void receiveCall(String callerName) { System.out.println("Дзвонить " + callerName); }
    public String getNumber() { return number; }
    public String getModel() { return model; }
    public double getWeight() { return weight;}
}
class Phone_1 extends Phone {
    private String operatingSystem;
    public Phone_1(String number, String model, double weight, String operatingSystem) {
        super(number, model, weight);
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
class Phone_2 extends Phone {
    private boolean hasCord;
    public Phone_2(String number, String model, double weight, boolean hasCord) {
        super(number, model, weight);
        this.hasCord = hasCord;
    }
    public boolean isHasCord() {
        return hasCord;
    }
    public void setHasCord(boolean hasCord) {
        this.hasCord = hasCord;
    }
}
class Phone_3 extends Phone {
    private int batteryLife; // Унікальне поле для мобільного телефону

    public  Phone_3 (String number, String model, double weight, int batteryLife) {
        super(number, model, weight);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}


//Zav_3
class Ball extends SolidOfRevolution {
    // Конструктор
    public Ball(double radius) {
        this.radius = radius;
        this.volume = (4.0 / 3.0) * Math.PI * radius * radius * radius; // Об'єм кулі
    }

    public static void main(String[] args) {
    }
}
class Cylinder extends SolidOfRevolution {
    protected double height; // Висота циліндра

    // Конструктор
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.volume = Math.PI * radius * radius * height; // Об'єм циліндра
    }

    public static void main(String[] args) {
    }
}
class SolidOfRevolution extends Shape {
    protected double radius;

    public static void main(String[] args) {
    }

    public double getRadius() {
        return radius;
    }
}
class Pyramid extends Shape {
    protected double s; // Площа основи
    protected double h; // Висота
    // Конструктор
    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = (s * h) / 3; // Об'єм піраміди
    }

    public static void main(String[] args) {
    }
}
class Shape {
    protected double volume;

    public static void main(String[] args) {
    }

    public double getVolume() {
        return volume;
    }
}
class Result3 {
    public static void main(String[] args) {
        Ball ball = new Ball(5.0);
        Cylinder cylinder = new Cylinder(3.0, 10.0);
        Pyramid pyramid = new Pyramid(6.0, 12.0);

        System.out.println("Volume of Ball: " + ball.getVolume());
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
        System.out.println("Volume of Pyramid: " + pyramid.getVolume());
    }
}


//Zav_4
abstract class Car {
    String model;
    String color;
    int maxSpeed;
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
    }

    void gas() {
        System.out.println("Газуємо!");
    }
    abstract void brake();
}
class Sedan extends Car {
    Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }
    @Override
    void brake() {
        System.out.println("Седан гальмує.");
    }
}
class Truck extends Car {
    Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }
    @Override
    void brake() {
        System.out.println("Грузовик гальмує.");
    }
}
class Result4 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota Camry", "Сірий", 220);
        Truck truck = new Truck("MAN", "Червоний", 180);
        sedan.gas();
        sedan.brake();
        truck.gas();
        truck.brake();
    }
}


//Zav_5-6



class LibraryCard {

    protected String firstName;
    protected String lastName;
    protected int borrowedBooks;

    public LibraryCard() {
        firstName = "";
        lastName = "";
        borrowedBooks = 0;
    }

    public static void main(String[] args) {
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я:");
        firstName = scanner.nextLine();
        System.out.println("Введіть прізвище:");
        lastName = scanner.nextLine();
        System.out.println("Введіть кількість взятих книг:");
        borrowedBooks = scanner.nextInt();
    }

    public void increaseBorrowedBooks(int increment) {
        borrowedBooks += increment;
    }

    public void decreaseBorrowedBooks(int decrement) {
        if (borrowedBooks >= decrement) {
            borrowedBooks -= decrement;
        } else {
            System.out.println("Помилка: неможливо зменшити кількість взятих книг.");
        }
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Кількість взятих книг: " + borrowedBooks);
    }
}

class ExtendedLibraryCard extends LibraryCard {
    private String address;
    private String phoneNumber;

    public ExtendedLibraryCard() {
        super();
        address = "";
        phoneNumber = "";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Адреса: " + address);
        System.out.println("Телефон: " + phoneNumber);
    }

    public void inputAdditionalInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть адресу:");
        address = scanner.nextLine();
        System.out.println("Введіть номер телефону:");
        phoneNumber = scanner.nextLine();
    }
}

class Result5_6 {
    public static void main(String[] args) {

        LibraryCard card1 = new LibraryCard();
        card1.inputInfo(); // Вводимо інформацію
        card1.displayInfo(); // Виводимо інформацію

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість книг, які ви бажаєте додати чи відняти (наприклад, +3 або -2):");
        String input = scanner.nextLine();
        char operation = input.charAt(0);
        int quantity = Integer.parseInt(input.substring(1));

        if (operation == '+') {
            card1.increaseBorrowedBooks(quantity); // Збільшуємо кількість взятих книг
        } else if (operation == '-') {
            card1.decreaseBorrowedBooks(quantity); // Зменшуємо кількість взятих книг
        } else {
            System.out.println("Неправильний формат вводу.");
        }

        card1.displayInfo(); // Виводимо оновлену інформацію

        System.out.println("------------------------------------");

        ExtendedLibraryCard card2 = new ExtendedLibraryCard();
        card2.inputInfo(); // Вводимо основну інформацію
        card2.inputAdditionalInfo(); // Вводимо додаткову інформацію
        card2.displayInfo(); // Виводимо інформацію

        System.out.println("\"Введіть кількість книг, які ви бажаєте додати чи відняти (наприклад, +3 або -2):\"");
        input = scanner.nextLine();
        operation = input.charAt(0);
        quantity = Integer.parseInt(input.substring(1));

        if (operation == '+') {
            card2.increaseBorrowedBooks(quantity); // Збільшуємо кількість взятих книг
        } else if (operation == '-') {
            card2.decreaseBorrowedBooks(quantity); // Зменшуємо кількість взятих книг
        } else {
            System.out.println("Неправильний формат вводу.");
        }

        card2.displayInfo(); // Виводимо оновлену інформацію

        scanner.close();
    }
}





