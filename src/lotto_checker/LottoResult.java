package lotto_checker;

import java.io.IOException;


public class LottoResult {
	String date;
	int[] results;
	
	
	LottoResult(LottoResponse resp, int n)  {
		results = new int[n];
		try {
			date = resp.anwser.readLine();
			for (int i = 0; i < results.length; i++) { 
			results[i]=Integer.parseInt(resp.anwser.readLine());
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	LottoResult(LottoResponse resp) {
		this( resp, 6);
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(date);
		result.append(" : [");
		for (int i: results) {
			result.append(i+", ");
		}
		result.delete(result.length()-2, result.length());
		result.append("]");
		return result.toString();
		
	}

	
}
