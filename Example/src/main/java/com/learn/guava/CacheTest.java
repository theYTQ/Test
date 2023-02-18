package com.learn.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class CacheTest {
    @Test
    public void cacheLoaderTest() throws ExecutionException {
        LoadingCache<Integer, User> cache = CacheBuilder.newBuilder().maximumSize(2)
                .build(new CacheLoader<Integer, User>() {
                    @Override
                    public User load(Integer integer) throws Exception {
                        return null;
                    }
                });
        List<User> userList = User.createUserList();
        userList.forEach(user -> cache.put(user.getId(), user));
        System.out.println(cache.get(3));
        System.out.println(cache.get(2));
    }
}
