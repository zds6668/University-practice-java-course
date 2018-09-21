import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;

/**
 * 名称分隔符separate /
 */
public class FileTest01 {
    public static void main(String[] args){
        //构建file对象，绝对路径
        File src1 = new File("C:/Users/deng/Desktop", "web学习笔记.txt");
        System.out.println(src1.length());
        File src2 = new File("C:/Users/deng/Desktop/web学习笔记.txt");
        System.out.println(src2.length());

        //相对路径
        System.out.println(System.getProperty("user.dir"));
        //基本信息
        System.out.println("文件名为：" + src1.getName());
        System.out.println(src2.getAbsolutePath());
        System.out.println(src1.getParent());

        //文件状态
        System.out.println(src1.exists());
        System.out.println(src1.isDirectory());

        //length() 文件的字节数
        File src3 = new File("C:/Users/deng/");
        System.out.println(src3.length());

        //创建删除
        File src4 = new File("C:/Users/deng/Desktop", "我来创建一个.txt");
        try {
            src4.createNewFile();
            System.out.println("创建咯");
        } catch (IOException e) {
            e.printStackTrace();
        }
        src4.delete();
    }
}
