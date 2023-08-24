import android.telecom.Call

interface ApiInterface {
    @GET("posts")
    fun getTitle(): Call<List<Posts>>
}

annotation class GET(val value: String)

class Posts {

}
