package com.river.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

    @Value("24")
    private int age;

    private Laptop laptop;

    private Book book;

    @Autowired
    @Qualifier("car")
    private Transport transport;

    @Autowired
    private Pen pen;

    public Alien() {
        System.out.println("Alien created");
    }

    public Alien(Book book) {
        System.out.println("Book constructor called");
        this.book = book;
    }

    public Alien(int age, Laptop laptop, Book book, Transport transport, Pen pen) {
        this.age = age;
        this.laptop = laptop;
        this.book = book;
        this.transport = transport;
        this.pen = pen;
    }

    public Alien(Pen pen) {
        this.pen = pen;
    }

    public Alien(int age, Book book) {
        System.out.println("Age and Book constructor called");
        this.age = age;
        this.book = book;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Setter injection.
        // That mean age will be injected to the setter, value will come from spring-bean.xml file
        System.out.println("Setter age called");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        // Inject object by setter injection
        System.out.println("Setter laptop called");
        this.laptop = laptop;
    }

    public Book getBook() {
        return book;
    }

    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void code() {
        // Inject object by constructor injection
        laptop.compile();
        // Constructor injection
        book.read();
        System.out.println(this.getAge());
        System.out.println("Coding");
    }

    public void transport() {
        transport.drive();
        System.out.println("Alien transport");
    }

    public void write() {
        pen.write();
        System.out.println("Alien write");
    }

    public void read() {
        book.read();
        System.out.println("Alien read");
    }

    public void relax() {
        System.out.println("Alien relax");
    }
}
