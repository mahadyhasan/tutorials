package com.mahady.optionals;

/**
 * Created by Mahady Hasan on 01/08/16.
 */
public class Trade {

    private final String traderName;
    private final int amount;
    private final Side side;

    public enum Side {
        BUY, SELL
    }

    public Trade(String traderName, int amount, Side side) {

        this.traderName = traderName;
        this.amount = amount;
        this.side = side;
    }

    public String getTraderName() {
        return traderName;
    }

    public int getAmount() {
        return amount;
    }

    public Side getSide() {
        return side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trade trade = (Trade) o;

        if (amount != trade.amount) return false;
        if (traderName != null ? !traderName.equals(trade.traderName) : trade.traderName != null) return false;
        return side == trade.side;

    }

    @Override
    public int hashCode() {
        int result = traderName != null ? traderName.hashCode() : 0;
        result = 31 * result + amount;
        result = 31 * result + (side != null ? side.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "traderName='" + traderName + '\'' +
                ", amount=" + amount +
                ", side=" + side +
                '}';
    }
}
