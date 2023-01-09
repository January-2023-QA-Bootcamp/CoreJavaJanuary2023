package lec02_java_basic;

//we are learning: String concatenation, very important and very easy!!!

public class E_happyBirthDay {

	public static void main(String[] args) {
		// When we Print a complete sentence -- That is a String.
		// How you understand this is a String? when you see something inside double quotation --> " "
		// white space inside the double quotation can't be removed by ---> shift+control+f
		System.out.println("Stephen Hawking was an English theoretical physicist and cosmologist, who despite being afflicted motor neurone disease that severely limited his physical abilities, was able to build a phenomenally successful career. He was the first to set out a theory of cosmology explained by a union of the general theory of relativity and quantum mechanics. Hawking was ranked 25 in the BBC's poll of the 100 Greatest Britons, in 2002.");
		// Below we are Printing by String concatenation
		// Concat is a verb
		// String concatenation -- Concat/connect multiple String
		System.out.println("Stephen Hawking was an English theoretical physicist and cosmologist," + "who despite being afflicted motor neurone disease that severely limited his physical abilities," + "was able to build a phenomenally successful career. He was the first to set out a theory of cosmology explained by a union of the general theory of relativity and quantum mechanics. Hawking was ranked 25 in the BBC's poll of the 100 Greatest Britons, in 2002.");
	}

}
