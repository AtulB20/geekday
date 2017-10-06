package com.geekday.moviebooking;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class ScreenRepositoryTest {

	@BeforeClass
    public static void init() {
		ScreenRepository.initialize();
    }
	
	@Test
    public void shouldSaveCustomer() throws Exception {
		ScreenRepository repository = new ScreenRepository();
        repository.save(new Screen("screen1", "Test"));
        Screen screen = repository.get("screen1");
        assertEquals("screen1", screen.getId());
        assertEquals("Test", screen.getShow());
    }
	
	
}
