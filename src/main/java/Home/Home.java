package Home;

import searchingFile.FindFilesName;

import java.util.Scanner;

/**
 * The Home.Home class implements the main controller of the project.
 * It controls the other class, and functions.
 *
 * @author : Eranda Upeshitha
 * @version : 1.0
 * @since : 2021/03/09
 */
public class Home {

    private static String fileType;
    private static final String fileLocation = "E:\\User\\Downloads\\Files"; //change your target directory path

    public static void main(String[] args) {
        Home home = new Home();
        home.chooseFileType();
        FindFilesName findFilesName = new FindFilesName();
        findFilesName.listFiles(fileLocation,fileType);
    }

    public void chooseFileType(){
        Scanner input = new Scanner(System.in);

        System.out.println("Type want to search file extension with dot mark \n" +
                ".PDF | .XLSX | .TXT | .PPT");
        fileType = input.nextLine();
    }

    public String getFileType(){
        return fileType;
    }
}
