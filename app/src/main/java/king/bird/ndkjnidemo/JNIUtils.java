package king.bird.ndkjnidemo;

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/11/15
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class JNIUtils {

    static {
        System.loadLibrary("JNIControl");
    }

    public static native String printStringByJni();
}
