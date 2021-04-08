//import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Taras
 */
public class Program {

    static ContactsBook contactsBook;
    static OrdersBook ordersBook;
    static StudentsBook studentsBook;

    public static void main(String[] args) throws Exception {

        contactsBook = new ContactsBook();
        ordersBook = new OrdersBook();
        studentsBook = new StudentsBook();
        boolean isExit;

        do {
            isExit = playMenu();
        } while (!isExit);
    }

    private static boolean playMenu() throws Exception {
        String counter, countOrder, countStudents, countContacts;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Натисніть наступне" + '\n' + "1. Контакти" + '\n' + "2. Замовлення" + "\n\n" + "3. Студенти"
                + '\n' + "4. Вихід" + "\n\n" + "--------------_--------------");
        do {
            counter = scanner.nextLine();
        } while (Objects.isNull(counter));

        switch (counter) {
        case "1":
            System.out.print("Натисніть наступне" + '\n' + "1. Добавити контакт" + '\n' + "2. Переглянути контакт"
                    + "\n" + "3. Сортування" + '\n' + "4. Вихід" + '\n' + "--------------_--------------" + '\n');
            do {
                countContacts = scanner.nextLine();
            } while (Objects.isNull(countContacts));

            switch (countContacts) {
            case "1":
                addContactOption();
                break;
            case "2":
                System.out.println(getContacts(contactsBook));
                System.out.println("Нажмите \"Enter\"");
                scanner.nextLine();
                break;
            case "3":
                System.out.println(SortContact(contactsBook));
            case "4":
                return true;
            default:
                System.out.println("Ви ввели не правильне значення");
                break;
            }
            return false;
        case "2":
            System.out.print("Натисніть наступне" + '\n' + "1. Добавити замовлення" + '\n' + "2. Переглянути замовлення"
                    + "\n" + "3. Сортування" + '\n' + "4. Вихід" + '\n' + "--------------_--------------" + '\n');
            do {
                countOrder = scanner.nextLine();
            } while (Objects.isNull(countOrder));
            switch (countOrder) {
            case "1":
                addOrderOption();
                break;
            case "2":
                System.out.println(getOrders(ordersBook));
                System.out.println("Нажмите \"Enter\"");
                scanner.nextLine();
                break;
            case "3":
                System.out.println(SortOrders(ordersBook));
            case "4":
                return true;
            default:
                System.out.println("Ви ввели не правильне значення");
                break;
            }
            return false;
        case "3":
            System.out.print("Натисніть наступне" + '\n' + "1. Добавити студента" + '\n' + "2. Переглянути студента"
                    + "\n" + "3. Сортування" + '\n' + "4. Вихід" + '\n' + "--------------_--------------" + '\n');
            do {
                countStudents = scanner.nextLine();
            } while (Objects.isNull(countStudents));
            switch (countStudents) {
            case "1":
                addStudentOption();
                break;
            case "2":
                System.out.println(getStudents(studentsBook));
                System.out.println("Нажмите \"Enter\"");
                scanner.nextLine();
                break;
            case "3":
                System.out.println(SortStudents(studentsBook));
            case "4":
                return true;
            default:
                System.out.println("Ви ввели не правильне значення");
                break;
            }
            return false;
        case "4":
            return true;
        default:
            System.out.println("Ви ввели не правильне значення");
            break;
        }
        return false;
    }

    public static void addStudentOption() throws Exception {

        Students students;

        Scanner scanner = new Scanner(System.in);
        File nFile = new File("Student.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(nFile, true));
        System.out.println("Введіть ID");
        String id = scanner.nextLine();
        System.out.println("Введіть прізвище");
        String Fam = scanner.nextLine();
        System.out.println("Введіть Ім'я студента");
        String Name = scanner.nextLine();
        System.out.println("Введіть групу студента");
        String Groupa = scanner.nextLine();
        System.out.println("Введіть Кафедру студента");
        String Department = scanner.nextLine();
        writer.write("------Студент------" + '\n' + id + '\n' + Fam + '\n' + Name + '\n' + Groupa + '\n' + Department
                + '\n' + "-----Закінчення студентів------" + '\n');
        writer.close();
        /*
         * ArrayList<Students> StudentList = new ArrayList<>(); Students student2 = new
         * Students(id, Fam, Name, Groupa, Department); StudentList.add(student2);
         * System.out.println(StudentList);
         */
        students = new Students(id, Fam, Name, Groupa, Department);
        studentsBook.addStudent(students);
        /*
         * student = new collectionStudents(id, Fam, Name, Groupa, Department);
         * сollectionStudents.addStudent(student);
         */

        System.out.println("Студента добавлено! Натисніть \"Enter\"");
        scanner.nextLine();
    }

    private static void addOrderOption() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Order orders;
        File fFile = new File("Order.txt");
        BufferedWriter writerOrder = new BufferedWriter(new FileWriter(fFile, true));
        System.out.println("Введіть ID");
        String Id = scanner.nextLine();
        System.out.println("Введіть назву товара");
        String name = scanner.nextLine();
        System.out.println("Введите имя курьера");
        String courier = scanner.nextLine();
        System.out.println("Введите час");
        String dateTime = scanner.nextLine();
        System.out.println("Введіть тип заказа");
        String type = scanner.nextLine();
        writerOrder.write("------Замовлення------" + '\n' + Id + '\n' + name + '\n' + courier + '\n' + dateTime + '\n'
                + type + '\n' + "-----Закінчення замовлень------" + '\n');
        writerOrder.close();
        /*
         * ArrayList<String> OrderList = new ArrayList<>(Arrays.asList(Id, name,
         * courier, dateTime, type)); System.out.println(OrderList);
         */
        orders = new Order(Id, name, courier, dateTime, type);
        ordersBook.addOrder(orders);
        System.out.println("Замовлення добавлено! Натисніть \"Enter\"");
        scanner.nextLine();
    }

    private static void addContactOption() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Contact contact;
        File sFile = new File("Contact.txt");
        BufferedWriter writerContact = new BufferedWriter(new FileWriter(sFile, true));
        System.out.println("Введіть ім'я контакта");
        String firstName = scanner.nextLine();
        System.out.println("Введите прізвище контакта");
        String lastName = scanner.nextLine();
        System.out.println("Введите адресс контакта");
        String address = scanner.nextLine();
        writerContact.write("------Контакти------" + '\n' + firstName + '\n' + lastName + '\n' + address + '\n'
                + "------Закінчення контакта------" + '\n');
        writerContact.close();
        contact = new Contact(firstName, lastName, address);
        contactsBook.addContact(contact);
        /*
         * ArrayList<String> ContactList = new ArrayList<>(Arrays.asList(firstName,
         * lastName, address)); System.out.println(ContactList);
         */
        System.out.println("Контакт добавлено! Натисніть \"Enter\"");
        scanner.nextLine();
    }

    private static String getContacts(ContactsBook contacts) {
        StringBuilder stringBuilder = new StringBuilder();
        contacts.getContacts().forEach((contact -> stringBuilder.append(contact.toString()).append('\n')));
        return stringBuilder.toString();
    }

    private static String getOrders(OrdersBook orders) {
        StringBuilder stringBuilder = new StringBuilder();
        orders.getOrders().forEach((order -> stringBuilder.append(order.toString()).append('\n')));
        return stringBuilder.toString();
    }

    private static String SortOrders(OrdersBook orders) {
        StringBuilder stringBuilder = new StringBuilder();
        orders.SortOrders().forEach((order -> stringBuilder.append(order.toString()).append('\n')));
        return stringBuilder.toString();
    }

    private static String SortStudents(StudentsBook students) {
        StringBuilder stringBuilder = new StringBuilder();
        students.SortStudents().forEach((student -> stringBuilder.append(student.toString()).append('\n')));
        return stringBuilder.toString();
    }

    private static String SortContact(ContactsBook contacts) {
        StringBuilder stringBuilder = new StringBuilder();
        contacts.SortContact().forEach((contact -> stringBuilder.append(contact.toString()).append('\n')));
        return stringBuilder.toString();
    }

    private static String getStudents(StudentsBook students) {
        StringBuilder stringBuilder = new StringBuilder();
        students.getStudents().forEach((student -> stringBuilder.append(student.toString()).append('\n')));
        return stringBuilder.toString();
    }
}
