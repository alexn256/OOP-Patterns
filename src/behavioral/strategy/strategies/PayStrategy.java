package behavioral.strategy.strategies;

/**
 * Common all strategies interface.
 *
 * @author Alexander Naumov.
 */

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
