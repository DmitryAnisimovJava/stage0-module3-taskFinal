package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
    	String reversedNumberString = ("" + number);
    	StringBuilder sb = new StringBuilder(reversedNumberString);
    	System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}
