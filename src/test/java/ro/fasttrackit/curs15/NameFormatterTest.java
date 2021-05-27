package ro.fasttrackit.curs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameFormatterTest {
    private NameFormatter formatter;

    @BeforeEach
    void setup() {
        //SETUP
        formatter = new NameFormatter();
    }

    @Test
    @DisplayName("WHEN firstName is Ana and lastName is Popescu THEN the return is A. Popescu")
    void simpleHappyFlow() {
//        RUN
        String result = formatter.shortName("Ana", "Popescu");
//        ASSERT
        assertThat(result).isEqualTo("A. Popescu");
    }

    @Test
    @DisplayName("WHEN two identical names are sent THEN the return is correct")
    void identicalNames() {
        //RUN
        String result = formatter.shortName("Ana", "Ana");
        //ASSERT
        assertThat(result).isEqualTo("A. Ana");
    }

    @Test
    @DisplayName("WHEN firstName is null THEN only the last name is printed")
    void firstNameNull() {
        //RUN
        String result = formatter.shortName(null, "Popescu");
        //ASSERT
        assertThat(result).isEqualTo("Popescu");
    }

    @Test
    @DisplayName("WHEN lastName is null THEN the first letter with point is returned")
    void lastNameNull() {
        //RUN
        String result = formatter.shortName("Ana", null);
        //ASSERT
        assertThat(result).isEqualTo("A. ");
    }

    @Test
    @DisplayName("WHEN firstName and lastName are NULL THEN empty string is returned")
    void lastNameFirstNameNull() {
        //RUN
        String result = formatter.shortName(null, null);
        //ASSERT
        assertThat(result).isEmpty();
    }
}
