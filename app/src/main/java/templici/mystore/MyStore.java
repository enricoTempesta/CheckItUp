package templici.mystore;

import android.app.Application;

/**
 * Created by Enrico on 09/11/2014.
 */
public class MyStore extends Application {
    private String username;

    public void onCreate() {
        super.onCreate();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String user) {
        this.username = user;
    }

    // ToDo: Inizializzare e gestire variabili globali applicazione
}
