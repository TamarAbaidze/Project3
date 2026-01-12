package org.example;

import net.datafaker.Faker;
import org.example.work1.Car;
import work2.User;
import work3.Student;
import work4.Calculator;
import work5.Book;
import work6.BankAccount;
import work7.Product;
import work8.Address;

public class MyTests {
    Faker faker = new Faker();

    /// TestWork1
    public void testWork1() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork1 start");

        Car car = new Car();
        car.brand = faker.company().name();
        car.model = faker.vehicle().model();
        car.year = faker.number().numberBetween(1980, 2026);

        car.printInfo();

        System.out.println("Method testWork1 end");
    }

    public void testWork2() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork2 start");

        User user = new User(faker.name().name());
        user.printInfo();
        User userSecond = new User(faker.name().name(), faker.internet().emailAddress());
        userSecond.printInfo();
        System.out.println("Method testWork2 end");
    }

    public void testWork3() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork3 start");

        Student student = new Student();

        student.setName(faker.name().fullName());
        student.setAge(faker.number().numberBetween(18, 25));
        student.setGrade(faker.number().randomDouble(2, 0, 100));

        System.out.println("name:" + student.getName() + " number:" + student.getAge() + " grade:" + student.getGrade());

        System.out.println("Method testWork3 end");
    }


    public void testWork4() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork4 start");

        Calculator calc = new Calculator();
        calc.Generate(faker.number().randomDigit(), faker.number().randomDigit());
        calc.Generate(faker.number().randomDigit(), faker.number().randomDigit(), faker.number().randomDigit());


        System.out.println("Method testWork4 end");
    }

    public void testWork5() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork5 start");

        Book book = new Book();

        book.title = faker.book().title();
        book.author = faker.book().author();
        book.pages = faker.number().numberBetween(100, 500);

        System.out.println(book.toString());

        System.out.println("Method testWork5 end");
    }

    public void testWork6() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork6 start");

        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = faker.number().randomDouble(3, 1, 1000);
        bankAccount.checkBalance();

        System.out.println("Method testWork6 end");
    }


    public void testWork7() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork7 start");

        Product product = new Product();

        product.price = faker.number().randomDouble(2, 50, 500);
        product.discount = faker.number().numberBetween(5, 30);

        System.out.println("finalPrice:" + product.finalPrice());

        System.out.println("Method testWork7 end");
    }


    public void testWork8() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork8 start");

        Address address = new Address();
        address.Street = faker.address().streetAddress();
        address.number = faker.address().buildingNumber();

        work8.User user = new work8.User();
        user.address = address;
        System.out.println("user street is '" + user.address.Street + "' building number is " + user.address.number);

        System.out.println("Method testWork8 end");
    }

    public void testWork9() {
        System.out.println("-------------------------------------");
        System.out.println("Method testWork9 start");

        work9.Student studentOne = new work9.Student();
        studentOne.studentId = faker.number().randomDigit();

        work9.Student studentSecond = new work9.Student();
        studentSecond.studentId = studentOne.studentId;

        System.out.println("student id is same:" +studentOne.equals(studentSecond));

        System.out.println("Method testWork9 end");
    }
}
