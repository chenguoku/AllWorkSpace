package com.hh.prototype.greatestsage;

import java.io.Serializable;

/**
 * 金箍棒
 * @author Administrator
 *
 */
public class GoldRingedStaff implements Serializable {
	private float height  = 100;
	private float diameter = 10;
	
	/**
	 * 金箍棒长大
	 */
	public void grow() {
		this.diameter *= 2;
		this.height *= 2;
	}
	
	/**
	 * 金箍棒缩小
	 */
	public void shrink() {
		this.diameter /= 2;
		this.height /= 2;
	}
}
