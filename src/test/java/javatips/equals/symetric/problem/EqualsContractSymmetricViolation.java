package javatips.equals.symetric.problem;

import javatips.equals.symmetric.problem.Money;
import javatips.equals.symmetric.problem.Voucher;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualsContractSymmetricViolation {

    @Test
    public void test() {
        Money cash = new Money(42, "USD");
        Voucher voucher = new Voucher(42, "USD", "Amazon");

        // false => expected => ok
        assertFalse(voucher.equals(cash));

        // false => expected => wrong (true - money is not a voucher)
        assertFalse(cash.equals(voucher)); // => true // That's wrong.
    }
}
