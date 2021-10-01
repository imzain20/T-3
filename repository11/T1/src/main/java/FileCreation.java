
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

  public class FileCreation {
    public static void main(String[] args) {
    	Account atest = new Account("zain", "c111", "090178601", 1, 1000);
      File file = new File("file.txt");
      try {
    	FileWriter myWriter = new FileWriter("file.txt");
        myWriter.write(atest.getName());
        myWriter.write(atest.getAddress());
        myWriter.write(atest.AllDeductions("Savings"));
        myWriter.close();
        System.out.println("\nSuccessfully wrote to the file.");
        boolean createFile = file.createNewFile();
        if (createFile) {
          System.out.println("A New File has been created");
        }else {
          System.out.println("This File already exists");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }