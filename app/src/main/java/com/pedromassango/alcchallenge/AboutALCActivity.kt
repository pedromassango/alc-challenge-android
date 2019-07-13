package com.pedromassango.alcchallenge

import android.net.Uri
import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.SslErrorHandler
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutALCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        web_view.webChromeClient = WebChromeClient()
        web_view.webViewClient = SSLIgnoreClient()
        web_view.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY

        web_view.settings.apply {
            javaScriptEnabled = true
            useWideViewPort = true
            loadWithOverviewMode = true
            domStorageEnabled = true
            javaScriptCanOpenWindowsAutomatically = true
            loadsImagesAutomatically = true
            setSupportZoom(true)
        }

        web_view.loadUrl("https://andela.com/alc/")

    }
}

class SSLIgnoreClient : WebViewClient(){

    override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
        handler?.proceed()
    }
}
