

class PostRepository(private val apiService: ApiInterface) {

    suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}