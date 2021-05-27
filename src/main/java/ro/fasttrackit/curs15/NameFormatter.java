package ro.fasttrackit.curs15;

public class NameFormatter {

    public String shortName(String firstName, String lastName) {
        return (firstName == null ? "" : firstName.charAt(0) + ". ") +
                (lastName == null ? "" : lastName);
    }
}
