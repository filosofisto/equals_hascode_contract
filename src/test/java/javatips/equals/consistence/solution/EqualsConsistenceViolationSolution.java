package javatips.equals.consistence.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualsConsistenceViolationSolution {

    @Test
    public void test() {
        People p1 = new People("Pedro");
        People p2 = new People("Pedro");

        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
