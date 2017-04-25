package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 * 成功的把素数进行剔除
 * @author fzy
 * @createTime 2017年4月25日
 */
public class PrimeNumberList {
	//专门存放素数的集合
	public static List<Integer> list=new ArrayList<Integer>();
	public int PrimeNumber(int i){
		//获取m开方之后的值(//首先，m以内的约数的必定是一个>m的根号,一个<m的根号。只要满足一个条件,那么另一个条件也就自然满足)
		int m=(int) Math.sqrt(i);
		for(int j=m;j<=i;j++){
			a:for(int k=1,n=0;k<=m;k++){
				while(j%k != 0){
					n++;
					//m-1=m-2+1次循环
					if(n%(m-1)==0){
						list.add(j);
					}
					continue a;
				}
			}
		}
		if(i == m){
			//作为结束标志!
			return 0;
		}
		Collections.sort(list);
		return PrimeNumber(m);
	}
	//第二种
/*	public void PrimeNumbered(int i){
		for(int j=2;j<=i;j++){
			a:for(int m=2;m<j;m++){
				while(j%m == 0){
					list.add(j);
					break a;
				}
			}
		}
		for(int n=1;n<=i;n++){
			if(!list.contains(n)){
				System.out.println(n);
			}
		}
	}*/

	public static void main(String []args){
		
		new PrimeNumberList().PrimeNumber(100);
		for(Integer e:list){
			System.out.println(e);
		}

	}

}
