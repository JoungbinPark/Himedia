package com.ohgiraffers.section02.string;

public class Application {
    public static void main(String[] args){
        /* String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */

        /* charAt()
        * 해당 문자열의 인덱스에 해당되는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자체계를 의미하며
        * 인덱스를 벗어난 정수를 입자로 전달하는 경우
        * indexOutOfBoundsException이 발생
        * */

        String str = "apple";
        for(int i = 0; i<str.length();i++){
            System.out.println("charAt(" + i + ") = " + str.charAt(i));
        }

        /* campareTo()
        * 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같으면 0을 반환, 인자로 전달한 문자열보다 작으면 음수를, 크면 양수를 반환.
        * 단 이 메소드는 대소문자를 구분한다.
        * 기준값에 비교대상이 포함되어있을 경우 서로의 문자열 길이의 차이값을 리턴
        * 비교대상과 전혀 다를 경우 비교가 불가능한 지점의 문자열 아스키값을 기준으로 비교*/

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo(str3) : " +(str2.compareTo(str3)));   //0
        System.out.println("compareTo(str4) : " +(str2.compareTo(str4)));   //32
        System.out.println("compareTo(str2) : " +(str4.compareTo(str2)));   //-32
        System.out.println("compareTo(str5) : " +(str2.compareTo(str5)));   // 5
        System.out.println("compareTo(str2) : " +(str5.compareTo(str2)));   //-5

        /* concat() :
        * 문자열에 인자로 전달한 문자열을 합치기해서 새로운 문자열을 반환.
        * 원본 문자열에는 영향을 주지 않는다. */

        System.out.println("concat() : " + (str2.concat(str5)));
        System.out.println("str2 = " + str2);

        /* indexOf() :
        * 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
        System.out.println("indexOf('a') : " + indexOf.indexOf('z'));


        /* lastIndexOf() :
        * 문자열 탐색을 뒤에서부터하고 처음 일치하는 위치의 인덱스를 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.*/


        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a'));
        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('z'));

        /*trim() :
        * 문자열의 앞 위에 공백을 제거한 문자열을 반환 */
        String trimstr = "   java   ";

        System.out.println("trimstr + # = " + trimstr +"#");
        System.out.println("trimstr + # = " + trimstr.trim() +"#");

        /* toLowerCase() :
        * 모든 문자를 소문자로 변환시킴
        * toUpperCase() :
        * 모든 문자를 대문자로 변환시킴
        * */
        String caseStr = "JavaOracle";

        System.out.println("toLowerCase() : "+ caseStr.toLowerCase());
        System.out.println("toUpperCase() : "+ caseStr.toUpperCase());

        /* substring() :
        * 문자열 일부분을 잘라내어 새로운 문자열을 반환한다.
        * */
        String javaoracle = "javaoracle";
        System.out.println("substring(3,6) : " + javaoracle.substring(3, 6));
        System.out.println("substring(3) : " + javaoracle.substring(3));

        /* replace() :
        * 문자열에서 대체할 문자열로 기존 문자열을 변경해서 변환한다. */
        System.out.println("replace() : " + javaoracle.replace("java","python"));

        /*length() :
        * 문자열의 길이를 정수형으로 변환*/
        System.out.println("length() : " + javaoracle.length());
        System.out.println("빈 문자열의 길이 : " + ("".length()));

        /* isEmpty() :
        * 문자열의 길이가 0이면 true를, 아니면 false를 반환 */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "   ".isEmpty());
        System.out.println("isEmpty() : " + "   ".isBlank());

        /* 길이가 0인 문자열은 null과 다르다. */
        String str6 = null;


    }
}
