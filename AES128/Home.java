package AES128;

public class Home {
    public static void main(String[] args) {
        try {
            Aes128 aes128 = new Aes128("password12345678");
        
            String plain = "this is plain text";
            String enc= aes128.encrypt(plain);
            String dec = aes128.decrypt(enc);
    
            System.out.println(enc);
            System.out.println(dec);
        } catch (Exception e) {
            e.printStackTrace(); 
        }
      
    }
}
