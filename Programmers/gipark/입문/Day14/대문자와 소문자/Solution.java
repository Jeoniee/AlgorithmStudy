/**
 * 대문자와 소문자
 * 제출 내역
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
 * 입출력 예
 * my_string	result
 * "cccCCC"	"CCCccc"
 * "abCdEfghIJ"	"ABcDeFGHij"
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
 * 입출력 예 #2
 *
 * 소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
 */
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}