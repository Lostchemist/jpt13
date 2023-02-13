package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        // { "name": "Toni" }
//        String json = "{ \"name\": \"Toni \"}";
//
//        Book book1 = new Book();
//        book1.setTitle("Harry Potter y la piedra filosofal");
//        book1.setPages(400);
//        Book book2 = new Book();
//        book2.setTitle("Harry Potter y la cámara de los secretos");
//        book2.setPages(340);
//        Book book3 = new Book();
//        book3.setTitle("Harry Potter y el prisionero de azkaban");
//        book3.setPages(440);
//        List<Book> lst = Arrays.asList(book1, book2, book3);
//
//        Author jk = new Author();
//        jk.setName("JK");
//        jk.setLastName("Rowling");
//        jk.setBookList(lst);

//        File f = new File("j.json");
//        Scanner scanner = new Scanner(f);
//        String str = "";
//        while (scanner.hasNextLine()) {
//            str = str + scanner.nextLine();
//        }


//        Gson gson = new Gson();
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
////        String jsonOut = gson.toJson(jk);
//        Author jk = gson.fromJson(str, Author.class);
//
//        System.out.println(jk);


        try {
        System.out.println(stringToInt("abc"));
        } catch (NumberFormatException e) {
            System.err.println("failed!");
        }

        try {
            System.out.println(buildFullName("Toni", "Mas"));
        } catch (IllegalArgumentException e) {
            System.err.println("something went wrong!");
        }
        try {
            System.out.println(buildFullName(null, "Mas"));
        } catch (IllegalArgumentException e) {
            System.err.println("something went wrong!");
        }


    }

    public static String buildFullName(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("first name and last name need to be provided");
        }
        return firstName + " " + lastName;
    }

    public static int stringToInt(String str) throws NumberFormatException{
        int value = Integer.valueOf(str);
        return value;
    }

    public String readFile(String name) throws FileNotFoundException, NullPointerException, Exception{
//        try {
            System.out.println(name.length());
            FileReader fileReader =  new FileReader(new File(name));
//        } catch (FileNotFoundException e) {
//            System.err.println("Couldn't find file " + name);
//        } catch (NullPointerException e) {
//            System.err.println("file not provided");
//        } catch (Exception e) {
//            System.err.println("unknown error");
//        } finally {
//            System.out.println("completed execution");
//        }
//        Integer.valueOf()
        return "ok";
    }
}
