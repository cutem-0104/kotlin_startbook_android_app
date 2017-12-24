package sample.qiitaclient.client

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import sample.qiitaclient.model.Article

/**
 * Created by cutem on 2017/12/25.
 */
interface ArticleClient {
    @GET("api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}