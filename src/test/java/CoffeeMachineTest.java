import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {
    CoffeeMachine cf;

    @BeforeEach
    public void init (){
        cf =new CoffeeMachine();
    }

    @Nested
    public class bottomUp {

        @Test
        public void testCapacity1(){
            assertEquals(true, cf.atMaxCapacity(9000,101,10));
        }
        @Test
        public void testCapacity2(){
            assertEquals(false, cf.atMaxCapacity(90,10,9));
        }
        @Test
        public void testCapacity3(){
            assertEquals(true, cf.atMaxCapacity(0,101,10));
        }
        @Test
        public void testCapacity4(){
            assertEquals(true, cf.atMaxCapacity(0,0,100));
        }

        @Test
        public void testCanMakeCoffee1(){
            assertEquals(false, cf.canMakeCoffee());
        }


        @Test
        public void testFilling1(){
            assertEquals(false, cf.fillIngredients(9000,101,10));
        }
        @Test
        public void testFilling2(){
            assertEquals(true, cf.fillIngredients(90,10,9));
        }
        @Test
        public void testFilling3(){
            assertEquals(false, cf.fillIngredients(0,101,10));
        }
        @Test
        public void testFilling4(){
            assertEquals(false, cf.fillIngredients(0,0,100));
        }

        @Test
        public void testMakeCoffee1(){
            assertEquals(false, cf.makeCoffee());
        }
    }
}