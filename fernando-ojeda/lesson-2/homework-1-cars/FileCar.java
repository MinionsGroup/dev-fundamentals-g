package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCar {
    public List<String> readFile() {
        List<String> gasoline = new ArrayList<>();
        File archivo = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            archivo = new File("archivo.txt");
            fileReader = new FileReader(archivo);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
                gasoline.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return gasoline;
    }
}
