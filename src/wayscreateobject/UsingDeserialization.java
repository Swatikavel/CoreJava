package wayscreateobject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
int id = 127;
String name = "Ram";
}
public class UsingDeserialization {
   public static void main(String[] args) throws Exception {
        Employee e1 = new Employee();
        // Serialize the object into a byte array
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bytes);
        out.writeObject(e1);
        out.close();
        //Deserialize : reconstruct an Object
        ByteArrayInputStream in = new ByteArrayInputStream(bytes.toByteArray());
      // Employee e2 = (Employee) in.readObject();
       in.close();
       // System.out.println(e2.id);
        //System.out.println(e2.name);
    }
}
//