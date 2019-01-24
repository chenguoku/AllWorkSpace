package com.hh;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 用来统计 项目中一共有多少个java 文件
 */
@Mojo(name = "hhedu",defaultPhase = LifecyclePhase.PACKAGE)
public class HhMojo extends AbstractMojo {

    //用来存放java文件个数
    ArrayList<String> list = new ArrayList<String>();

    @Parameter
    private String currectBaseDir;

    @Parameter(property = "suffix",defaultValue = ".java")
    private String suffix;
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(currectBaseDir);
        System.out.printf("###hh plugin###");
        System.out.println("This is have"+scanFile(currectBaseDir).size()+" "+suffix+"");
    }

    private List<String> scanFile(String filePath){

        File dir = new File(filePath);
        //递归查询所有文件
        for (File file:dir.listFiles()){
            if (file.isDirectory()){
                scanFile(file.getAbsolutePath());
            }else {
                if(file.getName().endsWith(suffix)) {
                    list.add(file.getName());
                }
            }
        }
        return list;
    }

}
