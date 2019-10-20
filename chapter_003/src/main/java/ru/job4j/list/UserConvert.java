package ru.job4j.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

 class UserConvert {

	 static HashMap<Integer, User> process(List<User> list) {
		HashMap<Integer, User> result = new HashMap<>();
		for (User user : list) {
			result.put(user.getId(), user);
		}
		return result;
	}
}
