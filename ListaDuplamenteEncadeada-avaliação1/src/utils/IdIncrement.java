package utils;

public class IdIncrement {
	private static Long code = 0l;
	
	public static Long getCode() {
		++code;
		return code;
	}
}
