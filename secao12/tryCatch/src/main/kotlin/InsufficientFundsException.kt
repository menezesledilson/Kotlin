class InsufficientFundsException(val currentBalance: Double) : RuntimeException("Saldo insuficiente: $currentBalance")
