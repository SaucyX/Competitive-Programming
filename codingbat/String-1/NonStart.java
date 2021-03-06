/*
 * CodingBat Java Activity "nonStart" from String-1 section.
 * codingbat.com
 */

 /*
 * INSTRUCTIONS
 * Given two strings, return their concatenation, except omit the first char of each.
 * The strings will be at least length 1.
 * 
 * nonStart("Hello", "There") -> "ellohere"
 * nonStart("java", "code") -> "avaode"
 * nonStart("shotl", "java") -> "hotlava"
 */

public class NonStart 
{
	public String nonStart(String a, String b)
	{
		return a.substring(1) + b.substring(1);
	}
}

