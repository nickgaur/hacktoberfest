package Assignments;

public class VivekHeliwalAssignmentJune9 {
    static void sortOnFrequency(String str) {

    }

    static void firstUniqueCharacter(String str, int n) {
        int arr[] = new int[26];
        for (int i = 0; i < n; i++)
            arr[str.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++)
            if (arr[str.charAt(i) - 'a'] == 1) {
                System.out.println("First unique character is '" + str.charAt(i) + "' at index : " + i);
                break;
            }
        System.out.println();
    }

    static void RLE(String str) {
        int count = 1;
        int i = 0;
        int j = 1;

        for (int k = 0; k <= str.length(); k++) {
            if (str.charAt(j) == '@') {
                System.out.println(str.charAt(i) + "" + count);
                break;
            } else if (str.charAt(i) == str.charAt(j)) {
                j++;
                count++;
            } else if (str.charAt(i) != str.charAt(j)) {
                System.out.print(str.charAt(i) + "" + count);
                i = j;
                j++;
                count = 1;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String str2 = "aabbcbdbbdbsaa";
        int n2 = str2.length();
        firstUniqueCharacter(str2, n2);

        String str3 = "aaaabbbcccccdddeef";
        str3 = str3 + "@";
        RLE(str3);
    }
}
