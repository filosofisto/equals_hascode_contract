package javatips.equals.symmetric.solution;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class EqualsContractSymmetricViolationSolution {

    @Test
    public void test() {
        Money cash = new Money(42, "USD");
        Voucher voucher = new Voucher(cash, "Amazon");

        // false => expected => ok
        assertFalse(voucher.equals(cash));

        // false => expected => ok
        assertFalse(cash.equals(voucher));
    }
}
