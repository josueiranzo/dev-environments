import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {
    @Test
    void testDeposit() {
        Account account = new Account(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        Account account = new Account(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Account account = new Account(100);
        account.withdraw(200);
        assertEquals(100, account.getBalance()); // No cambia el saldo
    }
}
