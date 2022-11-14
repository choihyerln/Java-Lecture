package ch15_collection.sec04_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("사과", 1000);
		map.put("배", 2000);
		map.put("감", 800);
		map.put("사과", 2500);	// key값이 중복이면 value를 수정(업데이트)함
		System.out.println("총 엔트리 수: " + map.size());
		
		// 키로 값 얻기
		String key = "배";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		// 키의 set collection
		Set<String> keySet = map.keySet();
		for (String s: keySet)
			System.out.println(s + ": " + map.get(s));
		System.out.println();
		
		// EntrySet collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry: entrySet)
			System.out.println(entry.getKey() + ": " + entry.getValue());
		System.out.println();
		
		// Iterator
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		
		// forEach
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		System.out.println();
		
		// 키로 엔트리 삭제
		map.remove("사과");
		System.out.println("총 엔트리 수: " + map.size());
		
		// 키 검색
		System.out.println(map.containsKey("감"));
		System.out.println(map.containsKey("사과"));
		// value 검색
		System.out.println(map.containsValue(2000));
	}
}