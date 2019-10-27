package lotto_checker;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class LottoTest {

	@Test
	public void test() {
		
	}

	@Test
	public void testLottoResult() {
		System.out.println(new LottoResult(new LottoResponse("app.lotto.pl/wyniki/?type=dl")));
		System.out.println(new MiniResult(new LottoResponse("app.lotto.pl/wyniki/?type=el")));
		System.out.println(new MultiResult(new LottoResponse("app.lotto.pl/wyniki/?type=ml")));
	}
}
