package king.bird.ndkjnidemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtnLoadNative.setOnClickListener {
            val jniUtils = JNIUtils.printStringByJni()
            mTvText.text = jniUtils
        }
    }
}
