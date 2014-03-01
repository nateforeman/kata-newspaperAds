package com.demo.newspaperAds;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class CreateNewspaperTests {

	static final String ID = "MyNewspaperID";
	Newspaper target;
	
	@Before
	public void setUp() throws Exception {
		target = new Newspaper(ID);
	}
	
	@Test
	public void hasCorrectId() throws Exception {
		assertThat(target.getId(), is(ID));
	}
}
