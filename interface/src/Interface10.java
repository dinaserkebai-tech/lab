interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

class AES implements Encryptable {
    public String encrypt(String data) {
        return "AES(" + data + ")";
    }
    public String decrypt(String encryptedData) {
        return encryptedData.replace("AES(", "").replace(")", "");
    }
}

class RSA implements Encryptable {
    public String encrypt(String data) {
        return "RSA(" + data + ")";
    }
    public String decrypt(String encryptedData) {
        return encryptedData.replace("RSA(", "").replace(")", "");
    }
}

public class Interface10 {
    public static void main(String[] args) {
        Encryptable aes = new AES();
        String encrypted = aes.encrypt("hello");
        System.out.println("Encrypted with AES: " + encrypted);
        System.out.println("Decrypted: " + aes.decrypt(encrypted));

        Encryptable rsa = new RSA();
        encrypted = rsa.encrypt("world");
        System.out.println("Encrypted with RSA: " + encrypted);
        System.out.println("Decrypted: " + rsa.decrypt(encrypted));
    }
}
