import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class BaseModel(private val postRepository: PostRepository) : ViewModel() {

    private val base_posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> = base_posts

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                val fetchedPosts = postRepository.getPosts()
                base_posts.postValue(fetchedPosts)
            } catch (e: Exception) {

            }
        }
    }
}