package lotto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OutputConsole {

    public static final String PURCHASE_HISTORY_OUTPUT_MESSAGE = "8개를 구매했습니다.";

    public static void printLottoList(List<Lotto> lottos) {
        System.out.println(PURCHASE_HISTORY_OUTPUT_MESSAGE);
        for (int i = 0; i < lottos.size(); i++) {
            List<Integer> lottoNumbers= lottos.get(i).getNumbers();
            Collections.sort(lottoNumbers);
            String lottoNumbersMessage = lottoNumbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("[" + lottoNumbersMessage + "]");
        }
    }
}