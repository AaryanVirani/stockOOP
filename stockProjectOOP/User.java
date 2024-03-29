package stockProjectOOP;

import java.util.List;

public class User implements Trader {
    private Portfolio portfolio;
    private double budget;

    /**
     * CONSTRUCTOR: User
     * 
     * @param budget (double) - the initial budget for the user.
     * 
     *               PROCESSING: Initializes the user with the given budget
     *               and an empty portfolio.
     * 
     * @return none
     */
    public User(double budget) {
        this.budget = budget;
        this.portfolio = new Portfolio();
    }

    /*------------------
    GETTERS AND SETTERS
    -------------------*/

    @Override
    public List<PortfolioItem> getPortfolioItems() {
        return portfolio.getPortfolioItems();
    }

    @Override
    public Portfolio getPortfolioObject() {
        return this.portfolio;
    }

    @Override
    public double getBudget() {
        return budget;
    }

    @Override
    public void setBudget(double newBudget) {
        budget = newBudget;
    }

    /*--------------
    GENERAL METHODS
    --------------*/

    /**
     * METHOD: evaluatePortfolioValue
     * 
     * PROCESSING: Calculates the total current value of all stocks in the user's
     * portfolio.
     * Delegates the calculation to the getTotalValue method of the Portfolio class.
     * 
     * @return double - The total value of the user's portfolio.
     */
    @Override
    public double evaluatePortfolioValue() {
        return portfolio.getTotalValue();
    }

    /**
     * METHOD: viewPortfolioPerformance
     * 
     * PROCESSING: Provides an overview of the user's portfolio performance,
     * including the  the overall profit or loss.
     * This method calculates the total investment based on the initial purchase
     * price of each stock
     * in the portfolio and compares it with the current portfolio value to
     * determine the profit or loss.
     * 
     * @return double - A double representing of the portfolio's performance (profit/loss)
     */
    @Override
    public double viewPortfolioPerformance() {
        double totalInvestment = 0.0;
        double currentPortfolioValue = evaluatePortfolioValue();

        for (PortfolioItem item : getPortfolioItems()) {
            totalInvestment += item.getSharesOwned() * item.getPurchasePrice();
        }

        double profitOrLoss = currentPortfolioValue - totalInvestment;
        return profitOrLoss;
    }

}