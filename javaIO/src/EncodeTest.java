import java.io.UnsupportedEncodingException;

/**
 * 字符集
 */
public class EncodeTest {
    public static void main(String[] args){
        String msg = "阿里巴巴是真的厉害";
        //编码咯,默认是工程的字符集，utf-8一个中文3字节，gbk固定2字节
        byte[] datas = msg.getBytes();
        System.out.println(datas.length);

        try {
            byte[] datas2 = msg.getBytes("GBK");
            System.out.println(datas2.length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(datas);
        try {
            String strdes = new String(datas, 0, datas.length, "UTF8");
            System.out.println(strdes);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//乱码的产生，字节数不够，字符集不统一
        try {
            System.out.println(new String(datas, 0, datas.length, "GBK" ) );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
