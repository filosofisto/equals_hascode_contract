package javatips.equals.symmetric.problem;

import java.util.Objects;

public class Voucher extends Money {

    private String store;

    public Voucher(int amount, String currencyCode, String store) {
        super(amount, currencyCode);
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Voucher))
            return false;
        Voucher other = (Voucher)o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return this.amount == other.amount && currencyCodeEquals && storeEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), store);
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
