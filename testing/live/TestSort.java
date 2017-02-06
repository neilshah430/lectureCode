import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the methods of the Sort class */
public class TestSort {
<<<<<<< HEAD
	@Test
	public void testSort() {
		String[] input = {"cows", "dwell", "above", "clouds"};
		String[] expected = {"above", "clouds", "cows", "dwell"};
		Sort.sort(input);

		assertArrayEquals(expected, input);
	}

	@Test
	public void testFindSmallest() {
		String[] input = {"cows", "dwell", "above", "clouds"};
		int expected = 2;
		int actual = Sort.findSmallest(input, 0);
		assertEquals(expected, actual);

		input = new String[]{"cows", "dwell", "zebra", "clouds"};
		expected = 3;
		actual = Sort.findSmallest(input, 0);
		assertEquals(expected, actual);

		input = new String[]{"cows", "dwell", "above", "clouds"};
		expected = 2;
		actual = Sort.findSmallest(input, 2);
		assertEquals(expected, actual);
	}

	@Test
	public void testSwap() {
		String[] input = {"cows", "dwell", "above", "clouds"};
		String[] expected = {"above", "dwell", "cows", "clouds"};
		Sort.swap(input, 0, 2);
		assertArrayEquals(expected, input);
	}
}
=======
    /** Tests Sort.sort. */
    @Test
    public void testSort() {
        String[] input = {"hello", "trump", "hug", "sandwich"};
        String[] expected = {"hello", "hug", "sandwich", "trump"};
        Sort.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testFindSmallest() {
        String[] input = {"zebra", "trump", "hug", "sandwich"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void testSwap() {
        String[] input = {"hello", "trump", "hug", "sandwich"};
        String[] expected = {"hug", "trump", "hello", "sandwich"};
        Sort.swap(input, 0, 2);

        assertArrayEquals(expected, input);

    }
}

/*
        if (input.length != expected.length) {
                System.out.println("Error: Not Equal!");
                }

                int i = 0;
                while (i < input.length) {
        if (input[i] != expected[i]) {

        }
        }
        */
>>>>>>> 5070ca8da2cd47b168ebbef8574047df39385c26
