

class TestTimeFormatter {
	
	public static void main(String args[]){
		
		String t1 = "00:00:00.01";
		String t2 = "00:00:00.21";
		String t3 = "00:00:03.21";
		String t4 = "00:00:43.21";
		String t5 = "00:05:43.21";
		String t6 = "00:65:43.21";
		String t7 = "07:65:43.21";
		String t8 = "87:65:43.21";
		
		System.out.println(timeFormatter(t1));
		System.out.println(timeFormatter(t2));
		System.out.println(timeFormatter(t3));
		System.out.println(timeFormatter(t4));
		System.out.println(timeFormatter(t5));
		System.out.println(timeFormatter(t6));
		System.out.println(timeFormatter(t7));
		System.out.println(timeFormatter(t8));
	}
	
	
	private static String timeFormatter(String timeStr){
		if(timeStr == null) return null;
		
		String time = timeStr.replace(":", "");
		Float f = ((int)(Float.parseFloat(time) * 10)) / 10F;
		time = String.valueOf(f);
		
		StringBuffer sb = new StringBuffer(time);
		for(int i = time.length()-4; i > 0; i -= 2){
			sb.insert(i, ":");
		}
		
		return sb.toString();
	}
	
}