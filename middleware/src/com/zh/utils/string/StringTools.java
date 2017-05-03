package com.zh.utils.string; 

import java.sql.ResultSet;

/**
 * @ collect by mor tj
 *
 */
public class StringTools {
	

	public static boolean isNotNull(String str) {
		if (str == null || str.trim().equals("")) 
			return false;
		else 
			return true;
	}
	

	public static String objectToString(Object s) {
		String str = "";
		try {
			str = s.toString();
		} catch (Exception e) {
			str = "";
		}
		return str;
	}
	

	public static int objectToInt(Object s) {
		String str = "";
		int i = 0;
		try {
			str = s.toString();
			i = Integer.parseInt(str);
		} catch (Exception e) {
			i = 0;
		}
		return i;
	}
	
 
	public static String IntToString(int i) {
		String str = "";
		try {      
			str = Integer.toString(i);
		} catch (Exception e) {
			str = "";
		}
		return str;
	}
    

    public static String rsToString(ResultSet rs, String name) {
        String str = "";
        try {
            str = rs.getString(name);
            if (str == null)
            	throw new Exception();
        } catch (Exception e) {
            str = "";
        }
        return str;
    }
    

    public static int rsToInt(ResultSet rs, String name) {
        int i = 0;
        try {
            i = rs.getInt(name);
        } catch (Exception e) {
            i = 0;
        }
        return i;
    }
    
    
	public static String null2String(String s) {
		return s == null ? "" : s;
	}
    
    
    
    
  

}