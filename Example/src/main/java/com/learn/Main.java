package com.learn;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.learn.juejin.Animal;
import org.apache.commons.collections4.CollectionUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
    }

    private static void test() {
        ArrayList<Integer> list1 = Lists.newArrayList(1, 2, 3);
        ArrayList<Integer> list2 = Lists.newArrayList(3,1,2);

        boolean equal = CollectionUtils.isEqualCollection(list1, list2);
        System.out.println(equal);
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }
        System.out.println(JSON.toJSON(map));
        List<List<Integer>> res = new ArrayList<>();
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (int i = 0; i <= list.size() - key; i += key) {
                List<Integer> tmp = list.subList(i, i + key);
                System.out.println(JSON.toJSON(tmp));
                res.add(new ArrayList<>(tmp));
            }
        }
        return res;
    }

    private static ThreadLocal<DateFormat> threadLocal = ThreadLocal.withInitial(() ->
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static Date parse(String dateStr) {
        Date date = null;
        try {
            date = threadLocal.get().parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

class MyThread2 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("come in");
        return "hello";
    }
}
