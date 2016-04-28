import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by D062427 on 28.04.2016.
 */
public class MovieTest {
    Movie movie = new Movie("TestMovie", 1);

    @Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 1);

    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(2);
        assertEquals(movie.getPriceCode(), 2);
    }


    @Test
    public void getTitle() throws Exception {
        assertEquals(movie.getTitle(),"TestMovie");
    }

}