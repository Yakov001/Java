package StudentBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentBaseApp {

    public static void main(String[] args) throws FileNotFoundException {

        // The user is asked to enter the file path.
        System.out.println("Enter file path: ");
        Scanner keyboard = new Scanner (System.in);
        File file = new File(keyboard.nextLine());

        // the constructor is called and is given the file as it's formal parameter.
        StudentBaseMaster base = new StudentBaseMaster(file);

        // the program now allows user to chose between 4 options.
        String answer;
        do {
            System.out.print("Enter next action: View, Add, Change, Quit. ");
            answer = keyboard.nextLine();
            switch (answer.charAt(0)){
                case 'V':
                    base.display(); break;
                case 'A':
                    base.add(); break;
                case 'C':
                    base.change(); break;
            }
        }
        while (answer.charAt(0) != 'Q');

        // when the user decides to finish the word, the method write writes the data to a text file.
        StudentBaseMaster.write();
    }
}
