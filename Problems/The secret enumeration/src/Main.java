// Posted from EduTools plugin
public class Main {

    public static void main(String[] args) {
        int strCnt = 0;
        for (Secret s : Secret.values()) {
            strCnt += s.name().startsWith("STAR") ? 1 : 0;
        }
        System.out.println(strCnt);

    }
}

//// At least two constants start with STAR
//enum Secret {
//    STAR, CRASH, START, // ...
//}
