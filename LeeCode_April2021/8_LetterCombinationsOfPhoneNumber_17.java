class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if(digits.length()==0){
            return output;
        }
        int num = Integer.parseInt(digits);
        String[] ans = Keypad(num);
        
        for(String s : ans){
            output.add(s);
        }
        return output;
    }
    public static String[] Keypad(int inp){
        if(inp == 0) {
			String[] ans = {""};
			return ans;
		}
		String[] smallAns = Keypad(inp / 10);
		char[] options = numberOption(inp % 10);
		String[] output = new String[smallAns.length * options.length];
		int k = 0;
		for(int i=0; i<smallAns.length; i++) {
			for(int j=0; j<options.length; j++) {
				output[k] = smallAns[i] + options[j];
				k++;
			}
		}
		
		return output;
    }
    public static char[] numberOption(int inp) {
		switch(inp) {
		case 2:
			char option2[] = {'a','b','c'};
			return option2;
		case 3:
			char option3[] = {'d','e','f'};
			return option3;
		case 4:
			char option4[] = {'g','h','i'};
			return option4;
		case 5:
			char option5[] = {'j','k','l'};
			return option5;
		case 6:
			char option6[] = {'m','n','o'};
			return option6;
		case 7:
			char option7[] = {'p','q','r','s'};
			return option7;
		case 8:
			char option8[] = {'t','u','v'};
			return option8;
		case 9:
			char option9[] = {'w','x','y','z'};
			return option9;
		default:
			char option[] = {'\0'};
			return option;
		}
		
	}
}