package org.metrics;

import org.simmetrics.metrics.FuzzyMatching;

public final class test {
	public static void main(String[] args){
		String str1 = "�����������Źɷ����޹�˾";
		String str2 = "�����������Ź������޹�˾";
		System.out.println(FuzzyMatching.cosineSimilarity(str1,str2));
		System.out.println();
	}
}

