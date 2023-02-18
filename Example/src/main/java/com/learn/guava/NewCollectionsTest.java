package com.learn.guava;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NewCollectionsTest {
    @Test
    public void multiSetTest() {
        List<String> list = Arrays.asList("A", "A", "B", "B", "B", "C");
        Multiset<String> multiset = HashMultiset.create();
        multiset.addAll(list);
        System.out.println(multiset.toString());
        multiset.add("A", 1);
        multiset.remove("B", 2);
        System.out.println(multiset.toString());
    }

    @Test
    public void multiMapTest() {
        List<User> userList = User.createUserList();
        Multimap<String, User> multimap = ArrayListMultimap.create();
        userList.forEach(user -> multimap.put(user.getName(), user));
        for (String userName: multimap.keySet()) {
            Collection<User> users = multimap.get(userName);
            System.out.println(users.toString());
        }
    }

    @Test
    public void biMapTest() {
        BiMap<String, Integer> userNameIdMap = HashBiMap.create();
        List<User> userList = User.createUserList();
        userList.forEach(user -> userNameIdMap.put(user.getName(), user.getId()));
        System.out.println(userNameIdMap.toString());
    }

    @Test
    public void tableTest() {
        Table<Integer, String, Integer> table = HashBasedTable.create();
        List<User> userList = User.createUserList();
        userList.forEach(user -> table.put(user.getId(), user.getName(), user.getAge()));
        System.out.println(table.toString());
        System.out.println(table.rowMap().toString());
        System.out.println(table.rowKeySet().toString());
    }

    @Test
    public void rangeSetTest() {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(1, 10));
        System.out.println(rangeSet.toString());
        rangeSet.add(Range.closedOpen(11, 15));
        System.out.println(rangeSet.toString());
        rangeSet.add(Range.closedOpen(15, 20));
        System.out.println(rangeSet.toString());
        rangeSet.add(Range.openClosed(0, 0));
        System.out.println(rangeSet.toString());
        rangeSet.remove(Range.open(5, 10));
        System.out.println(rangeSet.toString());
    }
}
