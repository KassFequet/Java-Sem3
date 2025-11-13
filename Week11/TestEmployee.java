package Week11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.EOFException;
import Week11.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        // Employee E1 = new Employee(1, "Abiodun", "Oyedele", 5000);
        // Employee E2 = new Employee(2, "Cameron", "Boyer", 6000);
        // Employee E3 = new Employee(3, "Kassaundra", "Fequet", 7000);
        // Employee E4 = new Employee(4, "Taylor", "Carter", 8000);

        // try {
        //     FileOutputStream out = new FileOutputStream("EmpFile.txt");
        //     ObjectOutputStream ObOut = new ObjectOutputStream(out);
        //     ObOut.writeObject(E1);
        //     ObOut.writeObject(E2);
        //     ObOut.writeObject(E3);
        //     ObOut.writeObject(E4);
        //     out.close();
        //     ObOut.close();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        ArrayList<Employee> Emp = new ArrayList<Employee>();
        try {
            FileInputStream Fin = new FileInputStream("EmpFile.txt");
            ObjectInputStream in = new ObjectInputStream(Fin);
            // Employee temp = null;
            Object temp = null;

            while (true) {
                try {
                    temp = in.readObject();

                } catch (EOFException e) {
                    break;
                }
                Emp.add((Employee) temp);
            }



            Fin.close();
            in.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Emp);
    }

}
