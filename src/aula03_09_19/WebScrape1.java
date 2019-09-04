/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_09_19;
 // baixar jsoup
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author ktia-
 */
public class WebScrape1 {
    public static void main(String[] args) {
        
        final String url = "https://www.mg.superesportes.com.br/campeonatos/2019/brasileirao/serie-a/";
        int num = 1;
        try{
            final Document doc = Jsoup.connect(url).get();
            for(Element row : doc.select("table.table-cup.table-striped.margin-bottom-25 tr")){
                if(row.select("td:nth-of-type(1)").text().equals("")){
                continue;
            }else{
                    final String nome = row.select("td:nth-of-type(2)").text();
                    final String pontos = row.select("td:nth-of-type(3)").text();
                    System.out.println(" nome: "+nome+" pontos: "+pontos);
                    }
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
