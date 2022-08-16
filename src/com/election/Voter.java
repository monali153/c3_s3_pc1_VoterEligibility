package com.election;

public class Voter {

    static final int VOTER_ELIGIBLE_AGE = 18;
    private String name;
    private int age;

    public Voter() {
        name = null;
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCriteria() {

        if (getAge() >= VOTER_ELIGIBLE_AGE) {
            return getName() + " Is Eligible to Vote";
        } else if (getAge() > 0 && age < VOTER_ELIGIBLE_AGE) {
            return getName() + " Is Not Eligible to Vote";
        }
        return "Age Can't Be Negative or Zero";

    }
}
