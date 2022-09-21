package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1152 {

    // 단어의 개수
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] arr = input.trim().split(" ");

        if (arr[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}
