import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMMachineTest {
    ATMMachine am;

    @BeforeEach
    public void init (){
        am =new ATMMachine(10000);
    }
    @Nested
    class BottomUp{
        @Test
        void canWithdrawTest1() {
            assertEquals(true, am.canWithdraw(10));

        }
        @Test
        void canWithdrawTest2() {
            assertEquals(true, am.canWithdraw(9999));

        }
        @Test
        void canWithdrawTest3() {
            assertEquals(false, am.canWithdraw(1000000000));

        }
        @Test
        void canWithdrawTest4() {
            assertEquals(false, am.canWithdraw(10001));

        }

        @Test
        void withdrawMoneyTest1() {
            assertEquals(true, am.withdrawMoney(10));
        }
        @Test
        void withdrawMoneyTest2() {
            assertEquals(true, am.withdrawMoney(10));
        }
        @Test
        void withdrawMoneyTest3() {
            assertEquals(true, am.withdrawMoney(10));
        }
        @Test
        void withdrawMoneyTest4() {
            assertEquals(true, am.withdrawMoney(10));
        }
    }

}