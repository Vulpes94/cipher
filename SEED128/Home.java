package SEED128;

/***************************************
 * SEED-128 양방향 암호화
 ***************************************/

public class Home {
    public static void main(String[] args) {
        // 유저키 16자리 기반
        Seed128 seed128 = new Seed128("password12345678");

        String plain = "1";
        String enc= seed128.encrypt(plain);
        String dec = seed128.decrypt(enc);

        System.out.println(enc);
        System.out.println(dec);
    }
}