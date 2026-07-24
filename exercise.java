public class exercise{
    public static void main (String [] args) {
        String incorrect_name = new String (" mArTíN fIeRrO ");
        String modified_name = incorrect_name.trim();
        String modified_name1 = modified_name.replace("R", "");
        String modified_name2 = modified_name1.toLowerCase();
        String modified_name3 = modified_name2.replace(" ", ",");
        String modified_result = modified_name3.substring(0,1).toUpperCase() + modified_name3.substring(1);
        System.out.println(modified_result);
    }
}  