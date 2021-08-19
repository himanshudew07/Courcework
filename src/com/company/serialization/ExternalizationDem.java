package com.company.serialization;

import java.io.*;

class Acc implements Externalizable {

    public Acc(int number, String name, String bankname) {
        this.number = number;
        this.name = name;
        this.bankname = bankname;
    }



    int number;
    String name;
    String bankname;

    public Acc() {
    }

    public void writeExternal(ObjectOutput oo) throws IOException{
        oo.writeInt(number);
        oo.writeObject(name);
    }
    public void readExternal(ObjectInput oi) throws IOException,ClassNotFoundException{
        number = oi.readInt();
        name = (String) oi.readObject();
    }

    @Override
    public String toString() {
        return "Acc{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", bankname='" + bankname + '\'' +
                '}';
    }
}

public class ExternalizationDem {

    public static void main(String[] args) throws Exception {

        Acc acc = new Acc(254,"Saving account","State Bank");

        FileOutputStream fos = new FileOutputStream("test.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Before Exter  "+acc);

        oos.writeObject(acc);

        FileInputStream fis = new FileInputStream("test.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Acc acc1 = (Acc) ois.readObject();

        System.out.println("After exter "+acc1);


    }
}
