package duc.thanhhoa.shopeefake.activities

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import duc.thanhhoa.shopeefake.R
import duc.thanhhoa.shopeefake.databinding.ActivitySplashBinding

private lateinit var binding: ActivitySplashBinding
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        @Suppress("DEPRECATION")
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        //set thơi gian chờ khi vào home
        @Suppress("DEPRECATION")
        Handler().postDelayed(
            {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            },
            1500
        )

//        val typeFace: Typeface= Typeface.createFromAsset(assets, "OpenSans-Bold.ttf")
//        binding.tvAppName.typeface= typeFace


    }
}