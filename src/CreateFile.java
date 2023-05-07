import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args)   {
        try {
            File foldermkder = new File("My Folder");
            boolean boo1 = foldermkder.mkdir();
            if (boo1) {
                System.out.println("Folder created: " + foldermkder.getName());
            } else {
                System.out.println("Folder exits");
            }
            System.out.println("__________________________________");

            //files creation
            for (int i = 0; i < 20; i++) {
                File myfile = new File("My folder/My_file" + i + ".txt");
                myfile.createNewFile();
                myfile.setReadable(true);
            }

            //writing
            for (int i = 0; i < 20; i++) {
                FileWriter writer = new FileWriter("My folder/My_file" + i + ".txt");
                writer.write("Yes I just created  file no." + i);
                writer.close();
            }


            File[] files_list = foldermkder.listFiles();

            for (File file: files_list) {
                Scanner reader = new Scanner(file);
                while (reader.hasNext()){
                    System.out.println("The file name called("+file.getName()+")"+"has content: "+reader.nextLine());
                }
            }

//            Scanner reader = new Scanner(myfile);
//            while (reader.hasNext()){
//                System.out.print(reader.nextLine());
//            }

//            System.out.println("Successfully written.");

            //read


//            deletion
//            if (myfile.delete() && foldermkder.delete()) {
//                System.out.println("The deleted file is : " + myfile.getName());
//            }
//            else {
//                System.out.println("Failed in deleting the file.");
//            }

        } catch (IOException e) {
            System.out.println("Error");
           e.printStackTrace();
        }
    }
}
