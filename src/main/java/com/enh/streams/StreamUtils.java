package com.enh.streams;

import com.enh.streams.data.Employee;
import com.enh.streams.data.Person;
import com.enh.streams.data.Product;
import com.enh.streams.enums.Arrival;
import com.enh.streams.enums.Department;
import com.enh.streams.enums.Gender;
import com.enh.streams.enums.Role;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class StreamUtils {

    public static List<Integer> getEmptyIntegerList() {
        return List.of();
    } 
    
    public static List<Integer> getRandomIntegers() {
        return List.of(23, 34, 87, 55, 67, 98, 39, 72, 11, 29);
    }  
    
    public static List<Integer> getOrderedNumbers() {
        return List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    
    public static List<Double> getRandomDoubles() {
        return List.of(23.4, 44.8, 72.5, 13.5, 90.5, 8.4, 81.9);
    } 
    
    public static List<Double> getOrderedDoubles() {
        return List.of(1.0, 2.0, 3.0, 4.0, 5.0);
    }
    
    public static List<String> getStrings() {
        return List.of("String-1", "String-2", "String-3");
    }
    
    public static List<Person> createPersons() {
        return List.of(
                new Person("Agastya", 47, Gender.MALE, false),
                new Person("Muichiro", 13, Gender.MALE, true),
                new Person("Mitsuri", 22, Gender.FEMALE, false),
                new Person("Beeshma", 93, Gender.MALE, true),
                new Person("Rengoku", 84, Gender.MALE, false),
                new Person("Agastya", 105, Gender.MALE, true),
                new Person("Klin Kara", 37, Gender.FEMALE, true),
                new Person("Tengen", 58, Gender.MALE, false),
                new Person("Karna", 68, Gender.MALE, true),
                new Person("Tanjiro Kamado", 77, Gender.MALE, false),
                new Person("Mitsuri", 22, Gender.FEMALE, true),
                new Person("Nezuko Kamado", 16, Gender.FEMALE, false)
        );
    }
    
    public static List<Employee> createEmployees() {
        return List.of(
                new Employee("G-0305", "Sai Akshith", 25, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN, Department.FEATURE_TESTING), false),
                new Employee("G-0361", "Akanksha", 134, Role.SAP_QA_TESTER, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.TESTING), true),
                new Employee("G-0312", "Prudhvi Narsing", 45, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.FEATURE_TESTING, Department.TECH_DESIGN), false),
                new Employee("G-0345", "Mayur Lad", 34, Role.SAP_COMMERCE_ARCHITECT, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN, Department.FE_DEVELOPMENT), true),
                new Employee("G-0378", "Akhil", 13, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT), false),
                new Employee("G-0324", "Mounika", 134, Role.SAP_FRONTEND_DEV, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.FE_DEVELOPMENT, Department.FEATURE_TESTING), false),
                new Employee("G-0398", "Veera Narayan", 57, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TESTING), true),
                new Employee("G-0335", "Ravi", 66, Role.SAP_QA_TESTER, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.TESTING, Department.FEATURE_TESTING), false),
                new Employee("G-0387", "Meena", 94, Role.SAP_COMMERCE_TECH_LEAD, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN), true),
                new Employee("G-0351", "Sangeetha", 85, Role.SAP_QA_TESTER, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.TESTING), false),
                new Employee("G-0378", "Akhil", 73, Role.SAP_BACKEND_DEV, new BigDecimal(89_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT), true),
                new Employee("G-0367", "Yuva Veearmachaneni", 72, Role.SAP_COMMERCE_ARCHITECT, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN), true),
                new Employee("G-0386", "Hanumanth Reddy", 112, Role.SAP_COMMERCE_TECH_LEAD, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.FE_DEVELOPMENT, Department.TECH_DESIGN), false),
                new Employee("G-0411", "Surekha Dongre", 134, Role.SAP_COMMERCE_DELIVERY_LEAD, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.FE_DEVELOPMENT, Department.BE_DEVELOPEMENT), true)
        );
    }
    
    public static List<Product> createProducts() {
        return List.of(
                new Product("SG-22-101", "Samsung Galaxy S22", "Buy galaxy & change your life", new BigDecimal(17_000), true, Arrival.OLD),
                new Product("TV-22-475", "Samsung TV 2", "Buy samsung tv & change your life", new BigDecimal(2_31_000), true, Arrival.OLD),
                new Product("SGU-23-613", "Samsung S23 Ultra", "Buy galaxy ultra S23 & change your life", new BigDecimal(58_000), true, Arrival.NEW),
                new Product("SG-23-213", "Samsung Galaxy S23", "Buy samsung S23 & change your life", new BigDecimal(23_000), true, Arrival.OLD),
                new Product("ST-22-875", "Samsung Tab 2", "Buy samsung tab & change your life", new BigDecimal(78_000), true, Arrival.NEW),
                new Product("STI-22-913", "Samsung Trade-In", "Buy samsung trade-in & change your life", new BigDecimal(9_000), true, Arrival.NEW),
                new Product("ST-22-101", "Samsung Theft", "Buy samsung tab & change your life", new BigDecimal(58_000), true, Arrival.OLD),
                new Product("TV-22-095", "Samsung TV 1", "Buy samsung tv & change your life", new BigDecimal(1_10_000), true, Arrival.NEW),
                new Product("ST-22-774", "Samsung Tab 1", "Buy samsung theft & change your life", new BigDecimal(5_000), true, Arrival.OLD),
                new Product("SM-22-565", "Samsung Monitor 1", "Buy samsung monitor & change your life", new BigDecimal(1_45000), true, Arrival.NEW),
                new Product("SC-22-312", "Samsung Care Plus", "Buy samsung care plus & change your life", new BigDecimal(2_000), true, Arrival.NEW)
        );
    }
}
