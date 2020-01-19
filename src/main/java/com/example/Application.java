package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.data.datastore.core.DatastoreTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private DatastoreTemplate datastoreTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(final String... args) {
        final Person person1 = new Person("Person1FirstName", "Person1LastName");
        final Person person2 = new Person("Person2FirstName", "Person2LastName");
        final Person save1 = datastoreTemplate.save(person1);
        final Person save2 = datastoreTemplate.save(person2);
        System.out.println(person1.get_id());
        System.out.println(save2.get_id());
    }
}
