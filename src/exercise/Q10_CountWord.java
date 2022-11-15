package exercise;

import java.util.HashSet;

public class Q10_CountWord {

	public static void main(String[] args) {
		String text = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain\n"
				+ "was born and I will give you a complete account of the system, and expound the actual teachings\n"
				+ "of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes,\n"
				+ "or avoids pleasure itself, because it is pleasure, but because those who do not know how to\n"
				+ "pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there\n"
				+ "anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because\n"
				+ "occasionally circumstances occur in which toil and pain can procure him some great pleasure. To\n"
				+ "take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain\n"
				+ "some advantage from it? But who has any right to find fault with a man who chooses to enjoy a\n"
				+ "pleasure that has no annoying consequences, or one who avoids a pain that produces no\n"
				+ "resultant pleasure?";
		System.out.println(text.length());
				
		String cleanText = text.replaceAll("[^A-Za-z -]", "");		// 구둣점 제거
	//	String cleanText = text.replace("[\\.,\\?]", "");		// 구둣점 제거
		System.out.println(cleanText.length());
		
		String[] textArr = cleanText.split(" ");
		System.out.println("단어의 갯수: " + textArr.length);
		
		// 고유 단어의 갯수
		HashSet<String> hs = new HashSet<>();
		for (String word : textArr)
			hs.add(word.toLowerCase());
		System.out.println("단어의 갯수: " + hs.size());
		
		

	}

}
