package com.zh.utils.string;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 用户字符串操作
 * 
 * @author kcy
 * 
 */
public class StringUtil {

	/**
	 * 判断是否是整数
	 * 
	 * @param integer
	 * @return
	 */
	public static boolean isInteger(String integer) {
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher(integer);
		boolean b = m.matches();
		return b;
	}

	/**
	 * 判断是否是正整数
	 * 
	 * @param integer
	 * @return
	 */
	public static boolean isInteger2(String integer) {
		Pattern p = Pattern.compile("^[0-9]*[1-9][0-9]*$");
		Matcher m = p.matcher(integer);
		boolean b = m.matches();
		return b;
	}

	/**
	 * 根据字段序号取得数据表对应的字段名称
	 * 
	 * @param id
	 * @return
	 */
	public static String dealFieldStr(int id) {
		if (id < 10)
			return "data_00" + id;
		else if (id < 100)
			return "data_0" + id;
		else
			return "data_" + id;
	}

	public static String dealFieldStr(String report_name, int id) {
		if (id < 10)
			return report_name + "_00" + id;
		else if (id < 100)
			return report_name + "_0" + id;
		else
			return report_name + "_" + id;
	}

	/**
	 * 把前台传过来的含中文的url字符串转换成标准中文，比如%25E5%258C%2597%25E4%25BA%25AC转换成北京
	 */
	public static String decodeUrl(String url) {
		String str = "";
		try {
			str = URLDecoder.decode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 取字符除最后一位的子串，比如 aaa,bbb, 返回aaa,bbb
	 * 
	 * @param str
	 * @return
	 */
	public static String subTract(String str) {
		if (str.length() == 0)
			return "";
		else
			return str.substring(0, str.length() - 1);
	}

	/**
	 * 判断字符串是null或空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str) {
		if (str == null || str.equals(""))
			return true;
		else
			return false;
	}

	/**
	 * 把字符串里面的\r\n替换掉，json处理
	 * 
	 * @param str
	 * @return
	 */
	public static String dealJsonFormat(String str) {
		str = str.replace("\r", "");
		str = str.replace("\n", "");
		return str;
	}

	/**
	 * 把字符串里面的"-"和空格" "替换掉，并截取年月日成八位数日期字符串（18点日期格式），日期处理
	 * 
	 * @param str
	 * @return
	 */
	public static String dealDateFormat(String str) {
		str = str.replace("-", "");
		str = str.replace(" ", "");
		str = str.substring(0, 8);
		return str;
	}

	public static boolean checkFileExist(String path) {
		File file = new File(path);
		if (file.isFile() && file.exists()) {
			return true;
		} else
			return false;
	}

	/**
	 * 判断字符串是null或空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotNullOrEmpty(String str) {
		if (str != null && !str.equals(""))
			return true;
		else
			return false;
	}

	/**
	 * 如果为null不trim
	 * 
	 * @param str
	 * @return
	 */
	public static String isNullNoTrim(String str) {
		if (!(str == null)) {

			return str.trim();
		} else {
			return str;
		}
	}

	/**
	 * 格式化小数
	 * 
	 * @param val
	 * @param point小数位
	 * @return
	 */
	public static String formatDouble(String val, int point) {
		String str = "";
		DecimalFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(point);
		str = nf.format(Double.parseDouble(val));
		return str.replace(",", "");
	}

	/**
	 * 格式化小数
	 * 
	 * @param val
	 * @param point小数位
	 * @return
	 */
	public static double formatDouble(double val, int point) {
		String str = "";
		DecimalFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(point);
		str = nf.format(val);
		return Double.parseDouble(str.replace(",", ""));
	}

	/**
	 * 格式化两位小数
	 * 
	 * @param val
	 * @param point
	 * @return
	 */
	public static String formatDouble(String val) {
		String str = "";
		DecimalFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(2);
		str = nf.format(Double.parseDouble(val));
		return str.replace(",", "");
	}

	/**
	 * 格式化两位小数
	 * 
	 * @param val
	 * @param point
	 * @return
	 */
	public static double formatDouble(double val) {
		String str = "";
		DecimalFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(2);
		str = nf.format(val);
		return Double.parseDouble(str.replace(",", ""));
	}

	/**
	 * 格式化两位小数
	 * 
	 * @param val
	 * @param point
	 * @return
	 */
	public static float formatFloat(float val) {
		String str = "";
		DecimalFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(2);
		str = nf.format(val);
		return Float.parseFloat(str.replace(",", ""));
	}

	/**
	 * 格式化两位小数
	 * 
	 * @param val
	 * @param point
	 * @return
	 */
	public static float formatFloat(String val) {
		String str = "";
		DecimalFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(2);
		str = nf.format(Float.parseFloat(val));
		return Float.parseFloat(str.replace(",", ""));
	}

	/**
	 * 格式化金钱
	 * 
	 * @param val
	 * @param point
	 * @return
	 */
	public static String formatAmount(double val) {
		NumberFormat nf = new DecimalFormat("#,###.##");
		String str = nf.format(val);
		return str;
	}


	/**
	 * 把数字补零，比如传入T001，需要处理成T002，如果超出最大长度，返回"";
	 * @param 代码前缀
	 * @param code已经存在的最大代码
	 * @param 数字长度
	 * @return
	 */
	public static String addZero(String pre, String code, int numLength) {
		String str = "";
		if (StringUtil.isNullOrEmpty(code)) {
			str = pre;
			for (int i = 0; i < numLength - 1; i++) {
				str += "0";
			}
			str += "1";
		} else {
			str = pre;
			int num = Integer.parseInt(code.substring(pre.length(), code.length())) + 1;
			for (int i = 0; i < numLength - String.valueOf(num).length(); i++) {
				str += "0";
			}
			str += num;
		}
		if (str.length() > pre.length() + numLength)
			return "";
		else
			return str;
	}

	/*	public static String addZeroByType(String pre, String code) {
			String str = "";
			if (StringUtil.isNullOrEmpty(code)) {
				str = pre;
				for (int i = 0; i < numLength - 1; i++) {
					str += "0";
				}
				str += "1";
			} else {
				str = pre;
				int num = Integer.parseInt(code.substring(pre.length(), code.length())) + 1;
				int numLength1 = code.substring(pre.length(),code.length()-String.valueOf(num).length()).length();
				for (int i = 0; i < numLength; i++) {
					str += "0";
				}
				str += num;
			}
			if (str.length() > pre.length() + numLength)
				return "";
			else
				return str;
		}*/

	/**
	 * 获取物料类型的数字编号，比如T001，就是001
	 * @param protype
	 * @return
	 */
	public static String getProtypeNum(String protype) {
		if (protype != null && protype.length() >= 4)
			return protype.substring(1, 4);
		else
			return "";
	}


	/**
	 * 把数字转换成字符串，前面带0
	 * @param num
	 * @return
	 */
	public static String addZero4(int num) {
		if (num < 10)
			return "000" + num;
		else if (num < 100)
			return "00" + num;
		else if (num < 1000)
			return "0" + num;
		else
			return String.valueOf(num);
	}
}
