package lotto_checker;

public class LottoAPI {
	
	private LottoResult result;

	public LottoAPI(String game) {
		String address = "app.lotto.pl/wyniki/?type="+game;
		switch (game) {
			case "dl" : this.result = new LottoResult(new LottoResponse(address));
			break;
			case "ml" : this.result = new MultiResult(new LottoResponse(address));
			break;
			case "el" : this.result = new MiniResult(new LottoResponse(address));
		}		
	}
	
	public String toString() {
		return result.toString();
	}

}
