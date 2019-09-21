package br.ufpe.cin.android.podcast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.doAsync
import java.net.URL
import org.jetbrains.anko.uiThread
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.DividerItemDecoration

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        https://mundopodcast.com.br/podcasteando/tecnologia-feed-rss-podcasts/
        //Faz o carregamento do XML


//        doAsync{
//            val podcastXml = URL("https://s3-us-west-1.amazonaws.com/podcasts.thepolyglotdeveloper.com/podcast.xml").readText()
//            var itemList = Parser.parse(podcastXml)
//
//            uiThread {
//                recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
//                recyclerview.adapter = ItemFeedAdapter(itemList)
//                recyclerview.addItemDecoration(DividerItemDecoration(this@MainActivity, LinearLayoutManager.VERTICAL))
//            }
//        }

    }
}
