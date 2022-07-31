package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private Database database;
    private static final Integer[]NUMBERS = {5,8,21,68,81,-5};
    @Before
    public void prepare() throws OperationNotSupportedException {
        Integer[] numbers = NUMBERS;
        database = new Database(numbers);
    }

@Test
    public void testCreateDatabase() throws OperationNotSupportedException {

        Integer[] dbElements = database.getElements();
        Assert.assertEquals(NUMBERS.length, dbElements.length);
    for (int i = 0; i < NUMBERS.length; i++) {
        Assert.assertEquals(NUMBERS[i],dbElements[i]);

    }
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithLessThen1Argument() throws OperationNotSupportedException {
    Database database = new Database();
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithMoreThan16Arguments() throws OperationNotSupportedException {
    new Database(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testAddWithNullArgumentShoutThrow() throws OperationNotSupportedException {
        database.add(null);
    }
    @Test
    public void testAddSuccess() throws OperationNotSupportedException {
        int initialSize = database.getElements().length;

        database.add(12);
        Integer[]dbElements = database.getElements();
        int lastElementFromDb = dbElements[dbElements.length -1];
        Assert.assertEquals(12,lastElementFromDb);
        Assert.assertEquals(initialSize + 1,dbElements.length);
    }
    @Test
    public void testRemoveSuccess() throws OperationNotSupportedException {
        int initialSize = database.getElements().length;
        database.remove();
        Integer[] currentElement = database.getElements();
        Assert.assertEquals(initialSize - 1,currentElement.length);
        int secondToLastBeforeDelete = NUMBERS[NUMBERS.length - 2];
        int lastElementAfterDelete = currentElement[currentElement.length - 1];
        Assert.assertEquals(secondToLastBeforeDelete,lastElementAfterDelete);

    }
    @Test(expected = OperationNotSupportedException.class)
    public void testShouldTrowForEmptyDatabase() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();

        }
        database.remove();
    }
}
