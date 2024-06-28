package DataConversion;

public class DataConvert {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//String to int: using Wrapper class: Integer
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
//		String t = "200A";
//		int j = Integer.parseInt(t);
//		System.out.println(j+20); //NumberFormatException
		
		String y = "12.33";
		System.out.println(y+20);
		
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//String to boolean:
		
		String execute = "true";
		boolean b = Boolean.parseBoolean(execute);//true
		
		if(b) {
			System.out.println("Run my testcases");
		} else {
			System.out.println("exit");
		}
		
		// int to String:
		System.out.println("-----------");
		int p = 200;
		System.out.println(p+20);
		
		String s = String.valueOf(p);
		System.out.println(s+20);
		
		//boolean to String:
		
		boolean f = true;
		String ff = String.valueOf(f); //"true"
		System.out.println(ff.length());
		
		//
		String tr = "";
		System.out.println(tr.isEmpty());//true
		System.out.println(tr.isBlank());//true
		
		String tr1 = " ";
		System.out.println(tr1.isEmpty());//false
		System.out.println(tr1.isBlank());//true
		
		String tr2 = "      ";
		System.out.println(tr2.isEmpty());//false
		System.out.println(tr2.isBlank());//true
		
		String tr3 = "      v";
		System.out.println(tr3.isEmpty());//false
		System.out.println(tr3.isBlank());//false
		
		
		
		

	}

}
