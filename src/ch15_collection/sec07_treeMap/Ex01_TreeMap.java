package ch15_collection.sec07_treeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * TreeMap 일반적 사용법
 */
public class Ex01_TreeMap {

	public static void main(String[] args) {
		// key 값 오름차순 (String type) -> 디폴트
		TreeMap<String, Integer> tm = new TreeMap<>();
		// key 값 내림차순 (String type)
//		TreeMap<String, Integer> tm = new TreeMap<>(Comparator.reverseOrder());
		
		tm.put("apple", 80);
		tm.put("forever", 50);
		tm.put("description", 40);
		tm.put("ever", 60);
		tm.put("zoo", 10);
		tm.put("base", 20);
		tm.put("guess", 70);
		tm.put("cherry", 30);
		
		// 정렬된 엔트리 가져오기
//		for (Entry<String, Integer> entry: tm.entrySet())
//			System.out.println(entry.getKey() + "-" + entry.getValue());	// key 값이 정렬의 기준 (오름차순 디폴트)
		tm.forEach((k,v) -> System.out.println(k + "-" + v));		// 람다식이 훨씬 간편함
		System.out.println();
		
		// 특정 키에 대한 값 가져오기
		Entry<String, Integer> entry = tm.firstEntry();
		System.out.println("첫번째 단어: " + entry.getKey() + "-" + entry.getValue());
	
		entry = tm.lastEntry();
		System.out.println("마지막 단어: " + entry.getKey() + "-" + entry.getValue());
		
		entry = tm.lowerEntry("ever");
		System.out.println("ever 앞 단어: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		
		// 범위 검색
		System.out.println("[c~g) 사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = tm.subMap("c", true, "g", false);
		rangeMap.forEach((k,v) -> System.out.println(k + "-" + v));
	}
}
