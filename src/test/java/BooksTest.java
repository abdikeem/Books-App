import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class BooksTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkInstance_CreateNewObject(){
        localDate datePublished = localDate.of(year: 2019 , month: December , dayOfMonth: 17);
        Books testbook = new Books("Habits", "Derrick Moles", datePublished, 123, "Personal Development", availability:true);
        assertEquals( expected: true, testBook insanceof Books);
    }

    @Test
    public void borrowBook_changeAvailability_false(){
        LocalDate datePublished = LOcalDate.of( year:2019 , month: December ,dayOfMOnth:17);
        Books testbook = new Books("Habits", "Derrick Moles", datePublished, 123, "Personal Development", availability:true);
        assertfalse(textBook.changeAvailability("Habits", "Derrick Moles"));
    }

    @Test
    public void getAllBooks_returnAllInstances_ArrayList()
}