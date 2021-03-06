package searchingFile;

import Home.Home;

import java.io.File;

/**
 * The function of searchingFile.FindFilesName class is find suitable file names
 * when user give as the input.
 *
 * @author : Eranda Upeshitha
 * @version : 1.0
 * @since : 2021/03/09
 */
public class FindFilesName {
    /**
     * search user type file extension, is there in the folder.
     *
     * @param location   get full file location
     * @param extension  get file extension
     */
    public void listFiles(String location, String extension){

        SearchFiles files = new SearchFiles(extension);
        File folder = new File(location);

        if (folder.isDirectory() == false){
            System.out.println("Folder does not exists: " +location);
            return;
        }

        String[] list = folder.list(files);

        if (list.length == 0){
            System.out.println("There are no files with "+extension +" extensions.");
            return;
        }
        for(String file : list){
            String temp = new StringBuffer().append(file).toString();
            System.out.println(temp);
        }
    }
}
