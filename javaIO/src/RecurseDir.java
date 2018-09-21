import java.io.File;

/*
递归打印某个路径里的文件
 */
public class RecurseDir {
    public static void main(String[] args){
        File src = new File("F:\\github\\java\\面向对象");
        printName(src, 0);
    }

    public static void printName(File src, int deep){
        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
        if (!src.exists() || src == null){
            return;
        }else if (src.isDirectory()){
            for (File s:src.listFiles() ) {
                printName(s, deep+1);
            }
        }else{
            System.out.println(src.getName());
        }
    }
}
