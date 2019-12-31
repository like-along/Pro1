import java.util.ArrayList;
import java.util.List;

/**
 * 	智能补全  引包 alt+Enter
 * 	由方法自动生成返回值变量 ctrl+alt+v
 * 	跳到方法的实现类 ctrl+alt+b
 * 	实现接口或父类方法 ctrl +O    ctrl + i
 * 	查看方法参数 ctrl+p
 * 	查看方法文档  ctrl+q
 * 	复制行 ctrl+D
 * 	删除行 ctrl+Y
 * 	跳转到上一个/下一个位置   ctrl+alt+左右
 * 	大小写切换  ctrl+shift+u
 */
public class HelloWord {
    public static final String password = "111";
    int i = 1;
    public static void main(String[] args) {
    //    ArrayList list = new ArrayList();
        List list1 = new ArrayList();
        list1.add("222");
        System.out.println("dasdhjkas");

        for (Object list : list1) {
            System.out.println(list);
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("args = [" + args + "]");
            System.out.println("HelloWord.main");
            System.out.println("arg = " + arg);
            System.out.println(i);


        }

        for (int i = 0; i <50; i++) {
            System.out.print("1");
        }



    }

}
