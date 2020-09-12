package StudentBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

//    Student Base Master class represents a list of students (Student Base objects).

public class StudentBaseMaster {

    private static File file;
    private static StudentBaseInt[] list;
    private static int size;


//    A method for creating a new student object.

    public static StudentBaseInt create (String a, String b, int c){
        StudentBaseInt student = new StudentBase(a, b, c);
        return student;
    }


//    The constructor takes a file path as a formal parameter, stores it and calls the method read, which establishes
//    the database.

    StudentBaseMaster (File f) throws FileNotFoundException {
        file = f;
        read();
    }


    // Method read works with a file. The first line of the file has the amount of students that we have on our
    // database. Then an array of students is created with the size that has just been read.
    // The next 3 lines represent the FamilyName, OtherNames and Rank of the first student. A for loop iterates
    // over the text file size times. Each student is added to the array.

    public static void read () throws FileNotFoundException {
        if (file.exists()){
            Scanner scanner = new Scanner (file);
            size = Integer.parseInt(scanner.nextLine());
            list = new StudentBase[size];
            for (int i = 0; i < size; i ++){
                String FamilyName = scanner.nextLine();
                String OtherName = scanner.nextLine();
                int Rank = Integer.parseInt(scanner.nextLine());
                list [i] = create(FamilyName, OtherName, Rank);
            }
            scanner.close();
        }

    }

    // Here are the other methods that provide certain actions over the list of students.

    public static void write () throws FileNotFoundException {
        PrintStream stream = new PrintStream(file);
        stream.println(size);
        for (int i = 0; i < size; i ++){
            stream.println(list[i].getFamilyName());
            stream.println(list[i].getOtherNames());
            stream.println(list[i].getRank());
        }
        stream.close();
    }

    public static void add (){
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter Family Name: ");
        String a = keyboard.nextLine();
        System.out.println("\nEnter Other Names: ");
        String b = keyboard.nextLine();
        System.out.println("\nEnter Rank: ");
        int c = keyboard.nextInt();
        StudentBaseInt [] newList = Arrays.copyOf(list, list.length + 1);
        newList[list.length] = create(a , b , c);
        list = newList;
    }

    public static void change () {
        System.out.print("Change student card to change: ");
        Scanner keyboard = new Scanner (System.in);
        int student = keyboard.nextInt();
        System.out.println("\nEnter parameter to edit: 1) Family Name 2)Other Names 3)Rank.");
        int parameter = keyboard.nextInt();
        switch (parameter){
            case (1):
                System.out.println("Enter new Family Name: ");
                String newFamilyName = keyboard.nextLine();
                StudentBaseInt[] newList = new StudentBaseInt[list.length];
                for (int i = 0; i < student; i ++){
                    newList[i] = list[i];
                }
                newList [student] = create(newFamilyName, list[student].getOtherNames(), list[student].getRank());
                for (int i = student + 1; i < list.length; i ++) {
                    newList[i] = list[i];
                }
                break;
            case (2):
                System.out.println("Enter new Other Name: ");
                String newOtherName = keyboard.nextLine();

                break;
            case(3):
                System.out.println("Enter new Rank: ");
                int newRank = keyboard.nextInt();

                break;
        }
    }

    public static void display (){
        for (int index = 0; index < list.length; index ++){
            System.out.printf("%d: %s %s - %d\n" , index, list[index].getFamilyName(), list[index].getOtherNames(),
            list[index].getRank());
        }
    }
}
