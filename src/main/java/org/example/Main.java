package org.example;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strF = sortStr(sc.nextLine());
        String strS = sortStr(sc.nextLine());
        int score = 0;
        StringBuilder sb = new StringBuilder();
        System.out.println("strF = " + strF);
        System.out.println("strS = " + strS);

        for (int i = 0; i < strF.length(); i++) {
            if (strS.contains(strF.charAt(i)+"")) {
                sb.append(strF.charAt(i));
                strS = strS.replaceFirst(strF.charAt(i)+"", "-");
                strF = strF.replaceFirst(strF.charAt(i) + "", "-");
                System.out.println("sb = " + sb);
            }
        }

        score = strF.length() + strS.length() - sb.length() * 2;


        System.out.println("score = " + score);

        System.out.println("strF = " + strF);
        System.out.println("strS = " + strS);
    }

    private static String sortStr(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        str = new String(c);
        return str;
    }
}
/*
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < cycle; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String before = st.nextToken();
            String after = st.nextToken();
            if (before.length() != after.length()) {
                answer.add("Impossible");
                continue;
            }
            for (int j = 0; j < before.length(); j++) {
                if(!check(before.charAt(j) + "", after)) {
                    answer.add("Impossible");
                    break;
                }
                after = after.replaceFirst(before.charAt(j)+"", "");
                if (j == before.length() -1) {
                    answer.add("Possible");
                }
            }

        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

    static boolean check(String a, String b) {
        if (b.contains(a)) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            return true;
        }
        return false;
    }
}
*/

//12 점 맞음
/*
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int member = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int score = 0;
        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < member; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            String room = "";
            if (gender == 1) {
                room += "B" + grade + score;
                if (hash.getOrDefault(room, 0) == limit) {
                    score++;
                    room = "B" + grade + score;
                }
            }
            if (gender == 0) {
                room += "G" + grade + score;
                if (hash.getOrDefault(room, 0) == limit) {
                    score++;
                    room = "G" + grade + score;
                }
            }
            hash.put(room, hash.getOrDefault(room, 0) + 1);




        }
        System.out.println("hash = " + hash.size());
        System.out.println("hash = " + hash);
        System.out.println("score = " + score);
    }
}
*/
/*
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int score = 0;
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int obj = Integer.parseInt(br.readLine());
        Collections.sort(list);
        int start = 0;
        int end = list.size() - 1;
            while (start < end) {
                //두 수가 obj 와 같으면 start 와 end 를 한칸 앞으로 옮긴다 end 는 -1
                if (list.get(start) + list.get(end) == obj) {
                    score++;
                    start++;
                    end--;
                }
                //더 크면 end -1
                //list 가 오름차 순으로 정렬 되어있기 때문에 list[i] + list[j] 가 obj 보다 크다면 list[i + 1] + list[j] 도 obj 보다 큼
                if (list.get(start) + list.get(end) < obj) {
                    end--;
                }
                if (list.get(start) + list.get(end) > obj) {
                    start++;
                }
            }

        System.out.println("start = " + score);
    }
}
*/
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> hash = new HashMap<>();
        float max = 0;
        String roomNum = String.valueOf(sc.nextInt());

        for (int i = 0; i < roomNum.length(); i++) {
            String str = roomNum.charAt(i) + "";
            if (str.equals("9")) {
                str = "6";
            }
            if (str.equals("6")) {
                hash.put(str, hash.getOrDefault(str, 0f) + 0.5f);

            }
            if (!str.equals("6")) {
                hash.put(str, hash.getOrDefault(str, 0f) + 1);
            }
            if (hash.get(str) > max) {
                max = hash.get(str);
            }
        }

        System.out.println((int)Math.ceil(max));

    }
}*/
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<>();
        int sum = 1;
        String sumStr = "";
        for (int i = 0; i < 3; i++) {
            sum = sc.nextInt() * sum;
        }

        sumStr = sum + "";

        for (int i = 0; i < sumStr.length(); i++) {
            String str = sumStr.charAt(i) + "";

            hash.put(str, hash.getOrDefault(str, 0) + 1);
        }

        for (int i = 0; i <= 9; i++) {
            String key = String.valueOf(i);
            System.out.println(hash.getOrDefault(key, 0));
        }

    }
}*/
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
        }
        int max = Collections.max(list);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}*/
/*public class Main {
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
}*/

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
