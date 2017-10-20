package mx.com.websampler;

public class IdGenerator {

    public static void main(String[] args) {
        for (int a = 0; a < 5; a++) {
            String md5 = String.valueOf(System.nanoTime());
    
            try {
                java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
                byte[] array = md.digest(md5.getBytes());
                StringBuffer sb = new StringBuffer();
    
                for (int i = 0; i < array.length; ++i) {
                    sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
                }
    
                System.out.println(sb.toString().toUpperCase());
            } catch (java.security.NoSuchAlgorithmException nsae) {
                System.out.println("Ocurrio un error al generar el uuid: " + nsae.getMessage());
            }
        }
    }

}
