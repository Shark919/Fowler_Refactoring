import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by D062427 on 28.04.2016.
 */
public class MovieTest {
    Movie movie = new Movie("TestMovie", 50);

    @Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 50);

    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(20);
        assertEquals(movie.getPriceCode(), 20);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(movie.getTitle(),"TestMovie");
    }

}