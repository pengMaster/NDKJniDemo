//
// Created by Wp on 2018/11/15.
//

#include "king_bird_ndkjnidemo_JNIUtils.h"
JNIEXPORT jstring JNICALL Java_king_bird_ndkjnidemo_JNIUtils_printStringByJni
        (JNIEnv *env, jclass jclass){
return env->NewStringUTF("没想到吧！我竟然会JNI了！！！");
}
