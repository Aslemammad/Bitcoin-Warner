/*
*********************************************************Bitcoin Warner*********************************************************
this project is Bitcoin warner (in silicon valley film) with more Features
project by:Mohammad Bagher Abiat 
telegram :@MBAbiat
github : github.com/MBAbiat
this project is very funny
thanks for __PascalCase Community__ and __kia hamedi(telegram:@happy722)__ to help
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import org.json.JSONException;
import org.json.JSONObject;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Bitcion {

    static InputStream expensive;
    static AudioStream au;
    static InputStream cheap;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\u001B[31m*********************************************************\u001B[0m");//red
        System.out.print("\u001B[32mBitcoin Warner by Mohammad Bagher Abiat\u001B[0m");//green
        System.out.print("\u001B[34m*********************************************************\u001B[0m\n");//blue
        try {
            String add = "https://api.coinbase.com/v2/prices/spot?currency=USD";//address of coinbase.com api(JSON file)
            URL obj = new URL(add);//object of URL class (_name is : "obj"_)
            try {
                HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();//object of HttpsURLConnection class (_name is :"con"_)
                int rc = con.getResponseCode();//get response code (_name is : "rc"_)
                BufferedReader buf = new BufferedReader(new InputStreamReader(con.getInputStream()));//object of BufferedReader class to read the add file (_name is : "buf"_)
                //read the file 
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = buf.readLine()) != null) {
                    response.append(inputLine);
                }
                buf.close();
                //end of reading the file 
                JSONObject json = new JSONObject(response.toString());//object name is "json"
                JSONObject val = new JSONObject(json.getJSONObject("data").toString());//object of "data" in json file 
                String price = val.getString("amount");//string of price of bitcoin in USD
                double amount = Double.parseDouble(price);//parse price string to double

                expensive = new FileInputStream(new File("/home/zorofast/Desktop/JAVA BOOK/napalm-death-scum-12-you-suffer.mp3"));//sound of napalm-death-scum-12-you-suffer
                cheap = new FileInputStream(new File("/home/zorofast/Desktop/JAVA BOOK/it was cheap.mp3"));//sound of it was cheap
                BufferedInputStream bu = new BufferedInputStream(expensive);
                BufferedInputStream c_heap = new BufferedInputStream(cheap);
                try {
                    Player play_exp = new Player(bu);
                    Player play_che = new Player(c_heap);
                    Time.timeprint();
                    System.out.print("\n\u001B[35mDo you think the price of bitcoin is lower than what price??(USD) : \u001B[0m");
                    double think_price = input.nextDouble();
                    if (amount > think_price) {
                        System.out.println("\u001B[31m" + "You think wrong, the price is higher.");
                        System.out.println("\u001B[31m" + "Price : " + price);
                        play_exp.play();//play bad sound 
                        play_exp.close();
                    } else {
                        System.out.println("\u001B[32m" + "Bravoo,You can say that again.");
                        System.out.println("\u001B[32mPrice : " + price);
                        play_che.play();//play good sound
                        play_che.close();
                    }
                } catch (JavaLayerException ex) {
                    Logger.getLogger(Bitcion.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (IOException ex) {
                Logger.getLogger(Bitcion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Bitcion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Bitcion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
