import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.assesment.databinding.ActivityMainBinding
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onResume() {
        super.onResume()
        getDetails()
    }

    fun getDetails(){
        val retrofit = ApiClient.ApiClient(ApiInterface::class.java)
        var request = retrofit.getTitle()
        request.enqueue(object : Callback<List<Fetchdata>> {
            override fun onResponse(call: Call<List<Fetchdata>>, response: Response<List<Posts>>) {
                if (response.isSuccessful){
                    var postings = response.body()
                    Toast.makeText(baseContext,"${postings!!.size}postings", Toast.LENGTH_LONG).show()
                }
            }

            fun onFailure(call: Call<List<Fetchdata>>, t: Throwable) {
            }
        })
    }
}
