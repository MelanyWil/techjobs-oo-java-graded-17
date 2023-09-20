package org.launchcode.techjobs.oo;

public class Employer extends JobField {

    public Employer() {
        super();
    }
    public Employer(String value) {
        super(value);
    }

    @Override
    public String toString() {
        if (getValue() == null || getValue().isEmpty()) {
            return "Data not available";
        }
        return getValue();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }
}
