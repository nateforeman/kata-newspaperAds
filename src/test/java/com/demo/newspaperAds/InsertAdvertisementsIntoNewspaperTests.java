package com.demo.newspaperAds;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class InsertAdvertisementsIntoNewspaperTests {

	static final Advertisement AD_1 = new Advertisement("AD_1");
	static final Advertisement AD_2 = new Advertisement("AD_2");
	static final Advertisement AD_3 = new Advertisement("AD_3");
	
	Newspaper target;
	
	@Before
	public void setUp() throws Exception {
		target = new Newspaper("Foo News");
	}
	
	@Test
	public void initiallyNewspaperHasNoAds() throws Exception {
		assertThat(target.getAdvertisements().isEmpty(), is(true));
	}
	
	@Test
	public void canInsertOne() throws Exception {
		target.insert(AD_1);
		assertThat(target.getAdvertisements().size(), is(1));
		assertThat(target.getAdvertisements(), hasItem(AD_1));
	}
	
	@Test
	public void ignoresDuplicates() throws Exception {
		target.insert(AD_1);
		target.insert(AD_1);
		assertThat(target.getAdvertisements().size(), is(1));
		assertThat(target.getAdvertisements(), hasItem(AD_1));
	}
	
	@Test
	public void canInsertMany() throws Exception {
		target.insert(AD_1);
		target.insert(AD_2);
		target.insert(AD_3);
		assertThat(target.getAdvertisements().size(), is(3));
		assertThat(target.getAdvertisements(), hasItem(AD_1));
		assertThat(target.getAdvertisements(), hasItem(AD_2));
		assertThat(target.getAdvertisements(), hasItem(AD_3));
	}
	
	@Test
	public void insertListOfManyAdvertisementsIgnoresDuplicates() throws Exception {
		final List<Advertisement> ADS = ImmutableList.of(AD_1, AD_2, AD_3, AD_2);
		target.insert(ADS);
		assertThat(target.getAdvertisements().size(), is(3));
		assertThat(target.getAdvertisements(), hasItem(AD_1));
		assertThat(target.getAdvertisements(), hasItem(AD_2));
		assertThat(target.getAdvertisements(), hasItem(AD_3));
	}
	
}
