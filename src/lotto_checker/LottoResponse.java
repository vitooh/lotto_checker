package lotto_checker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class LottoResponse {
		
		String address;
		
		String protocol = "https://";
		
		BufferedReader anwser;
		
		public LottoResponse(String address) {
			this.address = address;
			getAnwser(this.protocol+this.address);
		}


		private void getAnwser(String address) {
			URL url;
			try {
				url = new URL(address);
				URLConnection connection = url.openConnection();
				anwser = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			}
			catch (Exception ex) {
				System.out.println(ex);
			}
			
		}

}
