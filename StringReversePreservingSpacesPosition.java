import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StringReversePreservingSpacesPosition {
	public static void main(String[] args) {
		String inputString="I am not a String";
		String reverseString=reverseStringWithSpaces(inputString);
		System.out.println(reverseString);
		List tempList=new ArrayList();
		tempList.add("25000000");
		BigDecimal cashRequirementAmt=new BigDecimal("0");
		cashRequirementAmt=new BigDecimal(tempList.get(0).toString());
		System.out.println("cashRequirementAmt: "+cashRequirementAmt);
		cashRequirementAmt=cashRequirementAmt.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("cashRequirementAmt: "+cashRequirementAmt);
		
	}
	public static String reverseStringWithSpaces(String inputString){
		
		StringBuffer stringReverse=new StringBuffer();
		char[] tempString=inputString.toCharArray();
		int stringLength=tempString.length;
		for(int i=stringLength-1,j=0;i>=0;i--){
			if(tempString[stringLength-1-i]==' '){
				stringReverse=stringReverse.append(" ");
			}
			if(tempString[i]==' '){
				continue;
			}
				
			stringReverse=stringReverse.append(tempString[i]);
		}
		return stringReverse.toString();
	}

}
