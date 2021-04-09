package com.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.File;

public class AliyunOssUntil {

 public static final String endpoint = "oss-cn-beijing.aliyuncs.com";

 public static final String accessKeyId = "LTAI4FmcqnEBvaP1eyN66Vqp";
 public static final String accessKeySecret = "cz89WMtYoWlkwUb6OoCEFVdMP6MsFT";
 public static final String bucketName = "duanpengchang";

 public static OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

 public static void main(String[] args) {
  ossClient.putObject(bucketName, "gongzi.jpg", new File("微信图片_20201023152454.png"));
  ossClient.shutdown();
  System.out.println("上传图片完成！");
 }




}
