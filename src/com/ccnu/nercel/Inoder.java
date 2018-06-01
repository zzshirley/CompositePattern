package com.ccnu.nercel;

import java.util.ArrayList;
import java.util.List;

public class Inoder extends Inode{
	
	List<Inode> nodeList = new ArrayList<Inode>();

	Inoder(String nodeName) {
		super(nodeName);
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
        for(Inode inode:nodeList) {
        		inode.display();
        }
	}	
}
