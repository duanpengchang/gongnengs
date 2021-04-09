package com.controller;

import com.utils.AliyunOssAllUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("aly")
public class TestAliyunPictureUpload {


 //图片上传
 @PostMapping("/uploadFile")
 @ResponseBody
 public Map<String,Object> uploadFile(@RequestParam("img") MultipartFile img){
  Map<String,Object> map = new HashMap<String,Object>();
  AliyunOssAllUtils aliyunOssUtils=new AliyunOssAllUtils();
  String url = "";
  try {
   /*获取上传的图片名称*/
   url = aliyunOssUtils.uploadImg2Oss(img);
  } catch (Exception e) {
   e.printStackTrace();
  }
  /*拼接图片路径 并返回到前台*/
  String imageUrl = aliyunOssUtils.getImageUrl(url);
  map.put("imgurl",imageUrl);

  return map;

 }
}
