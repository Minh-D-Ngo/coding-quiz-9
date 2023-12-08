import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    long Min = (int) Math.pow(10,10);
    long Max = 0;
    long Sum = 0;
    long MinNum = 0;
    long MaxNum = 0;
    for (int i = 0; i < arr.size(); i++){
        Sum += arr.get(i);
    }
    
    for (int i = 0; i < arr.size(); i++){
        if (arr.get(i) < Min) {
            Min = arr.get(i);
        }
        if (arr.get(i) > Max){
            Max = arr.get(i);
        }
    }
    MinNum = Sum - Max;
    MaxNum = Sum - Min;
    System.out.print(MinNum + " " + MaxNum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
