package com.file;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class FileWorking {
    public static FileHandler fh;
    static Logger logger = Logger.getLogger("MyLog");

    public FileWorking(){
        logger.setLevel(Level.INFO);
        try {

            // This block configure the logger with handler and formatter
            fh = new FileHandler("src/DataLog.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void FileWriting(String salat) throws IOException {
        /*
        Writing new salat to Salats.txt
         */
        BufferedWriter writer = new BufferedWriter(new FileWriter(
                "src/Salats.txt",true));
        writer.append(String.format("\n\n%s",salat));
        writer.close();
    }

    public static void FileLogging(String BufLog){
        /*
        Recording all operations during programme running
         */
        logger.info(BufLog);
    }

    public static void FileClose(){
        fh.close();
    }

    public static void FileReading(String path) throws IOException {
        /*
        Read file from path
         */
        File myObj = new File(path);
        Scanner reader = new Scanner(myObj);
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }

}
