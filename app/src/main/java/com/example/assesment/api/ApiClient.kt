object ApiClient {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildClient(apiInterface:Class<T>): T{
        return retrofit.create(apiInterface)
    }
}

class Retrofit {
    class Builder {
        fun baseUrl(s: String): Any {
            TODO("Not yet implemented")
        }

    }

}

class GsonConverterFactory {
    companion object {
        fun create(): Any {

        }
    }

}
