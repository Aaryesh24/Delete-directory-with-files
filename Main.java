package com.wyvern;

import java.io.File;

public class Main  {
    public static void main(String[] args){
        File file = new File("C:\\Users\\RDRL\\Desktop\\Basic Plugin\\CustomPlugins\\src\\com\\wyvern\\filename");
        String[] fileArray = file.list();
        if (fileArray != null){
            for (String i : fileArray){
                String path = "C:\\Users\\RDRL\\Desktop\\Basic Plugin\\CustomPlugins\\src\\com\\wyvern\\filename\\";
                File file1 = new File(path + i);
                file1.delete();
                System.out.println("file '" + i +"' is deleted");
            }
            file.delete();
            System.out.println("Folder filename deleted");
        }
    }
}
