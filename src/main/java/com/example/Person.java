package com.example;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Field;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity(name = "people")
public class Person implements Serializable {

    @Id
    @Field(name = "_id")
    private Long _id;

    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void set_id(final long _id) {
        this._id = _id;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(final Long _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
