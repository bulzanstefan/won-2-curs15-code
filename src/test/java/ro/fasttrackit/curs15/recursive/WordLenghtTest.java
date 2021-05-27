package ro.fasttrackit.curs15.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordLenghtTest {
    @Test
    void testLenght() {
        WordLenght wordLenght = new WordLenght();
        assertThat(wordLenght.len("abcd")).isEqualTo(4);
        assertThat(wordLenght.len("")).isEqualTo(0);
        assertThat(wordLenght.len(null)).isEqualTo(0);
        assertThat(wordLenght.len("1234567890")).isEqualTo(10);
    }

    @Test
    void testReverse() {
        WordLenght wordLenght = new WordLenght();
        assertThat(wordLenght.rev("abc")).isEqualTo("cba");
        assertThat(wordLenght.rev("")).isEqualTo("");
        assertThat(wordLenght.rev(null)).isEqualTo("");
        assertThat(wordLenght.rev("restaurant")).isEqualTo("tnaruatser");
    }
}
