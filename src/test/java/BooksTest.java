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
        localDate datePublished = localDate.of(year: 2019 , Month: December , dayOfMonth: 17);
        Books testBook = new Books(name: "Habits", author:"Derrick Moles", datePublished, noOfPages:123, category:"Personal Development", availability:true);
        assertEquals( expected: true, testBook insanceof Books);
    }

    @Test
    public void borrowBook_changeAvailability_false(){
        LocalDate datePublished = LOcalDate.of( year:2019 , Month: December ,dayOfMOnth:17);
        Books testBook = new Books(name:"Habits", author    "Derrick Moles", datePublished, noOfPages:123, category:"Personal Development", availability:true);
        assertfalse(textBook.changeAvailability("Habits", "Derrick Moles"));
    }

    @Test
    public void getAllBooks_returnAllInstances_ArrayList() {
        LocalDate datePublished = LocalDate.of(year:2019, Month:December, dayOfMonth:17);
        Books testBook = new Books(name:"Habits", author "Derrick Moles", datePublished, noOfPages:123, category:
        "Personal Development", availability:true);
        Books secondBook = new Books(name:"Henry", author "J.K.Rowlings", datePublished, noOfPages:150, category:"Personal Development", availability:true);
        Books thirdBook = new Books(name:"Hulk", author "Mutea", datePublished, noOfPages:228, category:"Personal Development", availability:false);
         Books testBook = new Books(name:"Hashim", author "Yassir", datePublished, noOfPages:346, category:"Personal Development", availability:true);
           assertfalse(textBook.changeAvailability("Habits", "Derrick Moles"));
            assertfalse(textBook.changeAvailability("Habits", "Derrick Moles"));
             assertfalse(textBook.changeAvailability("Habits", "Derrick Moles"));
              assertfalse(textBook.changeAvailability("Habits", "Derrick Moles"));
    }
}