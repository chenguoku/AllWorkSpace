package com.hh.dome.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.*;

import static org.mockito.Mockito.*;

/**
 * @Classname: MockitoDemo
 * @Description: mockito的使用
 * @Author: chenguoku
 * @Date 2020-11-10
 * @Version V1.0
 */
public class MockitoDemo {

    /**
     * 创建mock对象
     */
    @Test
    public void createMockObject() {
        List mockList = mock(List.class);
        Assert.assertTrue(mockList instanceof List);

        ArrayList mockArrayList = mock(ArrayList.class);
        Assert.assertTrue(mockArrayList instanceof List);
        Assert.assertTrue(mockArrayList instanceof ArrayList);
    }

    /**
     * 配置mock对象，方法
     */
    @Test
    public void configMockObject() {
        List mockList = mock(List.class);

        //定制当调用mockList.add("one") 时，返回true
        when(mockList.add("one")).thenReturn(true);
        //当调用 mockList.size() 时，返回 1
        when(mockList.size()).thenReturn(1);

        Assert.assertTrue(mockList.add("one"));
        //因为没有定制 add("two") ，因此返回默认值 ， 即false
        Assert.assertFalse(mockList.add("two"));
        Assert.assertEquals(mockList.size(), 1);

        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("Hello,").thenReturn("Mockito!");
        String result = i.next() + "" + i.next();
        Assert.assertEquals("Hello,Mockito!", result);
    }

    /**
     * 测试mockito 抛异常
     */
    @Test(expected = NoSuchElementException.class)
    public void testForException() {
        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("Hello,").thenReturn("Mockito!");
        String result = i.next() + "" + i.next();
        Assert.assertEquals("Hello,Mockito!", result);

        doThrow(new NoSuchElementException()).when(i).next();
        i.next();
    }

    /**
     * 校验Mock对象的方法调用
     */
    @Test
    public void testVerify() {
        List mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("three times");
        mockedList.add("three times");
        mockedList.add("three times");

        when(mockedList.size()).thenReturn(5);
        Assert.assertEquals(mockedList.size(), 5);

        verify(mockedList, atLeastOnce()).add("one");
        verify(mockedList, times(1)).add("two");
        verify(mockedList, times(3)).add("three times");
        verify(mockedList, never()).isEmpty();
    }

    /**
     * 使用spy()部分模拟对象
     */
    @Test
    public void testSpy() {
        LinkedList<Object> list = new LinkedList<>();
        List spy = spy(list);

        //对 spy.size() 进行定制
        when(spy.size()).thenReturn(100);

        spy.add("one");
        spy.add("two");

        //因为我们没有对get(0)，get(1) 方法进行定制
        //因此这些调用其实是调用的真实对象的方法
        Assert.assertEquals(spy.get(0), "one");
        Assert.assertEquals(spy.get(1), "two");

        Assert.assertEquals(spy.size(), 100);
    }

    /**
     * 参数捕获
     */
    @Test
    public void testCaptureArgument() {
        List<String> list = Arrays.asList("1", "2");
        List mockedList = mock(List.class);
        ArgumentCaptor<List> argument = ArgumentCaptor.forClass(List.class);

        mockedList.addAll(list);
        verify(mockedList).addAll(argument.capture());

        Assert.assertEquals(2, argument.getValue().size());
        Assert.assertEquals(list, argument.getValue());
    }

}
