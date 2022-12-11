package com.command;
import com.file.*;

import java.io.IOException;
import java.util.Scanner;

public class Database {
    Scanner scanner = new Scanner(System.in);
    public Database() {

    }

    public void salatFile() throws IOException {
                 /*
                 Read file Salats.txt (it contains all saved salats)
                 */
        System.out.println("\n\n\n");
        FileWorking.FileReading("src/Salats.txt");
    }

    public void help() throws IOException {
                /*
                Read file Help.txt (it contains documentation of using progmamme)
                */
        System.out.println("\n\n\n");
        FileWorking.FileReading("src/Help.txt");
    }

    public void exit(){
        System.exit(0);
    }
}
