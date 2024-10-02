public class string1 {
    public static void main(String[] args) {
        String name = "MISS.ARADHYA";
        int n = name.length();
        System.out.println(n);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String trim = name.trim();
        System.out.println(trim);
        String k = "   KHUSHI ";
        System.out.println(k);
        String trimmeed = k.trim();
        System.out.println(trimmeed);
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(1));
        System.out.println(name.replace("ARAD", "KHU"));
        System.out.println(name.replace("HYA", "SHI"));
    }
}
