package com.ccnu.nercel;

import java.io.File;
import java.io.IOException;

public class CompositeDemo {

	public static void main(String[] args) {
		Inode inoder =new Inoder("/Users/biello/machine-learning");
		String keyword="linear";
		try {
			searchFile(inoder,keyword);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inoder.display();
	}

    public static void searchFile(Inode inode, String name) throws IOException {
        serachFile(inode.nodename, name, inode);
    }

    /**
     * 递归查找path目录下所有文件名包含name的文件
     * @param path 查找的根目录
     * @param name 查找的文件名
     * @param inode 结果存放的节点
     */
	public static void serachFile(String path, String name, Inode inode) {
        File root = new File(path);
        File[] files = root.listFiles(file -> {
                    if (file.isDirectory()) {
                        return true;
                    }
                    if (file.getName().toLowerCase().contains(name)) {
                        return true;
                    }
                    return false;
                }
        );
        if(files != null) {
            for(File fi :files) {
                if(fi.isFile()) {
                    file filer =new file(fi.getAbsolutePath());
                    inode.add(filer);
                }
                if(fi.isDirectory()) {
                    serachFile(fi.getAbsolutePath(), name, inode);
                }
            }
        }
    }
}

