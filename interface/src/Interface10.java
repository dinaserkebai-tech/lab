// Interface10.java
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Simple simulation of AES encryption
        return "AES{" + new StringBuilder(data).reverse() + "}";
    }

    @Override
    public String decrypt(String encryptedData) {
        // Simple simulation of AES decryption
        String inner = encryptedData.substring(4, encryptedData.length() - 1);
        return new StringBuilder(inner).reverse().toString();
    }
}

class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Simple simulation of RSA encryption
        return "RSA<" + data.toUpperCase() + ">";
    }

    @Override
    public String decrypt(String encryptedData) {
        // Simple simulation of RSA decryption
        String inner = encryptedData.substring(4, encryptedData.length() - 1);
        return inner.toLowerCase();
    }
}

public class Interface10 {
    public static void main(String[] args) {
        Encryptable aes = new AES();
        Encryptable rsa = new RSA();

        String text = "HelloWorld";

        System.out.println("Original Text: " + text);

        // AES
        String aesEncrypted = aes.encrypt(text);
        System.out.println("AES Encrypted: " + aesEncrypted);
        System.out.println("AES Decrypted: " + aes.decrypt(aesEncrypted));

        System.out.println();

        // RSA
        String rsaEncrypted = rsa.encrypt(text);
        System.out.println("RSA Encrypted: " + rsaEncrypted);
        System.out.println("RSA Decrypted: " + rsa.decrypt(rsaEncrypted));
    }
}
