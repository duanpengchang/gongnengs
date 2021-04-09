package com.utils;

import redis.clients.jedis.Jedis;

public class RedisUtils {

                             //虚拟机地址         redis端口号
 Jedis jedis=new Jedis("192.168.44.129",6379);
//*/密码

//  jedis.auth("123456");*//*

////保存数据

//  jedis.set("name","张三");
//  jedis.set("color","yellow");
}
