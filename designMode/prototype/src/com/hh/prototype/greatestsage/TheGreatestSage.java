package com.hh.prototype.greatestsage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

//�����ʥ
public class TheGreatestSage extends Monkey implements Cloneable,Serializable {

	//�𹿰�
	private GoldRingedStaff staff ;

	//��ʯͷ���бĳ���
	public TheGreatestSage() {
		this.staff = new GoldRingedStaff();
		this.birthday = new Date();
		this.height = 150;
		this.weight = 30;
	}

	//������
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null ;
		ObjectInputStream ois = null;
		try {
			//���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			//�����л�
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			TheGreatestSage copy = (TheGreatestSage)ois.readObject();
			copy.birthday = new Date();
			
			return copy;
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
		
		
		
	}

	public GoldRingedStaff getStaff() {
		return staff;
	}

	public void setStaff(GoldRingedStaff staff) {
		this.staff = staff;
	}
	
	
	
}
