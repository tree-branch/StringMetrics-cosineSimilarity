package org.metrics;

import org.simmetrics.metrics.FuzzyMatching;

public final class test {
	public static void main(String[] args){
		String str1 = "大连火眼征信股份有限公司";
		String str2 = "大连火眼征信管理有限公司";
		System.out.println(FuzzyMatching.cosineSimilarity(str1,str2));
		System.out.println();
	}
}

