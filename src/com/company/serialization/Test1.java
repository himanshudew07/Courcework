package com.company.serialization;


import java.io.*;

class Emp implements Serializable {
    public Emp(int eno, String name, int sal) {
        this.eno = eno;
       // this.name = name;
        this.sal = sal;
    }

    transient static int eno;
    transient  String name = "Ram";
    int sal;

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
public class Test1 {
    public static void main(String[] args) throws Exception {

        Emp emp = new Emp(100,"Harish",2500);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);

        System.out.println("Serialization ended");

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInput ois = new ObjectInputStream(fis);
        Emp emp1 = (Emp) ois.readObject();

        System.out.println("Deserialized object : "+emp1);


    }

}
