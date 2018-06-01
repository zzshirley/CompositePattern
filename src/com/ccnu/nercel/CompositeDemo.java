package com.ccnu.nercel;

import java.io.File;
import java.io.FileFilter;

public class CompositeDemo {
	public static void main(String[] args) {
		Inode inoder =new Inoder("/Users/xiaotong/Documents/sequencepattern");
		String keyword="data9.txt";
		try {
			searchfile(inoder,keyword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inoder.display();
	}
	public static void searchfile(Inode inode,String name) throws Exception{
		File file = new File(inode.nodename);
		File[] f=file.listFiles(
				new FileFilter() {
		            @Override
		            public boolean accept(File file) {
		               if (file.isDirectory()) {
		                    return true;
		                }
		                if (file.getName().toLowerCase().contains(name)) {
		                    return true;		                    
		                }
		                return false;		                
		                }
		            }
				);
		if(f!=null) {
			for(File fi :f) {
				if(fi.isFile()) {
					file filer =new file(fi.getAbsolutePath());
					inode.add(filer);	
				}
				if(fi.isDirectory()) {
					Inoder inoder = new Inoder(fi.getAbsolutePath());
					inode.add(inoder);
					searchfile(inoder,name);
					}
			}
         }
	}
}	

