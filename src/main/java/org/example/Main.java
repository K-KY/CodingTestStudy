package org.example;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb;
        String str = "";
        for (int i = 1; i <= n; i++) {
            sb = new StringBuilder();
            for (int j = 1; j <= n * 2 - i; j++) {
                if (j < i || j > n * 2 - i) {
                    sb.append(" ");
                    continue;
                }

                sb.append("*");

            }
            System.out.println(sb);
            if (i < n) {
                sb.append("\n");
                sb.append(str);
                str = sb.toString();
            }

        }
        System.out.println(str);
    }
}

/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb;
        String str = "";
        for (int i = 1; i <= n; i++) {
            sb = new StringBuilder();
            for (int j = 1; j <= n * 2; j++) {
                if (j <= i || j > n * 2 - i) {
                    sb.append("*");
                    continue;
                }

                    sb.append(" ");

            }
            System.out.println(sb);
            //반대편에 출력할 결과를 만든다
            if (i < n) {
                sb.append("\n");
                sb.append(str);
                str = sb.toString();
            }

        }
        System.out.println(str);
    }
}*/
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        String str = "";
        for (int i = 1; i <= num; i++) {
            sb = new StringBuilder();
            for (int j = 0; j <= num; j++) {
                if (num - j > i) {
                    sb.append(" ");
                }
            }
            int n = 2 * i - 1;
            for (int j = 1; j <= n; j++) {
                sb.append("*");
            }
            sb.append("\n");
            sb.append(str);
            str = sb.toString();
        }
        System.out.println(sb);
    }
}*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= num; j++) {
                if (num - j > i) {
                    sb.append(" ");
                }
            }
            int n = 2 * i - 1;
            for (int j = 1; j <= n; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < num; j++) {
                if (num - j > i) {
                    sb.append("*");
                }
            }
            System.out.println(sb);
        }
    }
}
*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < num; j++) {
                if (num - j > i) {
                    sb.append(" ");
                }
                if (num - j <= i)  {
                    sb.append("*");
                }
            }
            System.out.println(sb);
        }

    }
}
*/
/*public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
                answer = answer + Integer.parseInt(st.nextToken());
                answer = answer + Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(answer));
            bw.write("\n");

            bw.flush();
        }
    }
}*/

/*public class Main{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0;
        int m = 0;
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int time = sc.nextInt();
            y += yong(time);
            m += min(time);
        }

        if (y < m) {
            sb.append("Y").append(" ").append(y);
        }
        if (y > m) {
            sb.append("M").append(" ").append(m);
        }

        if (y == m) {
            sb.append("Y M").append(" ").append(m);
        }
        System.out.println(sb);




    }

    static int yong(int time) {
        int r = 0;
        while (time >= 0) {
            time = time - 30;
            r = r + 10;
        }
        return r;
    }

    static int min(int time) {
        int r = 0;
        while (time >= 0) {
            time = time - 60;
            r = r + 15;
        }
        return r;

    }
}*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = b - (a + 1);
        if (n < 0) {
            n = 0;
        }
        System.out.println(n);
        StringBuilder sb = new StringBuilder();
        for (long i = a + 1; i < b; i++) {
            sb.append(i);
            if(i == b - 1) {
                break;
            }
            sb.append(" ");
        }
        if (a < b)
        System.out.println("sb.toString() = " + sb);
    }
}
*/
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> hobit = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            hobit.add(sc.nextInt());
        }
        Collections.sort(hobit);

        for (int i = 0; i < hobit.size(); i++) {
            sum += hobit.get(i);
        }
        findHobit(hobit, sum);

    }

    static void findHobit(List<Integer> hobit, int sum) {
        int over = sum - 100;
        System.out.println("over = " + over);
        for (int i = 0; i < hobit.size(); i++) {
            for (int j = 0; j < hobit.size() - 1; j++) {
                if (hobit.get(i) + hobit.get(j) == over && j != i) {
                    found(hobit, i, j);
                    hobit.removeAll(hobit);
                    break;
                }
            }
        }
    }

    private static void found(List<Integer> hobit, int i, int j) {
        for (int k = 0; k < hobit.size(); k++) {
            if( k != i && k != j)
            System.out.println(hobit.get(k));
        }
    }
}*/

/*
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String[] lst = {"aa", "bb"};
        AtomicInteger a = new AtomicInteger();
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(6,1);
        hash.put(2,2);
        hash.put(3,3);
        hash.put(4,4);
        hash.forEach((k, v) ->{
            System.out.println(k+":::"+v);
            a.addAndGet(v);
        });
        System.out.println("a = " + a);
        a.toString();
        String s = "aaa aaa bbb";
        StringTokenizer st = new StringTokenizer(s);
        arr.add(st.nextToken());
    }
}

*/
