package com.demo.newspaperAds;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class CreateAdvertisementTests {
	static final String ID = "MyAdvertisementID";
	Advertisement target;
	
	@Before
	public void setUp() throws Exception {
		target = new Advertisement(ID);
	}
	
	@Test
	public void hasCorrectId() throws Exception {
		assertThat(target.getId(), is(ID));
	}
}
