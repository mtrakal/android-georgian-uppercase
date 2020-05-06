package cz.mtrakal.myapplication

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vUpperCase.text = "Original\n$testingGlyphs"
        vUpperCaseFont.text = "Custom font\n$testingGlyphs"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            vLowerCase.text = "Orig font converted \n${GeorgianUtil.convertGeorgianUppercaseToLowercase(testingGlyphs)}"
            vLowerCaseFont.text = "Custom font conv\n${GeorgianUtil.convertGeorgianUppercaseToLowercase(testingGlyphs)}"
        }
    }

    private val testingGlyphs =
        "Ჰ > ჰ\nᲱ > ჱ\nᲲ > ჲ\nᲳ > ჳ\nᲴ > ჴ\nᲵ > ჵ\nᲶ > ჶ\nᲷ > ჷ\nᲸ > ჸ\nᲹ > ჹ\nᲺ > ჺ\nᲽ > ჽ\nᲾ > ჾ\nᲿ > ჿ\n" +
                "Ⴀ > ⴀ / Ა > ა\n" +
                "Ⴁ > ⴁ / Ბ > ბ\n" +
                "Ⴂ > ⴂ / Გ > გ\n" +
                "Ⴃ > ⴃ / Დ > დ\n" +
                "Ⴄ > ⴄ / Ე > ე\n" +
                "Ⴅ > ⴅ / Ვ > ვ\n" +
                "Ⴆ > ⴆ / Ზ > ზ\n" +
                "Ⴡ > ⴡ / Ჱ > ჱ\n" +
                "Ⴇ > ⴇ / Თ > თ\n" +
                "Ⴈ > ⴈ / Ი > ი\n" +
                "Ⴉ > ⴉ / Კ > კ\n" +
                "Ⴊ > ⴊ / Ლ > ლ\n" +
                "Ⴋ > ⴋ / Მ > მ\n" +
                "Ⴌ > ⴌ / Ნ > ნ\n" +
                "Ⴢ > ⴢ / Ჲ > ჲ\n" +
                "Ⴍ > ⴍ / Ო > ო\n" +
                "Ⴎ > ⴎ / Პ > პ\n" +
                "Ⴏ > ⴏ / Ჟ > ჟ\n" +
                "Ⴐ > ⴐ / Რ > რ\n" +
                "Ⴑ > ⴑ / Ს > ს\n" +
                "Ⴒ > ⴒ / Ტ > ტ\n" +
                "Ⴣ > ⴣ / Ჳ > ჳ\n" +
                "Ⴓ > ⴓ / Უ > უ\n" +
                "Ⴧ > ⴧ / Ჷ > ჷ\n" +
                "Ⴔ > ⴔ / Ფ > ფ\n" +
                "Ⴕ > ⴕ / Ქ > ქ\n" +
                "Ⴖ > ⴖ / Ღ > ღ\n" +
                "Ⴗ > ⴗ / Ყ > ყ\n" +
                "— > — / Ჸ > ჸ\n" +
                "Ⴘ > ⴘ / Შ > შ\n" +
                "Ⴙ > ⴙ / Ჩ > ჩ\n" +
                "Ⴚ > ⴚ / Ც > ც\n" +
                "Ⴛ > ⴛ / Ძ > ძ\n" +
                "Ⴜ > ⴜ / Წ > წ\n" +
                "Ⴝ > ⴝ / Ჭ > ჭ\n" +
                "Ⴞ > ⴞ / Ხ > ხ\n" +
                "Ⴤ > ⴤ / Ჴ > ჴ\n" +
                "Ⴟ > ⴟ / Ჯ > ჯ\n" +
                "Ⴠ > ⴠ / Ჰ > ჰ\n" +
                "Ⴥ > ⴥ / Ჵ > ჵ\n" +
                "— > — / Ჶ > ჶ\n" +
                "— > — / Ჹ— > ჹ\n" +
                "— > — / Ჺ > ჺ\n" +
                "— > — / — > ჼ\n" +
                "Ⴭ > ⴭ / Ჽ > ჽ\n" +
                "— > — / Ჾ > ჾ\n" +
                "— > — / Ჿ > ჿ\n" +
                "Ⴀ Ⴁ Ⴂ Ⴃ Ⴄ Ⴅ Ⴆ Ⴇ Ⴈ Ⴉ Ⴊ Ⴋ Ⴌ Ⴍ Ⴎ Ⴏ\n" +
                "Ⴐ Ⴑ Ⴒ Ⴓ Ⴔ Ⴕ Ⴖ Ⴗ Ⴘ Ⴙ Ⴚ Ⴛ Ⴜ Ⴝ Ⴞ Ⴟ\n" +
                "Ⴠ Ⴡ Ⴢ Ⴣ Ⴤ Ⴥ  Ⴧ      Ⴭ \n" +
                "ა ბ გ დ ე ვ ზ თ ი კ ლ მ ნ ო პ ჟ\n" +
                "რ ს ტ უ ფ ქ ღ ყ შ ჩ ც ძ წ ჭ ხ ჯ\n" +
                "ჰ ჱ ჲ ჳ ჴ ჵ ჶ ჷ ჸ ჹ ჺ ჻ ჼ ჽ ჾ ჿ\n"
}



