package com.ccnu.nercel;

import java.util.ArrayList;
import java.util.List;

public class Inoder extends Inode{
	
	List<Inode> nodeList = new ArrayList<Inode>();

	Inoder(String nodename) {
		super(nodename);
		// TODO Auto-generated constructor stub
	}

	@Override
	void add(Inode inode) {
		// TODO Auto-generated method stub
		nodeList.add(inode);
	}

	@Override
	void remove(Inode inode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
        System.out.println(nodename);
        for(Inode inode:nodeList) {
        		inode.display();
        }
 }

	@Override
	void searchfile(String name) {
		// TODO Auto-generated method stub
		
	}

}