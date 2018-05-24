package com.expertzlab.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamEx2 {

    public static void main(String[] args) throws Exception{
        int idA = 1;
        String nameA = "City";
        int populationA = 5;
        float tempA = 1.0f;

        int idB = 2;
        String nameB = "S";
        int populationB = 2;
        float tempB = 1.45f;

        FileOutputStream fos = new FileOutputStream("ag22.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(idA);
        dos.writeUTF(nameA);
        dos.writeInt(populationA);
        dos.writeFloat(tempA);

        dos.writeInt(idB);
        dos.writeUTF(nameB);
        dos.writeInt(populationB);
        dos.writeFloat(tempB);

        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("ag22.txt");
        DataInputStream dis = new DataInputStream(fis);

        int cityId = dis.readInt();
        System.out.println("City Id: " + cityId);
        String cityName = dis.readUTF();
        System.out.println("City Name: " + cityName);
        int cityPopulation = dis.readInt();
        System.out.println("City Population: " + cityPopulation);
        float cityTemperature = dis.readFloat();
        System.out.println("City Temperature: " + cityTemperature);
    }
}