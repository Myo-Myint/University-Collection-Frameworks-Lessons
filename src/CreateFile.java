import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args)   {
        try {

            File myfile = new File("My file.txt");
            myfile.createNewFile();
            myfile.setReadable(true);

           //writing
            FileWriter writer = new FileWriter("My file.txt");
            writer.write("Yes I just created a file !");
            writer.close();
            System.out.println("Successfully written.");



            //read
            Scanner reader = new Scanner(myfile);
            while (reader.hasNext()){
                System.out.print(reader.nextLine());
            }

            //deletion
//            if (myfile.delete()) {
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
