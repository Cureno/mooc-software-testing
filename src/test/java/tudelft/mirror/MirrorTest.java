package tudelft.mirror;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {

    private Mirror mirror;

    @BeforeEach
    void setUp() {
        mirror = new Mirror();
    }


    @Test
    void oddNumberOfCharactersMatch() {
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
        assertEquals("ab", mirror.mirrorEnds("abXYba"));
    }

    @Test
    void evenNumberOfCharactersMatch() {
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    void evenNumberOfCharactersMatch_InOddLengthWord() {
        assertEquals("a", mirror.mirrorEnds("abcda"));
    }
    @Test
    void evenNumberOfCharactersMatch_InThreeCharactersLongWord() {
        assertEquals("a", mirror.mirrorEnds("aba"));
    }

    @Test
    void evenNumberOfCharactersMatch_InFiveCharactersLongWord() {
        assertEquals("a", mirror.mirrorEnds("abbca"));
    }

    @Test
    void threeCharactersMatch() {
        assertEquals("abc", mirror.mirrorEnds("abccba"));
    }

    @Test
    void twoCharactersMatch() {
        assertEquals("a", mirror.mirrorEnds("aa"));
    }

    @Test
    void singleCharacter() {
        // Is this behavior a bug or a feature?
        assertEquals("", mirror.mirrorEnds("a"));
    }

    @Test
    void emptyString() {
        assertEquals("", mirror.mirrorEnds(""));
    }
}
