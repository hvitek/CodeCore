package formatUtils;

import java.sql.Timestamp;

public class FormatUtils {

	public static String TimestampToStringDDMMRRRR(Timestamp date)
	{
		String[] parts;
		if (date.toString().contains(" ")) {
			parts = date.toString().split(" ");
		} else {
		    throw new IllegalArgumentException("String " + date.toString() + " does not contain space");
		}
		
	if (parts[0].contains("-")) {
		parts = parts[0].split("-");
	} else {
	    throw new IllegalArgumentException("String " + parts[1] + " does not contain -");
	}

	return parts[2]+"."+parts[1]+"."+parts[0];
	}
	public static String LongToStringDDMMRRRR(Long date)
	{
		String[] parts;
		if (date.toString().contains(" ")) {
			parts = date.toString().split(" ");
		} else {
		    throw new IllegalArgumentException("String " + date.toString() + " does not contain space");
		}
		
	if (parts[0].contains("-")) {
		parts = parts[0].split("-");
	} else {
	    throw new IllegalArgumentException("String " + parts[1] + " does not contain -");
	}

	return parts[2]+"."+parts[1]+"."+parts[0];
	}
	public static String BooleanToAnswerByMask(Boolean bool, String trueAnswer, String falseAnswer)
	{
		if(bool)
			return trueAnswer;
		else
			return falseAnswer;
	}
	

	
	public static String BooleanToYesNo(Boolean bool)
	{
		if(bool)
			return "Yes";
		else
			return "No";
	}
	public static String BooleanToAnoNe(Boolean bool)
	{
		if(bool)
			return "Ano";
		else
			return "Ne";
	}
	public static String BooleanToOneZeroString(Boolean bool)
	{
		if(bool)
			return "1";
		else
			return "0";
	}	
	public static Integer BooleanToOneZeroInteger(Boolean bool)
	{
		if(bool)
			return 1;
		else
			return 0;
	}
}
