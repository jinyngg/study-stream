package com.study.functional;
import com.study.functional.comparator.User;

import java.util.*;

public class ComparatorPractice {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John"));
        users.add(new User(5, "Alice"));
        users.add(new User(3, "Bob"));

        /**
         * o1 < o2 : 음수
         * o1 = o2 : 0
         * o1 > o2 : 양수
         */
        Comparator<User> idComparator = (User u1, User u2) -> {
            return u1.getId() - u2.getId();
        };
        Collections.sort(users, idComparator);
        System.out.println(users);

        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println(users);
    }
}
