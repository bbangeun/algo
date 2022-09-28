package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2941 {

    // 크로아티아 알파벳
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(countString(input));

    }

    private static int countString(String input) {

        String replaceString = input;
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : alphabet) {
            replaceString = replaceString.replaceAll(s, "*");
        }

        return replaceString.trim().length();
    }

}
