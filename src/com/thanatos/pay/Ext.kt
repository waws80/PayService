import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.Charset


fun getString(url: String): String{
    return URL(url).readText()
}

fun URL.request(method: String, body: String?): String{
    val http: HttpURLConnection = this.openConnection() as HttpURLConnection
    http.doInput = true
    http.requestMethod = method
    http.setRequestProperty("content-type","application/x-www-form-urlencoded")
    if (method == "POST"){
        http.doOutput = true
        if (null != body && body.isNotEmpty()){
            val os = http.outputStream
            os.write(body.toByteArray(Charset.forName("UTF-8")))
            os.close()
        }
    }
    return String(http.inputStream.readBytes())
}