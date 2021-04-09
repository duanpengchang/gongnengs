package com.utils;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeChangeUtils {


 private static final String DEFAULT_STRING = "";
 private static final int DEFAULT_INT = 0;
 private static final long DEFAULT_LONG = 0L;
 private static final double DEFAULT_DOUBLE = 0.0D;
 private static final float DEFAULT_FLOAT = 0.0F;
 private static final boolean DEFAULT_BOOLEAN = Boolean.FALSE;





 public static BigDecimal toBigdecimalAdd(double v1, double v2){

  BigDecimal b1 = new BigDecimal(Double.toString(v1));
  BigDecimal b2 = new BigDecimal(Double.toString(v2));

  return b1.add(b2);

 }

 public static BigDecimal toBigdecimalsub(double v1,double v2){

  BigDecimal b1 = new BigDecimal(Double.toString(v1));
  BigDecimal b2 = new BigDecimal(Double.toString(v2));

  return b1.subtract(b2);

 }


 public static BigDecimal toBigdecimalmul(double v1,double v2){

  BigDecimal b1 = new BigDecimal(Double.toString(v1));
  BigDecimal b2 = new BigDecimal(Double.toString(v2));

  return b1.multiply(b2);

 }

 public static BigDecimal toBigdecimaldiv(double v1,double v2){

  BigDecimal b1 = new BigDecimal(Double.toString(v1));
  BigDecimal b2 = new BigDecimal(Double.toString(v2));

  return b1.divide(b2);

 }




 // [start]字符串转各种格式

 // 字符串转日期(格式:"yyyyMMdd")
 public static Date StrToDate_yyyMMdd(String str) {
  DateFormat format = new SimpleDateFormat("yyyyMMdd");
  Date date = null;
  try {
   date = format.parse(str);
  } catch (ParseException e) {
   e.printStackTrace();
  }
  return date;
 }

 // 字符串转日期(格式:"dd/MM/yyyy")
 public static Date StrToDate_ddMMyyyy(String str) {
  DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
  Date date = null;
  try {
   date = format.parse(str);
  } catch (ParseException e) {
   e.printStackTrace();
  }
  return date;
 }

 // 字符串转日期(格式:"yyyy-MM-dd")
 public static Date StrToDate_yyyyMMdd(String str) {
  DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
  Date date = null;
  try {
   date = format.parse(str);
  } catch (ParseException e) {
   e.printStackTrace();
  }
  return date;
 }

 // 字符串转日期(格式:"yyyy-MM-dd HH:mm:ss")
 public static Date StrToDate_yyyyMMddHHmmss(String str) {
  DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  Date date = null;
  try {
   date = format.parse(str);
  } catch (ParseException e) {
   e.printStackTrace();
  }
  return date;
 }

 // 字符串转Integer
 public static Integer StrToInteger(String str) {
  Integer integer = null;
  try {
   integer = Integer.valueOf(str);
  } catch (Exception e) {
   e.printStackTrace();
  }
  return integer;
 }

 // 字符串转Double
 public static Double StrToDouble(String str) {
  Double double1 = 0.00;
  try {
   double1 = Double.parseDouble(str);
  } catch (Exception e) {
   e.printStackTrace();
  }
  return double1;
 }

 // 字符串转时间戳
 public static Timestamp StrToTimeStamp(String str) {
  Timestamp timestamp = null;
  try {
   timestamp = Timestamp.valueOf(str);
  } catch (Exception e) {
   e.printStackTrace();
  }
  return timestamp;
 }

 // 字符串转BigDecimal
 public static BigDecimal StrToBigdecimal(String str) {
  BigDecimal bigDecimal = null;
  try {
   bigDecimal = new BigDecimal(str);
  } catch (Exception e) {
   e.printStackTrace();
  }
  return bigDecimal;
 }
 // [end]




 public static String toString(Object obj, String defaultValue) {
  return obj != null ? obj.toString() : defaultValue;
 }

 public static String toString(Object obj) {
  return toString(obj, DEFAULT_STRING);
 }

 public static String toString(Date obj, String defaultValue) {
  return obj != null ? obj.toString() : defaultValue;
 }

 public static String toString(Date obj) {
  SimpleDateFormat ss=new SimpleDateFormat("yyyyMMdd");
  String format = ss.format(obj);

  return format;
 }

 public static String toString(Integer intValue, String defaultValue) {
  return intValue != null ? String.valueOf(intValue) : defaultValue;
 }

 public static String toString(Integer intValue) {
  return toString(intValue, DEFAULT_STRING);
 }

 public static String toString(Long longValue, String defaultValue) {
  return longValue != null ? String.valueOf(longValue) : defaultValue;
 }

 public static String toString(Long longValue) {
  return toString(longValue, DEFAULT_STRING);
 }

 public static String toString(Boolean booleanValue, String defaultValue) {
  return booleanValue != null ? String.valueOf(booleanValue) : defaultValue;
 }

 public static String toString(Boolean booleanValue) {
  return toString(booleanValue, DEFAULT_STRING);
 }

 public static String toString(Double doubleValue, String defaultValue) {
  return null != doubleValue ? String.valueOf(doubleValue) : defaultValue;
 }

 public static String toString(Double doubleValue) {
  return toString(doubleValue, DEFAULT_STRING);
 }

 public static String toString(Float floatValue, String defaultValue) {
  return null != floatValue ? String.valueOf(floatValue) : defaultValue;
 }

 public static String toString(Float floatValue) {
  return toString(floatValue, DEFAULT_STRING);
 }

 public static int toInt(Object objectValue, int defaultValue) {
  int intValue = defaultValue;
  if (null != objectValue) {
   try {
    intValue = Integer.parseInt(toString(objectValue, toString(defaultValue)));
   } catch (NumberFormatException numberFormatException) {
    System.err.println(numberFormatException.getMessage());
   }
  }
  return intValue;
 }

 public static int toInt(Object objectValue) {
  return toInt(objectValue, DEFAULT_INT);
 }

 public static int toInt(String stringValue, int defaultValue) {
  int intValue = defaultValue;
  if (null != stringValue && stringValue.length() > 0) {
   try {
    intValue = Integer.parseInt(stringValue);
   } catch (NumberFormatException numberFormatException) {
    System.err.println(numberFormatException.getMessage());
   }
  }
  return intValue;
 }

 public static int toInt(Long longValue, int defaultValue) {
  int intValue = defaultValue;
  if (null != longValue) {
   intValue = longValue.intValue();
  }
  return intValue;
 }

 public static int toInt(Long longValue) {
  return toInt(longValue, DEFAULT_INT);
 }

 public static int toInt(Boolean booleanValue, int defaultValue) {
  int intValue = defaultValue;
  if (null != booleanValue) {
   intValue = booleanValue ? 1 : 0;
  }
  return intValue;
 }

 public static int toInt(Boolean booleanValue) {
  return toInt(booleanValue, DEFAULT_INT);
 }

 public static int toInt(Double doubleValue, int defaultValue) {
  int intValue = defaultValue;
  if (null != doubleValue) {
   intValue = doubleValue.intValue();
  }
  return intValue;
 }

 public static int toInt(Double doubleValue) {
  return toInt(doubleValue, DEFAULT_INT);
 }

 public static int toInt(BigDecimal bigdecimalValue, int defaultValue) {
  int intValue = defaultValue;
  if (null != bigdecimalValue) {
   intValue = bigdecimalValue.intValue();
  }
  return intValue;
 }

 public static int toInt(BigDecimal bigdecimalValue) {
  return toInt(bigdecimalValue, DEFAULT_INT);
 }

 public static int toInt(Float floatValue, int defaultValue) {
  int intValue = defaultValue;
  if (null != floatValue) {
   intValue = floatValue.intValue();
  }
  return intValue;
 }

 public static int toInt(Float floatValue) {
  return toInt(floatValue, DEFAULT_INT);
 }



 public static long toLong(Object objectValue, long defaultValue) {
  long longValue = defaultValue;
  if (null != objectValue) {
   try {
    longValue = Long.parseLong(toString(objectValue, toString(defaultValue)));
   } catch (NumberFormatException numberFormatException) {
    System.err.println(numberFormatException.getMessage());
   }
  }
  return longValue;
 }

 public static long toLong(Object objectValue) {
  return toLong(objectValue, DEFAULT_LONG);
 }

 public static long toLong(String stringValue, long defaultValue) {
  long longValue = defaultValue;
  if (null != stringValue && stringValue.length() > 0) {
   longValue = Long.parseLong(stringValue);
  }
  return longValue;
 }

 public static long toLong(String stringValue) {
  return toLong(stringValue, DEFAULT_LONG);
 }

 public static long toLong(Integer intValue, long defaultValue) {
  long longValue = defaultValue;
  if (null != intValue) {
   longValue = intValue.longValue();
  }
  return longValue;
 }

 public static long toLong(Integer intValue) {
  return toLong(intValue, DEFAULT_LONG);
 }

 public static long toLong(Boolean booleanValue, long defaultValue) {
  long longValue = defaultValue;
  if (null != booleanValue) {
   longValue = booleanValue ? 1L : 0L;
  }
  return longValue;
 }

 public static long toLong(Boolean booleanValue) {
  return toLong(booleanValue, DEFAULT_LONG);
 }

 public static long toLong(Double doubleValue, long defaultValue) {
  long longValue = defaultValue;
  if (null != doubleValue) {
   longValue = doubleValue.longValue();
  }
  return longValue;
 }

 public static long toLong(Double doubleValue) {
  return toLong(doubleValue, DEFAULT_LONG);
 }

 public static long toLong(Float floatValue, long defaultValue) {
  long longValue = defaultValue;
  if (null != floatValue) {
   longValue = floatValue.longValue();
  }
  return longValue;
 }

 public static long toLong(Float floatValue) {
  return toLong(floatValue, DEFAULT_LONG);
 }



 public static long toLong(BigDecimal bigdecimalValue, long defaultValue) {
  long longValue = defaultValue;
  if (null != bigdecimalValue) {
   longValue = bigdecimalValue.longValue();
  }
  return longValue;
 }

 public static long toLong(BigDecimal bigdecimalValue) {
  return toLong(bigdecimalValue, DEFAULT_LONG);
 }

 public static boolean toBoolean(Object objectValue, boolean defaultValue) {
  boolean booleanValue = defaultValue;
  if (null != objectValue) {
   booleanValue = Boolean.valueOf(toString(objectValue, toString(defaultValue)));
  }
  return booleanValue;
 }

 public static boolean toBoolean(Object objectValue) {
  return toBoolean(objectValue, DEFAULT_BOOLEAN);
 }

 public static boolean toBoolean(String stringValue, boolean defaultValue) {
  boolean booleanValue = defaultValue;
  if (null != stringValue && stringValue.length() > 0) {
   booleanValue = Boolean.valueOf(stringValue);
  }
  return booleanValue;
 }

 public static boolean toBoolean(String stringValue) {
  return toBoolean(stringValue, DEFAULT_BOOLEAN);
 }

 public static boolean toBoolean(Integer intValue, boolean defaultValue) {
  boolean booleanValue = defaultValue;
  if (null != intValue) {
   booleanValue = intValue == 1;
  }
  return booleanValue;
 }

 public static boolean toBoolean(Integer intValue) {
  return toBoolean(intValue, DEFAULT_BOOLEAN);
 }

 public static boolean toBoolean(Long longValue, boolean defaultValue) {
  boolean booleanValue = defaultValue;
  if (null != longValue) {
   booleanValue = longValue.longValue() == 1L;
  }
  return booleanValue;
 }

 public static boolean toBoolean(Long longValue) {
  return toBoolean(longValue, DEFAULT_BOOLEAN);
 }

 public static float toFloat(Object objectValue, float defaultValue) {
  float floatValue = defaultValue;
  if (null != objectValue) {
   try {
    floatValue = Float.valueOf(toString(objectValue, toString(defaultValue)));
   } catch (NumberFormatException numberFormatException) {
    System.err.println(numberFormatException);
   }
  }
  return floatValue;
 }

 public static float toFloat(Object objectValue) {
  return toFloat(objectValue, DEFAULT_FLOAT);
 }

 public static float toFloat(String stringValue, float defaultValue) {
  float floatValue = defaultValue;
  if (null != stringValue && stringValue.length() > 0) {
   try {
    floatValue = Float.valueOf(stringValue);
   } catch (NumberFormatException numberFormatException) {
    System.err.println(numberFormatException.getMessage());
   }
  }
  return floatValue;
 }

 public static float toFloat(String stringValue) {
  return toFloat(stringValue, DEFAULT_FLOAT);
 }

 public static float toFloat(Integer intValue, float defaultValue) {
  float floatValue = defaultValue;
  if (null != intValue) {
   floatValue = intValue.floatValue();
  }
  return floatValue;
 }

 public static float toFloat(Integer intValue) {
  return toFloat(intValue, DEFAULT_FLOAT);
 }

 public static float toFloat(Long longValue, float defaultValue) {
  float floatValue = defaultValue;
  if (null != longValue) {
   floatValue = longValue.floatValue();
  }
  return floatValue;
 }

 public static float toFloat(Long longValue) {
  return toFloat(longValue, DEFAULT_FLOAT);
 }

 public static float toFloat(Double doubleValue, float defaultValue) {
  float floatValue = defaultValue;
  if (null != doubleValue) {
   floatValue = doubleValue.floatValue();
  }
  return floatValue;
 }

 public static float toFloat(Double doubleValue) {
  return toFloat(doubleValue, DEFAULT_FLOAT);
 }

 public static double toDouble(Object objectValue, double defaultValue) {
  double doubleValue = defaultValue;
  if (null != objectValue) {
   doubleValue = Double.parseDouble(toString(objectValue, toString(defaultValue)));
  }
  return doubleValue;
 }

 public static double toDouble(Object objectValue) {
  return toDouble(objectValue, DEFAULT_DOUBLE);
 }

 public static double toDouble(String stringValue, double defaultValue) {
  double doubleValue = defaultValue;
  if (null != stringValue && stringValue.length() > 0) {
   doubleValue = Double.parseDouble(stringValue);
  }
  return doubleValue;
 }

 public static double toDouble(String stringValue) {
  return toDouble(stringValue, DEFAULT_DOUBLE);
 }

 public static double toDouble(Integer intValue, double defaultValue) {
  double doubleValue = defaultValue;
  if (null != intValue) {
   doubleValue = intValue.doubleValue();
  }
  return doubleValue;
 }

 public static double toDouble(Integer intValue) {
  return toDouble(intValue, DEFAULT_DOUBLE);
 }

 public static double toDouble(Long longValue, double defaultValue) {
  double doubleValue = defaultValue;
  if (null != longValue) {
   doubleValue = longValue.doubleValue();
  }
  return doubleValue;
 }

 public static double toDouble(Long longValue) {
  return toDouble(longValue, DEFAULT_DOUBLE);
 }

 public static double toDouble(Float floatValue, double defaultValue) {
  double doubleValue = defaultValue;
  if (null != floatValue) {
   doubleValue = floatValue.doubleValue();
  }
  return doubleValue;
 }

 public static double toDouble(Float floatValue) {
  return toDouble(floatValue, DEFAULT_DOUBLE);
 }

 public static double toDouble(BigDecimal decimalValue, double defaultValue) {
  double doubleValue = defaultValue;
  if (null != decimalValue) {
   doubleValue = decimalValue.doubleValue();
  }
  return doubleValue;
 }

 public static double toDouble(BigDecimal decimalValue){


  return toDouble(decimalValue,DEFAULT_DOUBLE);
 }


}
