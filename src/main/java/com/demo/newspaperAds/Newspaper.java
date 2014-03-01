package com.demo.newspaperAds;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;


public class Newspaper {
	private final String id;

	private final Set<Advertisement> advertisements;

	public Newspaper(String id) {
		this.id = id;
		this.advertisements = Sets.newHashSet();
	}

	public String getId() {
		return id;
	}

	public Set<Advertisement> getAdvertisements() {
		return ImmutableSet.copyOf(advertisements);
	}

	public void insert(Advertisement ad1) {
		advertisements.add(ad1);
	}

	public void insert(Iterable<Advertisement> advertisements) {
		for (Advertisement curAd : advertisements) {
			insert(curAd);
		}
	}
}
