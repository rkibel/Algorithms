public class AddOne{
    public static String addOne(String str) {
        for (int i = str.length()-1; i >=0 ; i--){
            int val = str.charAt(i);
            if (i == 0 && val == 57) return "10" + str.substring(1);
            if (val != 57) return str.substring(0, i) + (char)(val+1) + str.substring(i+1);
            str = str.substring(0, i) + "0" + str.substring(i+1);
        }
        return str;
    }
    public static void main(String[] args){
        String num = "99999";
        System.out.println(addOne(num));;
    }
}