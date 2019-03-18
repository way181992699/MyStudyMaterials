package com.ym.learn.exercises;

import java.io.*;

/**
 * 8:(IO流和递归的使用)
 * 把d盘目录下的source目录内容拷贝到e盘目录下。
 * 注意：source目录可能还有目录。
 */

public class Num9 {

    public static void main(String[] args) throws IOException {
        File srcFile = new File("D://aaa");//源文件实例(目录,即单纯一个文件夹,非文件)
        File a = new File("D://src");//测试文件实例(txt,非目录,为文本文件)
        File destFile = new File("E://destFolder");//目标文件实例
        if (!destFile.exists()) {//判断文件
            destFile.mkdir();
        }
        System.out.println(a.isDirectory());//false, txt文件 非目录
        System.out.println(destFile.isDirectory());//true 目录(即文件夹)
        System.out.println(srcFile.isDirectory());//true 目录(即文件夹)
        creatFolder(srcFile, destFile);
    }

    public static void creatFolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String name = srcFile.getName();
            File newDestFile = new File(destFile, name);//newFestFile : E://destFolder/aaa
            newDestFile.mkdir();
            File[] files = srcFile.listFiles();
            for (File file : files) {
                creatFolder(file, newDestFile);//递归创建文件夹
            }
        } else {
            String name = srcFile.getName();
            File newDestFile = new File(destFile, name);//newFestFile : E://destFolder/aaa
            copyFile(srcFile, newDestFile);//复制文件方法
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(srcFile));
            out = new BufferedOutputStream(new FileOutputStream(destFile));
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
            out.close();
        }
    }

}
