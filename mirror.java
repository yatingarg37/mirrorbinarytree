package assignments;

import java.util.Scanner;

public class mirror {
	public static class Node {
		int key;
		Node left, right;

		Node(int d) {
			key = d;
			left = right = null;

		}
	}
	static Node root;

	 mirror(){
		root=null;
	}

	public mirror(int key) {
		root = new Node(key);
	}
	public static boolean check(Node root) {
		return checkm(root,root);
	}
	public static boolean checkm(Node root1,Node root2) {
		if(root1==null&&root2==null) {
			return true;
		}
		if(root1!=null && root!=null && root1.key == root2.key) {
			return checkm(root.left,root2.right)&& checkm(root1.right,root2.left);
		}
		return false;
	}
	public static void main(String arg[]) {
		mirror mt= new mirror();
		root=new Node(1);
		mt.root.left=new Node(2);
		mt.root.right=new Node(2);
		mt.root.left.left=new Node(3);
		mt.root.left.right=new Node(4);
		mt.root.right.left=new Node(4);
		mt.root.right.right=new Node(3);
		if(check(root)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
