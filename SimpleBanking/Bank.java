

    public void transfer(int fromId, int toId, BigDecimal amount) {
        if (amount == null) throw new IllegalArgumentException("Amount required");
        if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("Amount must be positive");

        BankAccount from = getAccount(fromId);
        BankAccount to = getAccount(toId);
        if (from == null) throw new IllegalArgumentException("Source account not found: " + fromId);
        if (to == null) throw new IllegalArgumentException("Destination account not found: " + toId);
        // To avoid deadlock, lock accounts in id order
        BankAccount first = fromId < toId ? from : to;
        BankAccount second = fromId < toId ? to : from;
        synchronized (first) {
            synchronized (second) {
                from.transferTo(to, amount);
            }
        }
    }
}
