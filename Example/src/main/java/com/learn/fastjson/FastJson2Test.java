package com.learn.fastjson;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FastJson2Test {
    private final static Integer NUM = 100;

    public static void main(String[] args) {
        // 总时间
        long totalTime = 0L;
        //初始化学生数据
        List<Student> studentList = new ArrayList<>();
        // 10w学生
        for (int i = 0; i < 100000; i++) {
            studentList.add(Student.builder().name("我犟不过你").age(10).address("黑龙江省哈尔滨市南方区哈尔滨大街267号").build());
        }
        // 按指定次数循环
        for (int i = 0; i < NUM; i++) {
            // 单次循环开始时间
            long startTime = System.currentTimeMillis();
            // 遍历学生数据
            studentList.forEach(student -> {
                // 序列化
                String s = JSONObject.toJSONString(student);
                //字符串转回java对象
                JSONObject.parseObject(s, Student.class);
            });
            // 将学生list序列化，之后转为jsonArray
            JSONArray jsonArray = JSONArray.parseArray(JSONObject.toJSONString(studentList));
            // 将jsonArray转java对象list
            jsonArray.toList(Student.class);
            //单次处理时间
            long endTime = System.currentTimeMillis();
            // 单次耗时
            totalTime += (endTime - startTime);
            System.out.println("单次耗费时间：" + (endTime - startTime) + "ms");
        }
        System.out.println("平均耗费时间：" + totalTime / NUM + "ms");
    }

    //上述代码在fastjson和fastjson2的测试中基本相同，唯一不同在于在fastjson2当中，jsonArray.toJavaList方法转变成了jsonArray.toList。
}
