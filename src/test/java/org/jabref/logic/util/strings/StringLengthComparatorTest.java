package org.jabref.logic.util.strings;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringLengthComparatorTest {

    private StringLengthComparator slc;


    @Before
    public void setUp() {
        slc = new StringLengthComparator();
    }

    @Test
    public void test() {
        assertEquals(-1, slc.compare("AAA", "AA"));
        assertEquals(0, slc.compare("AA", "AA"));
        assertEquals(1, slc.compare("AA", "AAA"));
    }

}
