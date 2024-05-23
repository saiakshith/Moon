package com.enh.java.streams;

import com.enh.java.streams.builders.ProductBuilder;
import com.enh.java.streams.data.Employee;
import com.enh.java.streams.data.Person;
import com.enh.java.streams.data.Product;
import com.enh.java.streams.enums.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamUtils {

    public static List<Integer> getEmptyIntegerList() {
        return List.of();
    } 
    
    public static List<Integer> getRandomIntegers() {
        return List.of(23, 34, 87, 55, 67, 98, 39, 72, 11, 29);
    }  
    
    public static List<Integer> getOrderedIntegers() {
        return List.of(0, 1, 2, 3, 4, 5);
    }
    
    public static List<Double> getRandomDoubles() {
        return List.of(23.4, 44.8, 72.5, 13.5, 90.5, 8.4, 81.9);
    } 
    
    public static List<Double> getOrderedDoubles() {
        return List.of(1.0, 2.0, 3.0, 4.0, 5.0);
    }
    
    public static List<String> getStringsListWithNull() {
        return Arrays.asList("String-2", null, "String-3", null, "String-1");
    }
    
    public static List<String> getStrings() {
        return Arrays.asList("String-2", "String-3", "String-1");
    }
    
    public static List<String> getSentencesList() {
        return List.of("I’m begging you, don’t make me a killer!", "The pain you feel today will be the strength you’ll have tomorrow.");
    }
    
    public static List<Optional> getOptionalsList() {
        return Arrays.asList(Optional.ofNullable(2), Optional.ofNullable(null), Optional.ofNullable(3), Optional.ofNullable(null), Optional.ofNullable(1));
    }
    
    public static List<Person> getPersons() {
        return List.of(
                new Person("Agastya", 47, Gender.MALE, false),
                new Person("Muichiro", 13, Gender.MALE, true),
                new Person("Agastya", 47, Gender.MALE, true),
                new Person("Mitsuri", 22, Gender.FEMALE, false),
                new Person("Karna", 68, Gender.MALE, true),
                new Person("Rengoku", 93, Gender.MALE, false),
                new Person("Beeshma", 93, Gender.MALE, true),
                new Person("Klin Kara", 37, Gender.FEMALE, true),
                new Person("Tengen", 58, Gender.MALE, false),
                new Person("Akatsu", 78, Gender.MALE, true),
                new Person("Karna", 23, Gender.MALE, true),
                new Person("Tanjiro Kamado", 77, Gender.MALE, false),
                new Person("Mitsuri", 22, Gender.FEMALE, true),
                new Person("Nezuko Kamado", 16, Gender.FEMALE, false)
        );
    }
    
    public static List<Employee> getEmployees() {
        return List.of(
                new Employee("G-0305", "Sai Akshith", 25, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN, Department.FEATURE_TESTING), false, 3),
                new Employee("G-0361", "Akanksha", 134, Role.SAP_QA_TESTER, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.TESTING), true, 7),
                new Employee("G-0312", "Prudhvi Narsing", 45, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.FEATURE_TESTING, Department.TECH_DESIGN), false, 9),
                new Employee("G-0345", "Mayur Lad", 34, Role.SAP_COMMERCE_ARCHITECT, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN, Department.FE_DEVELOPMENT), true, 2),
                new Employee("G-0398", "Veera Narayan", 26, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TESTING), true, 5),
                new Employee("G-0378", "Akhil", 33, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT), false, 3),
                new Employee("G-0324", "Mounika", 134, Role.SAP_FRONTEND_DEV, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.FE_DEVELOPMENT, Department.FEATURE_TESTING), false, 7),
                new Employee("G-0398", "Veera Narayan", 57, Role.SAP_QA_TESTER, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.TESTING), true, 8),
                new Employee("G-0335", "Ravi", 66, Role.SAP_QA_TESTER, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.TESTING, Department.FEATURE_TESTING), false, 1),
                new Employee("G-0378", "Akhil", 73, Role.SAP_COMMERCE_ARCHITECT, new BigDecimal(89_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.FE_DEVELOPMENT, Department.TECH_DESIGN), true, 3),
                new Employee("G-0387", "Meena", 94, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN), true, 4),
                new Employee("G-0351", "Sangeetha", 85, Role.SAP_BACKEND_DEV, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.TESTING), false, 8),
                new Employee("G-0378", "Akhil", 118, Role.SAP_QA_TESTER, new BigDecimal(89_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TESTING), true, 6),
                new Employee("G-0367", "Yuva Veearmachaneni", 72, Role.SAP_COMMERCE_ARCHITECT, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.TECH_DESIGN), true, 2),
                new Employee("G-0386", "Hanumanth Reddy", 112, Role.SAP_COMMERCE_TECH_LEAD, new BigDecimal(25_000), Gender.MALE, Arrays.asList(Department.BE_DEVELOPEMENT, Department.FE_DEVELOPMENT, Department.TECH_DESIGN), false, 4),
                new Employee("G-0411", "Surekha Dongre", 134, Role.SAP_COMMERCE_DELIVERY_HEAD, new BigDecimal(25_000), Gender.FEMALE, Arrays.asList(Department.FE_DEVELOPMENT, Department.BE_DEVELOPEMENT), true, 6)
        );
    }
    
    public static List<Product> getProducts() {
        return List.of(
                ProductBuilder.withCode("SG-22-101").withName("Samsung Galaxy S22").withDescription(null).withPrice(new BigDecimal(17_000)).withProductReferences(null).withSellable(true).withArrival(Arrival.OLD).withBrand(Brand.SAMSUNG).withSold(2).withRatings(4).withPaymentMode(PaymentMode.ADYEN).withType(ProductType.MOBLIE).build()
//                new Product("TV-22-475", "Samsung TV 2", "Buy samsung tv & make your life simpler", new BigDecimal(2_31_000), null, false, Arrival.OLD, Brand.SAMSUNG, 5, 7, PaymentMode.CREDIT_CARD),
//                new Product("OP-8P", "One Plus 7 Pro", "Buy one plus when you don't have enough money for iphone", new BigDecimal(70_000), null, true, Arrival.NEW, Brand.ONE_PLUS, 4, 5, PaymentMode.PAYTM),
//                new Product("SG-23-213", "Samsung Galaxy S23", null, new BigDecimal(23_000), null,false, Arrival.OLD, Brand.SAMSUNG, 2, 7, PaymentMode.DEBIT_CARD),
//                new Product("ST-22-875", "Samsung Tab 2", "Buy samsung tab & make your life simpler", new BigDecimal(78_000), null, true, Arrival.NEW, Brand.SAMSUNG, 5, 3, PaymentMode.AMAZON_PAY),
//                new Product("OP-7P", "One Plus 7 Pro", "Buy one plus when you don't have enough money for iphone", new BigDecimal(40_000), null, true, Arrival.NEW, Brand.ONE_PLUS, 2, 8, PaymentMode.PAYPAL),
//                new Product("SGU-23-613", "Samsung S23 Ultra", "Buy galaxy ultra S23 & make your life simpler", new BigDecimal(58_000), null, true, Arrival.NEW, Brand.SAMSUNG, 2, 6, PaymentMode.PAYTM),
//                new Product("I-14PM", "Iphone 14 Pro Max", "Buying iphone means almost no regrets", new BigDecimal(1_30_000), null, true, Arrival.NEW, Brand.APPLE, 6, 14, PaymentMode.DEBIT_CARD),
//                new Product("STI-22-913", "Samsung Trade-In", null, new BigDecimal(9_000), null, true, Arrival.NEW, Brand.SAMSUNG, 7, 0, PaymentMode.ADYEN),
//                new Product("OP-9T", "One Plus 9T", "Buy one plus 9T", new BigDecimal(58_000), null, false, Arrival.OLD, Brand.ONE_PLUS, 1, 23, PaymentMode.AMAZON_PAY),
//                new Product("TV-22-095", "Samsung TV 1", "Buy samsung tv & make your life simpler", new BigDecimal(1_10_000), null, true, Arrival.NEW, Brand.SAMSUNG, 4, 1, PaymentMode.CREDIT_CARD),
//                new Product("ST-22-774", "Samsung Tab 1", "Buy samsung theft & make your life simpler", new BigDecimal(5_000), null, false, Arrival.OLD, Brand.SAMSUNG, 100, 4, PaymentMode.PAYTM),
//                new Product("I-8P", "Iphone 8 Plus", "Buying iphone means almost no regrets", new BigDecimal(70_000), null, true, Arrival.NEW, Brand.APPLE, 2, 7, PaymentMode.DEBIT_CARD),
//                new Product("SM-22-565", "Samsung Monitor 1", "Buy samsung monitor & make your life simpler", new BigDecimal(1_45000), null, true, Arrival.NEW, Brand.SAMSUNG, 2, 5, PaymentMode.PAYTM),
//                new Product("I-12P", "Iphone 12 Pro", "Buying iphone means almost no regrets", new BigDecimal(92_000), null, false, Arrival.NEW, Brand.APPLE, 3, 15, PaymentMode.AMAZON_PAY)
        );
    }
}
