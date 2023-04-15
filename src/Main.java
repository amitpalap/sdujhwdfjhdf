import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static  List<String> allfiles = new ArrayList<>();
    public static void main(String[] args) {
        allfiles.add("file3.txt");
        allfiles.add("file1.txt");
        allfiles.add("file2.txt");

        System.out.println("Welcome to my application");
        System.out.println("Developed by Amit");
        Scanner sc= new Scanner (System.in);
        while (true) {
            displayUserOption();
            int input = sc.nextInt();

            if(input == 1) {
               // list all files
                //sort all the file names
                Collections.sort(allfiles);
                for(String s : allfiles) {
                    System.out.println(s);
                }

            }
            else if(input == 2) {
                // go to menu2

                while(true) {
                    displayUserOption2();

                    int input2 = sc.nextInt();

                    if(input2 == 1) {
                        /// add a file
                        System.out.println("please enter file name to add");
                        String s = sc.next();

                        allfiles.add(s);

                        System.out.println("file added successfully");
                    }
                    if(input2 == 2) {
                        //delete a file
                        System.out.println("please enter file name to delete");
                        String s = sc.next();

                        //allfiles.contains(s) // true , false

                        if(allfiles.contains(s)) {
                            allfiles.remove(s);

                            System.out.println("file deleted successfully");
                        }
                        else  {
                            System.out.println("file not found");
                        }
                    }
                    if(input2 == 3) {
                        //search a file
                        System.out.println("Please enter file name to search");
                        String s = sc.next();

                        if(allfiles.contains(s)) {
                            System.out.println("file is present");
                        }
                        else {
                            System.out.println("file not found");
                        }
                    }
                    if(input2 == 4) {
                        //go to mian menu
                        break;
                    }

                }

            }
            else if(input == 3) {
                // exit program
                break;
            }
        }
    }

    private static void displayUserOption() {

        System.out.println("---------------------------");
        System.out.println( " 1. List All Files");
        System.out.println(" 2. Create/Search/Delete Files");
        System.out.println(" 3 . Exit program");

    }
    private static void displayUserOption2(){
        System.out.println("------------------------------------");
        System.out.println(" 1. Add a File");
        System.out.println(" 2. Delete a File");
        System.out.println(" 3. Search a File");
        System.out.println(" 4. Go to main menu");
    }
}