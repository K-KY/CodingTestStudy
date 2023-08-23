package org.example.inflearnAlgo.string;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.

비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.

비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.

만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.

1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.

2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.

3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.

참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.

현수가 4개의 문자를 다음과 같이 신호로 보냈다면

#****###**#####**#####**##**

이 신호를 4개의 문자신호로 구분하면

#****## --> 'C'

#**#### --> 'O'

#**#### --> 'O'

#**##** --> 'L'

최종적으로 “COOL"로 해석됩니다.

현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.


입력
첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.

현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.


출력
영희가 해석한 문자열을 출력합니다.

# = 1로
* = 0으로 바꾼다
끝에 입력된 공백이 에러를 유발하므로 같이 제거
Math.pow 로 2진수를 계산하고 7번쨰 수까지 합해서 char 로 변환후 스트링빌더에 넣는다
거꾸로 입력 되므로 reverse 메소드를 사용해 뒤집는다.

*/
public class l암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = Integer.parseInt(sc.nextLine());
        //사용 안함
        String psw = sc.nextLine().replace("*", "0").replace("#", "1").replace(" ", "");
        //공백을 제거하는 이유 -> 첫번째 테스트 케이스의 끝부분에 공백으로 에러남
        //공백이 들어가는건 정상적으로 되는데 아래 이진수 변환하는 과정에서 공백이 에러를 발생
        //*은 0 으로 #은 1로 바꾼다
        ArrayList<String> arr = new ArrayList<>();
        //0,1로 변경된 값이 들아갈 배열
        StringBuilder result = new StringBuilder();
        //
        int cal = 0;
        int cnt = 0;
        for (int i = 0; i < psw.length(); i++) {
            arr.add(String.valueOf(psw.charAt(psw.length() - (i + 1))));
            //어레이에 집어넣는데 뒤어서부터 계산하기 때문에 거꾸로 집어넣는다
        }
        System.out.println(arr);
        for (int i = 0; i < psw.length(); i++) {
            cal += Integer.parseInt(arr.get(i)) * Math.pow(2, cnt);
            //2진수를 10진수로 변환 -> 0011001 = 각 자리수 별로 2의 0제곱부터 2의 length - 1 까지 계산 하면 0 + 0 + 4 + 8 + 0 + 0 + 64 = 76 = L
            cnt++;
            //배열의 자릿수 i 번째 숫자 * 2의 cnt 제곱만큼 더한다

            //문제에서 7자리로 구성되어있다 했으니 cnt = 7 -> 6번째 숫자까지 계산을 완료하면 스트링빌더에 추가하고 cnt 와 cal 을 초기화한다
            if (cnt == 7) {
                char c = (char) cal;
                //아스키코드인 cal 을 캐릭터로 캐스팅 한다
                System.out.println(cal);
                cal = 0;
                cnt = 0;
                result.append(c);
            }
        }
        //거꾸로 계산했기 때문에 문자열도 거꾸로 생성됨
        //그래서 문자열을 뒤집는다
        System.out.println(result.reverse());


    }
}
