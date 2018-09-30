import java.io.*;

/**
 * 自定义文件类加载器
 */
public class FileClassLoader extends ClassLoader {
    private String rootDir;

    public FileClassLoader(String rootDir){
        this.rootDir = rootDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(name);

        if(c != null){
            return c;
        }else{
            ClassLoader parent = this.getParent();
            parent.loadClass(name);
            if (null != c){
                return c;
            }else{
                byte[] classDate =getClassData(name);
                if (classDate == null){
                    throw new ClassNotFoundException();
                }else{
                    c = defineClass(name, classDate, 0, classDate.length);
                }
            }
        }return c;
    }


    private byte[] getClassData(String name) {
        String path = rootDir + "/" + name.replace(".", "/") + ".class";

        InputStream is = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            is = new FileInputStream(path);
            byte[] buffer = new byte[1024];
            int tmp = 0;
            while (-1 != (tmp = is.read(buffer))) {
                byteArrayOutputStream.write(buffer, 0, tmp);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
