package com.mahady.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Mahady Hasan on 01/08/16.
 */
public class OptionalExample2 {

    public static void main(String[] args) {
        List<Trade> tradeList = new ArrayList<>();
        tradeList.add(new Trade("John", 100, Trade.Side.BUY));
        tradeList.add(new Trade("Mary", 200, Trade.Side.BUY));
        tradeList.add(new Trade("Andy", 50, Trade.Side.SELL));

        Optional<Trade> foundTrades = find("Sam", tradeList);
        System.out.println(foundTrades.orElse(new Trade("Sam", 60, Trade.Side.SELL)));

    }

    private static Optional<Trade> find(String tradername, List<Trade> tradeList) {
        for (Trade trade : tradeList) {
            if (trade.getTraderName().equals(tradername)) {
                return Optional.of(trade);
            }
        }
        return Optional.empty();
    }
}
