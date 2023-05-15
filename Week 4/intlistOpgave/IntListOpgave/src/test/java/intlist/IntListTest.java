package intlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntListTest {

    final int[] values = {5,4,3,2,1,8,9,};
    IntList list;

    private void addAllValues(){
        for(final int value : values){
            list.add(value);
        }
    }

    @BeforeEach
    public void setup(){
        list = new IntList();
    }

    @Test
    void remove_WithValuesAdded_AllValuesReturnedInOrder() {
        // Arrange
        addAllValues();
        // Act
        // Assert
        for(final int value : values) {  // check if each Integer is removed in the same order as it was added
            assertEquals(value, list.remove(0));
        }
        assertNull(list.remove(0)); // Are there no Integers left behind?
    }

    @Test
    void findMin_OnEmptyList_ReturnsNull() {
        // Act
        final Integer min = list.findMin();
        // Assert
        assertNull(min);
    }

    @Test
    void findMin_WithAddedValues_ReturnsLowest1() {
        // Arrange
        addAllValues();
        // Act
        final Integer min = list.findMin();
        // Assert
        assertEquals(1, min);
    }
}