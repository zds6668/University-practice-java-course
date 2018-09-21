import java.io.File;

/**
 * 目录操作
 * makdir() makdirs()
 */
public class TestDir01 {
    public static void main(String[] args){
        File dir1 = new File("C:/Users/deng/Desktop/dir1/dir2/dir3");
        dir1.mkdir();
        dir1.mkdirs();

        //list()返回名称  listFiles()返回对象
        File dir2 = new File("C:/Users/deng/Desktop/");
        String[] dirL = dir2.list();
        for (String s:dirL
             ) {
            System.out.println(s);
        }
    }
}
