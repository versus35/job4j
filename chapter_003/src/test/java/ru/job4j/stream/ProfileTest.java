package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfileTest {
	@Test
	public void whenAddress() {
		Address address = new Address("Moscow", "Lenina", 36, 12);
		Address address1 = new Address("S.P", "Nevskii", 12, 13);
		Profile profile = new Profile(address);
		Profile profile1 = new Profile(address1);
		List<Profile> profiles = new ArrayList<>(Arrays.asList(profile, profile1));
		List<Address> expect = new ArrayList<>(Arrays.asList(address, address1));
		List<Address> result = Profile.collect(profiles);
		assertThat(result, is(expect));
	}

	@Test
	public void whenUniqueSort() {
		Address address = new Address("Moscow", "Lenina", 36, 12);
		Address address1 = new Address("S.P", "Nevskii", 12, 13);
		Profile profile1 =  new Profile(address);
		Profile profile2 = new Profile(address1);
		Profile profile3 = new Profile(address1);
		List<Profile> profiles = new ArrayList<>(Arrays.asList(profile1, profile2, profile3));
		List<Address> expected = new ArrayList<>(Arrays.asList(address, address1));
		List<Address> result = Profile.whenCollect(profiles);
		assertThat(result, is(expected));
	}
}