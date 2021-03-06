package c1_3_bags_queues_stacks;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//编写一段程序EvaluatePostfix，从标准输入中得到一个后序表达式，求值并打印结果。

public class Q1_3_11 {
	public static void main(String[] args){
		Stack<Double> vals = new Stack<Double>();
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();

			if(s.equals("(") || s.equals(")"));
			else if(s.equals("+") || s.equals("-") || s.equals("*") ||
				s.equals("/") || s.equals("sqrt")){
				double v = vals.pop();
				
				if(s.equals("+"))
					v = vals.pop() + v;
				if(s.equals("-"))
					v = vals.pop() - v;
				if(s.equals("*"))
					v = vals.pop() * v;
				if(s.equals("/"))
					v = vals.pop() / v;
				if(s.equals("sqrt"))
					v = Math.sqrt(v);
				StdOut.println(v);
				vals.push(v);
			}else
				vals.push(Double.parseDouble(s));
		}
		
		StdOut.println(vals.pop());
		StdOut.println(vals);
	}
}
