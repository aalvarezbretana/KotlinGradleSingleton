import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

object Tiempo{
        var doc:Document = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
        var miElemento: Elements = doc.getElementsByClass("today_nowcard-temp")
        var miTexto:String = miElemento.text()
        var elemento:Elements=doc.getElementsByClass("today_nowcard-phrase")
        var texto:String = elemento.text()


    fun imprimir(){
        println(miTexto)
        println(texto)
        println(doc.title())
    }
}