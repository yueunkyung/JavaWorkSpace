package ch19.sec06;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONTest {

	public static void main(String[] args) {
		JSONObject data = new JSONObject();
		data.put("id", "zzukre");
		data.put("name", "정진");
		data.put("age", 20);
		data.put("aa", true);

		System.out.println(data);
		
		JSONArray arr = new JSONArray();
		arr.put(100);
		arr.put(90);
		arr.put(80);

		System.out.println(arr);
		data.put("score",arr);
		System.out.println(data);
		
		for (String key : data.keySet()) {
			System.out.println(key + "==>" + data.get(key));
		}
	}

	public static void f2() {
		// Data 교환 : CSV, XML, JSON(JavaScript Object Notation)
		String s = """
					{
					"id": "zzukre",
					"name": "정진",
					"age": 20
				}
				""";
	}

}
