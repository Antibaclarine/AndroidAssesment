import android.telecom.Call

interface ApiInterface {
    @GET("posts")
    fun getTitle(): Call<List<Fetchdata>>
    fun getPosts(): List<Fetchdata>
}

annotation class GET(val value: String)

class Posts {

}
