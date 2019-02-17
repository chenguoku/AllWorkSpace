package com.hh.proxy.custom;

import java.lang.reflect.Method;

public interface HHInvocationHandler {
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
