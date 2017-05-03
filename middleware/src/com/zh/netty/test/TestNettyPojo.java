package com.zh.netty.test;

import java.io.Serializable;

import org.apache.commons.lang.math.RandomUtils;

/**
 *@author: zzh
 *@createtime: 2016-3-23下午1:45:28
 *@version: V1.0
 *@Description:
 */
public class TestNettyPojo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int serialNumber;
	private String justString;

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getJustString() {
		return justString;
	}

	public void setJustString(String justString) {
		this.justString = justString;
	}

	public TestNettyPojo() {
		super();
		this.serialNumber = RandomUtils.nextInt(100000000);
		this.justString = "天边亮起了一颗璀璨的星，那是他，我敬佩的他，" +
						"小时候，妈妈常给我讲他的故事，他是我心中美丽的天使，" +
						"他住在我心中最闪亮的地方。他，我所敬佩的他，就是老师。" +
						"老师是知识的工程师；是进步的启蒙者；是抚摸学生心灵的膏药；" +
						"是开启学生心灵的钥匙；是世界之灵魂。" +
						"有人说，老师是辛勤的园丁，无微不至地照顾着祖国的花朵；" +
						"有人说，老师是一截蜡烛，燃烧自己，照亮他人；" +
						"有人说，老师是一支小小的粉笔，留下的是无穷无尽的知识，牺牲的是宝贵的生命；" +
						"有人说……" +
						"这些说法，都无可否认，但我觉得老师更像善良的天使，" +
						"他试着去让每个恶魔屈服，虽然恶魔是野蛮的，" +
						"但是老师仍理直气壮，用知识教育恶魔，用行动感动恶魔，" +
						"他总是尽力而为，量力而行，" +
						"只要有一点点希望的曙光，那么他就会去感化每个恶魔。" +
						"我的启蒙老师，不就是这样的吗？";
	}

	@Override
	public String toString() {
		return "TestNettyPojo [serialNumber=" + serialNumber + ", justString="
				+ justString + "]";
	}

	
}

