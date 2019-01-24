package com.hh.dome.sort;

import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author weidongye
 *
 */
public class XforceListUtil {

	private XforceListUtil() {
	}

	/**
	 * 对list的元素按照多个属性名称排序 list元素的属性可以是(byte、short、int、long、float、double等)
	 * 
	 * @param list
	 * @param isAsc
	 * @param sortColumns
	 */
	public static <E> void sort(List<E> list, final boolean isAsc, final String... sortColumns) {
		Collections.sort(list, new Comparator<E>() {
			@Override
			public int compare(E a, E b) {
				int ret = 0;
				try {
					for (int i = 0; i < sortColumns.length; i++) {
						ret = XforceListUtil.compareObject(sortColumns[i], isAsc, a, b);
						if (0 != ret) {
							break;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return ret;
			}
		});
	}

	/**
	 * 对2个对象按照指定属性名称进行排序
	 * 
	 * @param sortName 属性名称
	 * @param isAsc    true升序，false降序
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception
	 */
	private static <E> int compareObject(final String sortName, final boolean isAsc, E a, E b) throws Exception {
		int ret;
		Object value1 = XforceListUtil.forceGetFieldValue(a, sortName);
		Object value2 = XforceListUtil.forceGetFieldValue(b, sortName);
		String str1 = value1.toString();
		String str2 = value2.toString();
		if (value1 instanceof Number && value2 instanceof Number) {
			int maxlen = Math.max(str1.length(), str2.length());
			str1 = XforceListUtil.addZero2Str((Number) value1, maxlen);
			str2 = XforceListUtil.addZero2Str((Number) value2, maxlen);
		} else if (value1 instanceof Date && value2 instanceof Date) {
			long time1 = ((Date) value1).getTime();
			long time2 = ((Date) value2).getTime();
			int maxlen = Long.toString(Math.max(time1, time2)).length();
			str1 = XforceListUtil.addZero2Str(time1, maxlen);
			str2 = XforceListUtil.addZero2Str(time2, maxlen);
		}
		if (isAsc) {
			ret = str1.compareTo(str2);
		} else {
			ret = str2.compareTo(str1);
		}
		return ret;
	}

	/**
	 * 给数字对象按照指定长度在左侧补0.
	 * 
	 * 使用案例: addZero2Str(11,4) 返回 "0011", addZero2Str(-18,6)返回 "-000018"
	 * 
	 * @param numObj 数字对象
	 * @param length 指定的长度
	 * @return
	 */
	public static String addZero2Str(Number numObj, int length) {
		NumberFormat nf = NumberFormat.getInstance();
		// 设置是否使用分组
		nf.setGroupingUsed(false);
		// 设置最大整数位数
		nf.setMaximumIntegerDigits(length);
		// 设置最小整数位数
		nf.setMinimumIntegerDigits(length);
		return nf.format(numObj);
	}

	/**
	 * 获取指定对象的指定属性值
	 * 
	 * @param obj       属性名称所在的对象
	 * @param fieldName 属性名称
	 * @return
	 * @throws Exception
	 */
	public static Object forceGetFieldValue(Object obj, String fieldName) throws Exception {
		Field field = obj.getClass().getDeclaredField(fieldName);
		Object object = null;
		boolean accessible = field.isAccessible();
		if (!accessible) {
			field.setAccessible(true);
			object = field.get(obj);
			field.setAccessible(accessible);
			return object;
		}
		object = field.get(obj);
		return object;
	}
}
