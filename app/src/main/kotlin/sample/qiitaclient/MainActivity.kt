package sample.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import sample.qiitaclient.model.Article
import sample.qiitaclient.model.User
import sample.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)

        listAdapter.articles = listOf(dummyArticle("Kotlin入門","たろう"),
                dummyArticle("Java入門", "じろう"))

        val listView: ListView = findViewById<ListView>(R.id.list_view)
        listView.adapter = listAdapter

        listView.setOnItemClickListener { articleView, view, position, id ->
            val article = listAdapter.articles[position]
            ArticleActivity.intent(this, article).let { startActivity(it)}

        }
    }

    private fun dummyArticle(title: String, userName: String): Article =
            Article(id = "",
                    title = title,
                    url = "http://kotlinlang.org/",
                    user = User(id = "", name = userName, profileImageUrl = ""))
}
