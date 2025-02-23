package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.JavaExercise;
import com.example.demo.model.SQLExercise;
import com.example.demo.repository.JavaExerciseRepository;
import com.example.demo.repository.SQLExerciseRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final SQLExerciseRepository sqlRepository;
    private final JavaExerciseRepository javaRepository;

    public DataLoader(SQLExerciseRepository sqlRepository, JavaExerciseRepository javaRepository) {
        this.sqlRepository = sqlRepository;
        this.javaRepository = javaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Clear existing data for a fresh start
        sqlRepository.deleteAll();
        javaRepository.deleteAll();

        // ----- SQL Questions -----
        // Question 1: Basic SELECT Query
        SQLExercise q1 = new SQLExercise();
        q1.setTitle("Basic SELECT Query");
        q1.setTopic("select");
        q1.setDifficulty("beginner");
        q1.setProblemStatement("Which SQL statement is used to select all data from a table named 'Customers'?");
        q1.setOptions(Arrays.asList("SELECT * FROM Customers", "GET * FROM Customers", "SHOW * FROM Customers", "FETCH * FROM Customers"));
        q1.setCorrectOption("SELECT * FROM Customers");
        q1.setHint("Remember the standard SQL syntax to retrieve all columns.");
        q1.setExplanation("The correct syntax is: SELECT * FROM Customers; GET, SHOW, and FETCH are not valid SQL commands.");

        // Question 2: Filtering Records
        SQLExercise q2 = new SQLExercise();
        q2.setTitle("Filtering Records");
        q2.setTopic("where");
        q2.setDifficulty("beginner");
        q2.setProblemStatement("Which SQL clause is used to filter records?");
        q2.setOptions(Arrays.asList("WHERE", "HAVING", "ORDER BY", "GROUP BY"));
        q2.setCorrectOption("WHERE");
        q2.setHint("It comes immediately after the FROM clause.");
        q2.setExplanation("The WHERE clause is used to filter records based on a condition. HAVING is used for groups.");

        // Question 3: Sorting Results
        SQLExercise q3 = new SQLExercise();
        q3.setTitle("Sorting Results");
        q3.setTopic("order by");
        q3.setDifficulty("beginner");
        q3.setProblemStatement("Which SQL keyword is used to sort the result-set?");
        q3.setOptions(Arrays.asList("ORDER BY", "SORT BY", "GROUP BY", "ARRANGE BY"));
        q3.setCorrectOption("ORDER BY");
        q3.setHint("It orders your result.");
        q3.setExplanation("ORDER BY is used to sort the result-set in ascending or descending order.");

        // Question 4: Aggregate Function
        SQLExercise q4 = new SQLExercise();
        q4.setTitle("Aggregate Function");
        q4.setTopic("aggregate");
        q4.setDifficulty("intermediate");
        q4.setProblemStatement("Which SQL function returns the number of rows in a table?");
        q4.setOptions(Arrays.asList("COUNT()", "SUM()", "AVG()", "TOTAL()"));
        q4.setCorrectOption("COUNT()");
        q4.setHint("It counts rows.");
        q4.setExplanation("COUNT() returns the total number of rows that match the query criteria.");

        // Question 5: Joining Tables
        SQLExercise q5 = new SQLExercise();
        q5.setTitle("Joining Tables");
        q5.setTopic("join");
        q5.setDifficulty("intermediate");
        q5.setProblemStatement("Which type of join returns all rows from both tables, matching rows where available?");
        q5.setOptions(Arrays.asList("FULL OUTER JOIN", "INNER JOIN", "LEFT JOIN", "RIGHT JOIN"));
        q5.setCorrectOption("FULL OUTER JOIN");
        q5.setHint("It returns unmatched rows as well.");
        q5.setExplanation("FULL OUTER JOIN returns all rows when there is a match in either left or right table.");

        // Question 6: Alias Usage
        SQLExercise q6 = new SQLExercise();
        q6.setTitle("Alias Usage");
        q6.setTopic("alias");
        q6.setDifficulty("beginner");
        q6.setProblemStatement("What is the purpose of using an alias in SQL?");
        q6.setOptions(Arrays.asList("To give a table or column a temporary name", "To create a permanent name", "To filter records", "To join tables"));
        q6.setCorrectOption("To give a table or column a temporary name");
        q6.setHint("It’s temporary.");
        q6.setExplanation("Aliases provide a temporary name to a table or column for the duration of a query.");

        // Question 7: DISTINCT Keyword
        SQLExercise q7 = new SQLExercise();
        q7.setTitle("Distinct Keyword");
        q7.setTopic("select");
        q7.setDifficulty("beginner");
        q7.setProblemStatement("Which SQL keyword is used to return only distinct (different) values?");
        q7.setOptions(Arrays.asList("DISTINCT", "UNIQUE", "DIFFERENT", "ONLY"));
        q7.setCorrectOption("DISTINCT");
        q7.setHint("It eliminates duplicates.");
        q7.setExplanation("DISTINCT is used to return only unique values by removing duplicates.");

        // Question 8: NULL Value Testing
        SQLExercise q8 = new SQLExercise();
        q8.setTitle("NULL Value");
        q8.setTopic("null");
        q8.setDifficulty("intermediate");
        q8.setProblemStatement("Which operator is used to test for NULL values in SQL?");
        q8.setOptions(Arrays.asList("IS NULL", "== NULL", "= NULL", "NULL()"));
        q8.setCorrectOption("IS NULL");
        q8.setHint("It uses the keyword IS.");
        q8.setExplanation("The 'IS NULL' operator is used to test for NULL values in SQL.");

        // Question 9: GROUP BY Clause
        SQLExercise q9 = new SQLExercise();
        q9.setTitle("Group By Clause");
        q9.setTopic("group by");
        q9.setDifficulty("intermediate");
        q9.setProblemStatement("What is the purpose of the GROUP BY clause in SQL?");
        q9.setOptions(Arrays.asList("To group rows that have the same values in specified columns", "To sort the result set", "To join tables", "To filter records"));
        q9.setCorrectOption("To group rows that have the same values in specified columns");
        q9.setHint("It groups similar data.");
        q9.setExplanation("GROUP BY is used to arrange identical data into groups with the help of aggregate functions.");

        // Question 10: Subqueries
        SQLExercise q10 = new SQLExercise();
        q10.setTitle("Subqueries");
        q10.setTopic("subquery");
        q10.setDifficulty("advanced");
        q10.setProblemStatement("What is a subquery in SQL?");
        q10.setOptions(Arrays.asList("A query nested inside another query", "A query that selects from a single table", "A query used only in the WHERE clause", "A query that returns no result"));
        q10.setCorrectOption("A query nested inside another query");
        q10.setHint("It’s embedded within another query.");
        q10.setExplanation("A subquery is a query nested inside another query. It can be used in SELECT, INSERT, UPDATE, or DELETE statements.");

        // Save SQL questions
        sqlRepository.save(q1);
        sqlRepository.save(q2);
        sqlRepository.save(q3);
        sqlRepository.save(q4);
        sqlRepository.save(q5);
        sqlRepository.save(q6);
        sqlRepository.save(q7);
        sqlRepository.save(q8);
        sqlRepository.save(q9);
        sqlRepository.save(q10);

        // ----- Java Questions -----
        // ----- Java Questions -----
JavaExercise j1 = new JavaExercise();
j1.setTitle("Basic Syntax");
j1.setTopic("syntax");
j1.setDifficulty("beginner");
j1.setProblemStatement("Which keyword is used to define a class in Java?");
j1.setOptions(Arrays.asList("class", "Class", "define", "struct"));
j1.setCorrectOption("class");
j1.setHint("It is all lowercase.");
j1.setExplanation("In Java, the keyword 'class' (all lowercase) is used to define a class.");

JavaExercise j2 = new JavaExercise();
j2.setTitle("Main Method");
j2.setTopic("method");
j2.setDifficulty("beginner");
j2.setProblemStatement("What is the signature of the main method in Java?");
j2.setOptions(Arrays.asList(
    "public static void main(String[] args)",
    "public void main(String[] args)",
    "static void main(String[] args)",
    "public static int main(String[] args)"
));
j2.setCorrectOption("public static void main(String[] args)");
j2.setHint("It must be public, static, and void.");
j2.setExplanation("The main method must be declared as public static void main(String[] args) to be the entry point of a Java application.");

// --- ADDING MORE JAVA QUESTIONS ---

JavaExercise j3 = new JavaExercise();
j3.setTitle("Data Types");
j3.setTopic("data types");
j3.setDifficulty("beginner");
j3.setProblemStatement("Which of the following is NOT a primitive data type in Java?");
j3.setOptions(Arrays.asList("int", "boolean", "String", "double"));
j3.setCorrectOption("String");
j3.setHint("Primitive types do not include objects.");
j3.setExplanation("String is not a primitive type, it is a reference type in Java.");

JavaExercise j4 = new JavaExercise();
j4.setTitle("OOP Concepts");
j4.setTopic("oop");
j4.setDifficulty("intermediate");
j4.setProblemStatement("Which OOP principle allows a subclass to provide a specific implementation of a method defined in its superclass?");
j4.setOptions(Arrays.asList("Encapsulation", "Abstraction", "Polymorphism", "Inheritance"));
j4.setCorrectOption("Polymorphism");
j4.setHint("Think about method overriding.");
j4.setExplanation("Polymorphism allows a subclass to override a method from its superclass to provide specific behavior.");

JavaExercise j5 = new JavaExercise();
j5.setTitle("Exception Handling");
j5.setTopic("exceptions");
j5.setDifficulty("intermediate");
j5.setProblemStatement("Which keyword is used to handle exceptions in Java?");
j5.setOptions(Arrays.asList("throw", "catch", "try", "finally"));
j5.setCorrectOption("try");
j5.setHint("It is used to start exception handling.");
j5.setExplanation("The 'try' block is used to wrap the code that might throw an exception in Java.");

JavaExercise j6 = new JavaExercise();
j6.setTitle("Interfaces vs Abstract Classes");
j6.setTopic("oop");
j6.setDifficulty("advanced");
j6.setProblemStatement("Which statement about interfaces in Java is true?");
j6.setOptions(Arrays.asList(
    "Interfaces can have constructors.",
    "Interfaces can contain abstract methods only.",
    "Interfaces can contain default and static methods.",
    "Interfaces cannot be extended."
));
j6.setCorrectOption("Interfaces can contain default and static methods.");
j6.setHint("Java 8 introduced new capabilities for interfaces.");
j6.setExplanation("Since Java 8, interfaces can contain both static and default methods.");

JavaExercise j7 = new JavaExercise();
j7.setTitle("Multithreading");
j7.setTopic("threads");
j7.setDifficulty("advanced");
j7.setProblemStatement("Which Java class is used to create a new thread?");
j7.setOptions(Arrays.asList("Runnable", "Thread", "Executor", "Callable"));
j7.setCorrectOption("Thread");
j7.setHint("It is a class, not an interface.");
j7.setExplanation("The Thread class is used to create a new thread by extending it or implementing Runnable.");

JavaExercise j8 = new JavaExercise();
j8.setTitle("Collections Framework");
j8.setTopic("collections");
j8.setDifficulty("advanced");
j8.setProblemStatement("Which collection type allows only unique elements in Java?");
j8.setOptions(Arrays.asList("List", "Set", "Map", "Queue"));
j8.setCorrectOption("Set");
j8.setHint("Duplicates are not allowed.");
j8.setExplanation("The Set interface ensures that all stored elements are unique.");

JavaExercise j9 = new JavaExercise();
j9.setTitle("Memory Management");
j9.setTopic("memory");
j9.setDifficulty("intermediate");
j9.setProblemStatement("What does Java use for automatic memory management?");
j9.setOptions(Arrays.asList("Destructor", "Garbage Collector", "Manual Deallocation", "Reference Counter"));
j9.setCorrectOption("Garbage Collector");
j9.setHint("Java automatically frees memory.");
j9.setExplanation("The Java Garbage Collector automatically frees memory for objects that are no longer in use.");

JavaExercise j10 = new JavaExercise();
j10.setTitle("Static Keyword");
j10.setTopic("keywords");
j10.setDifficulty("beginner");
j10.setProblemStatement("Which statement about the static keyword is true?");
j10.setOptions(Arrays.asList(
    "Static methods can access instance variables.",
    "Static variables belong to the class, not instances.",
    "Static blocks execute after constructors.",
    "A class can have only one static method."
));
j10.setCorrectOption("Static variables belong to the class, not instances.");
j10.setHint("They do not belong to objects.");
j10.setExplanation("Static variables belong to the class itself and are shared among all instances of the class.");

// ---- Saving All Java Questions ----
javaRepository.save(j1);
javaRepository.save(j2);
javaRepository.save(j3);
javaRepository.save(j4);
javaRepository.save(j5);
javaRepository.save(j6);
javaRepository.save(j7);
javaRepository.save(j8);

javaRepository.save(j9);
javaRepository.save(j10);

    }
}
