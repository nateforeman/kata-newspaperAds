package com.demo.newspaperAds;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CompareAdvertisementTests {

	static final String ADVERTISEMENT_ID_A = "Paper A";
	static final String ADVERTISEMENT_ID_B = "Paper B";
	
	static final Advertisement ADVERTISEMENT_A1 = new Advertisement(ADVERTISEMENT_ID_A);
	static final Advertisement ADVERTISEMENT_A2 = new Advertisement(ADVERTISEMENT_ID_A);
	static final Advertisement ADVERTISEMENT_B1 = new Advertisement(ADVERTISEMENT_ID_B);
	
	@Test
	public void reflexiveIsEqual() throws Exception {
		assertThat(ADVERTISEMENT_A1, is(ADVERTISEMENT_A1));
	}
	
	@Test
	public void sameIdsIsEqual() throws Exception {
		assertThat(ADVERTISEMENT_A1, is(ADVERTISEMENT_A2));
	}
	
	@Test
	public void differentIdsAreNotEqual() throws Exception {
		assertThat(ADVERTISEMENT_B1, not(ADVERTISEMENT_A2));
	}
}
