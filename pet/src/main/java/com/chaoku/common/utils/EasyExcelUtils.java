package com.chaoku.common.utils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Email: wang_xiaogang17@163.com
 * @Date: 2019/8/14 12:43
 * @Description: easyexcel工具类  未完成，待做
 */
@Slf4j
public class EasyExcelUtils {

    /**
     * 同步的返回，不推荐使用，如果数据量大会把数据放到内存里面
     *
     * @param in    excel输入流
     * @param clazz
     * @return
     */
    public static <T> List<T> readByModel(InputStream in, Class<T> clazz) {
        try {

            //自动读取第一个sheet
            List<Object> list = EasyExcel.read(in).head(clazz).sheet().doReadSync();
            return (List<T>) list;

        } catch (Exception e) {
            log.error("同步读取excel异常", e);
            return null;
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 将数据写入excel并直接输出浏览器
     *
     * @param response
     * @param fileName 文件名称
     * @param list     数据
     * @param clazz    数据类型
     */
    public static <T> void writeAndDownload(HttpServletResponse response, String fileName, List<T> list, Class<T> clazz) {
        ServletOutputStream out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setHeader("content-Type", "application/vnd.ms-excel");
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xls");
            out = response.getOutputStream();
            //写excel
            EasyExcel.write(fileName, clazz).sheet().doWrite(list);
        } catch (Exception e) {
            log.error("数据写入excel并输出浏览器异常", e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 该方法为示例方法，不可调用
     * 使用监听器读取excel，监听器为DemoDataListener
     * 可以使用模板去读取
     */
    private void demoReadByListener() {
        try {
            InputStream in = new FileInputStream(new File(""));
            //这里可以使用模板读取excel
            EasyExcel.read(in, Object.class, new DemoDataListener()).sheet().doRead();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * excel数据量大的时候可以使用监听器异步操作
     * 示例解析监听器，只做示例，不可用
     * 每解析一行会回调invoke()方法,
     * 整个excel解析结束会执行doAfterAllAnalysed()方法
     */
    private class DemoDataListener extends AnalysisEventListener<Object> {
        /**
         * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
         */
        private static final int BATCH_COUNT = 5;
        List<Object> list = new ArrayList<>();

        @Override
        public void invoke(Object data, AnalysisContext context) {
            log.info("解析到一条数据:{}", data);
            list.add(data);
            if (list.size() >= BATCH_COUNT) {
                saveData();
                list.clear();
            }
        }

        @Override
        public void doAfterAllAnalysed(AnalysisContext context) {
            saveData();
            log.info("所有数据解析完成！");
        }

        /**
         * 自定义操作，可以进行数据库存储
         */
        private void saveData() {
            log.info("{}条数据，开始存储数据库！", list.size());
            log.info("存储数据库成功！");
        }
    }


}
