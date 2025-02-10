package task6;

	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }
	}

	class Employee {
	    private int id;
	    private String firstName;
	    private String lastName;
	    private int salary;

	    public Employee(int id, String firstName, String lastName, int salary) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salary = salary;
	    }

	    public int getID() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    public int getAnnualSalary() {
	        return salary * 12;
	    }

	    public int raiseSalary(int percent) {
	        salary += salary * percent / 100;
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "}";
	    }
	}

	class Circle {
	    private double radius;

	    public Circle() {
	        this.radius = 1.0;
	    }

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    @Override
	    public String toString() {
	        return "Circle{radius=" + radius + ", circumference=" + getCircumference() + "}";
	    }
	}

	class Account {
	    private int accountNumber;
	    private double balance;

	    public Account() {
	        this.accountNumber = 0;
	        this.balance = 0.0;
	    }

	    public Account(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            return true;
	        } else {
	            System.out.println("Insufficient balance.");
	            return false;
	        }
	    }

	    public double checkBalance() {
	        return balance;
	    }

	    @Override
	    public String toString() {
	        return "Account{accountNumber=" + accountNumber + ", balance=" + balance + "}";
	    }
	}

	public class Task6 {
	    public static void main(String[] args) {
	        // Test Person class
	        Person p1 = new Person("Alice", 25);
	        System.out.println(p1);

	        // Test Employee class
	        Employee e1 = new Employee(1, "John", "Doe", 5000);
	        System.out.println(e1);
	        e1.raiseSalary(10);
	        System.out.println("After raise: " + e1);

	        // Test Circle class
	        Circle c1 = new Circle();
	        Circle c2 = new Circle(5.0);
	        System.out.println(c1);
	        System.out.println(c2);

	        // Test Account class
	        Account acc1 = new Account(12345, 1000.0);
	        System.out.println(acc1);
	        acc1.deposit(500);
	        System.out.println("After deposit: " + acc1);
	        acc1.withdraw(200);
	        System.out.println("After withdrawal: " + acc1);
	    }
	}
	
	//Output
	//Person{name='Alice', age=25}
	//Employee{id=1, name=John Doe, salary=5000}
	//After raise: Employee{id=1, name=John Doe, salary=5500}
	//Circle{radius=1.0, circumference=6.283185307179586}
	//Circle{radius=5.0, circumference=31.41592653589793}
	//Account{accountNumber=12345, balance=1000.0}
	//After deposit: Account{accountNumber=12345, balance=1500.0}
	//After withdrawal: Account{accountNumber=12345, balance=1300.0}