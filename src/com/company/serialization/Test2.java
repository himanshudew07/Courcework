package com.company.serialization;


import java.io.*;

class User implements Serializable {

    String username = "Ricky";
    transient String password = "Ponting";

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        password = "123"+password;
        os.writeObject(password);

    }

    private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();
        String password1 = (String) ois.readObject();
        password = password1.substring(3);

    }


}
public class Test2 {

    public static void main(String[] args) throws Exception {
        User user = new User();

        FileOutputStream fos = new FileOutputStream("xyz.ser");
        ObjectOutput oos = new ObjectOutputStream(fos);

        oos.writeObject(user);

        System.out.println("-------Derialization done-----------");

        FileInputStream fis = new FileInputStream("xyz.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        User user1 = (User) ois.readObject();

        System.out.println("Deserialized Object: "+user1);


    }
}
