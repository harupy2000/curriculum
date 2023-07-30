package check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		{
			// 問① 下記例の配列をString型しか格納できないように修正してください。
			// 現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
			// 例List<Object> array = new ArrayList<>();
			// また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。

			List<String> array = new ArrayList<>(Arrays.asList("hoge", "pos", "foo"));

			// 問② arrayの二つ目の要素を"bar"にしましょう。
			array.set(1, "bar");

			// 問③ fooが格納されているインデックスを出力してください。
			int index = array.indexOf("foo");
			System.out.println("fooのインデックス: " + index);
		}

		{
			// 問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
			Map<String, Object> map = new HashMap<>();
			map.put("address","///") ;
			map.put("name","kosuke") ;
			map.put("age", "29");

			// 問⑤ 上記で格納したキーを繰り返し文で出力しましょう。
			for (String key : map.keySet()) {
				System.out.println("key: " + key);
			}

			// 問⑥ 上記で格納したバリューを繰り返し文で出力しましょう。
			for (Object value : map.values()) {
				System.out.println("value: " + value);
			}
		}

		{
			// 問⑦ Calendar型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int day = cal.get(Calendar.DAY_OF_MONTH);
			int[] arrayDate = { year, month, day };
			
			// 問⑧ 配列arrayDateをList型に置換しましょう。
			List<Integer> listDate = Arrays.asList(arrayDate[0], arrayDate[1], arrayDate[2]);

			// 問⑨ 上記で格納した要素を繰り返しで出力しましょう。
			for (Integer date : listDate) {
				System.out.println(date);
			}
		}
	}

}
