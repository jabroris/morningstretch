package hackerrank;

/**
 * You are given employee's presence records at a company as an array of strings,
 * where each string looks like 'YNYYNN' where 'Y' indicates that the employee
 * at that index was at work on that day and 'N' indicates that the employee at
 * that index was not present at work on that day.
 *
 * Given an array of presence indicating dates in a sequence, find the length of
 * the longest sequence where all employees were present at work.
 */
class ManageEmployees {
    
    private static int maxStreak(String[] arr) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(!arr[i].contains("N"))
            {
                count++;
                if(count > maxCount)
                    maxCount = count;
            }
            else
                count = 0;
        }
        return maxCount;
    }
    
    public static void main(String[] args) {
//		  String[] arr = new String[]{"NYY"}; // 0
//        String[] arr = new String[]{"YNYY" , "YYYY" , "YYYY" , "YYNY" , "NYYN"}; // 2
//        String[] arr = new String[]{"YYY", "YYY", "YYY", "YYN", "YYN"}; // 2
        String[] arr = new String[]{"YYY", "YYY", "YNN", "YYY", "YYY", "YYY", "YYN", "YYN"}; // 3
//        String[] arr = new String[]{}; // 0
        System.out.println(maxStreak(arr));
    }
}
