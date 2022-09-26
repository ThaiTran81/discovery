package org.example;

import org.example.model.Group;
import org.example.model.Person;

/**
 *
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .setId(1)
                .setName("John")
                .setAge(20).build();

        Person person2 = Person.newBuilder()
                .setId(2)
                .setName("Jane")
                .setAge(20).build();


        var group = Group.newBuilder()
                .addPersons(person)
                .addPersons(person2).build();

        System.out.println(group);
    }
}