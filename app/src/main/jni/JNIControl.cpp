//
// Created by Wp on 2018/11/15.
//

#include "king_bird_ndkjnidemo_JNIUtils.h"
//king_bird_ndkjnidemo_JNIUtils_printStringByJni 包名+文件名+文件内方法名
JNIEXPORT jstring JNICALL Java_king_bird_ndkjnidemo_JNIUtils_printStringByJni
        (JNIEnv *env, jclass jclass){
    //字符串返回
return env->NewStringUTF("没想到吧！我竟然会JNI了！！！");
}
