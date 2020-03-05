package javatips.equals.symmetric.solution;

import java.util.Objects;

public class Voucher {

    private Money money;
    private String store;

    public Voucher(Money money, String store) {
        this.money = money;
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Voucher))
            return false;
        Voucher other = (Voucher)o;
        boolean currencyCodeEquals = (this.money.currencyCode == null && other.money.currencyCode == null)
                || (this.money.currencyCode != null && this.money.currencyCode.equals(other.money.currencyCode));
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return this.money.amount == other.money.amount && currencyCodeEquals && storeEquals;
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
